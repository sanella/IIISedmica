/**
 * matrica 2 *2 i debuging
 * @author sanelagrcic
 *
 */
public class Dan5Predavanja1 {
public static void main(String[] args) {
	int [][]matrix= new int [][] {{5, 6} , {1, 9}};
		printMatrix(matrix);
	
}
	public static void printMatrix (int[][] matrix) {
		for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
			printRow(matrix[rowIndex]);
		}
	}
	private static void printRow(int[] row) {
		for (int columIndex = 0; columIndex < row.length; columIndex++) {
		System.out.printf("%d ",row[columIndex] );
		
		}
		System.out.println();
		
	}
	}

