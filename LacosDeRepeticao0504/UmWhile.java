package LacosDeRepeticao0504;
import java.util.Scanner;
public class UmWhile {
	public static void main(String[] args) {
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.*/
		int idade, contmenor=0, contmaior=0;
		Scanner Luka = new Scanner (System.in);
		
		System.out.println("Insira a sua idade:");
		idade = Luka.nextInt();

		while(idade!=-99)
		{
			System.out.println("Sua idade é de: " +idade+ " anos.");
			idade++;
			
			
			if(idade<21) 
			{
				contmenor++;
			}
			if(idade>50) //não precisa do else pq não estão coligados
			{
				contmaior++;
			}
			
			System.out.println("\nInsira a sua idade, para parar o programa, insira \"-99\".");
			idade = Luka.nextInt();
		}
		System.out.println("\nHá " +contmenor+ " pessoas com menos de 21 anos.\nHá "+contmaior+ " pessoas com mais de 50 anos.");
		
	}

}
