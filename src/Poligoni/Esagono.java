package Poligoni;

public class Esagono extends PoligoniRegolari {
    public Esagono(double lato) throws Exception {
        super(lato, 6);
        this.lato = lato;
    }
    public double calcolaArea() {
        return (1.5 * Math.sqrt(3)) * lato * lato;
    }
    public double calcolaDiagonale() {
        return 2 * lato;
    }
    public double calcolaApotema() {
        return lato*0.866;
    }

    public String disegna() {
        String result = "";
        for (int riga = 1; riga <= 2 * lato - 1; riga++) {
            for (int spazio = 1; spazio <= Math.abs(lato - riga); spazio++) {
                result += " ";
            }
            for (int colonna = 1; colonna <= 2 * lato - 1; colonna++) {
                if (colonna == 1 || colonna == 2 * lato - 1 || riga == 1 || riga == 2 * lato - 1) {
                    result += "#";
                } else {
                    result += " ";
                }
            }
            result += "\n";
        }
        return result;
    }

    public String toString() {
        return super.toString()+"\n Perimetro: "+calcolaPerimetro()+", Area: "+calcolaArea()+", Apotema: "+calcolaApotema()+", Diagonale: "+calcolaDiagonale();
    }
}