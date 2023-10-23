package Poligoni;

class Quadrato extends PoligoniRegolari {
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

    @Override
    public String toString() {
        return super.toString()+"\n Perimetro: "+calcolaPerimetro()+", Area: "+calcolaArea()+", Apotema: "+calcolaApotema()+", Diagonale: "+calcolaDiagonale();
    }
}
