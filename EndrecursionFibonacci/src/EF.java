import java.util.Scanner;

public class EF {
	static Scanner Reader = new Scanner(System.in);
	static int _zahl;
	public static void main(String[] args)
	{
		System.out.print("Geben Sie eine Zahl ein: ");
		_zahl = Reader.nextInt(); 
		System.out.println(fibonacci(_zahl));
	}
	public static int eF(int zahl, int fbn1, int fbn2)
	{
		if(zahl <= 1) return fbn1 + fbn2;
		else
		{
			return eF(zahl-1, fbn2+fbn1, fbn1);
		}
	}
	public static int fibonacci(int zahl)
	{
		return eF(zahl-1,1,0);
	}
}