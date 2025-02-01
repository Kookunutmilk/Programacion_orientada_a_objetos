/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author frida
 */
import java.util.Scanner;

public class NombreSaludo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;

        do {
            System.out.print("Ingresa tu nombre (o escribe 'salir' para terminar): ");
            nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("salir")) { //terminar programa
                System.out.println("¡Hasta luego!"); //mensaje de finalización
                break;
            } else if (nombre.equalsIgnoreCase("Frida")) {
                System.out.println("¡Hola, Frida! Bienvenida al programa.");
            } else if (nombre.equalsIgnoreCase("Hector")) {
                System.out.println("¡Hola, Hector! Espero que tengas un gran día.");
            } else {
                System.out.println("¡Hola, " + nombre + "! Encantado de conocerte."); //nombre no registrado
            }

            // Verificar si la primera letra está en minúscula
            if (!nombre.isEmpty() && Character.isLowerCase(nombre.charAt(0))) {
                System.out.println("No olvides que tu nombre lleva mayúscula al inicio.");
            }

        } while (true);

        scanner.close();
    }
}

