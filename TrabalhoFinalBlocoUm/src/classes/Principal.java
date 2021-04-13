package classes;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int opcao,senha=0,pontuacao=0,nVacinados=0;
		Scanner leia = new Scanner(System.in);
		
		int idade=0;
		String nome="",cpf="",data="",identidadeGenero="",nacionalidade="",raca="",endereco="",inicioSintomas="",residenteArea="",telefone="",sexualidade="";
		char sexo='d';
		boolean privadoDeLiberdade=false,situacaoDeRua=false,profissionalSaude=false,profissionalSeguranca=false,jaVacinado=false;
	
		//Cria um array de Usuaries só que sem tamanho definido, pode inserir a vontade 
		ArrayList<Usuarie> user = new ArrayList();
		
		Funcionarie func = new Funcionarie("Luiz",25,"444444","profissional da saúde");
		
		do
		{
			//Menu do programa
			System.out.println("\n\n\n--------------------------------------------------------------------------------");
			System.out.println("\n\t\tBem Vinde ao IntegraTEC ");
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
				boolean sintomas,certo=false;
				
				System.out.println("Responda o questionário com seus sintomas: ");
				
				leia.nextLine();
				
				System.out.println("\n( ) Febre" );//(5pt)
				sintomas=leia.nextBoolean();
				if(sintomas)
				{
					pt+=5;
					
				}
				
				
				System.out.println("( )Dor de cabeça "); //(1pt)
				sintomas = leia.nextBoolean();				
				if(sintomas)
				{
					pt++;
					
				}
				System.out.println("( ) Secreção nasal/espirros ");//(1pt)
				sintomas = leia.nextBoolean();				
				if(sintomas)
				{
					pt++;
					
				}
				System.out.println("( ) Dor de garganta ");//(1pt) 
				sintomas =leia.nextBoolean();				
				if(sintomas)				
				{
					pt++;
					
				}
				System.out.println("( ) Dificuldade respiratória"); //(10pt) 
				sintomas = leia.nextBoolean();				
				if(sintomas)
				{
					pt+=10;
					
				}
				System.out.println("( ) Dor no corpo ");//(1pt) 
				sintomas = leia.nextBoolean();				
				if(sintomas)
				{
					pt++;
					
				}
				System.out.println("( ) Diarreia ");//(1pt) 
				sintomas = leia.nextBoolean();			
				if(sintomas)
				{
					pt++;
					
				}
				System.out.println("( ) Perda do olfato ");//(3pt)
				sintomas = leia.nextBoolean();				
				if(sintomas)
				{
					pt+=3;
					
				}
				System.out.println("( ) Contato com algum caso de COVID-19 ");//(10pt)
				sintomas = leia.nextBoolean();				
				if(sintomas)
				{
					pt+=10;
					
				}
				
				System.out.println("Pontuação total: "+pt);
				
			
						
				if (pt>9)
				{
			
					System.out.println("\nVocê está com risco de contágio e de testagem positiva.\nVamo realizar seu cadastro.");
					System.out.println("---------------------------------------------");
				
					leia.nextLine();
				
				
					try {
						System.out.println("Digite a idade do usuárie:");
						idade = leia.nextInt();
					}
					catch(InputMismatchException inputMismatchException) 
					{
						System.err.printf("Exception: %s",inputMismatchException);
						leia.nextLine();
						System.out.println("Digite um valor inteiro");
					}
					
					try {
						System.out.println("Digite sexo: F | M: ");
						sexo = leia.next().charAt(0); //Esse charAt é pra avisar que só vai pegar um character
					}
					catch(InputMismatchException inputMismatchException)
					{
						System.err.printf("Exception: %s",inputMismatchException);
						leia.nextLine();
						System.out.println("Digite apenas um caracter");
					}
				
				
					try 
					{
						leia.nextLine();
						System.out.println("Digite o nome do usuárie:");
						nome = leia.nextLine();
				
						System.out.println("Digite o cpf: ");
						cpf = leia.nextLine();
				
						System.out.println("Digite a data de nascimento");
						data=leia.nextLine();
						
						System.out.println("Digite identidade de Gênero: ");
						identidadeGenero = leia.nextLine();
						
						System.out.println("Digite sua sexualidade: ");
						sexualidade = leia.nextLine();
						
						System.out.println("Digite sua nacionalidade: ");
						nacionalidade = leia.nextLine();
				
						
						System.out.println("Digite raça: ");
						raca = leia.nextLine();
				
						System.out.println("Digite seu telefone de contato");
						telefone=leia.nextLine();
					
						System.out.println("Digite seu endereço: ");
						endereco = leia.nextLine();
				
						System.out.println("Digite qual o tipo de área você é residente:  ");
						residenteArea=leia.nextLine();
				
						System.out.println("Digite a data do inicio sintomas ");
						inicioSintomas=leia.nextLine();
					
					
					}
					catch(InputMismatchException inputMismatchException) 
					{
						System.err.printf("Exception: %s",inputMismatchException);
						leia.nextLine();
						System.out.println("O tipo de dados esperado é string");
					
					}
				
					try 
					{
						System.out.println("Você se encontra privado de liberdade: true|false ");
						privadoDeLiberdade = leia.nextBoolean();
				
						System.out.println("Você se encontra em situação de rua : true|false");
						situacaoDeRua=leia.nextBoolean();
				
						System.out.println("Você é profissional de Saúde? ");
						profissionalSaude=leia.nextBoolean();
				
						System.out.println("Você é um profissional da área de segurança?");
						profissionalSeguranca=leia.nextBoolean();
						
						if(idade>60 ) {
							
							System.out.println("Você ja foi vacinado?");
							jaVacinado=leia.nextBoolean();
							
							if(jaVacinado==true) {
								nVacinados++;
							}
						}
						
				
				
						int classifi = pt;
				
						System.out.println("\nCadastro feito com sucesso");
					}
					
					catch(InputMismatchException inputMismatchException) 
					{
						System.err.printf("Exception: %s",inputMismatchException);
						leia.nextLine();
						System.out.println("O tipo de dados esperado é boolean");
					
					}
					
					
				}
				
				else
				{
					System.out.println("\nVocê está com baixo risco de contágio e de testagem positiva.\nSe possível fique em casa.");
					System.out.println("---------------------------------------------");
				}
				
				
				Usuarie userBase = new Usuarie();
				
				//Funcionário cadastra uma pessoa
				userBase=func.cadastrarUsuarie(idade, nome, cpf, data, sexo, identidadeGenero, nacionalidade, raca, endereco, residenteArea, privadoDeLiberdade, situacaoDeRua, telefone, profissionalSaude, profissionalSeguranca, inicioSintomas, sexualidade, jaVacinado);
				user.add(userBase);
					
				senha++;
				System.out.println("\nOlá "+nome+"\nSua senha é nº"+senha);
				
				userBase.EmitirDados();
				
					
				break;
				
			case 2:
				
				int nObitos=1286,novosCasos=767,casosTotais=29281,totalJaVacinados=0;
				
				infoCovid infoC = new infoCovid(nObitos,nVacinados,novosCasos,casosTotais,totalJaVacinados);
			
				
				//Menu do programa
				System.out.println("\n--------------------------------------------------------------------------------");
				System.out.println("\n--------------------Monitoramento de casos confirmados e óbitos de -COVID-19-MUNICÍPIO-SÃO-PAULO------------------------------------------------------------");
				System.out.println("\nPeríodo: 29/03/2021 à 05/04/2021");
				System.out.println("\nNúmero de óbitos pela covid19: "+nObitos);
				System.out.println("\nNúmeros de vacinados nessa Unidade:  "+nVacinados);
				System.out.println("\nNovos Casos: "+novosCasos);
				System.out.println("\nTotais de Casos: "+casosTotais);
				System.out.println("\n--------------------------------------------------------------------------------");
				System.out.println("\nFontes Consultadas: USP ");
				System.out.println("\nUSP - https://ciis.fmrp.usp.br/covid19/sp-br/ ");
				System.out.println("\nMinistério da Saúde – https://coronavirus.saude.gov.br");
				System.out.println("\nBoletim epidemiológico da Secretaria de Vigilância em Saúde – https://www.saude.gov.br/boletins-epidemiologicos");
				System.out.println("\nInformações sobre o coronavírus disponibilizada pela FIOCRUZ – https://portal.fiocruz.br/coronavirus");
				System.out.println("\nFundação SEADE – https://www.seade.gov.br/coronavirus/");
				System.out.println("\nInformações sobre a epidemia de COVID 19 fornecidas pela OMS – https://www.who.int/emergencies/diseases/novel-coronavirus-2019");
				System.out.println("\nBrasil.IO – https://brasil.io/home");
				
				System.out.println("\n--------------------O Ministério da Saúde adverte se possível fique em casa------------------------------------------------------------");
				
				
				break;
				
			case 0:
			{
				System.out.println("O programa está encerrando.");
			}
				
			default:
				System.out.println("\nERROR\nInsira uma opção válida.");
			}
			
		}while(opcao!=0);

	}
			
}


