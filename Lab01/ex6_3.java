import java.util.Scanner;
public class ex6_3 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n: ");int n = sc.nextInt();
		for(int i=0;i<n+1;i++)
		{
			for(int j=0;j<n+i-1;j++)
			{
				if(j<n-i)System.out.print(" ");
				else System.out.print("*");
			}System.out.println();
		}
	}
}
