package Poligoni;

class Esagono extends PoligoniRegolari {
    public Esagono(double lato) {
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
        return 2 * calcolaArea() / 2 * calcolaPerimetro();
    }
    public String toString() {
        return super.toString()+"\n Perimetro: "+calcolaPerimetro()+", Area: "+calcolaArea()+", Apotema: "+calcolaApotema()+", Diagonale: "+calcolaDiagonale();
    }
}