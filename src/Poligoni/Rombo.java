package Poligoni;

class Rombo extends PoligoniRegolari {
    private double diagonaleMaggiore;
    private double diagonaleMinore;

    public Rombo(double lato, double diagonaleMaggiore, double diagonaleMinore) {
        super(lato, 4);
        this.diagonaleMaggiore = diagonaleMaggiore;
        this.diagonaleMinore = diagonaleMinore;
    }
    public double calcolaArea() {
        return (diagonaleMaggiore * diagonaleMinore) / 2.0;
    }
    public double calcolaApotema() {
        return Math.sqrt((lato * lato)*(lato*4));
    }

    public String disegna(){
        String result = "";
        double spaziVuoti = diagonaleMaggiore/ 2;

        for(int riga = 1; riga <= diagonaleMaggiore; riga++){
            for(int spazio = 0; spazio < spaziVuoti; spazio++){
                result += " ";
            }

            for(int colonna = 0; colonna < diagonaleMaggiore - 2 * spaziVuoti; colonna++){
                result += "0";
            }

            result += "\n";

            if(riga <= diagonaleMaggiore / 2){
                spaziVuoti--;
            }else{
                spaziVuoti++;
            }
        }
        return result;
    }


    public String toString() {
        return super.toString()+"\n Perimetro: "+calcolaPerimetro()+", Area: "+calcolaArea()+", Apotema: "+calcolaApotema()+", Diagonale Maggiore: "+diagonaleMaggiore+", Diagonale Minore"+diagonaleMinore;
    }
}
