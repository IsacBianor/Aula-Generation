package Herancas.Animais0904;

public class Cavalo extends Animal {
	
private int patas;
	
	public Cavalo (String nome, int idade, int patas)
	{
		super(nome,idade);
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
		System.out.println("correr");
	}
	@Override
	public void som()
	{
		System.out.println("inhóóóóóóó");
	}

}

