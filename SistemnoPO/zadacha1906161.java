import java.util.Scanner;
public class ������ 
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);

	System.out.println("����� ������ a: ");      //���� ����� ������ a
	double a = scanner.nextDouble();	     //������������ ����� � ������������ ��� �
	System.out.println("����� ������ b: ");      //���� ����� ������ b
	double b = scanner.nextDouble();             //������������ ����� � ������������ ��� b
	double c = Math.sqrt(a * a + b * b);         //���������� ����������
	double P = a+b+c;                            //���������� ���������
	double p = P/2;                              //���������� �������������
	double S =Math.sqrt(p*(p-a)*(p-b)*(p-c));    //���������� �������
	System.out.println("���������� �����: " +c); //����� �� ����� ����������
	System.out.println("�������� �����: " +P);   //����� �� ����� ���������
	System.out.println("�������: " +S);          //����� �� ����� �������
}