import java.util.Scanner;
  public class zadacha1906162 
{
  public static void main (String[]args) 
{
Scanner scanner = new Scanner(System.in);
System.out.println("Введите x1: ");          //ввод координат
double xa = scanner.nextDouble();             
System.out.println("Введите y1: ");          //ввод координат
double ya = scanner.nextDouble();                 
System.out.println("Введите x2: ");          //ввод координат
double xb = scanner.nextDouble();                    
System.out.println("Введите y2: ");          //ввод координат
double yb = scanner.nextDouble();                   
System.out.println("Введите x3: ");          //ввод координат
double xc = scanner.nextDouble();                      
System.out.println("Введите y3: ");          //ввод координат
double yc = scanner.nextDouble();             
double a = Math.sqrt(Math.pow(xb-xa, 2) + Math.pow(yb-ya, 2));
double b = Math.sqrt(Math.pow(xc-xb, 2) + Math.pow(yc-yb, 2));
double c = Math.sqrt(Math.pow(xc-xa, 2) + Math.pow(yc-ya, 2));
double P = a+b+c;                            //нахождение Периметра
double p = P/2;                              //нахождение Полупериметра
double S =Math.sqrt(p*(p-a)*(p-b)*(p-c));    //нахождение Площади
System.out.println("AB:"+a);                 //вывод на экран стороны AB
System.out.println("BC:"+b);                 //вывод на экран стороны BC
System.out.println("CA:"+c);                 //вывод на экран стороны AC
System.out.println("Периметр равен:"+P);     //вывод на экран Периметра
System.out.println("Площадь: " +S);          //вывод на экран Площадь
}		
}


