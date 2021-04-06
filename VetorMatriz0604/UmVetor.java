package VetorMatriz0604;
import java.util.Scanner;
public class UmVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Faça um programa que possua um vetor denominado A que armazene 6 números
inteiros. O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições
A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/
		int[] A = new int [6];
		int soma, valornovo;
		Scanner dun = new Scanner(System.in);
		
		A[0] = 1; A[1] = 0; A[2] = 5; A[3] = -2; A[4] = -5; A[5] = 7;
		
		soma = A[0]+A[1]+A[5];
		System.out.println("A soma das posições 0, 1 e 5 é de: " +soma);
		
		System.out.println("\nInforme o valor novo de 100 para a posição 4");
		valornovo = dun.nextInt();
		
		if(valornovo!=100)
		{
			System.out.println("Valor inválido, insira o valor de 100: ");
			valornovo = dun.nextInt();
		}
		else
		{
			A[4] = valornovo;
		}
		
		for(int i=0; i<6; i++)
		{
			System.out.println("O valor da posição "+i+ " no vetor é de: "+ A[i]);
		}
		

	}

}
