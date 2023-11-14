package Opere;

import java.util.Objects;

public abstract class OperaDArte {
    protected String nome;
    protected String cognome;
    protected String titolo;

    public OperaDArte(String nome, String cognome, String titolo){
        setNome(nome);
        setCognome(cognome);
        setTitolo(titolo);

    }

    public String getTitolo() {
        return titolo;
    }

    private void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome.substring(0,1).toUpperCase()+nome.substring(1).toLowerCase();
    }

    public String getCognome() {
        return cognome;
    }

    private void setCognome(String cognome) {
        this.cognome = cognome.substring(0,1).toUpperCase()+cognome.substring(1).toLowerCase();
    }

    public abstract double printingombro();

    public boolean equals(OperaDArte o) {
        boolean ver = Objects.equals(o.getTitolo(), this.titolo) && Objects.equals(o.getCognome(), this.cognome) && Objects.equals(o.getNome(), this.nome) && printingombro() == o.printingombro();
        return ver;
    }

    @Override
    public String toString() {
        return "OperaDArte{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", titolo='" + titolo + "}";
    }
}
