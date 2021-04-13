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
	
		//Cria um array de Usuaries s� que sem tamanho definido, pode inserir a vontade 
		ArrayList<Usuarie> user = new ArrayList();
		
		Funcionarie func = new Funcionarie("Luiz",25,"444444","profissional da sa�de");
		
		do
		{
			//Menu do programa
			System.out.println("\n\n\n--------------------------------------------------------------------------------");
			System.out.println("\n\t\tBem Vinde ao IntegraTEC ");
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
				boolean sintomas,certo=false;
				
				System.out.println("Responda o question�rio com seus sintomas: ");
				
				leia.nextLine();
				
				System.out.println("\n( ) Febre" );//(5pt)
				sintomas=leia.nextBoolean();
				if(sintomas)
				{
					pt+=5;
					
				}
				
				
				System.out.println("( )Dor de cabe�a "); //(1pt)
				sintomas = leia.nextBoolean();				
				if(sintomas)
				{
					pt++;
					
				}
				System.out.println("( ) Secre��o nasal/espirros ");//(1pt)
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
				System.out.println("( ) Dificuldade respirat�ria"); //(10pt) 
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
				
				System.out.println("Pontua��o total: "+pt);
				
			
						
				if (pt>9)
				{
			
					System.out.println("\nVoc� est� com risco de cont�gio e de testagem positiva.\nVamo realizar seu cadastro.");
					System.out.println("---------------------------------------------");
				
					leia.nextLine();
				
				
					try {
						System.out.println("Digite a idade do usu�rie:");
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
						sexo = leia.next().charAt(0); //Esse charAt � pra avisar que s� vai pegar um character
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
						System.out.println("Digite o nome do usu�rie:");
						nome = leia.nextLine();
				
						System.out.println("Digite o cpf: ");
						cpf = leia.nextLine();
				
						System.out.println("Digite a data de nascimento");
						data=leia.nextLine();
						
						System.out.println("Digite identidade de G�nero: ");
						identidadeGenero = leia.nextLine();
						
						System.out.println("Digite sua sexualidade: ");
						sexualidade = leia.nextLine();
						
						System.out.println("Digite sua nacionalidade: ");
						nacionalidade = leia.nextLine();
				
						
						System.out.println("Digite ra�a: ");
						raca = leia.nextLine();
				
						System.out.println("Digite seu telefone de contato");
						telefone=leia.nextLine();
					
						System.out.println("Digite seu endere�o: ");
						endereco = leia.nextLine();
				
						System.out.println("Digite qual o tipo de �rea voc� � residente:  ");
						residenteArea=leia.nextLine();
				
						System.out.println("Digite a data do inicio sintomas ");
						inicioSintomas=leia.nextLine();
					
					
					}
					catch(InputMismatchException inputMismatchException) 
					{
						System.err.printf("Exception: %s",inputMismatchException);
						leia.nextLine();
						System.out.println("O tipo de dados esperado � string");
					
					}
				
					try 
					{
						System.out.println("Voc� se encontra privado de liberdade: true|false ");
						privadoDeLiberdade = leia.nextBoolean();
				
						System.out.println("Voc� se encontra em situa��o de rua : true|false");
						situacaoDeRua=leia.nextBoolean();
				
						System.out.println("Voc� � profissional de Sa�de? ");
						profissionalSaude=leia.nextBoolean();
				
						System.out.println("Voc� � um profissional da �rea de seguran�a?");
						profissionalSeguranca=leia.nextBoolean();
						
						if(idade>60 ) {
							
							System.out.println("Voc� ja foi vacinado?");
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
						System.out.println("O tipo de dados esperado � boolean");
					
					}
					
					
				}
				
				else
				{
					System.out.println("\nVoc� est� com baixo risco de cont�gio e de testagem positiva.\nSe poss�vel fique em casa.");
					System.out.println("---------------------------------------------");
				}
				
				
				Usuarie userBase = new Usuarie();
				
				//Funcion�rio cadastra uma pessoa
				userBase=func.cadastrarUsuarie(idade, nome, cpf, data, sexo, identidadeGenero, nacionalidade, raca, endereco, residenteArea, privadoDeLiberdade, situacaoDeRua, telefone, profissionalSaude, profissionalSeguranca, inicioSintomas, sexualidade, jaVacinado);
				user.add(userBase);
					
				senha++;
				System.out.println("\nOl� "+nome+"\nSua senha � n�"+senha);
				
				userBase.EmitirDados();
				
					
				break;
				
			case 2:
				
				int nObitos=1286,novosCasos=767,casosTotais=29281,totalJaVacinados=0;
				
				infoCovid infoC = new infoCovid(nObitos,nVacinados,novosCasos,casosTotais,totalJaVacinados);
			
				
				//Menu do programa
				System.out.println("\n--------------------------------------------------------------------------------");
				System.out.println("\n--------------------Monitoramento de casos confirmados e �bitos de -COVID-19-MUNIC�PIO-S�O-PAULO------------------------------------------------------------");
				System.out.println("\nPer�odo: 29/03/2021 � 05/04/2021");
				System.out.println("\nN�mero de �bitos pela covid19: "+nObitos);
				System.out.println("\nN�meros de vacinados nessa Unidade:  "+nVacinados);
				System.out.println("\nNovos Casos: "+novosCasos);
				System.out.println("\nTotais de Casos: "+casosTotais);
				System.out.println("\n--------------------------------------------------------------------------------");
				System.out.println("\nFontes Consultadas: USP ");
				System.out.println("\nUSP - https://ciis.fmrp.usp.br/covid19/sp-br/ ");
				System.out.println("\nMinist�rio da Sa�de � https://coronavirus.saude.gov.br");
				System.out.println("\nBoletim epidemiol�gico da Secretaria de Vigil�ncia em Sa�de � https://www.saude.gov.br/boletins-epidemiologicos");
				System.out.println("\nInforma��es sobre o coronav�rus disponibilizada pela FIOCRUZ � https://portal.fiocruz.br/coronavirus");
				System.out.println("\nFunda��o SEADE � https://www.seade.gov.br/coronavirus/");
				System.out.println("\nInforma��es sobre a epidemia de COVID 19 fornecidas pela OMS � https://www.who.int/emergencies/diseases/novel-coronavirus-2019");
				System.out.println("\nBrasil.IO � https://brasil.io/home");
				
				System.out.println("\n--------------------O Minist�rio da Sa�de adverte se poss�vel fique em casa------------------------------------------------------------");
				
				
				break;
				
			case 0:
			{
				System.out.println("O programa est� encerrando.");
			}
				
			default:
				System.out.println("\nERROR\nInsira uma op��o v�lida.");
			}
			
		}while(opcao!=0);

	}
			
}


