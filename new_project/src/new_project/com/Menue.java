package new_project.com;
import java.util.*;

public class Menue {
	void display() {
		while(true) {
			Scanner sc= new Scanner (System.in);
			System.out.println("#$*#$*#$* MENUE CARD *$*#$*#*");
			
			System.out.println();
			System.out.println("1. Patterns ");
			System.out.println("2.Calculations");
			System.out.println("3.Even or Odd num");
			System.out.println("4.Table");
			System.out.println("5.Square ");
			System.out.println("6.cube "); 
			int a = sc.nextInt();
			if(a==1) {
				patterns p = new patterns();
				p.display();
			}
			else if (a==2) {
				calculation c= new calculation();
				c.display();
			}
			else if(a==3) {
				even_odd e = new even_odd();
				e.display();
			}
			else if(a==4) {
				table t = new table();
				t.display();
			}
			else if(a==5) {
				Square s= new Square();
				s.display();
			}
			else if(a==6) {
				cube c =new  cube();
				c.display();
				
			}

			
			
			
			
		}
	}

}
