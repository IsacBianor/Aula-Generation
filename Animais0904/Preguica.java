package Herancas.Animais0904;

public class Preguica extends Animal{
	
	private int patas;
	
	public Preguica (String nome, int idade, int patas)
	{
		super(nome, idade);
		this.patas=patas;
	}
	
	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	@Override
	public void habilidade() {
		System.out.println("escalar árvores");
	}
	
	@Override
	public void som()
	{
		System.out.println("aaaaaaaaaaaa");
	}
}

