package Domini;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Point;
import java.io.IOException;
import java.io.File.*;
import java.util.*;
import java.util.Scanner;


public class Algoritmes {
	
	
	private static int[][] board;
    private static int[] given, start;
    private static int iep;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inici = introduccio();
		String [] input;
		
		
		// ---------------------------------------------------------------------
		// VALIDACIÓ I RESOLUCIÓ DE HIDATOS!!!!!!!!!!!
		
		
		if (inici == 11) {
			System.out.print("Escull el tipus d'adjacència:\n");
			System.out.print("Costats : 1\n");
			System.out.print("Costats i angles : 2\n");
			Scanner n2_v2 = new Scanner(System.in);
			int val = n2_v2.nextInt();
			input = llegir_quadrat();
			setup(input);
			if(val == 1) {
				if (solve_quadrat(start[0], start[1], 1, 0)) {
					System.out.print("Té Solució\n");
					printBoard();			
				}
				else System.out.print("No té solució");
			}
			else if(val == 2) {
				if (solve_quadrat_ca(start[0], start[1], 1, 0)) {
					System.out.print("Té Solució\n");
					printBoard();			
				}
				else System.out.print("No té solució");
			}
			else System.out.print("Opció marcada incorrecte");
		}

		else if (inici == 12) {
			input = llegir_hexagon();
			setup(input);
			if (solve_hexagon(start[0], start[1], 1, 0)) {
				System.out.print("Té Solució\n");
				printBoard();			
			}
			else System.out.print("No té solució");			
		}

		
		else if (inici == 13) {
			//S'HA DE COMENTAR QUIN TIPUS D'ADJACÈNCIA VOL
			System.out.print("Escull el tipus d'adjacència:\n");
			System.out.print("Costats : 1\n");
			System.out.print("Costats i angles : 2\n");
			Scanner n2 = new Scanner(System.in);
			int val = n2.nextInt();
			input = llegir_triangle();
			
			//System.out.println("\nFound:");
			if(val == 1) {
				setup_triangle(input);
				if (solve_triangle(start[0], start[1], 1, 0)) {
					System.out.print("Té Solució\n");
					printBoard_triangle();			
				}
				else System.out.print("No té solució");
			}
			else if(val == 2) {
				setup_triangle_ca(input);
				if (solve_triangle_ca(start[0], start[1], 1, 0)) {
					System.out.print("Té Solució\n");
					printBoard_triangle();			
				}
				else System.out.print("No té solució");
			}
			else System.out.print("Opció marcada incorrecte");
		}

		
		// ---------------------------------------------------------------------
		// VALIDACIÓ DE HIDATOS!!!!!!!!!!!
		
		else if (inici == 21) {
			System.out.print("Escull el tipus d'adjacència:\n");
			System.out.print("Costats : 1\n");
			System.out.print("Costats i angles : 2\n");
			Scanner n2_v2 = new Scanner(System.in);
			int val = n2_v2.nextInt();
			input = llegir_quadrat();
			setup(input);
			if(val == 1) {
				if (solve_quadrat(start[0], start[1], 1, 0)) {
					System.out.print("Té Solució\n");
					printBoard();			
				}
				else System.out.print("No té solució");
			}
			else if(val == 2) {
				if (solve_quadrat_ca(start[0], start[1], 1, 0)) {
					System.out.print("Té Solució\n");			
				}
				else System.out.print("No té solució");
			}
			else System.out.print("Opció marcada incorrecte");
		}
		
