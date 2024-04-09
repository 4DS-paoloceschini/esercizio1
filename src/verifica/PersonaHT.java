package verifica;

import java.time.LocalDate;

public class PersonaHT {
    private String nome;
    private String dataDiNascita;

    public PersonaHT (String nome, String dataDiNascita) throws Exception {
        setNome(nome);
        setDataDiNascita(dataDiNascita);
    }

    public PersonaHT (PersonaHT p) throws Exception {
        setNome(p.getNome());
        setDataDiNascita(p.getDataDiNascita());
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public String getNome() {
         return nome;
    }

    public int getAscii(){
        int i;
        int somma = 0;
        for (i = 0; i<nome.length(); i++){
            somma = somma+nome.charAt(i);
        }
        return somma;
    }

    public void setDataDiNascita(String dataDiNascita) throws Exception {
        //controllo con le regex che le prime due posizioni siano tra 1 e il numero di giorni del mese
        //controllo che la terza sia "/"
        //controllo che quarta e quinta(per i mesi oltre settembre) siano un numero tra 1 e 12
        //controllo che la quinta/sesta sia "/"
        //controllo che le ultime 4 posizioni della stringa siano un numero realistico (non oltre il 2023)
        String ds = dataDiNascita.substring(0,2);
        String ms = dataDiNascita.substring(3,5);
        String as = dataDiNascita.substring(6,10);
        int data = Integer.parseInt(ds);
        int mese = Integer.parseInt(ms);
        int anno = Integer.parseInt(as);

        if (anno> LocalDate.now().getYear()){
            throw new Exception("Anno non valido");
        }
        if (mese<0 || mese>12){
            throw new Exception("Mese non valido");
        }
        if (mese> LocalDate.now().getMonthValue()){
            throw new Exception("Mese non valido");
        }

        if (anno%4==0){
            switch(mese){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (data<0 || data>31){
                        throw new Exception("Giorno non valido");
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (data<0 || data>30){
                        throw new Exception("Giorno non valido");
                    }
                    break;
                case 2:
                    if (data<0 || data>29){
                        throw new Exception("Giorno non valido");
                    }
            }
        }
        else{
            switch(mese){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (data<0 || data>31){
                        throw new Exception("Giorno non valido");
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (data<0 || data>30){
                        throw new Exception("Giorno non valido");
                    }
                    break;
                case 2:
                    if (data<0 || data>28){
                        throw new Exception("Giorno non valido");
                    }
            }
        }

    }

    public void setNome(String nome) throws Exception {
        /*if (nome.length()>3 && nome.charAt(0)>=65 || nome.charAt(0)<=90){
            this.nome = nome;
        }*/
        if (nome.matches("[A-Z][a-z]{2,}")){
            this.nome = nome;
        }
        else{
            throw new Exception("Formato del nome errato");
        }
    }
}
