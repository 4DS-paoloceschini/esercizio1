package verifica;

public class HashTable2 {
    private PersonaHT[] ELEMENTS;

    public HashTable2 (){
        ELEMENTS = new PersonaHT[11];
    }

    public PersonaHT[] getELEMENTS() {
        return ELEMENTS;
    }

    public void addElement(PersonaHT element) {
        if (ELEMENTS[findPosition(element)]==null){
            ELEMENTS[findPosition(element)]=element;
        }
        else{
            int f = findPosition(element);
            for (int i = f; i<11; i++){
                if (ELEMENTS[i]==null){
                    ELEMENTS[i]=element;
                }
                if (isFull()){
                    i=12;
                }
                if (i<=11){
                    i=0;
                } //invertiti dc
            }
        }
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

    public boolean isFull(){
        boolean ver = true;
        for (int i = 0; i<11; i++){
            if (ELEMENTS[i]==null){
                ver = !ver;
            }
        }
        return ver;
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
