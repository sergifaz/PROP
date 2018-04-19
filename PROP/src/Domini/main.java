package Domini;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		System.out.println("Et donem la benvinguda a Hidato, sisplau seleccioni una de les següents opcions per començar:");
		
        System.out.println("Clicar 1 per Sortir");
        
        System.out.println("Clicar 2 per crear NovaPartida");
        
        /*System.out.println("Clicar 3 per executar CargarPartida");
        
        System.out.println("Clicar 4 per executar ContinuarPartida");
        
        System.out.println("Clicar 5 per  executar Rankings");
        
        System.out.println("Clicar 6 per executar Ajuda");
        
        System.out.println("Clicar 7 per executar Configuració");
        */
        
        Scanner sc = new Scanner(System.in);
        int funcio = 0;
        Controlador_CD controlador = new Controlador_CD();
        funcio = sc.nextInt();
        
        if(funcio == 1) {
        	
        		controlador.Salir();
        }
        
        if(funcio == 2) {
        		
        		Scanner s2 = new Scanner(System.in);
        		int mode = 0;
        		System.out.println("Selecciona un mode de joc:");
        		System.out.println("Resolució d'un Hidato: 1");
        		System.out.println("Validació d'un Hidato: 2");
        		System.out.println("Generació Aleatoria d'un Hidato: 3");
        		mode = s2.nextInt();
        		
        		if(mode == 1) {		// Resolució d'un Hidato
        			System.out.println("Introdueix la entrada:");
        			
        		}
        		
        		if(mode == 2) {		// Validació d'un Hidato
        			System.out.println("Introdueix la entrada:");
        		}
        		
        		if(mode == 3) {		// Generació Aleatoria d'un Hidato
        			Scanner s3 = new Scanner(System.in);
            		String dif = "";
            		String cela = "";
        			System.out.println("Introdueix la dificultat:");
        			dif = s3.nextLine();
        			System.out.println("Selecciona el tipus de casella:");
        			cela = s3.nextLine();
        			
        			//System.out.println("Valor de dif: "+ dif);
        			//System.out.println("Valor de cela: " + cela);
        			
        		}
        		
        }
        
        if(funcio == 3) {
        	
        }
        
        if(funcio == 4) {
        	
        }
        
        if(funcio == 5) {
        	
        }
        
        if(funcio == 6) {
        	
        }
        
        if(funcio == 7) {
        	
        }
        
	}

}
