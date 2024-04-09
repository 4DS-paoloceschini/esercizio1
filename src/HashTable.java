package ceschini;

public interface HashTable<T> {

    public Object[] getELEMENTS();

    public void addElement(T element);

    public Integer findElement(T element);

    public boolean isFull();

    public String toString();

}
