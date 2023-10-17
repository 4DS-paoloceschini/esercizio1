package ceschiniSegmento;
class Punto{
    private double x;
    private double y;


    public Punto(double pX, double pY){
        this.x = pX;
        this.y = pY;
    }

    public Punto(Punto p){
        this.x = p.x;
        this.y = p.y;
    }

    public double getX(){
        return x;
    }
    public void setX(float newX){
        x = newX;
    }

    public double getY(){
        return y;
    }
    public void setY(float newY){
        y = newY;
    }

    public void trasla(double tX, double tY){
        this.x += tX;
        this.y += tY;
    }

    @Override
    public String toString() {
        return "(" +
                "x" + x +
                ",y=" + y +
                ')';
    }
}
