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
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Olá, Você está a procura de atendimento de covid ?");
			System.out.println("\n(1) Digite 1 caso sim  ");
			System.out.println("\n(2) Digite 2 para saber mais informações sobre a Covid ");
			System.out.println("\n(0) Digite 0 caso você queira Encerrar o programa");

	        opcao = leia.nextInt();
	        
	        switch(opcao)
			{
	        
			case 1:
				
				System.out.println("Responda o questionário com seus sintomas: ");
				
				System.out.println("\n( ) Febre" );//(5pt)
				
				if(boolean == true)
				{
					pt+
				}
				System.out.println("( )Dor de cabeça "); //(1pt)
				System.out.println("( ) Secreção nasal/espirros ");//(1pt)
				System.out.println("( ) Dor de garganta ");//(1pt) 
				System.out.println("( ) Dificuldade respiratória"); //(10pt) 
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
				System.out.println("Digite seu número de cartão do sus:");
				int cartao = leia.nextInt();
				System.out.println("Digite sua data de nascimento: ");
				int data_nasc = leia.nextInt();
				System.out.println("Digite seu sexo(feminino ou masculino): ");
				String sexo = leia.nextLine();
				System.out.println("Digite seu gênero: ");
				leia=next
				System.out.println("Digite sua sexualidade: ");
				
				System.out.println("Digite sua nacionalidade: ");
				
				System.out.println("Digite sua raça/cor: ");
				
				System.out.println("Digite seu endereço: ");
				
				System.out.println("Residente de área quilombola, índigena ou comunidade cigana:");
				
				System.out.println("Está sob condições privativas de liberdade: ");
				
				System.out.println("Está em situação de rua: ");
				
				System.out.println("Telefone: ");
				
				System.out.println("É profissional da saúde?");
				
				System.out.println("É profissional de segurança?");
				
				System.out.println("Data do ínicio dos sintomas: ");
				
				//A partir dos dados inseridos a cima é criado o usuário
				Usuarie userBase = new Usuarie(nome,idade,classifi);
				
				/*O usuário é adicionado a um array de usuários, 
				isso vai facilitar na hora de fazer as perguntas como por exemplos número de usuário vivos*/
				user.add(userBase);
					
				senha++;
				System.out.println("Olá "+nome+"\nSua senha é nº"+senha);
				}
				
					
				break;
				
			case 2:
				
				
				break;
				
			default:
				System.out.println("\nFinalizou o programa!!!");
			}
			
		}while(opcao!=0);

	}
	
	System.out.println("Digite a classifição de risco:");
	int classifi = leia.nextInt();
	
	System.out.println("Cadastro feito com sucesso");
	[1 a 9 pontos - Risco baixo de testagem positiva] 
			[10 a 19 - Risco médio]
			[20 a 36 pontos - Risco alto]
			Estado do teste covid19: //solicitado, coletado, concluido, exame não solicitado
			Alguma comorbidade: //Sim, Não
			opções: Diabetes Mellitus, Hipertensão, Cardiopatia, Imunodeprimidos (HIV, dialise, uso de corticoides, usuo de álcool e outras drogas. 
			Gestante: //sim, não; 
			Doenças respiratórias crônicas: sim, não. 
			Paciente teve contato próximo com pessoa que seja caso suspeito ou confirmado de covid19: sim, não. 
			Tem histórico de viagem até 14 dias antes do início dos sintomas? sim, não 
}


