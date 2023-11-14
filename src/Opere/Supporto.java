package Opere;

public abstract class Supporto {
    private double altezza;
    private double lunghezza;
    private double larghezza;

    public Supporto(double altezza, double lunghezza, double larghezza){
        setLarghezza(larghezza);
        setAltezza(altezza);
        setLunghezza(lunghezza);
    }

    public abstract boolean compatibile();

    private void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    private void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }

    private void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public double getLarghezza() {
        return larghezza;
    }
}
