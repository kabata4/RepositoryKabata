import java.util.Scanner;
public class zadacha1909163 
	{
	public static void main(String[] args) 
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Ââåäèòå Ðàäèóñ: ");         //ââîä ðàäèóñà
	double R = scanner.nextDouble();             
	double I = 2*Math.PI*R;                              //íàõîæäåíèå äëèíû îêðóæíîñòè
	double S = Math.PI*Math.pow(R, 2);                   //íàõîæäåíèå ïëîùàäè êðóãà
	System.out.println("Äëèíà îêðóæíîñòè: "+I);     //âûâîä äëèíû îêðóæíîñòè
	System.out.println("Ïëîùàäü êðóãà: "+S);        //âûâîä ïëîùàäè êðóãà
	}
}
