import java.util.Scanner;

public class EF {
	static Scanner Reader = new Scanner(System.in);
	static double _zahl;
	public static void main(String[] args)
	{
		System.out.println("Geben Sie eine Zahl ein: ");
		_zahl = Reader.nextDouble(); 
		System.out.println(fibonacci(n));
	}
	public static int eF(double zahl, int fbn1, int fbn2)
	{
		if(zahl <= 1) return fbn1 + fbn2;
		else
		{
			return eF(zahl-1, fbn2+fbn1, fbn1);
		}
	}
	public static int fibonacci(double zahl)
	{
		return endrecursionFibonacci(zahl-1,1,0);
	}
}