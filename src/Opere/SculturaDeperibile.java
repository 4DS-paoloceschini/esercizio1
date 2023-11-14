package Opere;

import java.util.Objects;

import static java.lang.Math.pow;

public class SculturaDeperibile extends Scultura{
    private String materiale;
    private double eta;

    public SculturaDeperibile(String nome, String cognome, String titolo, double altezza, double lunghezza, double profondita,Supporto supporto, String materiale, double eta){
        super(nome, cognome, titolo, altezza, lunghezza, profondita, supporto);
        setMateriale(materiale.toLowerCase());
        setEta(eta);
    }

    public void setMateriale(String materiale) {
        this.materiale = materiale;
    }

    public void setEta(double eta) {
        this.eta = eta;
    }

    public double consumo(){
        double consumo = 1;
        if (Objects.equals(materiale, "marmo")){
            consumo = pow(0.99, eta);
        }
        if (Objects.equals(materiale, "ghiaccio")){
            consumo = pow(0.0001, eta);
        }
        if (Objects.equals(materiale, "sabbia")){
            consumo = pow(0.000001, eta);
        }
        if (Objects.equals(materiale, "vetro")){
            consumo = pow(0.80, eta);
        }
        if (Objects.equals(materiale, "porfido")){
            consumo = pow(0.95, eta);
        }
        return consumo;
    }

    @Override
    public String toString() {
        return super.toString()+" Ingombro dopo "+eta+" anni : "+printingombro()*consumo()+" m3"+ '\'' +
                '}';
    }
}
