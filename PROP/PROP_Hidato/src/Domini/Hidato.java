package Domini;


public class Hidato {
	
	// ATRIBUTS DE LA CLASSE
	
	private int id_hidato;
	
	private String propietari;
	
	private int puntuacio;
	
	private boolean acabat;
		
	
	public Hidato(int id_hidato, String propietari, int puntuacio, boolean acabat) {
		super();
		this.id_hidato = id_hidato;
		this.propietari = propietari;
		this.puntuacio = puntuacio;
		this.acabat = acabat;
	}


	public int getId_hidato() {
		return id_hidato;
	}


	public void setId_hidato(int id_hidato) {
		this.id_hidato = id_hidato;
	}


	public String getPropietari() {
		return propietari;
	}


	public void setPropietari(String propietari) {
		this.propietari = propietari;
	}


	public int getPuntuacio() {
		return puntuacio;
	}


	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}


	public boolean isAcabat() {
		return acabat;
	}


	public void setAcabat(boolean acabat) {
		this.acabat = acabat;
	}

}
