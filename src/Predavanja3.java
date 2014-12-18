/**
 * 
 * @author sanelagrcic
 *Nadji broj koji je najveci od tri broja preko F-ja.
 *
 *
 */
public class Predavanja3 {
	public static void main(String[] args) {
		System.out.println(getMax(1, 2, 4));
	}

	public static int getMax(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		}
		return c;
	}
}
