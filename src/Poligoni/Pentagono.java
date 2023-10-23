package Poligoni;

class Pentagono extends PoligoniRegolari {
    public Pentagono(double lato) throws Exception {
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
    public String toString() {
        return super.toString()+"\n Perimetro: "+calcolaPerimetro()+", Area: "+calcolaArea()+", Apotema: "+calcolaApotema()+", Diagonale: "+calcolaDiagonale();
    }
}