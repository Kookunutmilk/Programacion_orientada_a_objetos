/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author frida
 */
public class ListaPares { //nombre class igual al archivo
    public static void main(String[] args) {
        // Crear arreglo para almacenar números pares
        int[] pares = new int[50]; 

        // Llenar el arreglo con números pares desde 2 hasta 100
        int index = 0; //variable para saber en qué posición estoy
        for (int i = 2; i <= 100; i += 2) {
            pares[index] = i;  // Almacenamos el número par en el arreglo
            index++;  // Incrementamos el índice para el siguiente número
        }

        // print los números almacenados en el arreglo
        System.out.println("Lista de números pares entre 2 y 100:");
        for (int i = 0; i < pares.length; i++) {
            System.out.println(pares[i]);
        }
    }
}
