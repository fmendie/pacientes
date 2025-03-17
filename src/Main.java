
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pipe7
 */
public class Main {
    public static void main(String[] args) {
        ListaPacientes lista = new ListaPacientes();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Central de Pacientes ---");
            System.out.println("1. Agregar Paciente");
            System.out.println("2. Buscar Paciente");
            System.out.println("3. Eliminar Paciente");
            System.out.println("4. Mostrar Todos los Pacientes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese Clínica: ");
                    String clinica = scanner.nextLine();
                    lista.agregarPaciente(id, nombre, edad, clinica);
                    break;
                case 2:
                    System.out.print("Ingrese ID del paciente a buscar: ");
                    int buscarId = scanner.nextInt();
                    Paciente encontrado = lista.buscarPaciente(buscarId);
                    if (encontrado != null) {
                        System.out.println("Paciente encontrado: " + encontrado);
                    } else {
                        System.out.println("Paciente no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese ID del paciente a eliminar: ");
                    int eliminarId = scanner.nextInt();
                    if (lista.eliminarPaciente(eliminarId)) {
                        System.out.println("Paciente eliminado con éxito.");
                    } else {
                        System.out.println("Paciente no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("\nLista de Pacientes:");
                    lista.mostrarPacientes();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
