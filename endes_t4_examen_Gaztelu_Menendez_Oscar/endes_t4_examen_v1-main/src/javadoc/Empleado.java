/**
 * @author Oscar
 * @version 1.0
 * @since 2024-02-23
 */

package javadoc;

public class Empleado {
    // Atributos de la clase
    /**
     *String Nombre del empleado
     */
    private String nombre;
    /**
     * ID privado de la clase empleado
     */
    private String id;
    /**
     * Double privado del sueldo de empleado
     */
    private double sueldo;


    /**
     * Instancia clase empleado
     * @param nombre Nombre del empleado
     * @param id ID unico del empleado
     * @param sueldo sueldo del empleado
     */
    public Empleado(String nombre, String id, double sueldo) {
        this.nombre = nombre;
        this.id = id;
        this.sueldo = sueldo;
    }


    /**
     * Getter para la variable nombre
     * @return obtienes la variable nombre
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * Setter para la variable Nombre
     * @param nombre, estableces el valor del string
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Getter del String id
     * @return obtienes el valor de id
     */
    public String getId() {
        return id;
    }


    /**
     * Getter de la variable sueldo
     * @return obtienes el valor de sueldo
     */
    public double getSueldo() {
        return sueldo;
    }


    /**
     * Setter de la variable sueldo
     * @param sueldo establece un nuevo valor para sueldo.
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


    /**
     * Metodo para incrementar el valor del sueldo.
     * @param incremento el valor que se va a sumar al sueldo.
     */
    public void incrementarSueldo(double incremento) {
        this.sueldo += incremento;
    }

    /**
     * Metodo en el que se devuelve un javadoc con todos los valores de la clase empleado.
     * @return nombre, id, sueldo.
     */
    @Override
    public String toString() {
        return "javadoc.Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
