package classes;

public class Funcionarie extends Pessoa {

	//Atributos
	private String cargo;
	
	
	//Construtor
	
	
	public Funcionarie(String nome , int idade,String cpf ,String cargo) {
		super(idade,nome,cpf);
		this.cargo=cargo;
	}
	
	public Funcionarie() {};
	
	
	//M�todos 
	//Esse m�todo serve para criar um usu�rio
	public Usuarie cadastrarUsuarie(int idade,String nome,String cpf,String data,char sexo,String identidadeGenero,
			String nacionalidade,String raca,String endereco,String residenteArea,
			Boolean privadoDeLiberdade,Boolean situacaoDeRua,String telefone,
			Boolean profissionalSaude,Boolean profissionalSeguranca,
			String  inicioSintomas, String sexualidade,boolean jaVacinado) {
		
		Usuarie user = new Usuarie(idade,nome,cpf,data,sexo,identidadeGenero,nacionalidade,raca,endereco,residenteArea,
				privadoDeLiberdade,situacaoDeRua,telefone,profissionalSaude,profissionalSeguranca,inicioSintomas, sexualidade,jaVacinado);
		
		return user;
	}
	
	
	
	
		
	//M�todos(polimorfismo)
	@Override
	public void EmitirDados() {
		System.out.println("O funcion�rie se chama: "+this.getNome());
		System.out.println("A idade do funcion�rie �: "+this.getIdade());
		System.out.println("O funcion�rie est� ocupando o cargo de: "+cargo);
	}

}
