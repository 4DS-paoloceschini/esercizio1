package Studente;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validatore {

    public static void main(String[] args) {
        // Esempi di dati da validare
        String email = "utente@example.com";
        String password = "Password123";
        String targaAuto = "BO000RM";
        String cap = "12345";
        String indirizzoIP = "192.168.1.1";
        String url = "https://www.example.com";
        String codiceFiscale = "RSSMRA80M01H501Z";

        // Esempi di chiamate per la validazione
        System.out.println("Email valida: " + isValidEmail(email));
        System.out.println("Password valida: " + isValidPassword(password));
        System.out.println("Targa auto valida: " + isValidTargaAuto(targaAuto));
        System.out.println("CAP valido: " + isValidCAP(cap));
        System.out.println("Indirizzo IP valido: " + isValidIndirizzoIP(indirizzoIP));
        System.out.println("URL valido: " + isValidURL(url));
        System.out.println("Codice Fiscale valido: " + isValidCodiceFiscale(codiceFiscale));
    }

    // Metodo per la validazione di un'email
    private static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";
        return email.matches(regex);
    }

    // Metodo per la validazione di una password (almeno 8 caratteri, almeno una lettera maiuscola, una lettera minuscola e un numero)
    private static boolean isValidPassword(String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";
        return password.matches(regex);
    }

    // Metodo per la validazione di una targa auto italiana
    private static boolean isValidTargaAuto(String targaAuto) {
        String regex = "^[A-Z]{2}\\d{5}[A-Z]{2}$";
        return targaAuto.matches(regex);
    }

    // Metodo per la validazione di un CAP italiano (5 cifre)
    private static boolean isValidCAP(String cap) {
        String regex = "^\\d{5}$";
        return cap.matches(regex);
    }

    // Metodo per la validazione di un indirizzo IP
    private static boolean isValidIndirizzoIP(String indirizzoIP) {
        String regex = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        return indirizzoIP.matches(regex);
    }

    // Metodo per la validazione di un URL
    private static boolean isValidURL(String url) {
        String regex = "^(http|https)://[a-zA-Z0-9-.]+\\.[a-zA-Z]{2,}(?:/[^\\s]*)?$";
        return url.matches(regex);
    }

    // Metodo per la validazione di un codice fiscale italiano
    private static boolean isValidCodiceFiscale(String codiceFiscale) {
        String regex = "^[A-Z]{6}\\d{2}[A-Z]\\d{2}[A-Z]\\d{3}[A-Z]$";
        return codiceFiscale.matches(regex);
    }
}