		else if (inici == 22) {
			input = llegir_hexagon();
			setup(input);
			System.out.println("\nFound:");
			if (solve_hexagon(start[0], start[1], 1, 0)) {
				System.out.print("Té Solució\n");			
			}
			else System.out.print("No té solució");
		}
		else if (inici == 23) {
			//S'HA DE COMENTAR QUIN TIPUS D'ADJACÈNCIA VOL
			System.out.print("Escull el tipus d'adjacència:\n");
			System.out.print("Costats : 1\n");
			System.out.print("Costats i angles : 2\n");
			Scanner n2 = new Scanner(System.in);
			int val = n2.nextInt();
			input = llegir_triangle();
			if(val == 1) {
				setup_triangle(input);
				if (solve_triangle(start[0], start[1], 1, 0)) {
					System.out.print("Té Solució\n");
					printBoard_triangle();			
				}
				else System.out.print("No té solució");
			}
			else if(val == 2) {
				setup_triangle_ca(input);
				if (solve_triangle_ca(start[0], start[1], 1, 0)) {
					System.out.print("Té Solució\n");			
				}
				else System.out.print("No té solució");
			}
			else System.out.print("Opció marcada incorrecte");
		}
		else return;
	}

	public static int introduccio() {
		System.out.print("Escull una opció:\n");
		System.out.print("Resolució : 1\n");
		System.out.print("Validació : 2\n");
		System.out.print("Generació : 3\n");
		
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		if (num == 1) {
			System.out.print("Escull tipus de caselles:\n");
			System.out.print("Quadrades : 1\n");
			System.out.print("Hexagonals : 2\n");
			System.out.print("Triangles : 3\n");
			
			num = n.nextInt();
			if (num == 1) return 11;
			else if (num == 2) return 12;
			else if (num == 3) return 13;
			
			else System.out.print("La opció que has escollit és erronea");			
		}
		
		else if (num == 2) {
			System.out.print("Escull tipus de caselles:\n");
			System.out.print("Quadrades : 1\n");
			System.out.print("Hexagonals : 2\n");
			System.out.print("Triangles : 3\n");
			num = n.nextInt();			
			if (num == 1) return 21;
			else if (num == 2) return 22;
			else if (num == 3) System.out.print("Funcionalitat ni implementada");	
			else System.out.print("La opció que has escollit és erronea");
		}
		
		else if (num == 3) {

			System.out.print("Escull tipus de caselles:\n");
			System.out.print("Quadrades : 1\n");
			System.out.print("Hexagonals : 2\n");
			System.out.print("Triangles : 3\n");
			num = n.nextInt();			
			if (num == 1) System.out.print("Funcionalitat ni implementada");
			else if (num == 2) System.out.print("Funcionalitat ni implementada");
			else if (num == 3) System.out.print("Funcionalitat ni implementada");
			else System.out.print("La opció que has escollit és erronea");
		}
		else System.out.print("La opció que has escollit és erronea");
		return 0;	
	}
 

	
