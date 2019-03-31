package ListasSimples;

public class Nodo {

   Premiado premiado;
   Premio premio;
   Nodo siguiente;

   public Nodo(Premio dato, Nodo siguiente) {
       this.premio=dato;
       this.siguiente= siguiente;
    }


    public Nodo(Premiado dato, Nodo siguiente) {
        this.premiado=dato;
        this.siguiente= siguiente;
    }

    public Nodo(Premiado dato) {
       this.premiado=dato;
       this.siguiente=null;
    }


    public Nodo(Premio dato) {
        this.premio=dato;
        this.siguiente=null;
    }

}
