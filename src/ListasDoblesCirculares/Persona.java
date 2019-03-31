package ListasDoblesCirculares;

public class Persona {

    private String nombres;
    private String identificacion;
    private int edad;


    public Persona(String nombres, String identificacion, int edad) {
        this.nombres = nombres;
        this.identificacion = identificacion;
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombres='" + nombres + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", edad=" + edad +
                '}';
    }
}
