package projectzadachi;

import java.util.Scanner;

public class zadacha181016urokjava {
	
	private static	Scanner scanner = new Scanner (System.in);

	
	public static void main(String[] args){
		System.out.println("���� ������ ������� �����.");
		for (int i = 10; i<=30; i+=10 ) playLvl(i);
		System.out.println("�� ��������!))");
			scanner.close();
	}
	
	private static void playLvl(int range){
	int number =(int)(Math.random()*range);{
		while(true){
			System.out.println("�������� ����� �� 0 �� " +range);
			int input_number = scanner.nextInt();
			if(input_number == number){
				System.out.println("�� �������!");
				break;
				} else if(input_number > number){
					System.out.println("�������� ����� ������");
				} else {
					System.out.println("�������� ����� ������");
				
		}
		
	}

	}
}
}