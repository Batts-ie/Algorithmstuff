import java.util.Random;

public class Selectionsort {
    final int arrayct=100;
    final int elem=1000000;
    final int range=1000;
    private int[] bubblesortarr;
    private int[] selectionsortarr;

    public static void main(String[] args) {
      Selectionsort ss = new Selectionsort();
      ss.Loop();   
      ss.Output("Selectionsort",ss.Average(ss.selectionsortarr),ss.Median(ss.selectionsortarr));
      ss.Output("Bubblesort",ss.Average(ss.bubblesortarr),ss.Median(ss.bubblesortarr));
    }

    public int MSelectionSort(int[] sorting) {
        int anz=0;
		for (int i = 0; i < sorting.length - 1; i++) {
			for (int j = i + 1; j < sorting.length; j++) {
				if (sorting[i] > sorting[j]) {
					int temp = sorting[i];
					sorting[i] = sorting[j];
					sorting[j] = temp;
                    anz++;
				}
			}
		}
		return anz;
	}

    public int MBubblesort(int[] array) {
        int anz=0;
        for (int n = array.length; n > 1; n--) {
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    int a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                    anz++;
                }
            }
        }
        return anz;
    }
    public int[] GenRndmArr()
    {
        int[] arr = new int[elem];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(range);
         }
        return arr;
    }
    public int Average(int[] resarray)
    {  
        int calc=0;
        for (int i : resarray) {
            calc=resarray[i]+calc;
        }
        return calc;
    }
    public int Median(int[] resarray)
    {
        int calc=resarray[resarray.length/2];
        return calc;
    }
    public void Loop()
    {
        for (int i = 0; i < arrayct; i++) {
            int[] arr =GenRndmArr();
            selectionsortarr[i]=MSelectionSort
      (arr);
            bubblesortarr[i]=MBubblesort(arr);
        }
    }
    public void Output(String type,int average,int median)
    {
        System.out.println(type);
        System.out.printf("average of %d and median of %d %n",average,median);
    }
}   
