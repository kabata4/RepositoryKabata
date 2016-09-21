import java.util.*;
import java.lang.*;
import java.io.*;

class zadacha2106164
{
	public static void main (String[] args) throws java.lang.Exception
	{
	double a=6;
	double b=8;
	if(a>b)
	{
		double a=(a*b)/2;
		double b=(a*b)/2;
		System.out.println("a rovn9ets9 :" +a);
		System.out.println("b rovn9ets9 :" +b);
	}
	else
	{
		double a=(a+b)/2;
		double b=(a+b)/2;
		System.out.println("a rovn9ets9 :" +a);
		System.out.println("b rovn9ets9 :" +b);
	}
	}
}