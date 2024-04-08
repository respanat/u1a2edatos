/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad2unidad2_2;

import java.util.ArrayList;

class ListaPersonalizada<T> {
    private ArrayList<T> lista;
    private ArrayList<T> elementosAgregados;
    private ArrayList<T> elementosEliminados;
    //Se inicializa la lista 
    public ListaPersonalizada() {
        lista = new ArrayList<>();
        elementosAgregados = new ArrayList<>();
        elementosEliminados = new ArrayList<>();
    }
    //método para agregar elementos a la lista
    public void agregarElemento(T elemento) {
        lista.add(elemento);
        elementosAgregados.add(elemento);
        System.out.println("Agregado: " + elemento);
    }
    //método para eliminar elementos de la lista
    public void eliminarElemento(T elemento) {
        if (lista.remove(elemento)) {
            elementosEliminados.add(elemento);
            System.out.println("Eliminado: " + elemento);
        } else {
            System.out.println("El elemento no existe en la lista.");
        }
    }
    //Aquí se devuelve la longitud de la lista
    public int longitud() {
        return lista.size();
    }
    //Método para imprimir los elementos agregados
    public void imprimirElementosAgregados() {
        System.out.println("Elementos agregados: " + elementosAgregados);
    }
    //Método para imprimir los elementos eliminados
    public void imprimirElementosEliminados() {
        System.out.println("Elementos eliminados: " + elementosEliminados);
    }
}

public class Personalizada {
    public static void main(String[] args) {
        ListaPersonalizada<Integer> listaPersonalizada = new ListaPersonalizada<>();
        listaPersonalizada.agregarElemento(5);
        listaPersonalizada.agregarElemento(10);
        listaPersonalizada.eliminarElemento(5);
        System.out.println("Longitud de la lista: " + listaPersonalizada.longitud());
        listaPersonalizada.imprimirElementosAgregados();
        listaPersonalizada.imprimirElementosEliminados();
    }
}


