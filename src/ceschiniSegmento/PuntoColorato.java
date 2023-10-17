package ceschiniSegmento;

public class PuntoColorato extends Punto {
    private Colore colore;

    public PuntoColorato(double x, double y, Colore c){
        super(x, y);
        this.colore = c;
    }

    public void setColore(Colore newColore)throws Exception{
        if(newColore==colore){
			throw new Exception ("Devi inserire un colore diverso da quello attuale!");
        }
        else{
            this.colore = newColore;
        }
    }

    public void aggiungiColore(Colore ColAggiunto){
        int r = (colore.getR() + ColAggiunto.getR())/2;
        colore.setR(r);
        int g = (colore.getG() + ColAggiunto.getG())/2;
        colore.setR(g);
        int b = (colore.getB() + ColAggiunto.getB())/2;
        colore.setR(b);
    }

    public Colore getZ(){
        return colore;
    }

    public String toString(){
        return super.toString()+" RGB ("+colore.getR()+", "+colore.getG()+", "+colore.getB()+")";
    }

}
