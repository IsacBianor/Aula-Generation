package LacosDeRepeticao0504;
import java.util.Scanner;
public class DoisFor {
	public static void main(String[] args) {
		/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.*/
		
		int i, n, cont=0, contnum=0;
		Scanner GetDown = new Scanner (System.in);
		
		for(i=1; i<=10; i++)
		{
			System.out.println("Insira um n�mero: ");
			n = GetDown.nextInt();
			
			if(n%2==0)
			{
				cont++;
			}
			else
			{
				contnum++;
			}
		}System.out.println("H� "+cont+ " n�meros pares, e "+contnum+ " n�meros �mpares.");
	}


}
