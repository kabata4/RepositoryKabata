import java.util.Scanner;
public class zadacha1906163 
	{
	public static void main(String[] args) 
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("������� ������: ");         //���� �������
	double R = scanner.nextDouble();             
	double I = 2*Math.PI*R;                              //���������� ����� ����������
	double S = Math.PI*Math.pow(R, 2);                   //���������� ������� �����
	System.out.println("����� ����������: "+I);     //����� ����� ����������
	System.out.println("������� �����: "+S);        //����� ������� �����
	}
}
