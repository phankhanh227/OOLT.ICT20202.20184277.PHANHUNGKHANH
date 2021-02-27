import java.util.Scanner; 
public class ex225 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter ther first number: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter the second number: ");
		double num2 = sc.nextDouble();
		System.out.println("SUM: "+(num1+num2));
		System.out.println("DIFF: "+(num1-num2));
		System.out.println("PRO: "+(num1*num2));
		System.out.println("DIV: "+(num1/num2));
	}
}
