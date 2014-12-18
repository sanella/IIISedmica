public class Lab1 {
	public static void main(String[] args) {
		int[] niz = new int[5];  // napravi niz od 5 brojeva

		for (int i = 0; i < niz.length; i++) { 
			System.out.println("unesi " + (i + 1) + "-ti broj");
			niz[i] = TextIO.getlnInt();
		}
		for (int i = 0; i < niz.length; i++) {
			System.out.print( ";" + (i+1) + " caln niza je " + niz[i]);
		
		
		}
		
	}
}
