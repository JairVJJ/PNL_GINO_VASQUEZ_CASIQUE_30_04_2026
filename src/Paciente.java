public class Paciente extends Persona {

    public String[] historial_motivos = new String[10];
    public String[] historial_detalles = new String[10];
    public int contador = 0;

    public Paciente(String n, int e, String g, String i) {
        super(n, e, g, i);
    }


    public void agregar_historial(String motivo, String detalle) {
        if (contador < 10) {
            historial_motivos[contador] = motivo;
            historial_detalles[contador] = detalle;
            contador++;
        }
    }

    public void mostrar_historial() {
        System.out.println("Historial de " + nombre + ":");
        for (int i = 0; i < contador; i++) {
            System.out.println("- " + historial_motivos[i] + ": " + historial_detalles[i]);
        }
    }
}