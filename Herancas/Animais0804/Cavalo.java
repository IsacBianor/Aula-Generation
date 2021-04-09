package Herancas.Animais0804;

public class Cavalo extends Animal {
	
private String corre;
	
	public Cavalo (String nome, int idade, String som, String corre)
	{
		super(nome,idade,som);
		this.corre=corre;
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}
	
	public String correr ()
	{
		return "Esse animal corre.";
	}

}

