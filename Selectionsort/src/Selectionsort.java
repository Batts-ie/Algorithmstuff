public class Selectionsort {
    public static void main(String[] args) {
        int[] a = new int[100];
        int upperlenght = 100000;
        for(int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random()*upperlenght);
        }
        Sorting(a);
        //selectionsort(a);
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
