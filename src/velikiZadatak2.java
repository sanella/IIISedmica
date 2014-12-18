public class velikiZadatak2 {

	public static int[][] kreirajMatricu(int visina, int sirina) {
		int[][] matrica = new int[visina][sirina];
		return matrica;
	}

	// Ispisi matricu poslanu kao argument na standardni zlaz
	public static void ispisiMatricu(int[][] matrica) {

		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica.length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int visina, sirina;
		System.out.println("unisi visinu: ");
		visina = TextIO.getlnInt();
		System.out.println("unisi visinu: ");
		sirina = TextIO.getlnInt();

		int[][] matrica = kreirajMatricu(visina, sirina);
		ispisiMatricu(matrica);
		// ispisi1DNiza(matrica[0]); // za ispisivanje prvog reda matrice

		matrica = postaviVrijednost(matrica);
		ispisiMatricu(matrica); // da mi ponovo ispise matricu
		
		
		for (int i = 0; i < matrica[0].length; i++) {// ISPIS DA PROVJERI DA LI
														// SU SVI ELEMENTI REDA
														// JEDNAKI
			boolean isti = sviIsitiRed(matrica[i]); // i
			System.out.println("U redu " + i + ": " + isti);

		}

		for (int i = 0; i < matrica[0].length; i++) {// ISPIS DA PROVJERI DA LI
														// SU SVI ELEMENTI
														// KOLONE JEDNAKI
			boolean isti = sviIsitiKolona(i, matrica); // i
			System.out.println("U KOLONI " + i + ": " + isti);

		}
		
		boolean trebaPonavljati = true;
		do {
			matrica = postaviVrijednost(matrica);
			for (int i = 0; i < matrica.length; i++) {
				if (sviIsitiRed( matrica[i] )== true && matrica[i][0] != 0) {
					trebaPonavljati = false;
					
				}
			}
			for (int i = 0; i < matrica[0].length; i++) {
				if (sviIsitiKolona(i, matrica) == true && matrica[0][i] != 0) {
					trebaPonavljati = false;
						
				}
			}
				if ( sviIstiKontraDijagonala(matrica) == true && matrica[0][matrica.length-1] !=0){
					trebaPonavljati = false;
				}
				
			//if ( sviIstiDijagonala(matrica) == true && matrica[0][0] !=0){    // ovo je kad napravim prvojeru za dijagonalu
				//trebaPonavljati = false;
			//}
			
			
		} while ( imaNulu(matrica) == true && trebaPonavljati == true);
			
		ispisiMatricu(matrica);
		}


	

	public static boolean sviIsitiRed(int[] red) { // DA LI SU SVI ISTI U REDU
		for (int i = 1; i < red.length; i++) {
			if (red[i - 1] != red[i]) {
				return false;
			}
		}
		return true;
	}

	public static boolean sviIsitiKolona(int kolona, int matrica[][]) { // DA LI
																		// SU
																		// SVI
																		// ISTI
																		// U
																		// KOLONI
		for (int i = 1; i < matrica.length; i++) {
			if (matrica[i - 1][kolona] != matrica[i][kolona]) {
				return false;
			}
		}
		return true;
	}

	// sum1 = sum1 + matrica[i][indexKolone];

	public static boolean sviIstiKontraDijagonala(int[][] matrica) { // ZA
																		// PROVJERU
																		// DA LI
																		// SU
																		// ISTI
																		// ELEMENTI
																		// U
																		// DIJAGONALI
																		// OBRNUTOJ
		int j = matrica.length - 1;
		for (int i = 1; i < matrica.length; i++) {
			int k = j - i;
			if (matrica[i - 1][k + 1] != matrica[i][k]) {
				return false;
			}
		}
		return true;
	}

	public static int[][] postaviVrijednost(int[][] matrica) {

		int visina = 0;
		int sirina = 0;
		do { // prvojeri da li su nove koordinate validna
			System.out.println("unisi visinu: ");
			visina = TextIO.getlnInt();
			while (visina < 0 || visina >= matrica.length) {
				System.out
						.println("Kordinata nije valdina, unesi kooordinatu x ");
				visina = TextIO.getlnInt(); // ako nisu unesi ponovo
			}

			System.out.println("unesi koordinatu sirina ");
			sirina = TextIO.getlnInt();
			while (sirina < 0 || sirina >= matrica[visina].length) {
				System.out
						.println("Kordinata nije valdina, unesi kooordinatu y ");
				sirina = TextIO.getlnInt();
			}
		} while (matrica[visina][sirina] != 0);

		// pokupiti vrijednost od korisnika
		System.out.println("unesi novu vrijednost unesenih kooordinata ");
		int vrijednost = TextIO.getlnInt();
		matrica[visina][sirina] = vrijednost; // zamijeni vrijednost koordinate
												// sa vrijednoscu koju korisnik
												// unese

		return matrica;

	}
	

	public static boolean imaNulu(int[][] matrica) {
		for(int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++){
			if (matrica[i][j] == 0)
				return true;
		}
		}
	return false;
	
		}
	}

