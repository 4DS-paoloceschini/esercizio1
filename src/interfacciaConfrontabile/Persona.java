package interfacciaConfrontabile;

public class Persona implements Confrontabile {
        private String nome;
        private String cognome;
        private int eta;

        public Persona(String nome, String cognome, int eta){
            this.nome = nome;
            this.cognome = cognome;
            this.eta = eta;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCognome() {
            return cognome;
        }

        public void setCognome(String cognome) {
            this.cognome = cognome;
        }

        public int getEta(){
            return eta;
        }

        @Override
        public String toString() {
            return "Studente{" +
                    "nome='" + nome + '\'' +
                    ", cognome='" + cognome + '\'' +
                    '}';
        }

    @Override
    public boolean isGreater(Confrontabile p) throws Exception {
        if(!(p instanceof Persona)){
            throw new Exception(("Non è un istanza della classe!"));
        }
        return (((Persona) p).getEta()>eta);
    }

    @Override
    public boolean isEquals(Confrontabile p) throws Exception {
        if(!(p instanceof Persona)){
            throw new Exception(("Non è un istanza della classe!"));
        }
        return (((Persona) p).getEta()>eta);
    }

    @Override
    public boolean isSmaller(Confrontabile p) throws Exception {
        if(!(p instanceof Persona)){
            throw new Exception(("Non è un istanza della classe!"));
        }
        return (((Persona) p).getEta()<eta);
    }
}
