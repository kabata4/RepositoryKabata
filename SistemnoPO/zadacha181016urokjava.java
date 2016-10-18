package projectzadachi;

import java.util.Scanner;

public class zadacha181016urokjava {
	
	private static	Scanner scanner = new Scanner (System.in);

	
	public static void main(String[] args){
		System.out.println("Ваша задача угадать число.");
		for (int i = 10; i<=30; i+=10 ) playLvl(i);
		System.out.println("Вы выйграли!))");
			scanner.close();
	}
	
	private static void playLvl(int range){
	int number =(int)(Math.random()*range);{
		while(true){
			System.out.println("Угадайте число от 0 до " +range);
			int input_number = scanner.nextInt();
			if(input_number == number){
				System.out.println("Вы угадали!");
				break;
				} else if(input_number > number){
					System.out.println("Заданное число меньше");
				} else {
					System.out.println("Заданное число больше");
				
		}
		
	}

	}
}
}