import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
class Insertionsort 
{
    static Scanner Reader = new Scanner(System.in);
    static long timeBefore = 0;
    static long timeAfter = 0;
    public static void main(String[] args) 
    {
        final int[] testArr = { 37, 23, 0, 17, 12, 72, 31, 46, 100, 88, 54 };

        System.out.print("Wollen Sie absteigend oder aufsteigend sortieren [a, s]: ");
        char wahl = Reader.next().toLowerCase().charAt(0);

        switch (wahl) 
        {
            case 'a':
                SortDESC(testArr);
                for (int i = 0; i < testArr.length; i++) System.out.println(testArr[i] + "");
                break;
            case 's':
                SortASC(testArr);
                for (int i = 0; i < testArr.length; i++) System.out.println(testArr[i] + "");
            break;
            default:
            System.out.println("Falsche Taste gedrückt");
                break;
        }
    }



    public static void SortDESC(int arr[])
    {
        timeBefore = System.nanoTime();
        for (int i = arr.length - 1; i > 0; i--)
        {
            int x = arr[i];
            int y = Math.abs(Arrays.binarySearch(arr, arr.length - 1, i, x) - 1); // arr.lenght - max Länge
            System.arraycopy(arr, y - i, arr, y, i);
            arr[y] = x;
        }
        timeAfter = System.nanoTime();
        System.out.println("Der Vorgang hat " + CalcTime(timeBefore, timeAfter) + " Nanosekunden gedauert");
    }
    public static void SortASC(int arr[])
    {
        timeBefore = System.nanoTime();
        for(int i = 1; i < arr.length; i++)
        {
            int x = arr[i];

            int y = Math.abs(Arrays.binarySearch(arr, 0, i, x) + 1); // Math.abs() - gibt eine absolute Zahl zurück

            System.arraycopy(arr, y, arr, y + 1, i - y); // kopiert das array von der source zum destination array
            // nun wird die Zahl an die richtige Stelle platziert bzw. verschoben
            arr[y] = x;
        }
        timeAfter = System.nanoTime();
        System.out.println("Der Vorgang hat " + CalcTime(timeBefore, timeAfter) + " Nanosekunden gedauert");
    }

    public static long CalcTime(long start, long end)
    {
        long total = end - start;
        return total;
    }
    /*public int[] fillArray() {
        int size = 100;
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }*/
}