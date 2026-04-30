import java.io.Serializable;

public class Persona implements Serializable {

    public String nombre;
    public int edad;
    public String genero;
    public String identificacion;

    public Persona(String nombre, int edad, String genero, String identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.identificacion = identificacion;
    }

    public void mostrar_informacion() {
        System.out.println("Nombre: " + nombre + " | ID: " + identificacion);
    }
}