// ------------ QUADRAT !!!!!!!!!!!!!!!! -----------------------------------//
	
	 public static String [] llegir_quadrat() {
			Scanner s = new Scanner(System.in);
			int alt,amp;
			System.out.println("Alçada del hidato: ");
			alt = s.nextInt();
			System.out.println("Amplada del hidato: ");
			amp = s.nextInt();
			String [] hidato = new String[alt];
			for(int i = 0; i < alt; ++i) {
				String str = s.next();
				hidato[i] = str;
			}
		 return hidato;
	 }
	    
	
	 private static void setup(String[] input) {
	
		 // TREU LES COMES DE LA MATRIU PUZZLE
	        String[][] puzzle = new String[input.length][];
	        for (int i = 0; i < input.length; i++)
	        	puzzle[i] = input[i].split(",");
	        int nCols = puzzle[0].length;
	        int nRows = puzzle.length;
	 
	        List<Integer> list = new ArrayList<>(nRows * nCols);
	 
	        // OMPLIR MATRIU BOARD TOT A -1
	        
	        board = new int[nRows + 2][nCols + 2];
	        for (int[] row : board)
	            for (int c = 0; c < nCols + 2; c++)
	                row[c] = -1;
	        
	        
	        for (int r = 0; r < nRows; r++) {
	            String[] row = puzzle[r];
	            for (int c = 0; c < nCols; c++) {
	                String cell = row[c];
	                switch (cell) {
	                    case "?":
	                        board[r + 1][c + 1] = 0;
	                        break;
	                    case "#":
	                        break;
	                    case "*":
	                    		board[r+1][c+1] = -2;
	                        break;
	                    default:
	                        int val = Integer.parseInt(cell);
	                        board[r + 1][c + 1] = val;
	                        list.add(val);
	                        if (val == 1)
	                            start = new int[]{r + 1, c + 1};
	                }
	            }
	        }
	        
	           
	        Collections.sort(list);
	        given = new int[list.size()];
	        for (int i = 0; i < given.length; i++)
	            given[i] = list.get(i);	               
	 	}
	
	 
	   private static boolean solve_quadrat(int r, int c, int n, int next) {
	        if (n > given[given.length - 1])
	            return true;
	 
	        if (board[r][c] != 0 && board[r][c] != n)
	            return false;
	 
	        if (board[r][c] == 0 && given[next] == n)
	            return false;
	 
	        int back = board[r][c];
	        if (back == n)
	            next++;
	 
	        board[r][c] = n;
	        for (int i = -1; i < 2; i++)
	            for (int j = -1; j < 2; j++) {
	            	
	            		// CAL TENIR EN COMPTE QUE NOMÉS POT MIRAR ELS SEUS VEINS ADJACENTS PER COSTAT
	            		// ÉS A DIR, ABAIX, AMUNT, ESQUERRA I DRETA
	            		if((i== -1 && j == 0) || (i == 0 && j == -1) 
	            				|| (i == 0 && j == 1) || (i == 1 && j == 0))
	                				if (solve_quadrat(r + i, c + j, n + 1, next))
	                					return true;
	            }
	        board[r][c] = back;
	        return false;
	    }
	   
	   
	   // EN CAS QUE LA ADJACÈNCIA SIGUI PER COSTATS I ANGLES, HAUREM DE DISTINGIR ENTRE ALGORITMES
	   // NOTA: NO FARIA FALTA, NOMÉS POSANT UNA CONDICIÓ EN EL FOR JA ESTARIA, COMENTAR-HO AMB EL GRUP
	   private static boolean solve_quadrat_ca(int r, int c, int n, int next) {
	        if (n > given[given.length - 1])
	            return true;
	 
	        if (board[r][c] != 0 && board[r][c] != n)
	            return false;
	 
	        if (board[r][c] == 0 && given[next] == n)
	            return false;
	 
	        int back = board[r][c];
	        if (back == n)
	            next++;
	 
	        board[r][c] = n;
	        for (int i = -1; i < 2; i++)
	            for (int j = -1; j < 2; j++)
	                if (solve_quadrat_ca(r + i, c + j, n + 1, next))
	                    return true;
	 
	        board[r][c] = back;
	        return false;
	    }
	 
	    
	   // Imprimir board per quadrat i hexagon
	   
	   private static void printBoard() {
		   for(int i = 1; i < board.length-1; ++i) {
			   for(int j = 1; j < board[0].length-1; ++j) {
				   if (board[i][j] == -1) {
					   System.out.print(" # ");
				   }
				   else if (board[i][j] == -2) {
					   System.out.print(" * ");
				   }
				   else System.out.print(" " + board[i][j] + " ");
			   }
			   System.out.println();
		   }
	   }
	   

	
