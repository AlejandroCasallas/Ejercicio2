package src;
import java.time.LocalDate;
import java.time.Period;

public class Docente {
    // Atributos
    private int id, horasSemanales;
    private String nombre, correo, asignatura, telefono, especialidad, tituloObtenido;
    private double salario;
    private LocalDate fechaContratacion;

    // Constructor (opcional)
    public Docente(int id, String nombre, String correo, String asignatura, 
                   String telefono, String especialidad, 
                   String tituloObtenido, double salario, int horasSemanales, LocalDate fechaContratacion) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.asignatura = asignatura;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.tituloObtenido = tituloObtenido;
        this.salario = salario;
        this.horasSemanales = horasSemanales;
        this.fechaContratacion = fechaContratacion;
    }

    public int getAniosdeServicio() {
        if (fechaContratacion == null) return 0;
        return Period.between(fechaContratacion, LocalDate.now()).getYears();
    }
    public int getMesesdeServicio() {
        if (fechaContratacion == null) return 0;
        return Period.between(fechaContratacion, LocalDate.now()).getMonths();
    }
    public int getPrecioHora(){
        if (horasSemanales == 0) return 0;
        return (int) (salario / horasSemanales);
    }

    public void mostrarDatos() {
        int tiempoDeServicio;
        String aniosOrMeses;
        if (getAniosdeServicio() == 0) {
            tiempoDeServicio = getMesesdeServicio();
            if (tiempoDeServicio < 0) {
                aniosOrMeses = "Tiempo de servicio: No se ha contratado al docente aún.";
            } else if (tiempoDeServicio == 0) {
                aniosOrMeses = "Tiempo de servicio: No ha transcurrido tiempo desde la contratación.";
            }
            else {
                aniosOrMeses = "Tiempo de servicio: " + tiempoDeServicio + " mes(es)";
            }
        }else if (getAniosdeServicio() < 0) {
            aniosOrMeses = "Tiempo de servicio: No se ha contratado al docente aún.";
        } 
        else {
            tiempoDeServicio = getAniosdeServicio();
            aniosOrMeses = "Tiempo de servicio: " + tiempoDeServicio + " año(s)";
        }
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Grado Académico: " + tituloObtenido);
        System.out.println("Salario (USD): $" + salario);
        System.out.println("Horas Semanales: " + horasSemanales);
        System.out.println("Al profesor(a) se le paga la hora a: $" + getPrecioHora());
        System.out.println(aniosOrMeses);
    }
}
