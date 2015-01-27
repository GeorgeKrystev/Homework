import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 int startR = input.nextInt();
		 int startC = input.nextInt();
		  int row = input.nextInt();
		 int col = input.nextInt();
		 
		 for (int i = startR + 0; i < row + startR   ; i++) {
			for (int j = startC + 0; j < col + startC ; j++) {
				
				System.out.print(j * i + " ");
				
			}
			System.out.println();
		}

	}

}
