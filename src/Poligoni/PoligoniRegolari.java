package Poligoni;

class PoligoniRegolari {
    protected double lato;
    protected int numeroLati;
    double area;
    public PoligoniRegolari(double lato, int numeroLati) throws Exception{
        if (lato<=0){
            throw new Exception("IL LATO NON PUO' ESSERE UGUALE  MINORE A 0!");
        }
        if (numeroLati<4 || numeroLati>6){
            throw new Exception("NESSUNO DEI POLIGONI DISPONIBILI HA "+numeroLati+" LATI!");
        }
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
