package Poligoni;

abstract class PoligoniRegolari {
    protected double lato;
    protected int numeroLati;
    double area;
    private static int numeroIstanze;
    public PoligoniRegolari(double lato, int numeroLati) throws Exception{
        if (lato<=0){
            throw new Exception("IL LATO NON PUO' ESSERE UGUALE  MINORE A 0!");
        }
        if (numeroLati<4 || numeroLati>6){
            throw new Exception("NESSUNO DEI POLIGONI DISPONIBILI HA "+numeroLati+" LATI!");
        }
        setLato(lato);
        this.numeroLati = numeroLati;
        area = 0.0;
        numeroIstanze+=1;
    }
    public PoligoniRegolari(PoligoniRegolari p) {
        this.lato = p.lato;
        this.numeroLati = p.numeroLati;
    }
    public void setLato(double lato)throws Exception{
        if (lato<=0){
            throw new Exception("IL LATO NON PUO' ESSERE UGUALE  MINORE A 0!");
        }
        else{
            this.lato = lato;
        }
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
    public static int getNumeroIstanze(){
        return numeroIstanze;
    }
    public double calcolaPerimetro() {
        return lato * numeroLati;
    }

    public abstract double calcolaArea();

    public String toString() {
        return "Poligono Regolare con " + numeroLati + " lati";
    }

    public String toStringInt(){
        return ""+numeroIstanze;
    }
}
