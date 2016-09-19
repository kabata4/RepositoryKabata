import java.util.Scanner;
	public class zadacha1906164 {
	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);
		System.out.println("¬ведите число: "); 
		double a = scanner.nextDouble();
		System.out.println("¬ведите число: "); 
		double b = scanner.nextDouble();
		double x = (2+a*b)/(Math.pow(a, 2)-Math.pow(b, 2));
		double y = a/3+7*Math.pow(b, 3);
		System.out.println(x);
		System.out.println(y);
				
	}
	}

