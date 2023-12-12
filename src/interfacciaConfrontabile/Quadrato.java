package interfacciaConfrontabile;

public class Quadrato extends PoligoniRegolari {
    public Quadrato(double lato) throws Exception {
        super(lato, 4);
        this.lato = lato;
    }
    public double calcolaArea() {
        return lato * lato;
    }
    public double calcolaDiagonale() {
        return Math.sqrt(2) * lato;
    }
    public double calcolaApotema() {
        return lato / 2;
    }

    public String disegna() {
        String result = "";
        for (int riga = 1; riga <= lato; riga++) {
            for (int colonna = 1; colonna <= lato; colonna++) {
                if (riga == 1 || riga == lato || colonna == 1 || colonna == lato) {
                    result += "#";
                } else {
                    result += " ";
                }
            }
            result += "\n";
        }
        return result;
    }


    @Override
    public String toString() {
        return super.toString()+"\n Perimetro: "+calcolaPerimetro()+", Area: "+calcolaArea()+", Apotema: "+calcolaApotema()+", Diagonale: "+calcolaDiagonale();
    }

}
