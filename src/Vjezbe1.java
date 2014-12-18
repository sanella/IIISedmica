/**
 * FUNKCIJA korisnik unosi dva broja int i dva broja double, treba uraditi sumu,
 * proiyvod i dijeljenje i sabiranje
 * 
 * @author sanelagrcic
 *
 */
public class Vjezbe1 {
	public static double sum(double num1, double num2) {

		double sum = num1 + num2;
		return sum;
	}

	public static int sum(int num1, int num2) {

		int sum = num1 + num2;
		return sum;
	}

	public static double razlika(double num1, double num2) {

		double razlika = num1 - num2;
		return razlika;
	}

	public static int razlika(int num1, int num2) {

		int razlika = num1 - num2;
		return razlika;
	}

	public static double proizvod(double num1, double num2) {

		double proizvod = num1 * num2;
		return proizvod;
	}

	public static int proizvod(int num1, int num2) {

		int proizvod = num1 * num2;
		return proizvod;
	}

	public static double kolicnik(double num1, double num2) {

		double kolicnik = num1 / num2;
		return kolicnik;
	}

	public static int kolicnik(int num1, int num2) {

		int kolicnik = num1 / num2;
		return kolicnik;
	}

	public static void main(String[] args) {

		int num1 = TextIO.getlnInt();
		int num2 = TextIO.getlnInt();
		double num3 = TextIO.getlnDouble();
		double num4 = TextIO.getlnDouble();

		double sum = sum(num3, num4);
		System.out.println("sum double: " + sum);

		int sum1 = sum(num1, num2);
		System.out.println("sum int: " + sum1);

		double razlika = razlika(num3, num4);
		System.out.println("razlika double: " + sum);

		int razlika1 = razlika(num1, num2);
		System.out.println("razlika int: " + razlika1);

		double proizvod = proizvod(num3, num4);
		System.out.println("proizvod double: " + proizvod);

		int proizvod1 = proizvod(num1, num2);
		System.out.println("proizvod int: " + proizvod1);

		double kolicnik = kolicnik(num3, num4);
		System.out.println("kolicnik double " + kolicnik);

		int kolicnik1 = kolicnik(num1, num2);
		System.out.println("kolicnik int: " + kolicnik1);

	}

}
