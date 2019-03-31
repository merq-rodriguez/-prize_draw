package ListasSimples;

public class ListaSimple {
    Nodo cab, cola;
    int tam;


    public ListaSimple() {
        this.cola = this.cab = null;
        this.tam=0;
    }

    boolean Estavacia() {
        return (this.cab == null);
    }

    void insertarcab(Nodo nuevo) {
        if (Estavacia()) {
            this.cab = this.cola = nuevo;
        } else {
            nuevo.siguiente = this.cab;
             this.cab=nuevo;
        }
            this.tam++;
    }

    public void insertarfinal(Nodo nuevo){
        if (Estavacia()){
            this.cab = this.cola = nuevo;
        } else {
            this.cola.siguiente = nuevo;
            cola = cola.siguiente;
        }
        this.tam++;
    }

    public Premio getCabPremio() {
        return cab.premio;
    }

    public Nodo getCola() {
        return cola;
    }

    public void visualizarlistaPremio(){
        for (Nodo indice = this.cab; indice!=null ; indice = indice.siguiente) {
            System.out.println(indice.premio.getNombre());
        }
    }


    public void visualizarlistaPremiados(){
        for (Nodo indice = this.cab; indice!=null ; indice = indice.siguiente) {
            System.out.println(indice.premiado.toString());
        }
    }

    public int getTam() {
        return tam;
    }

      //saber el tamaño
      int tamano(){
        int tam=0;
          for (Nodo indice = this.cab; indice!=null; indice= indice.siguiente){
              tam=tam+1;
          }
          return tam;


    }

    // un metodo que recorra la lista y retorne el nodo de una posicion deseada y esta posicion se pasara
    //por parametros
    // el puto indice es el nodo siempre sera el nodo actual
    Nodo buscarposicion (int posicion) {
        int tam=0;
        for (Nodo indice = this.cab; indice != null; indice = indice.siguiente) {
            if(tam==posicion){
                return indice;
            }
            tam=tam+1;
        }
        return null;

    }




    public boolean eliminarCabeza(){
        cab=cab.siguiente;
        return true;
    }

    public boolean eliminar(int pos){
        if(!Estavacia() && pos < this.tam){
            if(pos==0){
                return eliminarCabeza();
            }
            Nodo indice;
            int i;
            for(indice = cab, i=1; i<pos; i++, indice= indice.siguiente){ }
            indice.siguiente= indice.siguiente.siguiente;
            return true;
        }
        return false;
    }



}
