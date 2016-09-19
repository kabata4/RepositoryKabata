import java.util.Scanner;
public class zadacha1906163 
	{
	public static void main(String[] args) 
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Введите Радиус: ");         //ввод радиуса
	double R = scanner.nextDouble();             
	double I = 2*Math.PI*R;                              //нахождение длины окружности
	double S = Math.PI*Math.pow(R, 2);                   //нахождение площади круга
	System.out.println("Длина окружности: "+I);     //вывод длины окружности
	System.out.println("Площадь круга: "+S);        //вывод площади круга
	}
}
