import java.util.Scanner;

public class Es3 {
    public static void main (String[] args){
//    Perimetro Rettangolo
        double lato1 = 2.5;
        double lato2 = 4.3;
        System.out.println("Il perimetro è : "+ (lato1+lato2)*2);
//        Pari Dispari
        Scanner paridisp = new Scanner(System.in);
        System.out.print("Inserisci il numero: ");
        int numero = paridisp.nextInt();
        System.out.println("Il numero inserito è : " + numero%2);
//        Area del triangolo
        double a = 2.2;
        double b = 3.4;
        double c = 4.5;
        double perimetro = (a+b+c);
        double semi = (a+b+c)/2;
        System.out.println("Il perimetro è : "+ perimetro);
        System.out.println("Il semiperimetro è : " + semi);
        double Area = Math.sqrt(semi * (semi-a)*(semi-b)*(semi-c));
        System.out.println("l'Area del triangolo è : " + Area);


    }
}
