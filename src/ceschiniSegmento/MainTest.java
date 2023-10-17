package ceschiniSegmento;

public class MainTest {
    public static void main(String[] args) {

        Punto p = new Punto(1.2, 11.4);
        Colore c = new Colore(255, 100, 0);
        PuntoColorato pc = new PuntoColorato(1.3, 11.4, c);
        Punto3D p3 = new Punto3D(1.1 , 11.4, 7);

        System.out.println("\nPunto: "+p.toString());
        System.out.println("\nPunto: "+pc.toString());
        System.out.println("\nPunto: "+p3.toString());

        p.trasla(12.1, 27);
        pc.trasla(13, 23);
        p3.trasla(32,32.5);

        System.out.println("\nPunto2: "+p.toString());
        System.out.println("\nPunto2 Colorato: "+pc.toString());
        System.out.println("\nPunto2 3D: "+p3.toString());



    }
}
