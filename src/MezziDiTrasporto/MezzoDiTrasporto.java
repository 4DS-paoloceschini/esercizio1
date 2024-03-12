package MezziDiTrasporto;

import java.util.Random;

public class MezzoDiTrasporto {
    private static float coeff = 0.73f;
    private Integer cavalli;
    private String marca;
    protected int numeroIstanze;

    MezzoDiTrasporto(){
        numeroIstanze++;
    }
    MezzoDiTrasporto (String marca, int cavalli){
        this();
        setMarca(marca);
        setCavalli(cavalli);
    }

    private void setMarca(String m) throws Exception{
        if (m.length()<3){
            throw new Exception("Marca non valida");
        }
        for (int i = 0; i<m.length(); i++){
            if (Character.isUpperCase(m.charAt(i))){
                throw new Exception("Devi inserire il nome della marca con tutte le lettere maiuscole")
            }
        }
        this.marca = m;
    }
    private void setCavalli(int c) throws Exception{
        Random rand = new Random();
        int cvMin = rand.nextInt(101) + 100;
    }
}
