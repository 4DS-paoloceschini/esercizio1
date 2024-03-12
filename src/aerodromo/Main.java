package aerodromo;

public class Main {
    public static void main(String[] args) {

        Aeromotore a1 = null;
        Aliante a2 = null;
        Aeromotore a3 = null;
        Aliante a4 = null;

        try{
            a1 = new Aeromotore("Sr1", 1200);
            a2 = new Aliante("GR4", 120);
            a3 = new Aeromotore("FJ2", 1000);
            a4 = new Aliante("czs2", 130);

            System.out.println("A1 e A3: "+a1.isGreater(a3));
            System.out.println("A2 e A4: "+a2.isGreater(a4));
            System.out.println("A3 e A1: "+a3.isGreater(a1));
            System.out.println("A4 e A2: "+a4.isGreater(a2));

            System.out.println(a1.toString());
            System.out.println(a2.toString());
            System.out.println(a3.toString());
            System.out.println(a4.toString());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
