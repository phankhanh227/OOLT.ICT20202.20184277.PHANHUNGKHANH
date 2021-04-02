package hust.soict.globalict.test.utils.DVDTest;
import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc1;
import hust.soict.globalict.aims.utils.DVDUtils.DVDUtils;

public class DVDTest {
	public static void main(String [] args)
	{
		DigitalVideoDisc1 dvd1 = new DigitalVideoDisc1("AAAA","aaaa","aaaa",1,5);
		DigitalVideoDisc1 dvd2 = new DigitalVideoDisc1("BBBB","bbbb","bbbb",2,2);
		DigitalVideoDisc1 dvd3 = new DigitalVideoDisc1("CCCC","cccc","cccc",3,3);
		DigitalVideoDisc1 dvd4 = new DigitalVideoDisc1("DDDD","dddd","dddd",4,4);
		DigitalVideoDisc1 dvd5 = new DigitalVideoDisc1("EEEE","eeee","eeee",5,1);

		
	
	System.out.println(DVDUtils.compareByCost(dvd1,dvd2));
	System.out.println(DVDUtils.compareByTitle(dvd5,dvd3));
	
	DigitalVideoDisc1[] sorted = DVDUtils.sortByCost(new DigitalVideoDisc1[] {dvd1,dvd2,dvd3,dvd4,dvd5});
	System.out.println("Sort by cost: ");
	for (int i=0;i<sorted.length;i++)
	{
		System.out.println(sorted[i].getDetail());
	}
	
	sorted = DVDUtils.sortByTitle(new DigitalVideoDisc1[] {dvd1, dvd2,dvd3,dvd4,dvd5});
	
	System.out.println("Sort by title: ");
	for (int i=0;i<sorted.length;i++)
	{
		System.out.println(sorted[i].getDetail());
	}
	}
}
