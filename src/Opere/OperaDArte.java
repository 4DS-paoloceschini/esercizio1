package Opere;

public abstract class OperaDArte {
    protected String nome;
    protected String cognome;

    public OperaDArte(String nome, String cognome){
        setNome(nome);
        setCognome(cognome);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.substring(0,1).toUpperCase()+nome.substring(1).toLowerCase();
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome.substring(0,1).toUpperCase()+cognome.substring(1).toLowerCase();
    }

    public abstract double printingombro();

    @Override
    public String toString() {
        return "Autore{" +
                " nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }
}
