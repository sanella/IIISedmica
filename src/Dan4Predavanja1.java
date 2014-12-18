import java.util.Scanner;

/**
 * IGRICA X/O
 * 
 * @author sanelagrcic
 *
 */
public class Dan4Predavanja1 {
	public static void main(String[] args) {
	igrajIgricuIksOks('X', 'O', ' ');
	}
	public static void igrajIgricuIksOks(char prviIgrac, char drugiIgrac, char nijedanIgrac) {
		int aktivniIgrac = 0; // 0 - igrac X, 1 - igrac O
	String izabranoPolje = null;
	char [][] poljanaZaIgru = new char[3][3];
	boolean krajIgre = false;
	for (int i = 0; i<3; i++) {
	for (int j = 0; j<3; j++) {
		poljanaZaIgru[i][j] = nijedanIgrac;
	}
	}
	
		do {
		do {
			izabranoPolje =	unesiPolje(aktivniIgrac);
		} while (izabranoPoljeJeIspravno(izabranoPolje, poljanaZaIgru, nijedanIgrac));
	postaviPolje((aktivniIgrac == 0 ? prviIgrac : drugiIgrac), izabranoPolje, poljanaZaIgru);
		krajIgre = krajIgre(poljanaZaIgru, nijedanIgrac);
		if (!krajIgre) {
			aktivniIgrac = promijeniAkivnogIgraca(aktivniIgrac);
		}
 	} while (!krajIgre);
		if(nemaPobjednika(poljanaZaIgru)) {
			ispisiRemi();
			
		}else {
			ispisiPobjednika(aktivniIgrac);
		}
	}
	


	private static String unesiPolje(int aktivniIgrac) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesi polje koje zelis da odigras:\n+---+---+---+\n| 7 | 8 | 9 |\n| 4 | 5 | 6 |\n| 1 | 2 | 3 |\n+---+---+---+");
		return in.nextLine();
		
	}

	private static void ispisiPobjednika(int aktivniIgrac) {
	
		
	}

	private static void ispisiRemi() {
		// TODO Auto-generated method stub
		
	}

	private static boolean nemaPobjednika(char[][] poljanaZaIgru) {
		// TODO Auto-generated method stub
		return false;
	}

	private static int promijeniAkivnogIgraca(int aktivniIgrac) { // za promjenu igraca
		if(aktivniIgrac == 0)
		return 1; //mogi a i ne moram da korsitim viticaste yagrade i else zato sto je ovo jednostavan if
	return 0;
	}

	private static boolean krajIgre(char[][] poljanaZaIgru) {
		int popunjenihPolja = 0;
		for (int i = 0; i < 3; i++) {
		for(int j = 0; j <3; j++) {
			if (poljanaZaIgru[i][j] != nijedanIgrac) {
				popunjenihPolja++;
			}
		}
		}
		if (popunjenihPolja == 9) {
		return true;
	}
		for (int i = 0; i <3; i++) {
			boolean kraj = false;
			kraj = (poljanaZaIgru[i][0] != nijedanIgrac) && (poljanaZaIgru[i][0] == poljanaZaIgru[i][1]) && poljanaZaIgru[i][0] == poljanaZaIgru[i][2]);
	if (kraj == true) {
		return true;
	}
	kraj = (poljanaZaIgru[0][i] != nijedanIgrac) && (poljanaZaIgru[0][i] == poljanaZaIgru[1][i]) && poljanaZaIgru[0][i] == poljanaZaIgru[2][i]);
	if (kraj == true) {
		return true;
		}
		}
		boolean kraj = false;
		
		
		return false;
	}
	private static void postaviPolje(int aktivniIgrac, String izabranoPolje, char[][] poljanaZaIgru) {
		int polje = Integer.parseInt(izabranoPolje);
		poljanaZaIgru[(polje - 1) / 3][(polje - 1) % 3] = igrac;
		
	}

	private static boolean izabranoPoljeJeIspravno(String izabranoPolje, char[][] poljanaZaIgru, char nijedanIgrac) {
		/*
		 * 7 8 9
		 * 4 5 6
		 * 1 2 3
		 */
		try {
			int polje = Integer.parseInt(izabranoPolje);
			if ((polje < 10) && (polje > 0)) {
				//(2-br1)*3 + br2 + 1
				if (poljanaZaIgru[(polje - 1) / 3][(polje - 1) %3]){
				return true;
				}
			}
		} catch (Exception e) { 
		}
		return false;
	}
}
