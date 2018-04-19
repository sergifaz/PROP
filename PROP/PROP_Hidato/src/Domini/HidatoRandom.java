package Domini;

public class HidatoRandom extends Hidato {
	
	//ATRIBUTS DE LA CLASSE
	
	private String dificultat;
	
	//Cal afegir tipus de casella potser
	
	
	
	// Constructor de la classe
	
	public HidatoRandom(int id_hidato, String propietari, int puntuacio, boolean acabat, String dificultat) {
		
		super(id_hidato, propietari, puntuacio, acabat);
		this.dificultat = dificultat;
		
	}

	public String getDificultat() {
		return dificultat;
	}

	public void setDificultat(String dificultat) {
		this.dificultat = dificultat;
	}
	
	

}
