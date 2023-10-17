package ceschiniSegmento;

public class Punto3D extends Punto{
    private double z;

    public Punto3D(double x, double y, double z){
        super(x,y);
        this.z = z;
    }

    public void setZ(float newZ)throws Exception{
        if(newZ==z){
			throw new Exception ("Devi inserire un valore diverso da quello attuale!");
        }
        else{
            this.z = newZ;
        }
    }

    public void trasla(double tX, double tY,double tZ){
        trasla(tX,tY);
        z += tZ;
    }

    public void traslaZ(float tZ)throws Exception{
        if(tZ==0){
			throw new Exception ("Devi inserire un valore diverso da 0!");
        }
        else{
            z += tZ;
        }
    }

    public double getZ(){
        return z;
    }

    public String toString(){
        return "("+getX()+","+getY()+","+z+")";
    }
}