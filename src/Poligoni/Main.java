package Poligoni;

import java.util.Scanner;

import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        ElencoPoligoni ep = new ElencoPoligoni(4);

        boolean ver = true;
        do {
            try {
                System.out.println("Inserisci il lato del quadrato: ");
                int lq = input.nextInt();
                Quadrato q = new Quadrato(lq);
                ep.aggiungiPoligono(q);

                System.out.println("Inserisci il lato del rombo: ");
                int lr= input.nextInt();
                int dMin;
                int dMag;
                do{
                    System.out.println("\nLa prima diagonale deve essere maggiore della seconda!");
                    do{
                        System.out.println("Le diagnoali devono essere > a 0");
                        System.out.println("\nInserisci la diagonale maggiore del rombo: ");
                        dMag= input.nextInt();
                        System.out.println("Inserisci la diagonale minore del rombo: ");
                        dMin= input.nextInt();
                    }while(dMin<=0 || dMag <=0);

                }while (dMin>dMag);

                Rombo r = new Rombo(lr,  dMag, dMin);
                ep.aggiungiPoligono(r);

                System.out.println("\nInserisci il lato del pentagono: ");
                int lp = input.nextInt();
                Pentagono p = new Pentagono(lp);
                ep.aggiungiPoligono(p);

                System.out.println("\nInserisci il lato dell'esagono: \n");
                int le = input.nextInt();
                Esagono e = new Esagono(le);
                ep.aggiungiPoligono(e);

                System.out.println("\n" + q.toString());
                System.out.println("\n" + r.toString());
                System.out.println("\n" + p.toString());
                System.out.println("\n" + e.toString());

                System.out.println("\nSomma dei perimetri: " + ep.calcolaPerimetroTotale());
                System.out.println("Area media dei poligoni: " + ep.calcolaAreaMedia());

                ver = true;
            } catch (Exception e) {
                System.out.println("Problema!" + e.getMessage());
                ver = false;
            }
        }while(!ver);
    }
}
