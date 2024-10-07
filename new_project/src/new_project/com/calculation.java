package new_project.com;
import java.util.*;

public class calculation {
	void display() {
		while(true) {
			Scanner sc =new Scanner(System.in);
			{
				System.out.println("*******CAlculations*******");
			}
			System.out.println("1.addition");
			System.out.println("2.subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.division");
			System.out.println("enter your num");
			int a = sc .nextInt();
			System.out.println("Please enter your nums");
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a==1) {
				System.out.println("the addition of given num is : "+(b+c));
			}
			else if(a==2) {
				System.out.println("the subtraction of given num is: "+(b-c));
			}
			else if(a==3) {
				System.out.println("the multiplication of given num is: "+(b*c));
			}
			else if (a==4) {
				System.out.println("the division of given num is: "+(b/c));
			}//System.out.println("The cube of given num is: "+b);
			System.out.println("for continue (press 1)");
			System.out.println("for return in main menue (Press 2)");
			int g = sc .nextInt();
			if(g==2) {
				break;
			}
		}
	}

}
