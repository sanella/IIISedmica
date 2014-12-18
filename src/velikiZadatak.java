public class velikiZadatak {

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

		for (int i = 0; i < matrica.length; i++) {
			int suma = sumaReda(matrica[i]); // ispis sume ya svaki drug red
			System.out.println("suma reda je" + suma); // ISPIS SUME REDA SVAKOG
														// BROJA
		}

		for (int i = 0; i < matrica[0].length; i++) {// ISPIS SUME KOLONE
			int suma = sumaKolone(matrica, i); // i
			System.out.println("suma kolone je" + suma);
		}

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

	}

	// for (int i = 0; i< matrica.length; i++) { //ZA ISPIS SUME dijagonale
	// int suma = sumaDijagonale(matrica, i );
	// System.out.println("suma dijagonale je : " + suma);
	// }
	// }
	public static int sumaReda(int[] niz) { // SUMA REDA
		int sum = 0;
		for (int i = 0; i < niz.length; i++) {
			sum = sum + niz[i];

		}
		return sum;

	}

	public static int sumaKolone(int[][] matrica, int indexKolone) { // SUMA
																		// KOLONE
		int sum1 = 0;
		for (int i = 0; i < matrica.length; i++) {
			sum1 = sum1 + matrica[i][indexKolone];

		}
		return sum1;

	}

	public static int sumaDijagonale(int[][] matrica, int[][] niz) { // SUMA
																		// DIJAGONALE
		int sum = 0;
		int i = 0;
		int j = 0;
		for (i = 0; i < matrica.length; i++) {
			sum += matrica[i][j];

		}
		return sum;
	}

	public static int sumaDijagonaleObrnuta(int[][] matrica, int[][] niz) { // SUMA
																			// DIJAGONALE
																			// obrnute
		int sum = 0;
		int i = 0;
		int j = matrica.length - 1;
		for (i = 0; i < matrica.length; i++) {
			sum += matrica[i][j - i];

		}
		return sum;
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

	public static boolean sviIstiKontraDijagonala(int[][] matrica) { // ZA PROVJERU DA LI SU ISTI ELEMENTI U DIJAGONALI OBRNUTOJ
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
		do { // prvojeri da li su nove koordinate validen
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

	public static void ispisi1DNiza(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i] + " ");
		}
	}
}
