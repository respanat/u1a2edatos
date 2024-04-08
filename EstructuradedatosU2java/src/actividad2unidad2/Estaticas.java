package actividad2unidad2;

import java.util.Arrays;

public class Estaticas {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        
        // Ordenamiento Burbuja
        bubbleSort(array);
        
        // Ordenamiento Mezcla
        mergeSort(array);
        
        // Ordenamiento Cocktail
        cocktailSort(array);
        
        // Ordenamiento Inserción
        insertionSort(array);
        
        // Ordenamiento Selección
        selectionSort(array);
    }
    
    // Método para el Ordenamiento Burbuja
    public static void bubbleSort(int[] array) {
        int n = array.length;
        int[] sortedArray = Arrays.copyOf(array, n);
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (sortedArray[j] > sortedArray[j+1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j+1] = temp;
                }
            }
        }
        System.out.println("Bubble Sort: " + Arrays.toString(sortedArray));
    }
    
    // Método para el Ordenamiento por Mezcla
    public static void mergeSort(int[] array) {
        int n = array.length;
        if (n < 2) {
            return;
        }
        int middle = n / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[n - middle];
        
        // Dividir el array en dos sub-arrays
        for (int i = 0; i < middle; i++) {
            leftArray[i] = array[i];
        }
        for (int i = middle; i < n; i++) {
            rightArray[i - middle] = array[i];
        }
        
        // Llamada recursiva para ordenar los sub-arrays
        mergeSort(leftArray);
        mergeSort(rightArray);
        
        // Combinar los sub-arrays ordenados
        merge(array, leftArray, rightArray);
    }
    
    // Combinar dos sub-arrays ordenados
    public static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int n1 = leftArray.length;
        int n2 = rightArray.length;
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
        System.out.println("Merge Sort: " + Arrays.toString(array));
    }
    
    // Método para el Ordenamiento Cocktail
    public static void cocktailSort(int[] array) {
        int n = array.length;
        boolean swapped = true;
        int start = 0;
        int end = n - 1;
        
        while (swapped) {
            swapped = false;
            
            // Mueve el elemento más grande al final
            for (int i = start; i < end; ++i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            
            // SI nada se mueve, se ordena la matriz
            if (!swapped)
                break;
            
            swapped = false;
            end--;
            
            // Mueve el elemento más pequeño al inicio
            for (int i = end - 1; i >= start; --i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            
            start++;
        }
        
        System.out.println("Cocktail Sort: " + Arrays.toString(array));
    }
    
    // Método para el Ordenamiento por inserción
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        System.out.println("Insertion Sort: " + Arrays.toString(array));
    }
    
    // Método para el Ordenamiento por selección
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Se cambia aquí el elemento mínimo encontrado con el primer elemento
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        System.out.println("Selection Sort: " + Arrays.toString(array));
    }
}

