import java.util.Scanner;
public class Fibonacci {
    final static Scanner Reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Geben Sie eine Zahl > 0 ein: ");
        int zahl = Reader.nextInt();
        checkAmount(zahl);
        System.out.println();
        System.out.println(fibb(zahl));


    }

    public static int fibb(int zahl){
        if (zahl <= 1){
            return zahl;
        }
            return fibb(zahl-1) + fibb(zahl-2);
    }

    public static int checkAmount(int zahl){
        if(zahl < 0) return -1;
        else {
            return zahl;
        }
    }
}
