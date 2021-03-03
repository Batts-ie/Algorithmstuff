import java.util.Scanner;
public class Selectionsort {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int arrayLenght = 0;
        System.out.print("Wie viele Zahlen soll das Array beinhalten: ");
        arrayLenght = reader.nextInt();
        System.out.print("\n" + "Geben Sie die Range an: ");
        int range = reader.nextInt();
        reader.close();
        int[] a = new int[arrayLenght];
        for(int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random()*range);
        }
        Sorting(a);
        System.out.println("Sorted Array ");
        PrintArrayInConsole(a); 
    }
    public static void Sorting(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length;j++){
                if(arr[j] < arr[i]){
                    int temporary = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temporary;
                }
            }
        }
    }
    public static void PrintArrayInConsole(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "\n");
        }
    }
}
