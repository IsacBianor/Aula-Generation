package LacosDeRepeticao0504;
import java.util.Scanner;
public class UmDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
		int num, somanum=0;
		Scanner macarrao = new Scanner (System.in);
		
		do
		{
			System.out.println("Entre com um n�mero, para sair do programa, digite \"0\": ");
			num = macarrao.nextInt();
			somanum = somanum + num;
		}
		while (num!=0);
		
		System.out.println("A soma dos n�meros digitados � de: " + somanum);
		

	}

}
