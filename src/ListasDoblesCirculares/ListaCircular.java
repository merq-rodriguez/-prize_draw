package ListasDoblesCirculares;

public class ListaCircular {

    Nodo inicio;
    int tam;
    public ListaCircular() {
        inicio = null;
        this.tam = 0;
    }


    public boolean isVacia() {  //--------------OK
        return (inicio == null);
    }

    public void insertar(Nodo nuevo) {   //--------------OK
        if (!isVacia()) {
            nuevo.sig = inicio;
            nuevo.ant = inicio.ant;
            inicio.ant.sig = nuevo;
            inicio.ant = nuevo;
        } else {
            inicio = nuevo;
            nuevo.sig = inicio;
            nuevo.ant = inicio;
        }
        this.tam++;
    }

    public void insertarCola(Nodo nuevo) {
        if (!isVacia()) {
            Nodo tmp = inicio;
            while (tmp.sig != null) {
                tmp = tmp.sig;
            }
            nuevo.ant = tmp;
            tmp.sig = nuevo;
        } else {
            inicio = nuevo;
        }
        this.tam++;
    }

    public boolean insertarPos(Nodo nuevo, int pos) {
        if (pos == 0) {
            insertar(nuevo);
            tam++;
            return true;
        } else if (pos <= getTam()) {
            Nodo tmp = inicio;
            for (int i = 1; i < pos; i++) {
                tmp = tmp.sig;
            }
            nuevo.sig = tmp.sig;
            nuevo.ant = tmp;
            tmp.sig.ant = nuevo;
            tmp.sig = nuevo;
            tam++;
            return true;
        }
        return false;
    }

    /**
    public boolean eliminar(int pos){
        if(!isVacia() && pos<longitud()){
            if(pos==0){return eliminarCabeza();}
            Nodo tmp=cab;
            for(int i=1;i<pos;i++){
                tmp=tmp.sig;
            }
            tmp.sig=tmp.sig.sig;
            return true;
        }
        return false;
    }

*/


    public void eliminar(String dato) {
        Nodo actual;
        boolean encontrado = false;
        actual = inicio;
        while ((actual.sig != inicio) && (!encontrado)) {
            encontrado = (actual.sig.info.getIdentificacion() == dato);
            if (!encontrado) {
                actual = actual.sig;
            }
        }
        encontrado = (actual.sig.info.getIdentificacion() == dato);
        // enlace del nodo anterior con el siguiente
        if (encontrado) {
            Nodo temp = actual.sig; // Nodo a eliminarF

            if (inicio == inicio.sig) {// lista con solo un nodo
                inicio = null;
            } else {
                if (temp == inicio) {
                    inicio = actual;// borra el elemento referenciado por lc
                }               //el nuevo acceso a la lista es el anterior
                actual.sig= temp.sig;
            }
            temp = null;
            tam--;
        }

    }

    public int getTam() {
        return tam;
    }

    public Nodo getNodo(int pos) {
        if (!isVacia() && pos < getTam()) {
            Nodo tmp = inicio;
            for (int i = 0; i < pos; i++) {
                tmp = tmp.sig;
            }
            return tmp;
        }
        return null;
    }

    public Persona buscarPersona(String id) {

        for (Nodo indice = inicio; indice != null;indice = indice.sig) {
            if (indice.info.getIdentificacion() == id){
                return indice.info;
            }
        }
        return null;
    }


    public Persona buscarPos(int pos) {
        int i = 0;
        for (Nodo indice = inicio; indice != null;indice = indice.sig,i++) {
            if (i == pos){
                return indice.info;
            }
        }
        return null;
    }

    public boolean eliminarCabeza() {
        inicio = inicio.sig;
        return true;
    }

    @Override
    public String toString() {
        String mostrar = "cab<->";
        Nodo indice = inicio;
        while (indice.sig != inicio) {
            mostrar += indice.info.getNombres() + " <-> ";
            indice= indice.sig;
        }
        if (indice.sig == inicio) {
            mostrar += indice.info.getNombres() + " <-> ";
        }

        return mostrar + "cab";
    }

}
