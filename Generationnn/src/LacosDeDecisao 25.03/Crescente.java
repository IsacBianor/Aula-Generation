package Exercicios;
import java.util.Scanner;

public class Crescente {
	public static void main(String[] args) 
	{//Collections.sort

		int a, b, c;
		Scanner SuperTrouper = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número: ");
		a = SuperTrouper.nextInt();
		System.out.println("Insira o segundo número: ");
		b = SuperTrouper.nextInt();
		System.out.println("Insira o terceiro número: ");
		c = SuperTrouper.nextInt();
		
		if (a <= b && b <= c)
		{
			System.out.println("Ordem crescente: " +a+ ", "+b+", "+c);
		}
		
		else if(a <= c && c <= b)
		{
			System.out.println("Ordem crescente: " +a+ ", "+c+", "+b);
		}
		
		else if(b <= a && a <= c)
		{
			System.out.println("Ordem crescente: " +b+ ", "+a+", "+c);
		}
		else if(b <= c && c <= a)
		{
			System.out.println("Ordem crescente: " +b+ ", "+c+", "+a);
		}
		else if(c <= a && a <= b)
		{
			System.out.println("Ordem crescente: " +c+ ", "+a+", "+b);
		}
		else
		{
			System.out.println("Ordem crescente: " +c+ ", "+b+", "+a);
		}
		
		
	}

}
