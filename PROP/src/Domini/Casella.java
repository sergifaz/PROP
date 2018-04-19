package Domini;

public class Casella {
	
	private int valor;
	enum Tipus_Casella { Accessible, No_accessible, Prefixada };
	
	
	public Casella(int valor) {
		super();
		this.valor = valor;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	};
	
	

}
