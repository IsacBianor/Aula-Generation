package Herancas.Animais0804;

public class Preguica extends Animal{
	
private String escala;
	
	public Preguica (String nome, int idade, String som, String escala)
	{
		super(nome,idade,som);
		this.escala = escala;
	}

	public String getEscala() {
		return escala;
	}

	public void setEscala(String escala) {
		this.escala = escala;
	}
	
	public String escalar ()
	{
		return "Esse animal sobe em árvores.";
	}

}

