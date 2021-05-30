public interface IOutput {
    public static void output(String... sorts)
    {
        for(String sort : sorts)
        {
            System.out.println(sort);
        }
    }
}
