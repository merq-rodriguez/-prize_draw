package ListasSimples;

import ListasDoblesCirculares.Persona;
import ListasSimples.Premio;

public class Premiado {
    int id;
    Persona persona;
    Premio premio;

    public Premiado(int id, Persona persona, Premio premio) {
        this.id = id;
        this.persona = persona;
        this.premio = premio;
    }

    @Override
    public String toString() {
        return  persona.getNombres() + " fue premiado con: " + premio.getNombre();
    }
}
