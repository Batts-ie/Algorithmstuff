import java.util.Random;

public class binarySearch {

    public static void main(String[] args) {
        binarySearch binarySearch = new binarySearch();
        Random rand = new Random();
        int[] array = binarySearch.fillArray();
        int wanted = array[rand.nextInt(100)];
        binarySearch.searching(array, wanted, 0, array.length-1);
        binarySearch.binarySearcher(array, wanted, 0, array.length-1);
    }


    public void searching(int[] array, int wanted, int low, int high) {
        long start = System.currentTimeMillis(); // Zeit starten - in Millisekunden
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] < wanted) {
                low = mid + 1;
            } else if (array[mid] > wanted) {
                high = mid - 1;
            } else if (array[mid] == wanted) {
                System.out.println(System.currentTimeMillis() - start);
                System.out.println("Stelle:"+mid+" Gesucht:"+wanted);
                break;
            }
        }
    }
    public int binarySearcher(int[] array, int wanted, int low , int high)
    {
        long milliseconds = System.currentTimeMillis();
        int mid = (low + high)/2;
        if(array[mid]<wanted)
        {
            return binarySearcher(array,wanted,low+1,high);
        }
        else if(array[mid]>wanted)
        {
            return binarySearcher(array,wanted,low,high-1);
        }
        else if (array[mid]==wanted)
        {
            System.out.println(System.currentTimeMillis()-milliseconds);
            System.out.println("Stelle:"+mid+" Gesucht:"+wanted);
            return wanted;
        }
        else
        {
            return 0;
        }
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

