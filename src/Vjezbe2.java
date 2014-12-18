/**
 * unesi dva broja int pocetak i kraj, saber sve proste brojeve tog intervala
 * @author sanelagrcic
 *
 */
public class Vjezbe2 {
	public static int sumPrime(int i, int num2) {

		int sum = 0 + i;
		return sum;
	}
	  
	
		public static void main(String[] args) {

int i = TextIO.getlnInt();
int num2 = TextIO.getlnInt();
int brojac = 0;
			while (i <= num2) {
				int brojA = num2 %i;
				if (brojA == 0) {
					brojac++;
				}
				i++;
			}
			if (brojac > 0) {
				
				System.out.println("broj nije prost");}
				else {
					System.out.println("broj je prost");
			}
				return ;
	}
}

