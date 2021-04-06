package LacosDeRepeticao0504;
import java.util.Scanner;
public class DoisFor {
	public static void main(String[] args) {
		/*Ler 10 números e imprimir quantos são pares e quantos são ímpares.*/
		
		int i, n, cont=0, contnum=0;
		Scanner GetDown = new Scanner (System.in);
		
		for(i=1; i<=10; i++)
		{
			System.out.println("Insira um número: ");
			n = GetDown.nextInt();
			
			if(n%2==0)
			{
				cont++;
			}
			else
			{
				contnum++;
			}
		}System.out.println("Há "+cont+ " números pares, e "+contnum+ " números ímpares.");
	}


}
