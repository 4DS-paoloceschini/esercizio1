package Poligoni;

public class ElencoPoligoni {
    private PoligoniRegolari[] poligoni;
    int dimLog = 0;
    public ElencoPoligoni(int nPoligoni) {
        poligoni = new PoligoniRegolari[nPoligoni];
    }
    public void aggiungiPoligono(PoligoniRegolari p) {
        poligoni[dimLog] = new PoligoniRegolari(p);
        dimLog++;
    }
    public double calcolaAreaMedia() {
        double sommaAree = 0.0;
        for (int i = 0; i < dimLog; i++) {
            sommaAree += poligoni[i].calcolaArea();
        }
        return sommaAree / dimLog;
    }
    public double calcolaPerimetroTotale() {
        double perimetroTotale = 0.0;
        for (int i = 0; i < dimLog; i++) {
            perimetroTotale += poligoni[i].calcolaPerimetro();
        }
        return perimetroTotale;
    }
}
