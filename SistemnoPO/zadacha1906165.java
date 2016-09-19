	import java.util.Scanner;
	public class zadacha1906165
	{
	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);
		System.out.println("¬ведите число: "); 
		double a = scanner.nextDouble();     
		double b =a/100;
		double h =a/10;
		double q = h%10;
		double e = q%10;
		double o = a%10;
		int i = (int) b;
		int k = (int) e;
		int p = (int) o;
		System.out.println(""+i);
		System.out.println(""+k);
		System.out.println(""+p);
	}

}
