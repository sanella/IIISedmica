public class Lab2 {

	public static int[] unosNiza() {

		int[] nizUnos = new int[5];
		for (int i = 0; i < nizUnos.length; i++) {
			System.out.println("unesi broj");
			nizUnos[i] = TextIO.getlnInt();
		}
		return nizUnos;

	}

	public static void main(String[] args) {

		int[] niz = unosNiza();

		// iliint[] niz = new int[5];
		// niz = unosNiza()

		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");

		}
	}
}