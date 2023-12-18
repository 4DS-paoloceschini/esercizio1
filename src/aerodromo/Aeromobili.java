package aerodromo;

public abstract class Aeromobili implements Confrontabile{
    protected String sigla;

    public Aeromobili (String s){
        this.sigla = s;
    }

    public String getSigla() {
        return sigla;
    }

    @Override
    public abstract boolean isGreater(Confrontabile c) throws Exception;

    @Override
    public String toString() {
        return "Questo "+sigla+" è dotato di ";
    }
}

