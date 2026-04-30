public class Doctor extends Persona {
    public String especialidad;
    public String numero_de_licencia;
    // Arreglo para pacientes asignados [cite: 28]
    public Paciente[] misPacientes = new Paciente[5];
    public int totalPacientes = 0;

    public Doctor(String n, int e, String g, String i, String esp, String lic) {
        super(n, e, g, i);
        this.especialidad = esp;
        this.numero_de_licencia = lic;
    }

    public void agregar_paciente(Paciente p) {
        if (totalPacientes < 5) {
            misPacientes[totalPacientes] = p;
            totalPacientes++;
        }
    }

    public void mostrar_pacientes() {
        System.out.println("Pacientes del Dr/a. " + nombre + ":");
        for (int i = 0; i < totalPacientes; i++) {
            System.out.println("> " + misPacientes[i].nombre);
        }
    }
}