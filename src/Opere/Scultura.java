package Opere;

public class Scultura extends OperaDArte{
    protected double altezza;
    protected double lunghezza;
    protected double profondita;

    public Scultura(String nome, String cognome, String titolo, double altezza, double lunghezza, double profondita, Supporto s1){
        super(nome, cognome, titolo);
        boolean ver = s1.compatibile();{
            if (!(s1.getLarghezza() == profondita && s1.getAltezza() == altezza && s1.getLunghezza() == lunghezza)){
                System.out.println("Supporto non compatibile!");
            }
        }
        if (ver){
            setAltezza(altezza);
            setLunghezza(lunghezza);
            setProfondita(profondita);
        }


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

    public double getProfondita() {
        return profondita;
    }

    public void setProfondita(double profondita) {
        this.profondita = profondita;
    }

    public double printingombro() {
        return altezza*lunghezza*profondita;
    }

    @Override
    public String toString() {
        return "Scultura{" +
                "altezza=" + altezza +
                ", lunghezza=" + lunghezza +
                ", profondita=" + profondita + " Ingombro= "+ printingombro()+"m3" +" "+ super.toString();
    }
}
