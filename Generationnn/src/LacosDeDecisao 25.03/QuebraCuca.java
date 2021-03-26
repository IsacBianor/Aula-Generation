package Exercicios;

import java.util.Scanner;
public class QuebraCuca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float x, rq, p;
		Scanner paralelepipedo = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		x = paralelepipedo.nextFloat();
		
		if(x % 2 == 0)
		{
			rq = (float) Math.sqrt(x);
			System.out.println("Esse número é par e sua raiz quadrada é " + rq);
		}
		else
		{
			p = (float) Math.pow(x, 2);
			System.out.println("Esse número é ímpar e seu número ao quadrado é " + p);
		}

	}

}
