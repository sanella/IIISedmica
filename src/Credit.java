
public class Credit {
	public static void main(String[] args) {
		int glavnica = 100 ;
		double kamata = (double) (Math.random()*16 ) ;
		double kredit = glavnica * kamata / 100 + glavnica;
		System.out.println(kamata);
				System.out.println(kredit);
				
	}

}
