package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int opcao,senha=0;
		Scanner leia = new Scanner(System.in);
		
		//Cria um array de Usuaries s� que sem tamanho definido, pode inserir a vontade 
		ArrayList<Usuarie> user = new ArrayList();
		
		do
		{
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("\n\t\tBem Vinde ao nosso programa que ainda n�o tem nome :) ");
			System.out.println("\n--------------------------------------------------------------------------------");
			System.out.println("Ol�, Voc� est� a procura de atendimento de covid ?");
			System.out.println("\n(1) Digite 1 caso sim  ");
			System.out.println("\n(2) Digite 2 para saber mais informa��es sobre a Covid ");
			System.out.println("\n(0) Digite 0 caso voc� queira Encerrar o programa");

	        opcao = leia.nextInt();
	        
	        switch(opcao)
			{
	        
			case 1:
				int pt=0;
				boolean sintomas;
				
				System.out.println("Responda o question�rio com seus sintomas: ");
				
				leia.nextLine();
				System.out.println("\n( ) Febre" );//(5pt)
				sintomas = leia.nextBoolean();				
				if(sintomas == true)
				{
					pt+=5;
					System.out.println(pt);
				}
				//else {}
				System.out.println("( )Dor de cabe�a "); //(1pt)
				sintomas = leia.nextBoolean();	
				if(sintomas == true)
				{
					pt++;
					System.out.println(pt);
				}
				System.out.println("( ) Secre��o nasal/espirros ");//(1pt)
				sintomas = leia.nextBoolean();
				if(sintomas == true)
				{
					pt++;
					System.out.println(pt);
				}
				System.out.println("( ) Dor de garganta ");//(1pt) 
				sintomas = leia.nextBoolean();
				if(sintomas == true)				
				{
					pt++;
					System.out.println(pt);
				}
				System.out.println("( ) Dificuldade respirat�ria"); //(10pt) 
				sintomas = leia.nextBoolean();
				if(sintomas == true)
				{
					pt+=10;
					System.out.println(pt);
				}
				System.out.println("( ) Dor no corpo ");//(1pt) 
				sintomas = leia.nextBoolean();
				if(sintomas == true)
				{
					pt++;
					System.out.println(pt);
				}
				System.out.println("( ) Diarreia ");//(1pt) 
				sintomas = leia.nextBoolean();
				if(sintomas == true)
				{
					pt++;
					System.out.println(pt);
				}
				System.out.println("( ) Perda do olfato ");//(3pt)
				sintomas = leia.nextBoolean();
				if(sintomas == true)
				{
					pt+=3;
					System.out.println(pt);
				}
				System.out.println("( ) Contato com algum caso de COVID-19 ");//(10pt)
				sintomas = leia.nextBoolean();
				if(sintomas == true)
				{
					pt+=10;
					System.out.println(pt);
				}
				
				System.out.println(pt);
				
				if (pt<=9)
				{
					System.out.println("Realize seu cadastro");
					
					leia.nextLine();
					
					System.out.println("\nVamos realizar seu cadastro");
					System.out.println("---------------------------------------------");
					
					System.out.println("Seu nome completo: ");
					String nome = leia.nextLine();
					System.out.println("N�mero de cart�o do sus:");
					int cartao = leia.nextInt();
					System.out.println("Data de nascimento: ");
					int data_nasc = leia.nextInt();
					leia.nextLine();
					System.out.println("Sexo(feminino ou masculino): ");
					String sexo = leia.nextLine();
					System.out.println("G�nero: ");
					String genero = leia.nextLine();
					System.out.println("Sexualidade: ");
					String sexualidade = leia.nextLine();				
					System.out.println("Nacionalidade: ");
					String nacionalidade = leia.nextLine();
					leia.nextLine();
					System.out.println("Ra�a/cor: ");
					
					System.out.println("Endere�o: ");
					String endereco = leia.nextLine();
					System.out.println("Residente de �rea quilombola, �ndigena ou comunidade cigana:");
					//boolean
					System.out.println("Est� sob condi��es privativas de liberdade: ");
					
					leia.nextLine();
					System.out.println("Est� em situa��o de rua: ");
					
					System.out.println("Telefone: ");
					int telefone = leia.nextInt();				
					System.out.println("� profissional da sa�de?");
					
					leia.nextLine();
					System.out.println("� profissional de seguran�a?");
					
					System.out.println("Data do �nicio dos sintomas: ");
					
					//A partir dos dados inseridos a cima � criado o usu�rio
					//Usuarie userBase = new Usuarie(nome,idade,classifi);
					
					/*O usu�rio � adicionado a um array de usu�rios, 
					isso vai facilitar na hora de fazer as perguntas como por exemplos n�mero de usu�rio vivos*/
					//user.add(userBase);
						
					senha++;
					System.out.println("Ol� "+nome+"\nSua senha � n�"+senha);
				}
				

				
				//}
				
					
				break;
				
			case 2:
				System.out.println("Informa��es sobre covid:");
				
				break;
				
			case 0:
				System.out.println("At� mais!");
				
				break;
			default:
				System.out.println("\nERROR");
			}
			
		}
	while(opcao!=0);

	}
	
}


