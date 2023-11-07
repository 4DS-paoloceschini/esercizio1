package Poligoni;

public class Main {
    public static void main(String[] args) {

        PoligoniRegolari pr1;

        ElencoPoligoni ep = new ElencoPoligoni(4);

        Quadrato q = new Quadrato(4);
        pr1 = q;
        ep.aggiungiPoligono(pr1);

        Rombo r  = new Rombo(4, 5, 3);
        pr1 = r;
        ep.aggiungiPoligono(pr1);

        Pentagono p = new Pentagono(4);
        pr1 = p;
        ep.aggiungiPoligono(pr1);

        Esagono e = new Esagono(4);
        pr1 = e;
        ep.aggiungiPoligono(pr1);

        System.out.println(""+q.toString());
        System.out.println(""+r.toString());
        System.out.println(""+p.toString());
        System.out.println(""+e.toString());

        System.out.println("\nQuadrato: \n"+q.disegna());
        System.out.println("\nPentagono: \n"+p.disegna());
        System.out.println("\nRombo: \n"+r.disegna());
        System.out.println("\nEsagono: \n"+e.disegna());

        System.out.println("Somma dei perimetri: "+ep.calcolaPerimetroTotale());
        System.out.println("Area media dei poligoni: "+ep.calcolaAreaMedia());

    }
}
