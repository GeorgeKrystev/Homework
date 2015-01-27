import java.util.Scanner;


public class _8CountOfEqualBitsPair {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 int number = input.nextInt();
		 int counter = 0;
		 String numAsBinary = Integer.toBinaryString(number);
		 
		 for (int i = 0; i < numAsBinary.length() - 1; i++) {
			if (numAsBinary.charAt(i) == numAsBinary.charAt(i + 1)) {
				counter++;
			}
		}
		 System.out.println(counter);

	}

}
