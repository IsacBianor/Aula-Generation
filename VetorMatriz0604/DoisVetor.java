package VetorMatriz0604;

import java.util.Scanner;

public class DoisVetor {
	
	public static void main(String[] args) {
		/*Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados;
� A soma dos n�meros pares digitados;
� Os n�meros �mpares digitados;
� A quantidade de n�meros �mpares digitados.*/
		Scanner RosaNeon = new Scanner (System.in);
		int somapar=0, contimpar=0;
		int[] aGenteEDemais = new int [6];
		
		for(int x=0; x<6; x++)
		{
		System.out.println("Entre com os n�meros:" );
		aGenteEDemais[x] = RosaNeon.nextInt();
		}
		
		for(int x=0; x<6; x++)
		{
			if(aGenteEDemais[x]%2==0)
			{
				System.out.println(aGenteEDemais[x] + " � um n�mero par.");
				somapar = somapar + aGenteEDemais[x];
			}
			else
			{
				System.out.println(aGenteEDemais[x] + " � um n�mero �mpar.");
				contimpar++;
			}
		}
		System.out.println("A soma dos n�meros pares � de: " +somapar +"\nA quantidade de n�meros �mpar digitados foi de: " + contimpar);
		
		
	}

}
