package Studente;

public class Studente {
    private String nome;
    private String cognome;

    public Studente(String n, String c){
        nome = n;
        cognome = c;
    }

    public Studente(Studente stud){
        nome = stud.nome;
        cognome = stud.cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setNome(String nome) throws Exception{
        try {
            if (nome == null){
                throw new Exception("Nome nullo!");
            }
            if(!nome.equals("")){
                this.nome = nome;
            }
            else{
                throw new Exception("Nome vuoto!");
            }
        }catch (Exception e){
            System.out.println("Ua");
        }
    }

    public void setCognome(String cognome) {
        try {
            if (cognome == null){
                throw new Exception("Nome nullo!");
            }
            if(!cognome.equals("")){
                this.cognome = cognome;
            }
            else{
                throw new Exception("Nome vuoto!");
            }
        }catch (Exception e){
            System.out.println("Ua");
        }
    }

    public String toString() {
        return "Studente{" + "nome='" + nome + '\'' + ", cognome='" + cognome + '\'' + '}';
    }
}
