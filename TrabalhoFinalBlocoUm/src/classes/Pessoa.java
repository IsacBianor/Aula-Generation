package classes;

//Essa classe vai servir de base para as classes funcion�rie e usu�rie
public abstract class Pessoa {
	
	//Atributos
	private String nome;
	private int idade;
	private String cpf;
	
	

	//Construtor
	public Pessoa(int idade,String nome,String cpf) {
		
		this.idade=idade;
		this.nome=nome;
		this.cpf=cpf;
		}
	
	public Pessoa() {};
	
	
	//M�todos
	abstract public void EmitirDados();


	//M�todos Get e Setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
}
