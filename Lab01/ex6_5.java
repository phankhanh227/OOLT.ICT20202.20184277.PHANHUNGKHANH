import java.util.Scanner;
public class ex6_5 {
	public static void sortArr(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s=0;
        System.out.println("Enter the numbers of array: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
            s+=arr[i];
        }
        sortArr(arr);
        System.out.println("Array after sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSum of the array: "+s);
        System.out.println("Average value of the array: "+s/n);
    }
}
