import java.util.List;

public interface ISorting {
    public String getName();
    public List<Integer> sortInteger(List<Integer> sort);
    public ICounting getCompareCounting();
    public ICounting getSwapCounting();
    public ICounting getTimeCounting();
}
