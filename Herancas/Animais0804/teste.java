package Herancas.Animais0804;

public class teste {
	public static void main(String[] args) {
		
		//String nome, int idade, String som, String corre
		
		Animal peixin = new Animal ("Jefferson", 30, "Glub Glub");
		
		Cachorro cachorrin = new Cachorro ("PatoDonald", 5, "au au au woof au", "corre");
		
		Cavalo cavalin = new Cavalo ("Relampago", 72, "inh������", "corre");
		
		Preguica preguicin = new Preguica ("Carla", 35, "aaaaaaaaaaaaaaaaa", "escala �rvore");
		
		peixin.getNome();
		peixin.getIdade();
		peixin.getSom();
		
		cachorrin.getNome();
		cachorrin.getIdade();
		cachorrin.getSom();
		cachorrin.getCorre();
		
		cavalin.getNome();
		cavalin.getIdade();
		cavalin.getSom();
		cavalin.getCorre();
		
		preguicin.getNome();
		preguicin.getIdade();
		preguicin.getSom();
		preguicin.getEscala();
		
		
		System.out.println("O nome do peixe � "+peixin.getNome()+", tem "+peixin.getIdade()+" anos.\nSeu som �: "+peixin.getSom()+".");
		System.out.println("\n\nO nome do cachorro � "+cachorrin.getNome()+", tem "+cachorrin.getIdade()+" anos.\nSeu som �: "+cachorrin.getSom()+", e " + cachorrin.getCorre()+ ".");
		System.out.println("\n\nO nome do cavalo � "+cavalin.getNome()+", tem "+cavalin.getIdade()+" anos.\nSeu som �: "+cavalin.getSom()+", e " + cavalin.getCorre()+ ".");
		System.out.println("\n\nO nome da pregui�a � "+preguicin.getNome()+", tem "+preguicin.getIdade()+" anos.\nSeu som �: "+preguicin.getSom()+", e " + preguicin.getEscala()+ ".");
	}

}
