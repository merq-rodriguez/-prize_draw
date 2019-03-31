import ListasDoblesCirculares.ListaCircular;
import ListasDoblesCirculares.Persona;
import ListasSimples.ListaSimple;
import ListasSimples.Nodo;
import ListasSimples.Premiado;
import ListasSimples.Premio;

import java.util.Scanner;

public class principal {

    public static ListaCircular x = new ListaCircular();
    public static ListaSimple y = new ListaSimple();
    public static ListaSimple z = new ListaSimple();


    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);


        x.insertar(new ListasDoblesCirculares.Nodo(new Persona("Stiven","1223333",23)));
        x.insertar(new ListasDoblesCirculares.Nodo(new Persona("Valery","222222",23)));
        x.insertar(new ListasDoblesCirculares.Nodo(new Persona("Fulanito de tal","33333",23)));
        x.insertar(new ListasDoblesCirculares.Nodo(new Persona("Arya Stark","44444",23)));
        x.insertar(new ListasDoblesCirculares.Nodo(new Persona("Ned Stark","55555",23)));
        x.insertar(new ListasDoblesCirculares.Nodo(new Persona("Sansa Stark","66666",23)));
        x.insertar(new ListasDoblesCirculares.Nodo(new Persona("John Snow","777777",23)));
        x.insertar(new ListasDoblesCirculares.Nodo(new Persona("Tor","888888",23)));
        x.insertar(new ListasDoblesCirculares.Nodo(new Persona("Floppy","99999",23)));

        System.out.println(x.toString());
        System.out.println("Tamaño de lista de personas: "+x.getTam());



        y.insertarfinal(new Nodo(new Premio("Casa")));
        y.insertarfinal(new Nodo(new Premio("Lavadora")));
        y.insertarfinal(new Nodo(new Premio("Nevera")));
        y.insertarfinal(new Nodo(new Premio("Carro")));
        y.insertarfinal(new Nodo(new Premio("Moto")));
        y.insertarfinal(new Nodo(new Premio("Silla")));
        y.insertarfinal(new Nodo(new Premio("Novia nueva")));
        y.insertarfinal(new Nodo(new Premio("Computador")));
        y.insertarfinal(new Nodo(new Premio("Memoria USB")));
        y.visualizarlistaPremio();
        System.out.println("Tamaño de lista de premios: "+y.getTam());

        System.out.println("===================================================");
        System.out.println("                SORTEO DE PREMIOS");
        System.out.println("===================================================");

      // Persona ganador = sortear();
      // System.out.println("El ganador es: "+ganador.getNombres());

        System.out.println("===================================================");
        System.out.println("                Los ganadores son:                 ");
        System.out.println("===================================================");
        sortearTodo();
        z.visualizarlistaPremiados();




    }

    public static int getRandom(){
        return (int) (Math.random() * x.getTam()) + 1;
    }
    public static Persona sortear(){
        int num = getRandom();
        //System.out.println("Random: "+num);
        //Buscamos el ganador
        Persona ganador = x.buscarPos(num);
        //Obtenemos el premio (siempre es el primero de la lista)
        Premio premio = y.getCabPremio();
        //Eliminando ganador de la lista circular
        x.eliminar(ganador.getIdentificacion());
        //Eliminamos la cabeza
        y.eliminarCabeza();
        //Agregamos el objeto premiado que tiene el ganador y el premio que se ganó
        z.insertarfinal(new Nodo(new Premiado(num,ganador, premio)));
        return ganador;
    }

    public static void sortearTodo(){
        for (int i = 0;  x.getTam() != 0; i++) {
            sortear();
        }

    }
}
