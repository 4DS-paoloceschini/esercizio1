package Soldi;

public class Carta {
    private String numero;
    private String pin;
    private String scadenza;
    private Conto contoCorrente;

    public Carta(String numero, String pin, String scadenza, Conto contoCorrente)throws Exception{
        //controlli dei parametri
        this.numero = numero;
        this.pin = pin;
        this.scadenza = scadenza;
        this.contoCorrente = contoCorrente;
    }

    public String getNumero() {
        return numero;
    }

    public String getScadenza() {
        return scadenza;
    }

    public void prelievo(double prelievo) throws Exception {
        contoCorrente.prelievo(prelievo);
    }
}
