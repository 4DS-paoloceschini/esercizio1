package fattura;

public class Azienda {
    private String nome, indirizzo, partitaIVA, telefono;

    Azienda (String nome, String indirizzo, String partitaIVA, String telefono) throws Exception {
        setNome(nome);
    }

    public void setNome(String nome) throws Exception {
        if (nome == null){
            throw new Exception("NOME NULLO");
        }
        this.nome = nome;
    }

    public void setIndirizzo(String indirizzo) throws Exception {
        if (indirizzo == null){
            throw new Exception("NOME NULLO");
        }
        this.indirizzo = indirizzo;
    }

    public void setPartitaIVA(String partitaIVA) throws Exception {
        if (partitaIVA == null){
            throw new Exception("NOME NULLO");
        }
        if (!(partitaIVA.matches("\\d+")) && !(partitaIVA.length() == 11)) {
            throw new Exception("FORMATO ERRATO");
        }
        this.partitaIVA = partitaIVA;
    }

    public void setTelefono(String telefono) throws Exception {
        if (telefono == null){
            throw new Exception("NOME NULLO");
        }
        if (!(telefono.matches("\\d+")) && !(telefono.length() == 10)) {
            throw new Exception("FORMATO ERRATO");
        }
        this.telefono = telefono;
    }
}
