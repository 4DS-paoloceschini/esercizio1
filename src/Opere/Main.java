package Opere;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Quadro q = null;
        Scultura s = null;
        Scultura s1 = null;

        Collezione c = new Collezione(2);

        boolean ver = true;
        do {
            try {

                q = new Quadro("pietro", "fABBRI","Pezzo di cuore", 1.5, 2);
                c.aggiungiOpera(q);

                s = new Scultura("FRANCO", "aRmaNI","Abaco",15, 20, 12);
                c.aggiungiOpera(s);

                System.out.println("\nQuadro: " + q.toString());
                System.out.println("\nScultura: " + s.toString());

                System.out.println("\nColleazione: "+c.toString());


                System.out.println("\nDati dell'opera cercata: "+c.cercaOpera(s.getTitolo()));

                ver = true;
            } catch (Exception e) {
                System.out.println("Problema!" + e.getMessage());
                ver = false;
            }
        }while(!ver);
    }

}
