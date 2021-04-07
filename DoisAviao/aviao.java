package POO0704.DoisAviao;

	
public class aviao {
		private String modelo;
		private String linha;
		private int capacidade;
	
		public aviao(String modelo, String linha, int capacidade)
		{
			this.modelo=modelo;
			this.linha=linha;
			this.capacidade=capacidade;
		}
		
		public void voar() 
		{
			System.out.println("O avião está voando.");
		}
		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getLinha() {
			return linha;
		}

		public void setLinha(String linha) {
			this.linha = linha;
		}

		public int getCapacidade() {
			return capacidade;
		}

		public void setCapacidade(int capacidade) {
			this.capacidade = capacidade;
		}

		public void pousar ()
		{
			System.out.println("O avião está no chão.");
		}
		public void mostrar ()
		{
			System.out.println("O avião é do modelo "+modelo+", da linha "+linha+", a capacidade é de "+capacidade+" pessoas.");
		}
		
	}


