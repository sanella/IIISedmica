import java.util.InputMismatchException;
import java.util.Scanner;


public class Dan5Predavanja2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int broj ;
		try {
			broj = s.nextInt();
			
		} catch (InputMismatchException e) {
			System.out.println("Broj " );
			return ;
			
		} finally {
			s.close();
		}
		
		System.out.println("unijeli ste broj: " + broj);
		
		
	}
	
}
