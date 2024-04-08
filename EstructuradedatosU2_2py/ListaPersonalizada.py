class ListaPersonalizada:
    def __init__(self):
        self.lista = []
        self.elementos_agregados = []
        self.elementos_eliminados = []

    def agregar_elemento(self, elemento):
        self.lista.append(elemento)
        self.elementos_agregados.append(elemento)
        print("Agregado:", elemento)

    def eliminar_elemento(self, elemento):
        if elemento in self.lista:
            self.lista.remove(elemento)
            self.elementos_eliminados.append(elemento)
            print("Eliminado:", elemento)
        else:
            print("El elemento no existe en la lista.")

    def longitud(self):
        return len(self.lista)

    def imprimir_elementos_agregados(self):
        print("Elementos agregados:", ", ".join(map(str, self.elementos_agregados)))

    def imprimir_elementos_eliminados(self):
        print("Elementos eliminados:", ", ".join(map(str, self.elementos_eliminados)))

# Se indica poblar a la matriz y luego se imprime el proceso
lista_personalizada = ListaPersonalizada()
lista_personalizada.agregar_elemento(5)
lista_personalizada.agregar_elemento(10)
lista_personalizada.eliminar_elemento(5)
print("Longitud de la lista:", lista_personalizada.longitud())
lista_personalizada.imprimir_elementos_agregados()
lista_personalizada.imprimir_elementos_eliminados()

