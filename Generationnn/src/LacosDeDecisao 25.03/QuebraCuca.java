package Exercicios;

import java.util.Scanner;
public class QuebraCuca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float x, rq, p;
		Scanner paralelepipedo = new Scanner(System.in);
		
		System.out.println("Insira um n�mero: ");
		x = paralelepipedo.nextFloat();
		
		if(x % 2 == 0)
		{
			rq = (float) Math.sqrt(x);
			System.out.println("Esse n�mero � par e sua raiz quadrada � " + rq);
		}
		else
		{
			p = (float) Math.pow(x, 2);
			System.out.println("Esse n�mero � �mpar e seu n�mero ao quadrado � " + p);
		}

	}

}
