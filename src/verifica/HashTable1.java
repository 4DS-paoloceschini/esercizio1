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
        return element.getAscii()%11; //modulo di questo
    }

    public String toString(){
        String str = "[ ";
        for (int i = 0; i<11; i++){
            str += ELEMENTS[i].getNome() + " " + ELEMENTS[i].getDataDiNascita() + ", ";
        }
        str += " ]";
        return str;
    }
}
