package fattura;

public class Ora {

    private int ora, minuti, secondi;

    public Ora(int o, int m, int s){
        ora = o;
        minuti = m;
        secondi = s;
    }

    public int getOra() {
        return ora;
    }
    public int getMinuti() {
        return minuti;
    }
    public int getSecondi() {
        return secondi;
    }

    public void setOra(int o) {
        if(o>=24){
            o-=24;
        }
        if(o+ora>=24){

        }
    }
    public void setMinuti(int minuti) {
        while (minuti>=60){
            ora+=1;
            minuti-=60;
        }
    }
    public void setSecondi(int secondi) {
    }

    public int oreMancanti(){
        int ore = 24-ora;
        return ore;
    }
    public int minMancanti(){
        int minManc = (60-minuti)+(ora*60);
        return minManc;
    }
    public int secMancanti(){
        int secManc=(60-secondi)+(minuti*60)+(ora*3600);
        return secManc;
    }

    public int minPassati(){
        int minPas = minuti;
        int i = ora;
        while(i<=23){
            minPas+=60;
        }
        return minPas;
    }
    public int secPassati(){
        int secPas=secondi;
        int i = ora;
        while(i<=23){
            secPas+=3600;
        }
        i = minuti;
        while(i<=60){
            secPas+=60;
        }
        return secPas;
    }


    @Override
    public String  toString() {
        return "Orario{" +
                "ora=" + ora +
                ", minuti=" + minuti +
                ", secondi=" + secondi +
                '}';
    }
}

