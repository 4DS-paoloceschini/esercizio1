package aerodromo;

public class Aliante extends Aeromobili{
    private int efficienza;
    public Aliante(String s, int efficienza){
        super(s);
        this.efficienza = efficienza;
    }


    public double getEfficienza(){
        return efficienza;
    }

    public boolean equals(Object oggetto) {
        Boolean verifica = false;

        if (oggetto instanceof Aliante) {
            Aliante a = (Aliante) oggetto;

            if (getSigla().equals(a.getSigla()) && getEfficienza()==a.getEfficienza()){

                verifica = true;
            }
        }

        return verifica;
    }

    @Override
    public boolean isGreater(Confrontabile c) throws Exception {
        boolean ris = false;
        if (c instanceof Aliante){
            if (((Aliante) c).getEfficienza()>efficienza){
                ris = true;
            }
        }
        else{
            throw new Exception("L'oggetto passato non è confrontabile!");
        }

        return ris;
    }

    @Override
    public String toString() {
        return super.toString()+"un efficienza aerodinamica di "+getEfficienza()+"!";
    }
}

