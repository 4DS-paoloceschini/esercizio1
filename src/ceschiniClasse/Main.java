package ceschiniClasse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Studente cC = new Studente("Bobo", "Vieri");
        Studente s1 = new Studente("Giud","Belingam");
        Studente s2 = new Studente("Leo", "Mehi");
        Studente s3 = new Studente("Fenomeno", "Musiala");
        Studente[] arrStud;
        arrStud = new Studente[]{s1, s2, s3};
        Classe c = new Classe(cC, arrStud);

        System.out.println(c.toString());
        c.invertiAttributi();
        System.out.println(c.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(cC.toString());
    }
}