import java.util.Scanner;
public class ex6_4 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=0;
		System.out.println("Enter the month: ");
		String str=sc.nextLine();
		if(str=="January"||str=="Jan."||str=="Jan"||str=="1") a=1;
		if(str=="Februaly"||str=="Feb."||str=="Feb"||str=="2")  a=2;
		if(str=="March"||str=="Mar."||str=="Mar"||str=="3") a=3;
		if(str=="April"||str=="Apr."||str=="Apr"||str=="4") a=4;
		if(str=="May"||str=="5") a=5;
		if(str=="June"||str=="Jun"||str=="6") a=6;
		if(str=="July"||str=="Jul"||str=="7") a=7;
		if(str=="August"||str=="Aug."||str=="Aug"||str=="8") a=8;
		if(str=="September"||str=="Sept."||str=="Sep"||str=="9") a=9;
		if(str=="October"||str=="Oct."||str=="Oct"||str=="10") a=10;
		if(str=="November"||str=="Nov."||str=="Nov"||str=="11") a=11;
		if(str=="December"||str=="Dec."||str=="Dec"||str=="12") a=12;
		
		System.out.println("Enter the year: ");int y=sc.nextInt();
		System.out.println(a);
		switch(a)
		{
		/*case 1:case 3: case 5: case 7: case 8: case 10: case 12: {System.out.println(a+"/"+y+" have 31 days");break;}
		case 4:case 6: case 9:case 11: {System.out.println(a+"/"+y+" have 30 days");break;}*/
		case 2:{
			if(y%4==0) System.out.println(a+"/"+y+" have 29 days");
			else System.out.println(a+"/"+y+" have 28 days");
			break;
		}
		}
	}
}
