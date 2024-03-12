package Liste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Lista {

    public static void main(String[] args) {



        ArrayList<Persona> lista = new ArrayList<>();

        Persona p1 = new Persona("Samuel", "Tardiota", 17);
        Persona p2 = new Persona("Quincy", "Promes", 32);
        Persona p3 = new Persona("Best", "Rapper", 14);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);



        /*try{
            lista.add(4, "Txt3");
        } catch (Exception e) {
            System.out.println("add - Posizione inesistente");
        }

        /*try {
            lista.set(0, "Txt mod");
        } catch (Exception e) {
            System.out.println("set- posizione inesistente");
        }

        try {
            System.out.println(lista.get(0));
        } catch (Exception e) {
            System.out.println("get - posizione inesistente");
        }

        try {
            lista.remove(23);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        if (lista.remove("Txt mod")) { //Passo un integer per trovare un numero e non un int perché altrimenti lo usa come indice da eliminare
            System.out.println("Rimosso con successo");
        }
        else{
            System.out.println("Non rimosso");
        }

        System.out.println(lista.contains("Txt2"));

        System.out.println(lista.size());

        System.out.println(lista.indexOf("Txt2"));

        //lista.clear();

        System.out.println(lista.isEmpty());

        lista.trimToSize();

        ArrayList<String> lista1 = lista;

        ArrayList<String> lista2 = (ArrayList<String>) lista.clone(); //Da sovrascrivere il metodo

        for(String elemento: lista)
            System.out.println(elemento);

        lista.forEach((elemento) -> {
            System.out.println(elemento);
        });

        Collections.sort(lista);
        Collections.reverse(lista);

        lista.forEach((elemento) -> {
            System.out.println(elemento);
        });


        System.out.println("Sublist: " + lista.subList(0,2)); //non returna la posizione 2 (solo 0 e 1)


        String[] arr = new String[lista2.size()];
        lista2.toArray(arr);


        lista.ensureCapacity(4);
        System.out.println("ArrayList: " + lista);


        int position = lista.lastIndexOf("Txt4");
        System.out.println("Ultima posizione: " + position);

        lista2.remove("Txt2");
        lista2.retainAll(lista);
        System.out.println("Elementi comuni: " + lista2);

        lista2.add("Txt2");
        System.out.println(lista.containsAll(lista2)); //non guarda l'ordine
        */
        lista.forEach((elemento) -> {
            System.out.println(elemento);
        });

        //Collections.sort(lista, Comparator.comparing(Persona::getEta));


        lista.sort((o1, o2) -> o1.isGreater(o2));

        lista.forEach((elemento) -> {
            System.out.println(elemento);
        });
    }
}
