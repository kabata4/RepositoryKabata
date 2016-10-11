package projectzadachi;
import java.util.Scanner;

public class zadacha51016 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Vvedite a, b, c");
	    System.out.print("Vvedite znachenie a -> ");
	    double a= s.nextDouble();
	    System.out.print("Vvedite znachenie b -> ");
	    double b = s.nextDouble();
	    System.out.print("Vvedite znachenie c -> ");
	    double c = s.nextDouble();
	    System.out.println("Diskriminant = " + diskriminant(a, b, c));
	    System.out.println("Reshenie : " + otvet(a, b, c));
		}
		public static double diskriminant(double a, double b, double c)
		{
	    double d;
	    d = Math.pow(b, 2) - 4*a*c;
	    return d;
		}
		public static String otvet(double a, double b, double c)
	    {
	        if (diskriminant(a, b, c)==0)
	        {
	           double x1 = -b / 2*a;
	        return ""+x1;
	        }
	        else 
	        if (diskriminant(a, b, c) < 0)	
	        {
	        return "Net resheniya";
	        }
	        else
	        {
	        double x1 = (-b + Math.sqrt(diskriminant(a, b, c)))/(2*a);
	        double x2 = (-b - Math.sqrt(diskriminant(a, b, c)))/(2*a);
	        return "x1 = " + x1 + " x2 = " + x2;
	         }
	    }


	}
	
	
	
