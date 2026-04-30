import java.io.Serializable;

public class Cita implements Serializable {
    public Paciente paciente;
    public Doctor doctor;
    public String fecha;
    public String hora;
    public String motivo;

    public Cita(Paciente p, Doctor d, String f, String h, String m) {
        this.paciente = p;
        this.doctor = d;
        this.fecha = f;
        this.hora = h;
        this.motivo = m;
    }

    public void detalles_cita() {
        System.out.println("CITA: " + fecha + " a las " + hora);
        System.out.println("Atención para: " + paciente.nombre);
        System.out.println("Con el Dr: " + doctor.nombre);
    }

    public void cambiar_fecha_hora(String nueva_f, String nueva_h) {
        this.fecha = nueva_f;
        this.hora = nueva_h;
    }
}