package Domini;

public class HidatoPersonalitzat extends Hidato {
	
	private int num_caselles;
	
	private int num_forats;
	
	private int predefinits;
	
	private int temps;
	
	private int num_errors;
	
	
	
	
	
	// Constructor de la classe
	
	public HidatoPersonalitzat(int id_hidato, String propietari, int puntuacio, boolean acabat, int num_caselles,
			int num_forats, int predefinits, int temps, int num_errors) {
		
		super(id_hidato, propietari, puntuacio, acabat);
		this.num_caselles = num_caselles;
		this.num_forats = num_forats;
		this.predefinits = predefinits;
		this.temps = temps;
		this.num_errors = num_errors;
		
	}


	public int getNum_caselles() {
		return num_caselles;
	}


	public void setNum_caselles(int num_caselles) {
		this.num_caselles = num_caselles;
	}
	

	public int getNum_forats() {
		return num_forats;
	}


	public void setNum_forats(int num_forats) {
		this.num_forats = num_forats;
	}


	public int getPredefinits() {
		return predefinits;
	}


	public void setPredefinits(int predefinits) {
		this.predefinits = predefinits;
	}


	public int getTemps() {
		return temps;
	}


	public void setTemps(int temps) {
		this.temps = temps;
	}


	public int getNum_errors() {
		return num_errors;
	}
	

	public void setNum_errors(int num_errors) {
		this.num_errors = num_errors;
	}

	

}
