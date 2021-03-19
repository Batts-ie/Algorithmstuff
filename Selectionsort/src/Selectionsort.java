import java.util.Random;

public class Selectionsort {
    final int arraycount=100;
    final int elem=100;
    final int range=1000;
    private int[] bubblesortarr = new int[arraycount];
    private int[] selectionsortarr = new int[arraycount];
    private int[] insertionsortarr = new int[arraycount];

    public static void main(String[] args) {
        Selectionsort selectionsort = new Selectionsort();
        selectionsort.loop();   
        selectionsort.MOutput("Selectionsort",selectionsort.Average(selectionsort.selectionsortarr), 
        selectionsort.MMedian(selectionsort.selectionsortarr));
        selectionsort.MOutput("Bubblesort",selectionsort.Average(selectionsort.bubblesortarr), 
        selectionsort.MMedian(selectionsort.bubblesortarr));
        selectionsort.MOutput("Insertionsort", selectionsort.Average(selectionsort.insertionsortarr), 
        selectionsort.MMedian(selectionsort.insertionsortarr));
        selectionsort.MPrintArray("Selectionsort", selectionsort.selectionsortarr);
    }

    public static void MPrintArray(String arrayN, int arr[]){
        int n = arr.length;
        System.out.println();
        System.out.println(arrayN);
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public int MSelectionsort(int[] sort) {
        long before = System.nanoTime();
        int count = 0;
		for (int i = 0; i < sort.length - 1; i++) {
			for (int j = i + 1; j < sort.length; j++) {
				if (sort[i] > sort[j]) {
					int temp = sort[i];
					sort[i] = sort[j];
					sort[j] = temp;
                    count++;
				}
			}
		}
        long end = System.nanoTime() - before;
        System.out.println(end);
		return count;
	}

    public int MBubblesort(int[] array) {
        int count = 0;
        for (int n = array.length; n > 1; n--) {
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    int a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                    count++;
                }
            }
        }
        return count;
    }
    public int[] MGetRndmArray()
    {
        int[] arr = new int[elem];
        Random rndm = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rndm.nextInt(range);
         }
        return arr;
    }
    public int Average(int[] setarray)
    {  
        int calc = 0;
        for (int i = 0 ;i < setarray.length; i++) {
            calc = setarray[i] + calc;
        }
        return calc / setarray.length;
    }
    public int MMedian(int[] setarray)
    {
        int calc = setarray[setarray.length / 2];
        return calc;
    }
    public void loop()
    { // ct = countahl
        for (int i = 0; i < arraycount; i++) {
            int ict = MInsertionsort(MGetRndmArray());
            int sct = MSelectionsort(MGetRndmArray());
            int bct = MBubblesort(MGetRndmArray());
            selectionsortarr[i] = sct;
            bubblesortarr[i] = bct;
            insertionsortarr[i] = ict;
        }
    }
    public int MInsertionsort(int arr[])
    {
        long before = System.nanoTime();
        int n = arr.length;
        int count=0;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                count++;
            }
            arr[j + 1] = key;
        }
        long after = System.nanoTime() - before;
        System.out.println(after);
        return count;
    }

    public void MOutput(String type,int average,int median)
    {
        System.out.println(type);
        System.out.printf("average of %d and median of %d %n", average, median);
    }
}   