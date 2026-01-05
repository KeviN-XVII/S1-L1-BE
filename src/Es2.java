import java.util.Scanner;

public class Es2 {
    public static void main (String[] args){
        Scanner stringhe = new Scanner(System.in);
        System.out.print("Inserisci il nome: ");
        String name = stringhe.nextLine();
        System.out.print("Inserisci il cognome: ");
        String surname = stringhe.nextLine();
        System.out.print("Inserisci l'username: ");
        String username = stringhe.nextLine();

        System.out.println("Il risultato è : " + name + " " + surname + " " + username);
        System.out.println("Il risultato è : " + username + " " + surname + " " + name);

    }
}
