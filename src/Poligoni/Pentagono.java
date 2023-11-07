package Poligoni;

class Pentagono extends PoligoniRegolari {
    public Pentagono(double lato) {
        super(lato, 5);
        this.lato = lato;
    }
    public double calcolaArea() {
        return (lato*lato)*1.72;
    }
    public double calcolaDiagonale() {
        return lato*(1 + Math.sqrt(5))/2;
    }
    public double calcolaApotema() {
        return lato*0.688;
    }

    public String disegna() {
        String result = "";
        for (int riga = 1; riga <= lato; riga++) {
            for (int spazio = 1; spazio <= lato - riga; spazio++) {
                result += " ";
            }
            for (int colonna = 1; colonna <= 2 * riga - 1; colonna++) {
                if (colonna == 1 || colonna == 2 * riga - 1 || riga == lato) {
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