package LacosDeRepeticao0504;

import java.util.Scanner;

public class DoisDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		0(zero).(DO...WHILE)*/
		int num, somanum=0, contnum=0;
		float medianum;
		Scanner CryForMe = new Scanner(System.in);
		
		do
		{
			System.out.println("\nEntre com um n�mero, para sair do programa digite \"0\":");
			num = CryForMe.nextInt();
			if(num%3==0)
			{
				contnum++;
				somanum = num + somanum;
			}
			

		}
		while(num!=0);
		
		//System.out.println(contnum +","+somanum);
		medianum = (float) (somanum / (contnum - 1.0));
		System.out.println("A m�dia dos n�meros m�ltiplos de 3 � de: " +medianum);

	}

}
