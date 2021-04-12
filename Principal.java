package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int opcao,senha=0;
		Scanner leia = new Scanner(System.in);
		
		//Cria um array de Usuaries só que sem tamanho definido, pode inserir a vontade 
		ArrayList<Usuarie> user = new ArrayList();
		
		do
		{
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("\n\t\tBem Vinde ao nosso programa que ainda não tem nome :) ");
			System.out.println("\n--------------------------------------------------------------------------------");
			System.out.println("Olá, Você está a procura de atendimento de covid ?");
			System.out.println("\n(1) Digite 1 caso sim  ");
			System.out.println("\n(2) Digite 2 para saber mais informações sobre a Covid ");
			System.out.println("\n(0) Digite 0 caso você queira Encerrar o programa");

	        opcao = leia.nextInt();
	        
	        switch(opcao)
			{
	        
			case 1:
				int pt=0;
				boolean sintomas;
				
				System.out.println("Responda o questionário com seus sintomas: ");
				
				leia.nextLine();
				System.out.println("\n( ) Febre" );//(5pt)
				sintomas = leia.nextBoolean();				
				if(sintomas == true)
				{
					pt+=5;
					System.out.println(pt);
				}
				//else {}
				System.out.println("( )Dor de cabeça "); //(1pt)
				sintomas = leia.nextBoolean();	
				if(sintomas == true)
				{
					pt++;
					System.out.println(pt);
				}
				System.out.println("( ) Secreção nasal/espirros ");//(1pt)
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
				System.out.println("( ) Dificuldade respiratória"); //(10pt) 
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
					System.out.println("Número de cartão do sus:");
					int cartao = leia.nextInt();
					System.out.println("Data de nascimento: ");
					int data_nasc = leia.nextInt();
					leia.nextLine();
					System.out.println("Sexo(feminino ou masculino): ");
					String sexo = leia.nextLine();
					System.out.println("Gênero: ");
					String genero = leia.nextLine();
					System.out.println("Sexualidade: ");
					String sexualidade = leia.nextLine();				
					System.out.println("Nacionalidade: ");
					String nacionalidade = leia.nextLine();
					leia.nextLine();
					System.out.println("Raça/cor: ");
					
					System.out.println("Endereço: ");
					String endereco = leia.nextLine();
					System.out.println("Residente de área quilombola, índigena ou comunidade cigana:");
					//boolean
					System.out.println("Está sob condições privativas de liberdade: ");
					
					leia.nextLine();
					System.out.println("Está em situação de rua: ");
					
					System.out.println("Telefone: ");
					int telefone = leia.nextInt();				
					System.out.println("É profissional da saúde?");
					
					leia.nextLine();
					System.out.println("É profissional de segurança?");
					
					System.out.println("Data do ínicio dos sintomas: ");
					
					//A partir dos dados inseridos a cima é criado o usuário
					//Usuarie userBase = new Usuarie(nome,idade,classifi);
					
					/*O usuário é adicionado a um array de usuários, 
					isso vai facilitar na hora de fazer as perguntas como por exemplos número de usuário vivos*/
					//user.add(userBase);
						
					senha++;
					System.out.println("Olá "+nome+"\nSua senha é nº"+senha);
				}
				

				
				//}
				
					
				break;
				
			case 2:
				System.out.println("Informações sobre covid:");
				
				break;
				
			case 0:
				System.out.println("Até mais!");
				
				break;
			default:
				System.out.println("\nERROR");
			}
			
		}
	while(opcao!=0);

	}
	
}


