package Soldi;

public class Conto {
    private String iban;
    private String titolare;
    private double saldo;

    public Conto(String iban, String titolare, double saldo) {
        this.iban = iban;
        this.titolare = titolare;
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public String getTitolare() {
        return titolare;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double deposito){
        //possibili controlli se si mette un limite di soldi depositati sul conto ogni anno
        saldo += deposito;
    }

    public void prelievo(double prelievo)throws Exception{
        if (prelievo<saldo){
            throw new Exception("Prelievo troppo alto, non hai abbastanza soldi sul conto!");
        }
        else{
            saldo -= prelievo;
        }
    }
}
