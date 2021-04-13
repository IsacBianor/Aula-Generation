package classes;

public class infoCovid extends Funcionarie{
	
	private int nObitos;
	private int nVacinados;
	private int novosCasos;
	private int casosTotais;
	private int totalJaVacinados;
	
	public infoCovid(int nObitos,int nVacinados,int novosCasos,int casosTotais,int totalJaVacinados) {
		this.casosTotais=casosTotais;
		this.nObitos=nObitos;
		this.novosCasos=novosCasos;
		this.nVacinados=nVacinados;
		this.totalJaVacinados=totalJaVacinados;
	}

	
	//Getter e Setter
	public int getnObitos() {
		return nObitos;
	}
	public void setnObitos(int nObitos) {
		this.nObitos = nObitos;
	}
	public int getnVacinados() {
		return nVacinados;
	}
	public void setnVacinados(int nVacinados) {
		this.nVacinados = nVacinados;
	}
	public int getNovosCasos() {
		return novosCasos;
	}
	public void setNovosCasos(int novosCasos) {
		this.novosCasos = novosCasos;
	}
	public int getCasosTotais() {
		return casosTotais;
	}
	public void setCasosTotais(int casosTotais) {
		this.casosTotais = casosTotais;
	}


	@Override
	public void EmitirDados() {
		// TODO Auto-generated method stub
		
	}
	
	
}
