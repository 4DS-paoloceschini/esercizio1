package ceschiniSegmento;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci le coordinate del primo punto");
        System.out.println("X: ");
        double x = input.nextDouble();
        System.out.println("Y: ");
        double y = input.nextDouble();
        Punto p1 = new Punto(x, y);

        System.out.println("Inserisci le coordinate del secondo punto");
        System.out.println("X: ");
        double x2 = input.nextDouble();
        System.out.println("Y: ");
        double y2 = input.nextDouble();
        Punto p2 = new Punto(x2, y2);



        Segmento s = new Segmento(p1, p2);

        System.out.println("La lunghezza del segmento è: "+String.format("%,.2f", s.lunghezza()));

        System.out.println("Inserisci di quanto vuoi tralsare sull'asse delle X il segmento: ");
        float tX = input.nextFloat();
        System.out.println("Inserisci di quanto vuoi tralsare sull'asse delle Y il segmento: ");
        float tY = input.nextFloat();
        s.traslaSegmento(tX, tY);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(s.toString());
    }
}