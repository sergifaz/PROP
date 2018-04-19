package Domini;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Controlador_CD {
	
	private Fabrica_Hidato fabrica;
	private String tipus_joc;				// Resolució, Validació o Generació de Hidatos
	
	
	public void setHidato(String tipus_joc){
		this.tipus_joc = tipus_joc;
		fabrica = new Fabrica_Hidato(tipus_joc);
		fabrica.CrearHidato();
	}
	
	public void Salir(){
		System.exit(0);
	}
	

}
