package new_project.com;
import java.util.*;

public class table {
	void display() {
		while(true) {
			System.out.println("please Enter your num ");
			Scanner sc = new Scanner (System.in);
			int a = sc.nextInt();
			for(int i=1;i<=10;i++) {
				System.out.println(a+"*"+i+"= "+i*a);
				
				
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
