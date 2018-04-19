package Domini;

import java.util.ArrayList;
import java.io.*;

public class Fabrica_Hidato {

	private String tipus_joc;

	public Fabrica_Hidato(String tipus_joc) {
		super();
		this.tipus_joc = tipus_joc;
	}

	public String getTipus_joc() {
		return tipus_joc;
	}

	public void setTipus_joc(String tipus_joc) {
		this.tipus_joc = tipus_joc;
	}
	
	public void CrearHidato() {
		System.out.println("Fabrica_Hidato::JocCreat");
		
	}
	
}
