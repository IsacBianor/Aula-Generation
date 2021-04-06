package VetorMatriz0604;

import java.util.Scanner;

public class DoisVetor {
	
	public static void main(String[] args) {
		/*Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.*/
		Scanner RosaNeon = new Scanner (System.in);
		int somapar=0, contimpar=0;
		int[] aGenteEDemais = new int [6];
		
		for(int x=0; x<6; x++)
		{
		System.out.println("Entre com os números:" );
		aGenteEDemais[x] = RosaNeon.nextInt();
		}
		
		for(int x=0; x<6; x++)
		{
			if(aGenteEDemais[x]%2==0)
			{
				System.out.println(aGenteEDemais[x] + " é um número par.");
				somapar = somapar + aGenteEDemais[x];
			}
			else
			{
				System.out.println(aGenteEDemais[x] + " é um número ímpar.");
				contimpar++;
			}
		}
		System.out.println("A soma dos números pares é de: " +somapar +"\nA quantidade de números ímpar digitados foi de: " + contimpar);
		
		
	}

}
