package Poligoni;

public class Main {
    public static void main(String[] args) {

        ElencoPoligoni ep = new ElencoPoligoni(4);

        Quadrato q = new Quadrato(4);
        ep.aggiungiPoligono(q);

        Rombo r  = new Rombo(4, 5, 3);
        ep.aggiungiPoligono(r);

        Pentagono p = new Pentagono(4);
        ep.aggiungiPoligono(p);

        Esagono e = new Esagono(4);
        ep.aggiungiPoligono(e);

        System.out.println(""+q.toString());
        System.out.println(""+r.toString());
        System.out.println(""+p.toString());
        System.out.println(""+e.toString());

        System.out.println("Somma dei perimetri: "+ep.calcolaPerimetroTotale());
        System.out.println("Area media dei poligoni: "+ep.calcolaAreaMedia());

    }
}
