package ceschiniSegmento;

import static java.lang.Math.sqrt;

class Segmento {
    private Punto p1;
    private Punto p2;

    public Segmento(Punto pt1, Punto pt2){
        this.p1 = new Punto(pt1);
        this.p2 = new Punto(pt2);;
    }

    public void setP1(Punto pt){
        this.p1 = new Punto(pt.getX(), pt.getY());
    }
    public void setP2(Punto pt){
        this.p2 = new Punto(pt.getX(), pt.getY());
    }

    public Punto getP1(){
        p1 = new Punto(p1);
        return p1;
    }
    public Punto getP2(){
        p2 = new Punto(p2);
        return p2;
    }

    public double lunghezza(){
        double x = Math.pow((p2.getX()-p1.getX()),2);
        double y = Math.pow(p2.getY()-p1.getY(),2);
        double radice = sqrt(x+y);
        return radice;
    }

    public void traslaSegmento(float tX, float tY){
        p1.traslaPunto(tX, tY);
        p2.traslaPunto(tX, tY);
    }

    @Override
    public String toString() {
        return "Segmento{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
