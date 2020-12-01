import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int array[] = {10, 100, 20, 200, 1000, 25, 30};
        Sorting(array, array.length);

        System.out.println("Array wurde sortiert: ");
        System.out.println(Arrays.toString(array));
    }


    public static void Sorting(int array[], int n){
        if (n == 1){
            return;
        }
        for(int i = 0; i < n - 1; i++){
            if (array[i] > array[i + 1]){
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
            }
            Sorting(array, n-1);
        }
    }
}