package VetorMatriz0604;
import java.util.Scanner;
public class UmMatriz {
	public static void main(String[] args) {
		//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		Scanner Lion = new Scanner(System.in);
		int[][] likey = new int[3][3];
		int contmaior=0;
		
		for(int l=0; l<3; l++)
		{
			for(int c=0; c<3; c++)
			{
				System.out.println("Entre com os valores: ");
				likey[l][c] = Lion.nextInt();
				
				if(likey[l][c]>10)
				{
					System.out.println(likey[l][c] + " tem valor maior do que 10.");
					contmaior++;
				}
		}
		
		
	}
		System.out.println("Você escreveu "+contmaior+" números com valor maior do que 10.");
	}
}
