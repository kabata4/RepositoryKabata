import java.util.Scanner;
public class задача 
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);

	System.out.println("Длина катета a: ");      //ввод длины катета a
	double a = scanner.nextDouble();	     //сканирование ввода и присваивание его а
	System.out.println("Длина катета b: ");      //ввод длины катета b
	double b = scanner.nextDouble();             //сканирование ввода и присваивание его b
	double c = Math.sqrt(a * a + b * b);         //нахождение Гипотенузы
	double P = a+b+c;                            //нахождение Периметра
	double p = P/2;                              //нахождение Полупериметра
	double S =Math.sqrt(p*(p-a)*(p-b)*(p-c));    //нахождение Площади
	System.out.println("Гипотенуза равна: " +c); //вывод на экран Гипотенузы
	System.out.println("Периметр равен: " +P);   //вывод на экран Периметра
	System.out.println("Площадь: " +S);          //вывод на экран Площадь
}