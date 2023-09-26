package ceschiniClasse;

import java.util.Arrays;

public class Classe {
    private Studente capoClasse;
    private Studente[] studenti;

    public Classe(Studente capoClasse, Studente[] studenti){
        this.capoClasse=capoClasse;
        this.studenti=studenti;
    }
    public Classe(Classe classe){
        this.studenti= classe.studenti;
        this.capoClasse=classe.capoClasse;
    }

    public Studente getCapoClasse() {
        return capoClasse;
    }

    public void setCapoClasse(Studente capoClasse) {
        this.capoClasse = capoClasse;
    }

    public Studente[] getStudenti() {
        return studenti;
    }

    public void setStudenti(Studente[] studenti) {
        this.studenti = studenti;
    }

    public void controlloStudenti()throws Exception{
        int i = 0;
        int j = 0;
        for (i = 0; i< studenti.length; i++){
            for (j = 0;j< studenti.length; j++){
                if (studenti[i].getCognome()==studenti[j].getCognome() && studenti[i].getNome()==studenti[j].getNome()){
                    throw Exception();
                }
            }
        }
    }

    public void invertiAttributi(){
        int i = studenti.length;
        for (i= studenti.length-1;i>=0; i--){
            studenti[i] = new Studente(studenti[i].getCognome(), studenti[i].getNome());
        }
        capoClasse = new Studente(capoClasse.getCognome(), capoClasse.getNome());
    }

    @Override
    public String toString() {
        return "Classe{" +
                "capoClasse='" + capoClasse + '\'' +
                ", studenti=" + Arrays.toString(studenti) +
                '}';
    }
}
