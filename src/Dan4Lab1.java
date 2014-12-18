/**
 * unesi velicinu niza, unesi brojeve niza, iyracunaj sumu, i njen prosjek koristexi f-je
 * @author sanelagrcic
 *
 */

public class Dan4Lab1 {
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

	public static int suma(int[] niz) { // F-JA SUMA
		int sum = 0;
		for (int i = 0; i < niz.length; i++) {
			sum = sum + niz[i];

		}
		return sum;
	}

	public static double prosjek(int[] niz) { // F-JA PROSJEK

		double prosjek = (double) suma(niz) / niz.length; // ovdje koristim
															// length jer ne
															// mogu pozvati f-ju
															// unosNiza jer je
															// ona void
		return prosjek;
	}

	public static void main(String[] args) {
		System.out.println("koliko brojeva  ");
		int velicina = TextIO.getlnInt(); // definisali smo velicinu niza
		int[] niz = unosNiza(velicina);

		// ili int[] niz = new int[5];
		// niz = unosNiza()
		System.out.println("suma je jednaka " + suma(niz) + "; prosjek je: "
				+ prosjek(niz));

		ispis(niz);

	}

}
