
public class Lab6 {

	public static int[] unosNiza(int velicina) {

		int[] nizUnos = new int[velicina]; // korisnik unosi brojeve koji se
											// nalaze u nizu
		for (int i = 0; i < nizUnos.length; i++) {
			System.out.println("unesi broj");
			nizUnos[i] = TextIO.getlnInt();
		}
		return nizUnos;

	}

	public static void ispis(int[] nizK) { // void je jer mi ne daje nikakav
											// izlaz

		for (int i = 0; i < nizK.length; i++) { // za ispis brojeva niza
			System.out.print(nizK[i] + " ");
		}

	}

	public static int min(int[] niz) { // F-JA minimalni broj nadji i
		int min = niz[0];
				for(int i = 0; i < niz.length; i++){
					if (min > niz[i]) {
					min = niz[i];
					}
	}
				return min; //izlaz mi je minimalni broj
	}
	public static void main(String[] args) {
		System.out.println("koliko brojeva  ");
		int velicina = TextIO.getlnInt(); // definisali smo velicinu niza
		int[] niz = unosNiza(velicina);

		// ili int[] niz = new int[5];
		// niz = unosNiza()
		System.out.println("minimalni broj  je  " + min(niz));

		ispis(niz);

	}

}
