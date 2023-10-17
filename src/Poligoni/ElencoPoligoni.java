package Poligoni;

class ElencoPoligoni {
    private PoligoniRegolari[] poligoni;
    int dimLog = 0;
    public ElencoPoligoni(int nPoligoni) {
        poligoni = new PoligoniRegolari[nPoligoni];
    }
    public void aggiungiPoligono(PoligoniRegolari p) {
        poligoni[dimLog] = new PoligoniRegolari(p) {
            public double calcolaArea() {
                return 0;
            }
        };
        dimLog++;
    }
    public double calcolaAreaMedia() {
        double sommaAree = 0.0;
        for (int i = 0; i < dimLog; i++) {
            sommaAree += poligoni[i].getArea();
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
