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
	
	
	//Métodos 
	//Esse método serve para criar um usuário
	public Usuarie cadastrarUsuarie(int idade,String nome,String cpf,String data,char sexo,String identidadeGenero,
			String nacionalidade,String raca,String endereco,String residenteArea,
			Boolean privadoDeLiberdade,Boolean situacaoDeRua,String telefone,
			Boolean profissionalSaude,Boolean profissionalSeguranca,
			String  inicioSintomas, String sexualidade,boolean jaVacinado) {
		
		Usuarie user = new Usuarie(idade,nome,cpf,data,sexo,identidadeGenero,nacionalidade,raca,endereco,residenteArea,
				privadoDeLiberdade,situacaoDeRua,telefone,profissionalSaude,profissionalSeguranca,inicioSintomas, sexualidade,jaVacinado);
		
		return user;
	}
	
	
	
	
		
	//Métodos(polimorfismo)
	@Override
	public void EmitirDados() {
		System.out.println("O funcionárie se chama: "+this.getNome());
		System.out.println("A idade do funcionárie é: "+this.getIdade());
		System.out.println("O funcionárie está ocupando o cargo de: "+cargo);
	}

}
