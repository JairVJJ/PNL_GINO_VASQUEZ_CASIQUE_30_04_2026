import java.io.*;

public class Main {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("Carlos Ruiz", 28, "M", "77889900");
        Doctor d1 = new Doctor("Elena Sosa", 40, "F", "11223344", "Pediatria", "DOC456");

        p1.agregar_historial("Fiebre", "Se receto paracetamol");
        d1.agregar_paciente(p1);

        Cita miCita = new Cita(p1, d1, "30/04/2026", "15:00", "Revision general");

        miCita.detalles_cita();

        try {
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("clinica.dat"));
            escribir.writeObject(miCita);
            escribir.close();
            System.out.println("Informacion guardada en el archivo correctamente.");
        } catch (Exception e) {
            System.out.println("Hubo un error al guardar los datos.");
        }
    }
}
