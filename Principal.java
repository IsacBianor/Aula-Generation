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
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Ol�, Voc� est� a procura de atendimento de covid ?");
			System.out.println("\n(1) Digite 1 caso sim  ");
			System.out.println("\n(2) Digite 2 para saber mais informa��es sobre a Covid ");
			System.out.println("\n(0) Digite 0 caso voc� queira Encerrar o programa");

	        opcao = leia.nextInt();
	        
	        switch(opcao)
			{
	        
			case 1:
				
				System.out.println("Responda o question�rio com seus sintomas: ");
				
				System.out.println("\n( ) Febre" );//(5pt)
				
				if(boolean == true)
				{
					pt+
				}
				System.out.println("( )Dor de cabe�a "); //(1pt)
				System.out.println("( ) Secre��o nasal/espirros ");//(1pt)
				System.out.println("( ) Dor de garganta ");//(1pt) 
				System.out.println("( ) Dificuldade respirat�ria"); //(10pt) 
				System.out.println("( ) Dor no corpo ");//(1pt) 
				System.out.println("( ) Diarreia ");//(1pt) 
				System.out.println("( ) Perda do olfato ");//(3pt)
				System.out.println("( ) Contato com algum caso de COVID-19 ");//(10pt)
				
				if (pt=<9)
				{

				

				leia.nextLine();
				
				System.out.println("Vamos realizar seu cadastro");
				System.out.println("---------------------------------------------");
				
				System.out.println("Digite o seu nome completo: ");
				String nome = leia.nextLine();
				System.out.println("Digite seu n�mero de cart�o do sus:");
				int cartao = leia.nextInt();
				System.out.println("Digite sua data de nascimento: ");
				int data_nasc = leia.nextInt();
				System.out.println("Digite seu sexo(feminino ou masculino): ");
				String sexo = leia.nextLine();
				System.out.println("Digite seu g�nero: ");
				leia=next
				System.out.println("Digite sua sexualidade: ");
				
				System.out.println("Digite sua nacionalidade: ");
				
				System.out.println("Digite sua ra�a/cor: ");
				
				System.out.println("Digite seu endere�o: ");
				
				System.out.println("Residente de �rea quilombola, �ndigena ou comunidade cigana:");
				
				System.out.println("Est� sob condi��es privativas de liberdade: ");
				
				System.out.println("Est� em situa��o de rua: ");
				
				System.out.println("Telefone: ");
				
				System.out.println("� profissional da sa�de?");
				
				System.out.println("� profissional de seguran�a?");
				
				System.out.println("Data do �nicio dos sintomas: ");
				
				//A partir dos dados inseridos a cima � criado o usu�rio
				Usuarie userBase = new Usuarie(nome,idade,classifi);
				
				/*O usu�rio � adicionado a um array de usu�rios, 
				isso vai facilitar na hora de fazer as perguntas como por exemplos n�mero de usu�rio vivos*/
				user.add(userBase);
					
				senha++;
				System.out.println("Ol� "+nome+"\nSua senha � n�"+senha);
				}
				
					
				break;
				
			case 2:
				
				
				break;
				
			default:
				System.out.println("\nFinalizou o programa!!!");
			}
			
		}while(opcao!=0);

	}
	
	System.out.println("Digite a classifi��o de risco:");
	int classifi = leia.nextInt();
	
	System.out.println("Cadastro feito com sucesso");
	[1 a 9 pontos - Risco baixo de testagem positiva] 
			[10 a 19 - Risco m�dio]
			[20 a 36 pontos - Risco alto]
			Estado do teste covid19: //solicitado, coletado, concluido, exame n�o solicitado
			Alguma comorbidade: //Sim, N�o
			op��es: Diabetes Mellitus, Hipertens�o, Cardiopatia, Imunodeprimidos (HIV, dialise, uso de corticoides, usuo de �lcool e outras drogas. 
			Gestante: //sim, n�o; 
			Doen�as respirat�rias cr�nicas: sim, n�o. 
			Paciente teve contato pr�ximo com pessoa que seja caso suspeito ou confirmado de covid19: sim, n�o. 
			Tem hist�rico de viagem at� 14 dias antes do in�cio dos sintomas? sim, n�o 
}


