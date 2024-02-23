/**
 * @author Oscar
 * @version 1.0
 * @since 2024-02-23
 */
package javadoc;

import java.util.ArrayList;
import java.util.List;


public class GestorPersonal {

    /**
     * Lista privada llamada empleados
     */
    private List<Empleado> empleados;

    /**
     * Se crea un arraylist llamada empleados.
     */
    public GestorPersonal() {
        empleados = new ArrayList<>();
    }

    /**
     * Metodo en el que se añade un nuevo empleado al array
     * @param empleado
     */
    public void contratar(Empleado empleado) {
        empleados.add(empleado);
    }

    /**
     * Metodo en el que se despide a un empleado y se borra de la lista.
     * @param id se utiliza el ID del empleado para identificarlo
     * @return borra el empleado si su ID existe en la lista.
     */
    public boolean despedir(String id) {
        return empleados.removeIf(e -> e.getId().equals(id));
    }

    /**
     * Metodo booleano en el que se cambia el sueldo del empleado
     * @param id Identificador de empleado
     * @param nuevoSueldo valor del nuevo sueldo.
     * @return Devuelve un valor booleano si su sueldo se ha cambiado o no.
     */
    public boolean cambiarSueldo(String id, double nuevoSueldo) {
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(id)) {
                empleado.setSueldo(nuevoSueldo);
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo en el que se obtiene una arralist con todos los empleados.
     * @return nuevo arraylist
     */
    public List<Empleado> getEmpleados() {
        return new ArrayList<>(empleados);
    }
}
