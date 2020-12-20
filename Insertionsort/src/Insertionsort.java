import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
class Insertionsort 
{
    static Scanner Reader = new Scanner(System.in);
    public static void main(String[] args) 
    {
        
    }

    public void Sort(int arr[])
    {
        for(int i = 1; i < arr.length; i++)
        {
            int x = arr[i];

            // benutzt das Programm von binarySearch - ist ebenfalls im Package enthalten
            int y = Math.abs(Arrays.binarySearch(arr, 0, i, x) + 1); // Math.abs() - gibt eine absolute Zahl zurück

            System.arraycopy(arr, y, arr, y + 1, i - y); // kopiert das array von der source zum destination array

            // nun wird die Zahl an die richtige Stelle platziert bzw. verschoben
            arr[y] = x;
        }
    }
}