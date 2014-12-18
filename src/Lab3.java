/**
 * unesi broj u main f-iji koji ces poyvati u f-iji unosNiza da bi trazio od
 * klijenta da unese velicinu niza
 * 
 * @author sanelagrcic
 *
 */
public class Lab3 {
	public static int[] unosNiza(int velicina) {

		int[] nizUnos = new int[velicina]; // korisnik unosi brojeve koji se nalaze u nizu
		for (int i = 0; i < nizUnos.length; i++) {
			System.out.println("unesi broj");
			nizUnos[i] = TextIO.getlnInt();
		}
		return nizUnos;

	}

	public static void main(String[] args) {
		System.out.println("koliko brojeva  ");
		int velicina = TextIO.getlnInt(); // definisali smi velicinu niza
		int[] niz = unosNiza(velicina);

		// ili int[] niz = new int[5];
		// niz = unosNiza()

		
		for (int i = 0; i < niz.length; i++) {  //za ispis brojeva niza
			System.out.print(niz[i] + " ");

		}
	}
}