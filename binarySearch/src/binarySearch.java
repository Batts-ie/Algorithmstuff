import java.util.Random;

public class binarySearch {

    public static void main(String[] args) {
        binarySearch binarySearch = new binarySearch();
        Random rand = new Random();
        int[] array = binarySearch.fillArray();
        int wanted = array[rand.nextInt(100)]; // ist eine random Zahl von 100 Stellen
        binarySearch.searchNumber(array, wanted);
        binarySearch.binarySearcher(array, wanted, 0, array.length-1);
    }

    public int searchNumber(int[] arr, int wanted){
        int left = 0;
        int right = arr.length-1; // => 0 - 99

        while(left <= right){
            int middle = left + (right-left)/2;

            if(arr[middle] == wanted){
                return middle;
            }
            if(arr[left] == wanted){
                return left;
            }
            if(arr[right] == wanted){
                return right;
            }

            if(wanted < arr[middle]){
                right = middle;
            }else if(wanted > arr[middle]){
                left = middle;
            }
        }

        return -1; // Zahl wurde nicht gefunden
    }

    /**
     *
     * @param array
     * @param wanted
     * @param left
     * @param right
     * @return
     */
    public int binarySearcher(int[] array, int wanted, int left , int right)
    {
        long nanoseconds = System.nanoTime();
        int middle = (left + right)/2;
        if(array[middle] < wanted)
        {
            return binarySearcher(array,wanted,left+1,right);
        }
        else if(array[middle] > wanted)
        {
            return binarySearcher(array,wanted,left,right-1);
        }
        else if (array[middle] == wanted)
        {
            System.out.println(System.nanoTime()-nanoseconds);
            System.out.println("Stelle:" + middle + " Gesucht:" + wanted);
            return wanted;
        }
        return -1;
    }

    public int[] fillArray() {
        int size = 100;
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }

}

