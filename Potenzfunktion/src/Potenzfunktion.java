import java.util.Scanner;
public class Potenzfunktion{

    public static Scanner Reader = new Scanner(System.in);
    public static int powi(int zahl, int potenz){

        if(potenz == 1) return zahl;
        if(potenz == 0) return 1;
        else{
            return zahl*powi(zahl, potenz-1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Geben Sie eine Zahl größer 0 ein: ");
        int zahl = Reader.nextInt();
        System.out.println();
        System.out.print("Geben Sie eine Potenz größer 0 ein: ");
        int potenz = Reader.nextInt();
        System.out.println(powi(zahl, potenz));
    }

}