package classes;

public class Usuarie extends Pessoa {

	//Atributos
	private int classificacaoRisco;
	private String data;
	private char sexo;
	private String identidadeGenero;
	private String nacionalidade;
	private String raca;
	private String endereco;
	private String residenteArea;
	private String telefone;
	private String sexualidade;
	
	
	private boolean privadoDeLiberdade;
	private boolean situacaoDeRua;
	private boolean profissionalSaude;
	private boolean profissionalSeguranca;
	private boolean jaVacinado;
	private String  inicioSintomas;
	
	
	//Contrutor
	public Usuarie(int idade,String nome,String cpf,String data,char sexo,String identidadeGenero,
			String nacionalidade,String raca,String endereco,String residenteArea,
			boolean privadoDeLiberdade,boolean situacaoDeRua,String telefone,
			boolean profissionalSaude,boolean profissionalSeguranca,
			String  inicioSintomas, String sexualidade,boolean jaVacinado ) {
		
		super(idade,nome,cpf);
		this.classificacaoRisco=classificacaoRisco;
		this.data=data;
		this.sexo=sexo;
		this.identidadeGenero=identidadeGenero;
		this.nacionalidade=nacionalidade;
		this.raca=raca;
		this.endereco=endereco;
		this.residenteArea=residenteArea;
		this.privadoDeLiberdade=privadoDeLiberdade;
		this.situacaoDeRua=situacaoDeRua;
		this.telefone=telefone;
		this.profissionalSaude=profissionalSaude;
		this.profissionalSeguranca=profissionalSeguranca;
		this.inicioSintomas=inicioSintomas;
		this.sexualidade=sexualidade;
	}
	
	public Usuarie() {};
	
	
	//Método (utilizando o conceito de polimorfismo)
	@Override
	public void EmitirDados() {
		System.out.println("\nNome: "+this.getNome());
		System.out.println("\nIdade: "+this.getIdade());
		System.out.println("\nSexo :"+this.getSexo());
		System.out.println("\nIdentida de Genero: "+this.getIdentidadeGenero());
		System.out.println("\nNacionalidade:"+this.getNacionalidade());
		System.out.println("\nRaça: "+this.getRaca());
		System.out.println("\nEndereco: "+this.getEndereco());
		System.out.println("\nÁrea residencial: "+this.getResidenteArea());
		System.out.println("\nPrivado de liberdade? "+this.getPrivadoDeLiberdade());
		System.out.println("\nSe encontra em situação de rua? "+this.getSituacaoDeRua());
		System.out.println("Telefone de contato: "+this.getTelefone());
		System.out.println("É profissional de saúde? "+this.getProfissionalSaude());
		System.out.println("É profissional da area de segurança? "+this.getProfissionalSaude());
	}

	
	
	public String getSexualidade() {
		return sexualidade;
	}

	public void setSexualidade(String sexualidade) {
		this.sexualidade = sexualidade;
	}

	public boolean isJaVacinado() {
		return jaVacinado;
	}

	public void setJaVacinado(boolean jaVacinado) {
		this.jaVacinado = jaVacinado;
	}

	public void setPrivadoDeLiberdade(boolean privadoDeLiberdade) {
		this.privadoDeLiberdade = privadoDeLiberdade;
	}

	public void setSituacaoDeRua(boolean situacaoDeRua) {
		this.situacaoDeRua = situacaoDeRua;
	}

	public void setProfissionalSaude(boolean profissionalSaude) {
		this.profissionalSaude = profissionalSaude;
	}

	public void setProfissionalSeguranca(boolean profissionalSeguranca) {
		this.profissionalSeguranca = profissionalSeguranca;
	}

	public int getClassificacaoRisco() {
		return classificacaoRisco;
	}


	public void setClassificacaoRisco(int classificacaoRisco) {
		this.classificacaoRisco = classificacaoRisco;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public String getIdentidadeGenero() {
		return identidadeGenero;
	}


	public void setIdentidadeGenero(String identidadeGenero) {
		this.identidadeGenero = identidadeGenero;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getResidenteArea() {
		return residenteArea;
	}


	public void setResidenteArea(String residenteArea) {
		this.residenteArea = residenteArea;
	}


	public Boolean getPrivadoDeLiberdade() {
		return privadoDeLiberdade;
	}


	public void setPrivadoDeLiberdade(Boolean privadoDeLiberdade) {
		this.privadoDeLiberdade = privadoDeLiberdade;
	}


	public Boolean getSituacaoDeRua() {
		return situacaoDeRua;
	}


	public void setSituacaoDeRua(Boolean situacaoDeRua) {
		this.situacaoDeRua = situacaoDeRua;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public Boolean getProfissionalSaude() {
		return profissionalSaude;
	}


	public void setProfissionalSaude(Boolean profissionalSaude) {
		this.profissionalSaude = profissionalSaude;
	}


	public Boolean getProfissionalSeguranca() {
		return profissionalSeguranca;
	}


	public void setProfissionalSeguranca(Boolean profissionalSeguranca) {
		this.profissionalSeguranca = profissionalSeguranca;
	}


	public String getInicioSintomas() {
		return inicioSintomas;
	}


	public void setInicioSintomas(String inicioSintomas) {
		this.inicioSintomas = inicioSintomas;
	}


	
	
	
	
}
