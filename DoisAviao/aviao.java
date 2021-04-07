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
			System.out.println("O avi�o est� voando.");
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
			System.out.println("O avi�o est� no ch�o.");
		}
		public void mostrar ()
		{
			System.out.println("O avi�o � do modelo "+modelo+", da linha "+linha+", a capacidade � de "+capacidade+" pessoas.");
		}
		
	}


