import java.util.Scanner;
  public class zadacha1906162 
{
  public static void main (String[]args) 
{
Scanner scanner = new Scanner(System.in);
System.out.println("������� x1: ");          //���� ���������
double xa = scanner.nextDouble();             
System.out.println("������� y1: ");          //���� ���������
double ya = scanner.nextDouble();                 
System.out.println("������� x2: ");          //���� ���������
double xb = scanner.nextDouble();                    
System.out.println("������� y2: ");          //���� ���������
double yb = scanner.nextDouble();                   
System.out.println("������� x3: ");          //���� ���������
double xc = scanner.nextDouble();                      
System.out.println("������� y3: ");          //���� ���������
double yc = scanner.nextDouble();             
double a = Math.sqrt(Math.pow(xb-xa, 2) + Math.pow(yb-ya, 2));
double b = Math.sqrt(Math.pow(xc-xb, 2) + Math.pow(yc-yb, 2));
double c = Math.sqrt(Math.pow(xc-xa, 2) + Math.pow(yc-ya, 2));
double P = a+b+c;                            //���������� ���������
double p = P/2;                              //���������� �������������
double S =Math.sqrt(p*(p-a)*(p-b)*(p-c));    //���������� �������
System.out.println("AB:"+a);                 //����� �� ����� ������� AB
System.out.println("BC:"+b);                 //����� �� ����� ������� BC
System.out.println("CA:"+c);                 //����� �� ����� ������� AC
System.out.println("�������� �����:"+P);     //����� �� ����� ���������
System.out.println("�������: " +S);          //����� �� ����� �������
}		
}


