package verifica;

public class HashTable1{

    private PersonaHT[] ELEMENTS;

    public HashTable1 (){
        ELEMENTS = new PersonaHT[11];
    }

    public PersonaHT[] getELEMENTS() {
        return ELEMENTS;
    }

    public void addElement(PersonaHT element) {
        ELEMENTS[findPosition(element)] = element;
    }

    public Integer findElement(PersonaHT element) {
        if (ELEMENTS[findPosition(element)].getNome().equals(element.getNome())){
            return findPosition(element);
        }
        else {
            return -1;
        }
    }

    //@Override
    private Integer findPosition(PersonaHT element) {
        return element.getAscii()%11;
    }

    public String toString(){
        String str = "[ ";
        int i;
        for (i = 0; i<10; i++){
            str += ELEMENTS[i].getNome() + " " + ELEMENTS[i].getDataDiNascita() + ", ";
        }
        str+= ELEMENTS[i+1].getNome() + " " + ELEMENTS[i+1].getDataDiNascita();
        str += " ]";
        return str;
    }
}
