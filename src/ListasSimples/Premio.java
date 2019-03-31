package ListasSimples;

public class Premio {
    int id;
    String nombre;

    public Premio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }


    public Premio(String nombre) {
        this.id = 0;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
