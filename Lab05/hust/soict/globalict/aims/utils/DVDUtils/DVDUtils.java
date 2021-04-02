package hust.soict.globalict.aims.utils.DVDUtils;
import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc1;

public class DVDUtils {
	
	public static String compareByCost(DigitalVideoDisc1 dvd1,DigitalVideoDisc1 dvd2)
	{
		String s;
		if(dvd1.getCost()>dvd2.getCost()) s= "Cost of " +dvd1.getTitle()+" more than "+dvd2.getTitle();
		else if(dvd1.getCost()==dvd2.getCost()) s= "Cost of " +dvd1.getTitle()+" equal to "+dvd2.getTitle();
		else s= "Cost of " +dvd1.getTitle()+" less than "+dvd2.getTitle();
		return s;
		
	}
	
	public static String compareByTitle(DigitalVideoDisc1 dvd1,DigitalVideoDisc1 dvd2)
	{
		String s;
		if(dvd1.getTitle().compareTo(dvd2.getTitle())>0) s= "Title of " +dvd1.getTitle()+" stand before "+dvd2.getTitle();
		else if(dvd1.getTitle().compareTo(dvd2.getTitle())==0) s= "Title of " +dvd1.getTitle()+" is the same with "+dvd2.getTitle();
		else s= "Title of " +dvd1.getTitle()+" stand after "+dvd2.getTitle();
		return s;
	}
	
	public static DigitalVideoDisc1 [] sortByCost(DigitalVideoDisc1[] list)
	{
		for(int i=0;i<list.length;i++)
		{
			for(int j=i+1;j<list.length;j++)
			{
				if(list[i].getCost()>list[i+1].getCost())
				{
					DigitalVideoDisc1 temp=list[i];
					list[i]=list[j];
					list[j]=temp;
				}
			}
		}
		return list;
	}
	
	public static DigitalVideoDisc1 [] sortByTitle(DigitalVideoDisc1[] list)
	{
		for(int i=0;i<list.length;i++)
		{
			for(int j=i+1;j<list.length;j++)
			{
				if(list[i].getTitle().compareTo(list[i+1].getTitle())<0)
				{
					DigitalVideoDisc1 temp=list[i];
					list[i]=list[j];
					list[j]=temp;
				}
			}
		}
		return list;
	} 
}
