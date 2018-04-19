package Domini;

public class Tauler {
	
	
	// Atributs de la classe

	enum connectivitat { Costats, CostatsiAngles };
	
	
	private int[][] Matriu;

	
	//Mètodes
	
	
	// Constructor de la classe
	
	public Tauler(int[][] matriu) {
		super();
		Matriu = matriu;
	}


	public int[][] getMatriu() {
		return Matriu;
	}


	public void setMatriu(int[][] matriu) {
		Matriu = matriu;
	}
	
	
	
	
	


}
 