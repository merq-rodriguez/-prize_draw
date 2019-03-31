package ListasDoblesCirculares;

public class Nodo {

    Persona info;
    Nodo ant;
    Nodo sig;

    public Nodo(Persona info) {
        this.info = info;
        sig = null;
        ant = null;
    }

}
