import java.util.List;

public class InsertionSort implements ISorting {
    private ICounting compareCounter = new Counting();
    private ICounting swapCounter = new Counting();
    private ICounting timeCounter = new Counting();
    private String name = "InsertionSort";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Integer> sortInteger(List<Integer> sort) {
        timeCounter.setCount(System.nanoTime());
        compareCounter.setCount(0);
        swapCounter.setCount(0);
        int tempIndex, tempVar;
        for(int i=1; i<sort.size();i++)
        {
            tempIndex=i;
            compareCounter.setCount((Long) compareCounter.getCount()+1);
            for(int j = 0; j<i;j++)
            {
                if(sort.get(j)>sort.get(tempIndex))
                {
                    tempIndex = j;
                    break;
                }
            }
            for(int k=i;k>tempIndex;k--)
            {
                swapCounter.setCount((Long) swapCounter.getCount()+1);
                tempVar=sort.get(k);
                sort.set(k,sort.get(k-1));
                sort.set(k-1,tempVar);
            }
        }
        timeCounter.setCount(System.nanoTime()-(Long)timeCounter.getCount());
        return sort;
    }

    @Override
    public ICounting getCompareCounting() {
        return this.compareCounter;
    }

    @Override
    public ICounting getSwapCounting() {
        return this.swapCounter;
    }

    @Override
    public ICounting getTimeCounting() {
        return timeCounter;
    }
}
