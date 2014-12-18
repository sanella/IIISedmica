/**
 * DEVETI ZADATAK STRING I INT
 * 
 * @author sanelagrcic
 *
 */
public class Predavanja2 {
	public static void main(String[] args) {
		String str = " neka recenica koju provjeravam, ali ovaj zarez da zeza.";
		int redniBrojRijesikojurayimo = 4;
		System.out.println("To je rijec: "
				+ izvadiRijec(str, redniBrojRijesikojurayimo));
	}

	private static String izvadiRijec(String recenica,
			int redniBrojRijesikojurayimo) {

		String trazenaRijec = "";
		int trenutnaRijec = 0;
		int trenutniIndex = 0;
		while (trenutnaRijec < redniBrojRijesikojurayimo) {
			if (recenica.charAt(trenutniIndex) != ' ') {
				if (trenutniIndex == 0) {
					trenutnaRijec++;
				} else {
					if (recenica.charAt(trenutniIndex - 1) == ' ') {
						trenutnaRijec++;
					}
				}
			}
			}
			trenutniIndex--;
			while (recenica.charAt(trenutniIndex) != ' ') {
				trazenaRijec += recenica.charAt(trenutniIndex);
				trenutniIndex++;
			
		}
		return trazenaRijec;
	}
}
