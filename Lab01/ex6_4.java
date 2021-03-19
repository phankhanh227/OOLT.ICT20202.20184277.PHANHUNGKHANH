import java.util.Scanner;
public class ex6_4 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=0;
		System.out.println("Enter the month: ");
		String str=sc.nextLine();
		if(str.equals("January")||str.equals("Jan.")||str.equals("Jan")||str.equals("1")) a=1;
		if(str.equals("Februaly")||str.equals("Feb.")||str.equals("Feb")||str.equals("2"))  {a=2;}
		if(str.equals("March")||str.equals("Mar.")||str.equals("Mar")||str.equals("3")) a=3;
		if(str.equals("April")||str.equals("Apr.")||str.equals("Apr")||str.equals("4")) a=4;
		if(str.equals("May")||str.equals("5")) a=5;
		if(str.equals("June")||str.equals("Jun")||str.equals("6")) a=6;
		if(str.equals("July")||str.equals("Jul")||str.equals("7")) a=7;
		if(str.equals("August")||str.equals("Aug.")||str.equals("Aug")||str.equals("8")) a=8;
		if(str.equals("September")||str.equals("Sept.")||str.equals("Sep")||str.equals("9")) a=9;
		if(str.equals("October")||str.equals("Oct.")||str.equals("Oct")||str.equals("10")) a=10;
		if(str.equals("November")||str.equals("Nov.")||str.equals("Nov")||str.equals("11")) a=11;
		if(str.equals("December")||str.equals("Dec.")||str.equals("Dec")||str.equals("12")) a=12;
		
		System.out.println("Enter the year: ");int y=sc.nextInt();
		System.out.println(a+str);
		switch(a)
		{
		case 1:case 3: case 5: case 7: case 8: case 10: case 12: {System.out.println(a+"/"+y+" have 31 days");break;}
		case 4:case 6: case 9:case 11: {System.out.println(a+"/"+y+" have 30 days");break;}
		case 2:{
			if(y%4==0) System.out.println(a+"/"+y+" have 29 days");
			else System.out.println(a+"/"+y+" have 28 days");
			break;
		}
		}
	}
}
