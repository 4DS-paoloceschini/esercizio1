package Poligoni;

class PoligoniRegolari {
    protected double lato;
    protected int numeroLati;
    double area;
    public PoligoniRegolari(double lato, int numeroLati) {
        this.lato = lato;
        this.numeroLati = numeroLati;
        area = 0.0;
    }
    public PoligoniRegolari(PoligoniRegolari p) {
        this.lato = p.lato;
        this.numeroLati = p.numeroLati;
    }
    public void setLato(float lato) {
        this.lato = lato;
    }
    public double getLato() {
        return lato;
    }
    public void setNumLati(int n) {
        this.numeroLati = n;
    }
    public int getNumLati() {
        return numeroLati;
    }
    public double calcolaPerimetro() {
        return lato * numeroLati;
    }

    public double calcolaArea() {
        return 0;
    }

    public String toString() {
        return "Poligono Regolare con " + numeroLati + " lati";
    }
}
