import java.time.LocalDate;

public abstract class Mascota {

    private String nombre, estado;
    private int edad;
    private static LocalDate fechaNacimiento;

    public String muestra() {

        return null;
    }

    public LocalDate cumpleaños() {

        return LocalDate.of(2002, 10, 20);
    }

    public String morir() {

        return "muelto";
    }

    public String habla() {
        return "A las buenas tardes, soy una animal que habla";
    }

}
