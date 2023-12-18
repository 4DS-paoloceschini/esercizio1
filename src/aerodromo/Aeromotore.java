package aerodromo;

public class Aeromotore extends Aeromobili{
    private  double cv;

    public Aeromotore(String s, double cv){
        super(s);
        this.cv = cv;
    }


    public double getCV(){
        return cv;
    }

    public boolean equals(Object oggetto) {
        Boolean verifica = false;

        if (oggetto instanceof Aeromotore) {
            Aeromotore a = (Aeromotore) oggetto;

            if (getSigla().equals(a.getSigla()) && getCV()==a.getCV()){

                verifica = true;
            }
        }

        return verifica;
    }

    @Override
    public boolean isGreater(Confrontabile c) throws Exception {
        boolean ris = false;
        if (c instanceof Aeromotore){
            if (((Aeromotore) c).getCV()>cv){
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
        return super.toString()+"un motore da "+getCV()+" cavalli!";
    }
}
