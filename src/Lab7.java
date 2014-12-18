
public class Lab7 {

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

	public static int max(int[] niz) { // F-JA maximalnii broj nadji i
		int max = niz[0];
		for(int i = 0; i < niz.length; i++){
			if (max < niz[i]) {
			max = niz[i];
			}
}
				return max; //izlaz mi je minimalni broj
	}
	public static void main(String[] args) {
		System.out.println("koliko brojeva  ");
		int velicina = TextIO.getlnInt(); // definisali smo velicinu niza
		int[] niz = unosNiza(velicina);

		// ili int[] niz = new int[5];
		// niz = unosNiza()
		System.out.println("maximalnii broj  je  " + max(niz));

		ispis(niz);

	}

}
