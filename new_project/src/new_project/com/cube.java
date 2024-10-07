package new_project.com;
import java.util.*;

public class cube {
	void display() {
		while(true) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter your num");
			int a = sc.nextInt();
			int b = a*a*a;
			System.out.println("The cube of given num is: "+b);
			System.out.println("for continue (press 1)");
			System.out.println("for return in main menue (Press 2)");
			int c = sc .nextInt();
			if(c==2) {
				break;
			}

			
			
		}
	}

}
