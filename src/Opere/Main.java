package Opere;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Quadro q = null;
        SculturaDeperibile s = null;
        Scultura s1 = null;

        Collezione c = new Collezione(2);

        boolean ver = true;
        try {
            Supporto sup = new Supporto(1, 1,1) {
            @Override
            public boolean compatibile() {
                return false;
            }
        };

            q = new Quadro("pietro", "fABBRI","Pezzo di cuore", 1.5, 2);
            c.aggiungiOpera(q);

            s = new SculturaDeperibile("FRANCO", "aRmaNI","Abaco",1, 1, 1, sup,  "marmo", 10);
            c.aggiungiOpera(s);

            System.out.println("\nQuadro: " + q.toString());
            System.out.println("Scultura: " + s.toString());

            System.out.println("\nColleazione: "+c.toString());



            ver = true;
        } catch (Exception e) {
            System.out.println("Problema!" + e.getMessage());
            ver = false;
        }
    }

}
