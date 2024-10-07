package new_project.com;
import java.util.*;

public class even_odd {
	void display() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter your num");
			int a= sc.nextInt();
			if(a%2==0) {
				System.out.println("The given num is: Even");
			}
			else {
				System.out.println("The given num is : ODD");
			}
			//System.out.println("The cube of given num is: "+b);
			System.out.println("for continue (press 1)");
			System.out.println("for return in main menue (Press 2)");
			int c = sc .nextInt();
			if(c==2) {
				break;
			}
		}
	}

}
