/**
 * 
 * @author sanelagrcic
 *NIZOVI U FOR PETLJAMA
 *
 */
public class predavanjaNizovi {
	public static void main(String[] args) {
		int[] arr3 = new int[]{1, 2, 4};
		int[] arr = new int[]{5, 8, 50, 46}; //MOGU DVA PUTA POYVATI F-JU YA DVA RAZLICITA NIZA
		System.out.println(getMax (arr));
	}

	public static int getMax(int[] brojevi) { //F-JA 2. DA SE PRONADJE NAJVECI BROJ, KADA SE NADJE SA RETURN GA SALJEMO U 1. F-JU 
		int max  = brojevi[0];
		for (int idx=1; idx<brojevi.length; idx++){
	int trenutni = brojevi[idx];
		if (trenutni > max) {
			max = trenutni;
		}
		}
		
		return max;
	}

	
	public static String nizUString (int [] niz) {
		if (niz.length == 0) {
			return  "";
		} else {
		String strNiz = String.valueOf(niz[0]);
		for (int idx=1; idx < niz.lenght; idx++) {
			strNiz = strNiz + niz[idx] +  ", "  ;
		}
		return strNiz;
	}
