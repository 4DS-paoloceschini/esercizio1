package interfacciaConfrontabile;

public interface Confrontabile {

    public abstract boolean isGreater(Confrontabile c) throws Exception;
    public abstract boolean isEquals(Confrontabile c) throws Exception;
    public abstract boolean isSmaller(Confrontabile c) throws Exception;
}
