package VetorMatriz0604;

import java.util.Scanner;

public class DoisMatriz {

	public static void main(String[] args) {
		
		/*Não consegui colocar as opções dentro do while, e a opção de imprimir da errado quando
		 é efetuada alguma operação antes
		 */
		
		float[][] Montero = new float[2][2]; 
		float[][] CallMeByYourName = new float[2][2];
		float[][] Lovely = new float [2][2];
		int constante, Heather;
		
		Scanner TalkingToTheMoon = new Scanner(System.in);
		
		for(int l=0; l<2; l++)
		{
			for (int c=0; c<2; c++)
			{
				System.out.println("Insira os valores da Matriz 1: ");
				Montero[l][c] = TalkingToTheMoon.nextFloat();
			}
		}
		System.out.println("\n");
		
		for(int l=0; l<2; l++)
		{
			for (int c=0; c<2; c++)
			{
				System.out.println("Insira os valores da Matriz 2: ");
				CallMeByYourName[l][c] = TalkingToTheMoon.nextFloat();
			}
		}
		
		System.out.println("\nInsira o valor da constante que será adicionada (se não for adicionar nenhuma, insira 0): ");
		constante = TalkingToTheMoon.nextInt();
		
		System.out.println("\nInsira 1 caso você queira somar as matrizes: \nInsira 2 caso você queira subtrair as matrizes: \nInsira 3 caso queira adicionar uma constantes nas matrizes: \nInsira 4 caso queira imprimir as váriaveis:");
		Heather = TalkingToTheMoon.nextInt();
		
		while (Heather<1 || Heather>4)
		{
			System.out.println("\nInsira 1 caso você queira somar as matrizes: \nInsira 2 caso você queira subtrair as matrizes: \nInsira 3 caso queira adicionar uma constantes nas matrizes: \nInsira 4 caso queira imprimir as váriaveis:");
			Heather = TalkingToTheMoon.nextInt();
		}
		
		switch(Heather)
		{
		case 1:
			for(int l=0; l<2; l++)
			{
				for(int c=0; c<2; c++)
					{
					Lovely[l][c] =  Montero[l][c] + CallMeByYourName[l][c];
					}
			}
			System.out.println("\nResultado:\n[" + Lovely[0][0] +"]" + " [" +Lovely[0][1] +"]" + "\n[" +Lovely[1][0] +"] " + "[" + Lovely[1][1] +"]");
			break;
			
		case 2:
			for(int l=0; l<2; l++)
			{
				for(int c=0; c<2; c++)
					{
					Lovely[l][c] = CallMeByYourName[l][c] - Montero[l][c];
					}
			}
			System.out.println("\nResultado:\n[" + Lovely[0][0] +"]" + " [" +Lovely[0][1] +"]" + "\n[" +Lovely[1][0] +"] " + "[" + Lovely[1][1] +"]");
			break;
			
		case 3:
			for(int l=0; l<2; l++)
			{
				for(int c=0; c<2; c++)
					{
					Montero[l][c] = Montero[l][c] + constante;
					CallMeByYourName[l][c] = CallMeByYourName[l][c] + constante;
					}
			}
			System.out.println("\nPrimeira matriz:\n[" + Montero[0][0] +"]" + " [" +Montero[0][1] +"]" + "\n[" +Montero[1][0] +"] " + "[" +Montero[1][1] +"]");
			System.out.println("\nSegunda matriz:\n[" + CallMeByYourName[0][0] +"]" + " [" +CallMeByYourName[0][1] +"]" + "\n[" +CallMeByYourName[1][0] +"] " + "[" +CallMeByYourName[1][1] +"]");
			break;
			
		case 4:
			System.out.println("\nPrimeira matriz:\n[" + Montero[0][0] +"]" + " [" +Montero[0][1] +"]" + "\n[" +Montero[1][0] +"] " + "[" +Montero[1][1] +"]");
			System.out.println("\nSegunda matriz:\n[" + CallMeByYourName[0][0] +"]" + " [" +CallMeByYourName[0][1] +"]" + "\n[" +CallMeByYourName[1][0] +"] " + "[" +CallMeByYourName[1][1] +"]");
			break;
			
			default:
				System.out.println("\nResposta ínvalida. Reinicie o programa.");
		}
		
		System.out.println("\nDeseja fazer mais alguma operação?");
		System.out.println("\nInsira 0 caso queira sair do programa: \nInsira 1 caso você queira somar as matrizes: \nInsira 2 caso você queira subtrair as matrizes: \nInsira 3 caso queira adicionar uma constantes nas matrizes: \nInsira 4 caso queira imprimir as váriaveis:");
		Heather = TalkingToTheMoon.nextInt();
		
		//while(Heather <0 || Heather>4)
		//{
		switch(Heather)
		{
		case 1:
			for(int l=0; l<2; l++)
			{
				for(int c=0; c<2; c++)
					{
					Lovely[l][c] =  Montero[l][c] + CallMeByYourName[l][c];
					}
			}
			System.out.println("\nResultado:\n[" + Lovely[0][0] +"]" + " [" +Lovely[0][1] +"]" + "\n[" +Lovely[1][0] +"] " + "[" + Lovely[1][1] +"]");
			break;
			
		case 2:
			for(int l=0; l<2; l++)
			{
				for(int c=0; c<2; c++)
					{
					Lovely[l][c] = CallMeByYourName[l][c] - Montero[l][c];
					}
			}
			System.out.println("\nResultado:\n[" + Lovely[0][0] +"]" + " [" +Lovely[0][1] +"]" + "\n[" +Lovely[1][0] +"] " + "[" + Lovely[1][1] +"]");
			break;
			
		case 3:
			for(int l=0; l<2; l++)
			{
				for(int c=0; c<2; c++)
					{
					Montero[l][c] = Montero[l][c] + constante;
					CallMeByYourName[l][c] = CallMeByYourName[l][c] + constante;
					}
			}
			System.out.println("\nPrimeira matriz:\n[" + Montero[0][0] +"]" + " [" +Montero[0][1] +"]" + "\n[" +Montero[1][0] +"] " + "[" +Montero[1][1] +"]");
			System.out.println("\nSegunda matriz:\n[" + CallMeByYourName[0][0] +"]" + " [" +CallMeByYourName[0][1] +"]" + "\n[" +CallMeByYourName[1][0] +"] " + "[" +CallMeByYourName[1][1] +"]");
			break;
			
		case 4:
			System.out.println("\nPrimeira matriz:\n[" + Montero[0][0] +"]" + " [" +Montero[0][1] +"]" + "\n[" +Montero[1][0] +"] " + "[" +Montero[1][1] +"]");
			System.out.println("\nSegunda matriz:\n[" + CallMeByYourName[0][0] +"]" + " [" +CallMeByYourName[0][1] +"]" + "\n[" +CallMeByYourName[1][0] +"] " + "[" +CallMeByYourName[1][1] +"]");
			break;
			
		case 0:
			System.out.println("\nSe cuide ;)");
			break;
			
			default:
				System.out.println("\nResposta ínvalida. Reinecie o programa.");
		}
		
		System.out.println("\nDeseja fazer mais alguma operação?");
		System.out.println("\nInsira 0 caso queira sair do programa: \nInsira 1 caso você queira somar as matrizes: \nInsira 2 caso você queira subtrair as matrizes: \nInsira 3 caso queira adicionar uma constantes nas matrizes: \nInsira 4 caso queira imprimir as váriaveis:");
		Heather = TalkingToTheMoon.nextInt();
		//}
		
		switch(Heather)
		{
		case 1:
			for(int l=0; l<2; l++)
			{
				for(int c=0; c<2; c++)
					{
					Lovely[l][c] =  Montero[l][c] + CallMeByYourName[l][c];
					}
			}
			System.out.println("\nResultado:\n[" + Lovely[0][0] +"]" + " [" +Lovely[0][1] +"]" + "\n[" +Lovely[1][0] +"] " + "[" + Lovely[1][1] +"]");
			break;
			
		case 2:
			for(int l=0; l<2; l++)
			{
				for(int c=0; c<2; c++)
					{
					Lovely[l][c] = CallMeByYourName[l][c] - Montero[l][c];
					}
			}
			System.out.println("\nResultado:\n[" + Lovely[0][0] +"]" + " [" +Lovely[0][1] +"]" + "\n[" +Lovely[1][0] +"] " + "[" + Lovely[1][1] +"]");
			break;
			
		case 3:
			for(int l=0; l<2; l++)
			{
				for(int c=0; c<2; c++)
					{
					Montero[l][c] = Montero[l][c] + constante;
					CallMeByYourName[l][c] = CallMeByYourName[l][c] + constante;
					}
			}
			System.out.println("\nPrimeira matriz:\n[" + Montero[0][0] +"]" + " [" +Montero[0][1] +"]" + "\n[" +Montero[1][0] +"] " + "[" +Montero[1][1] +"]");
			System.out.println("\nSegunda matriz:\n[" + CallMeByYourName[0][0] +"]" + " [" +CallMeByYourName[0][1] +"]" + "\n[" +CallMeByYourName[1][0] +"] " + "[" +CallMeByYourName[1][1] +"]");
			break;
			
		case 4:
			System.out.println("\nPrimeira matriz:\n[" + Montero[0][0] +"]" + " [" +Montero[0][1] +"]" + "\n[" +Montero[1][0] +"] " + "[" +Montero[1][1] +"]");
			System.out.println("\nSegunda matriz:\n[" + CallMeByYourName[0][0] +"]" + " [" +CallMeByYourName[0][1] +"]" + "\n[" +CallMeByYourName[1][0] +"] " + "[" +CallMeByYourName[1][1] +"]");
			break;
			
		case 0:
			System.out.println("\nSe cuide ;)");
			break;
			
			default:
				System.out.println("\nResposta ínvalida. Reinecie o programa.");
		}
		
		System.out.println("\nDeseja fazer mais alguma operação?");
		System.out.println("\nInsira 0 caso queira sair do programa: \nInsira 1 caso você queira somar as matrizes: \nInsira 2 caso você queira subtrair as matrizes: \nInsira 3 caso queira adicionar uma constantes nas matrizes: \nInsira 4 caso queira imprimir as váriaveis:");
		Heather = TalkingToTheMoon.nextInt();
		
		switch(Heather)
		{
		case 1:
			for(int l=0; l<2; l++)
			{
				for(int c=0; c<2; c++)
					{
					Lovely[l][c] =  Montero[l][c] + CallMeByYourName[l][c];
					}
			}
			System.out.println("\nResultado:\n[" + Lovely[0][0] +"]" + " [" +Lovely[0][1] +"]" + "\n[" +Lovely[1][0] +"] " + "[" + Lovely[1][1] +"]");
			break;
			
		case 2:
			for(int l=0; l<2; l++)
			{
				for(int c=0; c<2; c++)
					{
					Lovely[l][c] = CallMeByYourName[l][c] - Montero[l][c];
					}
			}
			System.out.println("\nResultado:\n[" + Lovely[0][0] +"]" + " [" +Lovely[0][1] +"]" + "\n[" +Lovely[1][0] +"] " + "[" + Lovely[1][1] +"]");
			break;
			
		case 3:
			for(int l=0; l<2; l++)
			{
				for(int c=0; c<2; c++)
					{
					Montero[l][c] = Montero[l][c] + constante;
					CallMeByYourName[l][c] = CallMeByYourName[l][c] + constante;
					}
			}
			System.out.println("\nPrimeira matriz:\n[" + Montero[0][0] +"]" + " [" +Montero[0][1] +"]" + "\n[" +Montero[1][0] +"] " + "[" +Montero[1][1] +"]");
			System.out.println("\nSegunda matriz:\n[" + CallMeByYourName[0][0] +"]" + " [" +CallMeByYourName[0][1] +"]" + "\n[" +CallMeByYourName[1][0] +"] " + "[" +CallMeByYourName[1][1] +"]");
			break;
			
		case 4:
			System.out.println("\nPrimeira matriz:\n[" + Montero[0][0] +"]" + " [" +Montero[0][1] +"]" + "\n[" +Montero[1][0] +"] " + "[" +Montero[1][1] +"]");
			System.out.println("\nSegunda matriz:\n[" + CallMeByYourName[0][0] +"]" + " [" +CallMeByYourName[0][1] +"]" + "\n[" +CallMeByYourName[1][0] +"] " + "[" +CallMeByYourName[1][1] +"]");
			break;
			
		case 0:
			System.out.println("\nSe cuide ;)");
			break;
			
			default:
				System.out.println("\nResposta ínvalida. Reinecie o programa.");
		}
		

	}

}
