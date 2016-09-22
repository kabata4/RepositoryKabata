import java.util.Scanner;
  public class zadacha1909162 
{
  public static void main (String[]args) 
{
Scanner scanner = new Scanner(System.in);
System.out.println("Ââĺäčňĺ x1: ");          //ââîä ęîîđäčíŕň
double xa = scanner.nextDouble();             
System.out.println("Ââĺäčňĺ y1: ");          //ââîä ęîîđäčíŕň
double ya = scanner.nextDouble();                 
System.out.println("Ââĺäčňĺ x2: ");          //ââîä ęîîđäčíŕň
double xb = scanner.nextDouble();                    
System.out.println("Ââĺäčňĺ y2: ");          //ââîä ęîîđäčíŕň
double yb = scanner.nextDouble();                   
System.out.println("Ââĺäčňĺ x3: ");          //ââîä ęîîđäčíŕň
double xc = scanner.nextDouble();                      
System.out.println("Ââĺäčňĺ y3: ");          //ââîä ęîîđäčíŕň
double yc = scanner.nextDouble();             
double a = Math.sqrt(Math.pow(xb-xa, 2) + Math.pow(yb-ya, 2));
double b = Math.sqrt(Math.pow(xc-xb, 2) + Math.pow(yc-yb, 2));
double c = Math.sqrt(Math.pow(xc-xa, 2) + Math.pow(yc-ya, 2));
double P = a+b+c;                            //íŕőîćäĺíčĺ Ďĺđčěĺňđŕ
double p = P/2;                              //íŕőîćäĺíčĺ Ďîëóďĺđčěĺňđŕ
double S =Math.sqrt(p*(p-a)*(p-b)*(p-c));    //íŕőîćäĺíčĺ Ďëîůŕäč
System.out.println("AB:"+a);                 //âűâîä íŕ ýęđŕí ńňîđîíű AB
System.out.println("BC:"+b);                 //âűâîä íŕ ýęđŕí ńňîđîíű BC
System.out.println("CA:"+c);                 //âűâîä íŕ ýęđŕí ńňîđîíű AC
System.out.println("Ďĺđčěĺňđ đŕâĺí:"+P);     //âűâîä íŕ ýęđŕí Ďĺđčěĺňđŕ
System.out.println("Ďëîůŕäü: " +S);          //âűâîä íŕ ýęđŕí Ďëîůŕäü
}		
}


