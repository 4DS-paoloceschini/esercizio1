package verifica;

import ceschini.HashTable2;

public class Main {
    public static void main(String[] args) {
        /*ceschini.verifica.PersonaHT p1 = new ceschini.verifica.PersonaHT("Jan", "11/11/1111");
        ceschini.verifica.PersonaHT p2 = new ceschini.verifica.PersonaHT("Tim", "11/11/1111");
        ceschini.verifica.PersonaHT p3 = new ceschini.verifica.PersonaHT("Mia", "11/11/1111");
        ceschini.verifica.PersonaHT p4 = new ceschini.verifica.PersonaHT("Sam", "11/11/1111");
        ceschini.verifica.PersonaHT p5 = new ceschini.verifica.PersonaHT("Leo", "11/11/1111");
        ceschini.verifica.PersonaHT p6 = new ceschini.verifica.PersonaHT("Ted", "11/11/1111");
        ceschini.verifica.PersonaHT p7 = new ceschini.verifica.PersonaHT("Bea", "11/11/1111");
        ceschini.verifica.PersonaHT p8 = new ceschini.verifica.PersonaHT("Lou", "11/11/1111");
        ceschini.verifica.PersonaHT p9 = new ceschini.verifica.PersonaHT("Ada", "11/11/1111");
        ceschini.verifica.PersonaHT p10 = new ceschini.verifica.PersonaHT("Max", "11/11/1111");
        ceschini.verifica.PersonaHT p11 = new ceschini.verifica.PersonaHT("Zoe", "11/11/1111");

        verifica.HashTable1 h1 = new verifica.HashTable1();
        h1.addElement(p1);
        h1.addElement(p2);
        h1.addElement(p3);
        h1.addElement(p4);
        h1.addElement(p5);
        h1.addElement(p6);
        h1.addElement(p7);
        h1.addElement(p8);
        h1.addElement(p9);
        h1.addElement(p10);
        h1.addElement(p11);

        System.out.println(p1.getAscii()%11);

        System.out.println(h1.toString());*/



        PersonaHT p1 = new PersonaHT("Mia", "11/11/1111");
        PersonaHT p2 = new PersonaHT("Tim", "11/11/1111");
        PersonaHT p3 = new PersonaHT("Bea", "11/11/1111");
        PersonaHT p4 = new PersonaHT("Zoe", "11/11/1111");
        PersonaHT p5 = new PersonaHT("Sue", "11/11/1111");
        PersonaHT p6 = new PersonaHT("Len", "11/11/1111");
        PersonaHT p7 = new PersonaHT("Moe", "11/11/1111");
        PersonaHT p8 = new PersonaHT("Lou", "11/11/1111");
        PersonaHT p9 = new PersonaHT("Rae", "11/11/1111");
        PersonaHT p10 = new PersonaHT("Max", "11/11/1111");
        PersonaHT p11 = new PersonaHT("Tod", "11/11/1111");

        HashTable2 h2 = new HashTable2();
        h2.addElement(p1);
        h2.addElement(p2);
        h2.addElement(p3);
        h2.addElement(p4);
        h2.addElement(p5);
        h2.addElement(p6);
        h2.addElement(p7);
        h2.addElement(p8);
        h2.addElement(p9);
        h2.addElement(p10);
        h2.addElement(p11);

        System.out.println(p1.getAscii()%11);

        System.out.println(h2.isFull());
    }
}
