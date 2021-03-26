package Exercicios;
import java.util.Scanner;

public class MaiorNovo {

	public static void main(String[] args) 
	{// TODO Auto-generated method stub
		int n1, n2, maior12, n3, maior;
		Scanner voulezVous = new Scanner(System.in);
		
		System.out.println("Insira 3 números para saber qual o maior deles\nInsira o primeiro número: ");
		n1 = voulezVous.nextInt();
		System.out.println("Insira o segundo número: ");
		n2 = voulezVous.nextInt();
		System.out.println("Insira o terceiro número: ");
		n3 = voulezVous.nextInt();
		
		if (n1 > n2 && n1 > n3)
		{
			System.out.println("O maior número é: "+n1);
		}
		else if (n2 > n1 && n2 > n3)
		{
			System.out.println("O maior número é: "+n2);
		}
		else
		{
			System.out.println("O maior número é: "+n3);
		}
	}

}
