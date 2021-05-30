import java.util.List;

public class BubbleSort implements ISorting{
    private ICounting compareCounter = new Counting();
    private ICounting swapCounter = new Counting();
    private ICounting timeCounter = new Counting();
    private String name = "BubbleSort";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Integer> sortInteger(List<Integer> sort) {
        compareCounter.setCount(0);
        swapCounter.setCount(0);
        timeCounter.setCount(System.nanoTime());
        int tempVar;
        for(int i = 0; i<sort.size();i++)
        {
            for(int j =1;j<sort.size()-i;j++)
            {
                compareCounter.setCount((Long)compareCounter.getCount()+1);
                if(sort.get(j-1) > sort.get(j))
                {
                    swapCounter.setCount((Long) swapCounter.getCount()+1);
                    tempVar= sort.get(j-1);
                    sort.set(j-1,sort.get(j));
                    sort.set(j,tempVar);
                }
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