// --------------------------------------------------------------------------//
	
	
	
	
// ------------ HEXAGON !!!!!!!!!!!!!!!! -----------------------------------//
	
	
	public static String [] llegir_hexagon() {
		Scanner s = new Scanner(System.in);
		int alt,amp;
		System.out.println("Alçada del hidato: ");
		alt = s.nextInt();
		System.out.println("Amplada del hidato: ");
		amp = s.nextInt();
		String [] hidato = new String[alt];
		iep = 0;
		for(int i = 0; i < alt; ++i) {
			String str = s.next();			
			hidato[i] = conver(str,i,iep);
		}
		/*for (int i = 0; i < hidato.length; ++i) {
			System.out.print(hidato[i] + "\n");
			
		}*/
	 return hidato;
	}
	

	public static String conver(String s,int k,int iep) {
		char [] ant = s.toCharArray();
		char [] post = new char[(ant.length/2) + 1];
		int index = 0;
		for (int i = 0; i < ant.length; ++i) {
			if (i%2 == 0) {
				post[index] = ant[i];
				++index;
			}
		}
		int j = 0;
		char [] fi = new char[post.length*3+(post.length-1)];
		for (int i = 0; i < post.length; ++i) {
			if ((k%2) == 0) {
				if (i < post.length - 1) {
					fi[iep] = post[i];
					fi[iep+1] = ',';
					fi[iep+2] = '#';
					fi[iep+3] = ',';
					iep += 4;
				}
				else  {
					fi[iep] = post[i];	
					fi[iep+1] = ',';
					fi[iep+2] = '#';	
				}
			}
			else {
				if (i < post.length - 1) {
					fi[iep] = '#';
					fi[iep+1] = ',';					
					fi[iep+2] = post[i];
					fi[iep+3] = ',';
					iep += 4;
				}
				else  {	
					fi[iep] = '#';
					fi[iep+1] = ',';				
					fi[iep+2] = post[i];
				}
			}
		
		}	
		String retu = String.valueOf(fi);
		return retu;
	}

	
	private static boolean solve_hexagon(int r, int c, int n, int next) {
	    if (n > given[given.length - 1])
	        return true;

	    if (board[r][c] != 0 && board[r][c] != n)
	        return false;

	    if (board[r][c] == 0 && given[next] == n)
	        return false;

	    int back = board[r][c];
	    if (back == n)
	        next++;

	    board[r][c] = n;
	    for (int i = -1; i < 2; i++)
	        for (int j = -1; j < 2; j++)
	        		if ((i == 0) || (i == 1 && j == 1) || (i == 1 && j == -1) || (i == -1 && j == 1) || (i == -1 && j == -1)) {
	        			if (solve_hexagon(r + i, c + j, n + 1, next))
	        				return true;
	        		}

	    board[r][c] = back;
	    return false;
	}
	
