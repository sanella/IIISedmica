public class Lab4 {

	public static int[] unosNiza(int velicina) {

		int[] nizUnos = new int[velicina]; // korisnik unosi brojeve koji se
											// nalaze u nizu
		for (int i = 0; i < nizUnos.length; i++) {
			System.out.println("unesi broj");
			nizUnos[i] = TextIO.getlnInt();
		}
		return nizUnos;

	}

	public static void ispis(int[] nizK) { //void je jer mi ne daje nikakav izlaz
		
		for (int i = 0; i < nizK.length; i++) { // za ispis brojeva niza
			System.out.print(nizK[i] + " ");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("koliko brojeva  ");
		int velicina = TextIO.getlnInt(); // definisali smo velicinu niza
		int[] niz = unosNiza(velicina);

		// ili int[] niz = new int[5];
		// niz = unosNiza()
		
		int sum = 0;   // napravi sumu u main f-iji 
		for (int i = 0; i<niz.length; i++) {
		 sum = sum + niz[i];
		}
		System.out.println("suma je jednaka " + sum);
		
		ispis(niz);

	}
}
