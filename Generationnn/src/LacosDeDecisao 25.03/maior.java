package Exercicios;
import java.util.Scanner;

public class maior {

	public static void main(String[] args) 
	{// TODO Auto-generated method stub
		
		int n1, n2, maior12, n3, maior;
		Scanner voulezVous = new Scanner(System.in);
		
		System.out.println("Insira 3 n�meros para saber qual o maior deles\nInsira o primeiro n�mero: ");
		n1 = voulezVous.nextInt();
		System.out.println("Insira o segundo n�mero: ");
		n2 = voulezVous.nextInt();
		System.out.println("Insira o terceiro n�mero: ");
		n3 = voulezVous.nextInt();
		
		maior12 = Math.max(n1, n2);
		maior = Math.max(maior12, n3);
		
		System.out.println("\nO maior n�mero �: " + maior);

	}

}
