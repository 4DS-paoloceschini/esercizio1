package Opere;

public class Quadro extends OperaDArte{
    private double altezza;
    private double lunghezza;

    public Quadro(String nome, String cognome, String titolo, double altezza, double lunghezza) {
        super(nome, cognome, titolo);
        setAltezza(altezza);
        setLunghezza(lunghezza);
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }

    public double printingombro() {
        return altezza*lunghezza;
    }

    @Override
    public String toString() {
        return "Quadro{" +
                "altezza=" + altezza +
                ", lunghezza=" + lunghezza + " Ingombro= "+printingombro()+"m2"+ " "+ super.toString()+'}';
    }
}
