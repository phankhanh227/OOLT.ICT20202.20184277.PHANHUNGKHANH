import java.util.Scanner;
public class ex6_6 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of two arrays: ");
		int n=sc.nextInt();
		int[] a1=new int[n];
		int[] a2=new int[n];
		int[] a3=new int[n];
		
		System.out.println("Enter the elements of first array :");
		for(int i=0;i<n;i++)
		{
			System.out.println("a["+i+"]: ");
			a1[i]=sc.nextInt();
		}
		System.out.println("Enter the elements of 2nd array :");
		for(int i=0;i<n;i++)
		{
			System.out.println("a["+i+"]:");
			a2[i]=sc.nextInt();
			a3[i]=a1[i]+a2[i];
		}
		System.out.println("The array is sum of two: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a3[i]+" ");
		}
	}
}
