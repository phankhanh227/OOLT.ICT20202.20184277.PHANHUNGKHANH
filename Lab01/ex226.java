import java.util.Scanner;
public class ex226 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x;
		do {
			System.out.println("CACULATE");
			System.out.println("1.First-degree equation(ax+b=0).");
			System.out.println("2.System of irst-degree equations.");
			System.out.println("3.Second-degree equation.");
			System.out.println("4.Exit.");
			System.out.println("Your choice: ");x=sc.nextInt();
			switch(x)
			{
			case 1: {
				float a,b;
				do{System.out.println("Enter a: ");a=sc.nextFloat();if(a==0) System.out.println("a must be different from 0");}while(a==0);
				System.out.println("Enter b: ");b=sc.nextFloat();
				if(b == 0) System.out.println("Solution: x= 0");
				else {
					System.out.println("Solution: x = "+(-b)/a);
				}
				break;
			}
			case 2: {
				float a1,a2,b1,b2,c1,c2,x1,x2;
				float dx,dy,d;
				System.out.println("Enter a1: ");a1=sc.nextFloat();
				System.out.println("Enter b1: ");b1=sc.nextFloat();
				System.out.println("Enter c1: ");c1=sc.nextFloat();
				
				System.out.println("Enter a2: ");a2=sc.nextFloat();
				System.out.println("Enter b2: ");b2=sc.nextFloat();
				System.out.println("Enter c2: ");c2=sc.nextFloat();
				
				d=a1*b2-a2*b1;
				dx=c1*b2-c2*b1;
				dy=a1*c2-a2*c1;
				if(d!=0)
				{
					System.out.println("Solution: x1 = "+dx/d);
					System.out.println("Solution: x2 = "+dy/d);
				}else {
					if(dx==0&&dy==0) System.out.println("system of equations has infinite solutions");
					else if(dx==0||dy==0) System.out.println("System of equations have no solution !");
				}
				break;
			}
			case 3: {
				float a,b,c,delta;
				do {System.out.println("Enter a: ");a=sc.nextFloat(); if(a==0) System.out.println("a must be different form 0.");}while(a==0);
				System.out.println("Enter b: ");b=sc.nextFloat();
				System.out.println("Enter c: ");c= sc.nextFloat();
				delta=b*b-4*a*c;
				if(delta <0) System.out.println("Equation has no solution !");
				else if(delta == 0) System.out.println("Equation have double root: x1=x2="+(-b/(2*a)));
				else System.out.println("Equation have two root: x1 = "+((-b+Math.sqrt(delta))/(2*a))+"\nx2 = "+((-b-Math.sqrt(delta))/(2*a)));
			}
			break;
			
			case 4: {
				System.out.println("Good bye !");break;
			}}
		}while(x>0&&x<4);
	}
}
