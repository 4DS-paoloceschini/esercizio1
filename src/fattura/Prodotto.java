package fattura;

public class Prodotto {
    private String nome, descrizione;
    private int iva;
    private double prezzo;

    Prodotto (String nome, String descrizione, double prezzo) throws Exception {
        setNome(nome);
        setIva(descrizione);
        setPrezzo(prezzo);
    }

    public void setNome(String nome) throws Exception {
        if (nome == null){
            throw new Exception("NOME NULLO");
        }
        this.nome = nome;
    }

    private void setIva(String descrizione) throws Exception {
        if (descrizione == null) {
            throw new Exception("DESCRIZIONE ERRATA");
        }

        if (descrizione.equals("pc")) { //c sta per casa in quanto la maggior parte delle opere con iva al 10% sono opere per la casa/edificio
            this.iva = 10;
        }
        if (descrizione.equals("ps")) {//s sta per prestazioni sociali, sanitarie o educative delle cooperative sociali
            this.iva = 5;
        }
        if (descrizione.equals("pn")) {//pn sta per prima necessità
            this.iva = 4;
        }
        if (descrizione.equals("altro")) {
            this.iva = 22;
        }
    }

    public void setPrezzo(double prezzo) throws Exception {
        if (prezzo<=0){
            throw new Exception("PREZZO ERRATO");
        }
        this.prezzo = prezzo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "DESCRIZIONE IVA(%) PREZZO(€)" + "\n" + nome + " " + iva + " " + prezzo;
    }
}
