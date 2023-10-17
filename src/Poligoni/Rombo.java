package Poligoni;

class Rombo extends PoligoniRegolari {
    private double diagonaleMaggiore;
    private double diagonaleMinore;

    public Rombo(double lato, double diagonaleMaggiore, double diagonaleMinore) {
        super(lato, 4);
        this.diagonaleMaggiore = diagonaleMaggiore;
        this.diagonaleMinore = diagonaleMinore;
    }
    public double calcolaArea() {
        return (diagonaleMaggiore * diagonaleMinore) / 2.0;
    }
    public double calcolaApotema() {
        return Math.sqrt((lato * lato)*(lato*4));
    }
    public String toString() {
        return super.toString()+"\n Perimetro: "+calcolaPerimetro()+", Area: "+calcolaArea()+", Apotema: "+calcolaApotema()+", Diagonale Maggiore: "+diagonaleMaggiore+", Diagonale Minore"+diagonaleMinore;
    }
}
