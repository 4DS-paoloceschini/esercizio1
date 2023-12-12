package interfacciaConfrontabile;

public class Main {
    public static void main(String[] args) throws Exception {
        Quadrato q = null;
        Pentagono p = null;
        Persona p1 = null;
        Persona p2 = null;

        try {
            q = new Quadrato(4);
            p = new Pentagono(5);
            p1 = new Persona("Mafe", "sdffs", 15);
            p2 = new Persona("fewrf", "fer", 14);
        } catch (Exception e) {
            System.out.println("das");
        }

        if (q.isEquals(p)){
            System.out.println("Vero");
        }
        else{
            System.out.println("Falso");
        }
        if (q.isGreater(p)){
            System.out.println("Vero");
        }
        else{
            System.out.println("Falso");
        }
        if (q.isSmaller(p)){
            System.out.println("Vero");
        }
        else{
            System.out.println("Falso");
        }

        if (p1.isEquals(p2)){
            System.out.println("Vero");
        }
        else{
            System.out.println("Falso");
        }
        if (p1.isGreater(p2)){
            System.out.println("Vero");
        }
        else{
            System.out.println("Falso");
        }
        if (p1.isSmaller(p2)){
            System.out.println("Vero");
        }
        else{
            System.out.println("Falso");
        }
    }
}
