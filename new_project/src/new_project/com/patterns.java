package new_project.com;
import java .util.*;


public class patterns {
	void display() {
		while(true) {
		Scanner sc= new Scanner (System.in);{
		System.out.println("******PATTERNS******");
		}
		System.out.println("   Select patterns according to numbers");
		System.out.println("1.Square pattern");
		System.out.println("2.increasing in pattern");
		System.out.println("3.Desceasing in pattern");
		System.out.println("4.L line pattern");
			int a = sc.nextInt();
			if(a==1) {
				for(int i = 1;i<=8;i++) {
					for(int j =1 ;j<=8;j++) {
						System.out.print("* ");
					}
					System.out.println();
				}
			}
			else if (a==2) {
				for(int i = 1;i<=8;i++) {
					for(int j =1;j<=i;j++) {
						System.out.print("* ");
					}
					System.out.println();
				}
			}
			else if(a==3) {
				for(int i =1;i<=8;i++) {
					for(int j =i;j<=8;j++) {
						System.out.print("* ");
					}
					System.out.println();
				}
			}
			else if (a==4) {
				for(int i=1;i<=8;i++) {
					for(int j=1;j<=8;j++) {
						if(i==1||j==1||i==8||j==8) {
							System.out.print("* ");
						}
						else {
							System.out.println();
						}
					}
					System.out.println();
				}
			}
			System.out.println();
			System.out.println("if you want to continue(press 1)");
			System.out.println("if you want to return in main menue(press 2) ");
			Scanner sc1=new Scanner(System.in);
			
			  int b = sc1.nextInt();
			if(b==2) {
				break;
				
			}
			
			
		}
		
		
	}

}
