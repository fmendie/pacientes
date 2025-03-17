/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pipe7
 */
public class ListaPacientes {
    private Paciente cabeza;

    public ListaPacientes() {
        this.cabeza = null;
    }

    // Agregar paciente
   public void agregarPaciente(int id, String nombre, int edad, String clinica) {
    if (buscarPaciente(id) != null) {
        System.out.println("Error: Ya existe un paciente con este ID.");
        return;
    }

    Paciente nuevo = new Paciente(id, nombre, edad, clinica);
    if (cabeza == null) {
        cabeza = nuevo;
    } else {
        Paciente temp = cabeza;
        while (temp.siguiente != null) {
            temp = temp.siguiente;
        }
        temp.siguiente = nuevo;
    }
    System.out.println("Paciente agregado con éxito.");
}

    // Buscar paciente por ID
    public Paciente buscarPaciente(int id) {
        Paciente temp = cabeza;
        while (temp != null) {
            if (temp.id == id) {
                return temp;
            }
            temp = temp.siguiente;
        }
        return null;
    }

    // Eliminar paciente por ID
    public boolean eliminarPaciente(int id) {
        if (cabeza == null) {
            return false;
        }
        if (cabeza.id == id) {
            cabeza = cabeza.siguiente;
            return true;
        }
        Paciente temp = cabeza;
        while (temp.siguiente != null && temp.siguiente.id != id) {
            temp = temp.siguiente;
        }
        if (temp.siguiente != null) {
            temp.siguiente = temp.siguiente.siguiente;
            return true;
        }
        return false;
    }

    // Mostrar todos los pacientes
    public void mostrarPacientes() {
        Paciente temp = cabeza;
        if (temp == null) {
            System.out.println("No hay pacientes registrados.");
            return;
        }
        while (temp != null) {
            System.out.println(temp);
            temp = temp.siguiente;
        }
    }
}
