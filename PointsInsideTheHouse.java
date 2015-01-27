import java.util.Locale;
import java.util.Scanner;


public class _9PointsInsideTheHouse {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.ROOT);
		 Scanner input = new Scanner(System.in);
		 
		 double x = input.nextDouble();
		 double y = input.nextDouble();
		 
		 //((aX*(bY-cY) + bX*(cY-aY) + cX*(aY - bY))/2)
		 double area = Math.abs((12.5*(8.5 - 3.5) + 22.5*(3.5-8.5) + 17.5*(8.5 -8.5))/2);
		 double areaA = Math.abs((x*(8.5 - 3.5) + 22.5*(3.5-y) + 17.5*(y -8.5))/2);
		 double areaB = Math.abs((12.5*(y - 3.5) + x*(3.5-8.5) + 17.5*(8.5 - y))/2);
		 double areaC = Math.abs((12.5*(8.5 - y) + 22.5*(y-8.5) + x*(8.5 -8.5))/2);		
		 double result = areaA + areaC + areaB;
		 
			 
			if (y <= 8.5) {
				if (result == area) {
					System.out.println("Inside");
				} else {
					System.out.println("Outside");
				}
				
			} else {
				if (x>= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5
						|| x >= 20 && x <= 22.5 && y >= 8.5 && y <= 13.5) {
					 
					System.out.println("Inside");
				} else {
					System.out.println("Outside");
				}
			}
		}
 }
