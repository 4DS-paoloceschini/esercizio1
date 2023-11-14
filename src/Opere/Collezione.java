package Opere;

import java.util.Arrays;
import java.util.Objects;

public class Collezione {
        private OperaDArte[] collezione;
        int dimLog = 0;
        public Collezione(int n) {
            collezione = new OperaDArte[n];
        }
        public void aggiungiOpera(OperaDArte op) throws Exception {
            if (dimLog==0){
                collezione[0] = op;
            }
            for (int i = 1; i < dimLog; i++) {
                if (Objects.equals(op, collezione[i])) {
                    throw new Exception("Opera già esistente!");
                }
            }
            collezione[dimLog] = op;
            dimLog++;
        }

        public String cercaOpera(OperaDArte o){
            boolean ver = false;
            for (int i = 0; i<dimLog; i++){
                if (collezione[i].equals(o)){
                    ver = false;
                    return collezione[i].toString();
                }
            }
            if(!ver){
                return "Non eiste nessun' opera con queste caratteristiche!";
            }
            return "";
        }

    @Override
    public String toString() {
        String ritorno = "";
        for (int i = 0; i<dimLog; i++){
            ritorno += "\n" + collezione[i].toString();
        }
        return ritorno;
    }
}