// ---------------------------------------------------------------------------------------------
	

	
// ----------------------- TRIANGLE !!!!!!!!!!!!!!!! ------------------------------------------	
	
	
	
	public static String [] llegir_triangle() {
		Scanner s = new Scanner(System.in);
		int alt,amp;
		System.out.println("Alçada del hidato: ");
		alt = s.nextInt();
		System.out.println("Amplada del hidato: ");
		amp = s.nextInt();
		String [] hidato = new String[alt];
		for(int i = 0; i < alt; ++i) {
			String str = s.next();
			hidato[i] = str;
		}
		return hidato;
	}
	
	
	//HEM HAGUT DE FER UNA NOVA FUNCIÓ SETUP, PER A QUE POSÉS UN MARC DE 1 PARET PER QUE NO ES SURTIS DE RANG
	private static void setup_triangle(String[] input) {
		
		 // TREU LES COMES DE LA MATRIU PUZZLE
	        String[][] puzzle = new String[input.length][];
	        for (int i = 0; i < input.length; i++)
	        		puzzle[i] = input[i].split(",");
	        int nCols = puzzle[0].length;
	        int nRows = puzzle.length;
	 
	        List<Integer> list = new ArrayList<>(nRows * nCols);
	 
	        // OMPLIR MATRIU BOARD TOT A -1
	        
	        board = new int[nRows + 2][nCols + 2];
	        for (int[] row : board)
	            for (int c = 0; c < nCols + 2; c++)
	                row[c] = -1;
	        
	        
	        for (int r = 0; r < nRows; r++) {
	            String[] row = puzzle[r];
	            for (int c = 0; c < nCols; c++) {
	                String cell = row[c];
	                switch (cell) {
	                    case "?":
	                        board[r + 1][c + 1] = 0;
	                        break;
	                    case "#":
	                        break;
	                    case "*":
	                    	    board[r + 1][c + 1] = -2;
	                        break;
	                    default:
	                        int val = Integer.parseInt(cell);
	                        board[r + 1][c + 1] = val;
	                        list.add(val);
	                        if (val == 1)
	                            start = new int[]{r + 1, c + 1};
	                }
	            }
	        }
	        
	        Collections.sort(list);
	        given = new int[list.size()];
	        for (int i = 0; i < given.length; i++)
	            given[i] = list.get(i);	                 
	}
	
	
	//HEM HAGUT DE FER UNA NOVA FUNCIÓ SETUP, PER A QUE POSÉS UN MARC DE 2 PARETS!! PER QUE NO ES SURTIS DE RANG
	private static void setup_triangle_ca(String[] input) {
		
		 // TREU LES COMES DE LA MATRIU PUZZLE
	        String[][] puzzle = new String[input.length][];
	        for (int i = 0; i < input.length; i++)
	        		puzzle[i] = input[i].split(",");
	        int nCols = puzzle[0].length;
	        int nRows = puzzle.length;
	 
	        List<Integer> list = new ArrayList<>(nRows * nCols);
	 
	        // OMPLIR MATRIU BOARD TOT A -1
	        
	        board = new int[nRows + 4][nCols + 4];
	        for (int[] row : board)
	            for (int c = 0; c < nCols + 4; c++)
	                row[c] = -1;
	        
	        for (int r = 0; r < nRows; r++) {
	            String[] row = puzzle[r];
	            for (int c = 0; c < nCols; c++) {
	                String cell = row[c];
	                switch (cell) {
	                    case "?":
	                        board[r + 2][c + 2] = 0;
	                        break;
	                    case "#":
	                        break;
	                    case "*":
	                    	    board[r + 2][c + 2] = -2;
	                        break;
	                    default:
	                        int val = Integer.parseInt(cell);
	                        board[r + 2][c + 2] = val;
	                        list.add(val);
	                        if (val == 1)
	                            start = new int[]{r + 1, c + 1};
	                }
	            }
	        }
	        Collections.sort(list);
	        given = new int[list.size()];
	        for (int i = 0; i < given.length; i++)
	            given[i] = list.get(i);	        
	        
	        /*for (int i = 0; i < given.length; ++i) {
	        		System.out.print(given[i]);
	        } */  
	}
	
	
	//MIRAREM TOTES LES POSSIBLES ADJACÈNCIES PER COSTATS I ANGLES, PER AXÒ EL IF TAN LLARG
	private static boolean solve_triangle_ca(int r, int c, int n, int next) {
	    if (n > given[given.length - 1])
	        return true;
	  
	    if (board[r+1][c+1] != 0 && board[r+1][c+1] != n) {
	    		return false;
	    }

	    if (board[r][c] == 0 && given[next] == n) {
	    		return false;
	    }
	        

	    int back = board[r+1][c+1];
	    if (back == n)
	        next++;

	    board[r+1][c+1] = n;
	    for (int i = -1; i < 2; i++)
	        for (int j = -2; j < 3; j++) {
	        		
	        		// SI LA FILA ÉS PARELL
	        	
	        		if(i%2 == 0) {
	        			
	        				//SI LA COLUMNA ÉS PARELL
	        			
	        				if(j%2 == 0) {
	        					if ((i == 1 && j == 0) ||(i == 0 && j == 1) || (i == 0 && j == -1) ||  
	        							(i == -1 && j == -1) || (i == -1 && j == 0) || (i == -1 && j == 1)
	        							|| (i == 1 && j == -2) || (i == 1 && j == -1) || (i ==1 && j == 1)
	        							|| (i == 1 && j == 2) || (i == 0 && j == -2) || (i == 0 && j == 2)){
	        							if (solve_triangle_ca(r + i, c + j, n + 1, next))
	        								return true;
	        					}
	        				}
	        		
	        				else {
	        					// SI LA SOLUMNA ÉS SENAR
	        					if ((i == -1 && j == 0) || (i == 0 && j == 1) || (i == 0 && j == -1) || (i == 1 && j == 0)
	        							|| (i == -1 && j == -2) || (i == 0 && j == -2)|| (i == -1 && j == -1) 
	        							|| (i == -1 && j == 1) || (i == -1 && j == 2)|| (i == 0 && j == 2) 
	        							|| (i == 1 && j == -1)  || (i == 1 && j == 1)){
	    									if (solve_triangle_ca(r + i, c + j, n + 1, next))
	    										return true;
	        					}
	        				}
	        		}
	        		
	        		// SI LA FILA ÉS SENAR
	        		else {
	        			
	        			//SI LA COLUMNA ÉS PARELL
	        			if(j%2 == 0) {
	        				if ((i == -1 && j == 0) || (i == 0 && j == 1) || (i == 0 && j == -1) || (i == 1 && j == 0) 
        							|| (i == -1 && j == -2) || (i == 0 && j == -2)|| (i == -1 && j == -1) 
        							|| (i == -1 && j == 1) || (i == -1 && j == 2)|| (i == 0 && j == 2) 
        							|| (i == 1 && j == -1) || (i == 1 && j == 1)){
    									if (solve_triangle_ca(r + i, c + j, n + 1, next))
    										return true;
        					}
	        			
	        			}
	        			else {
	        				if ((i == 1 && j == 0) ||(i == 0 && j == 1) || (i == 0 && j == -1) ||  
        							(i == -1 && j == -1) || (i == -1 && j == 0) || (i == -1 && j == 1)
        							|| (i == 1 && j == -2) || (i == 1 && j == -1) || (i ==1 && j == 1)
        							|| (i == 1 && j == 2) || (i == 0 && j == -2) || (i == 0 && j == 2)){
        							if (solve_triangle_ca(r + i, c + j, n + 1, next))
        								return true;
        					}
	        			}
	        		}
	        }
	    
	    board[r+1][c+1] = back;
	    return false;
	}
	
	
	//NOMÉS MIRAREM ADJACÈNCIES PER COSTATS
	private static boolean solve_triangle(int r, int c, int n, int next) {
	    if (n > given[given.length - 1])
	        return true;

	    if (board[r][c] != 0 && board[r][c] != n)
	        return false;

	    if (board[r][c] == 0 && given[next] == n)
	        return false;

	    int back = board[r][c];
	    if (back == n)
	        next++;

	    board[r][c] = n;
	    for (int i = -1; i < 2; i++)
	        for (int j = -1; j < 2; j++) {
	        		
	        	// IF si es PARELL
	        	
	        		if ((i == 0 && j == 1) || (i == 0 && j == -1) || (i == 1 && j == 0)){
	        			if (solve_triangle(r + i, c + j, n + 1, next))
	        				return true;
	        		}
	    
	    		// IF si es SENAR
	    	
	    			if ((i == 0 && j == 1) || (i == 0 && j == -1) || (i == -1 && j == 0)){
	    				if (solve_triangle(r + i, c + j, n + 1, next))
	    						return true;
	    			}
	        }

	    board[r][c] = back;
	    return false;
	}
	

	private static void printBoard_triangle() {
		   for(int i = 2; i < board.length-2; ++i) {
			   for(int j = 2; j < board[0].length-2; ++j) {
				   if (board[i][j] == -1) {
					   System.out.print(" # ");
				   }
				   else if (board[i][j] == -2) {
					   System.out.print(" * ");
				   }
				   else System.out.print(" " + board[i][j] + " ");
			   }
			   System.out.println();
		   }
	}
}
