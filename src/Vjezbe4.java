
public class Vjezbe4 {
	
	public static int num1(int num1) {
		int br = TextIO.getlnInt();
		return br;
	}
	
	public static double myDouble(double myDouble) {
		double dob = TextIO.getDouble();
		return dob;
	}
	public static String myString (String myString) {
		String sttr = TextIO.getln();
		return sttr;
	}
	
	
public static void main(String[] args) {
	
	
	int num1 = getInputInt("Unesi integer");
	double myDouble = getInputDouble("Unesi double");
	double myString = getInputString("Unesi string");
	
	System.out.println("Integer je" + num1);
	System.out.println("Integer je" + myDouble);
	System.out.println("Integer je" + myString);
}





private static double getInputDouble(String string) {
	// TODO Auto-generated method stub
	return 0;
}

private static double getInputString(String string) {
	// TODO Auto-generated method stub
	return 0;
}

private static int getInputInt(String string) {
	// TODO Auto-generated method stub
	return 0;
}
}
