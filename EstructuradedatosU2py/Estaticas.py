def Estaticas():
    #Se indica a la matriz para que ordene en tipo burbuja
   def bubbleSort(array):
    n = len(array)
    for i in range(n - 1):
        for j in range(n - i - 1):
            if array[j] > array[j + 1]:
                array[j], array[j + 1] = array[j + 1], array[j]
#Se indica a la matriz para que ordene en tipo mezcla
def mergeSort(array):
    if len(array) > 1:
        middle = len(array) // 2
        left_half = array[:middle]
        right_half = array[middle:]

        mergeSort(left_half)
        mergeSort(right_half)

        i = j = k = 0

        while i < len(left_half) and j < len(right_half):
            if left_half[i] < right_half[j]:
                array[k] = left_half[i]
                i += 1
            else:
                array[k] = right_half[j]
                j += 1
            k += 1

        while i < len(left_half):
            array[k] = left_half[i]
            i += 1
            k += 1

        while j < len(right_half):
            array[k] = right_half[j]
            j += 1
            k += 1
#Se indica a la matriz para que ordene en tipo cocktail
def cocktailSort(array):
    n = len(array)
    swapped = True
    start = 0
    end = n - 1
    
    while swapped:
        swapped = False
        
        #Este ciclo mueve el elemento más grande al final
        for i in range(start, end):
            if array[i] > array[i + 1]:
                array[i], array[i + 1] = array[i + 1], array[i]
                swapped = True
        
        # El condicional si no se mueve nada, entonces se ordena la matriz
        if not swapped:
            break
        
        swapped = False
        end -= 1
        
        #Se mueve el elemento más pequeño al inicio
        for i in range(end - 1, start - 1, -1):
            if array[i] > array[i + 1]:
                array[i], array[i + 1] = array[i + 1], array[i]
                swapped = True
        
        start += 1
#Se indica a la matriz para que ordene en tipo inserción
def insertionSort(array):
    for i in range(1, len(array)):
        key = array[i]
        j = i - 1
        while j >= 0 and array[j] > key:
            array[j + 1] = array[j]
            j -= 1
        array[j + 1] = key
#Se indica a la matriz para que ordene en tipo selección
def selectionSort(array):
    n = len(array)
    for i in range(n - 1):
        min_index = i
        for j in range(i + 1, n):
            if array[j] < array[min_index]:
                min_index = j
        array[i], array[min_index] = array[min_index], array[i]
#Se indica el orden impresión de las matrices
def printArray(array):
    print("Ordenamiento por Burbuja:", ", ".join(map(str, array)))
    print("Ordenamiento por Mezcla:", ", ".join(map(str, array)))
    print("Ordenamiento por Cocktail:", ", ".join(map(str, array)))
    print("Ordenamiento por Inserción:", ", ".join(map(str, array)))
    print("Ordenamiento por Selección:", ", ".join(map(str, array)))

array = [64, 25, 12, 22, 11]

#bubbleSort(array) 
mergeSort(array)
cocktailSort(array)
insertionSort(array)
selectionSort(array)

printArray(array)

if __name__ == "__main__":
    Estaticas()
