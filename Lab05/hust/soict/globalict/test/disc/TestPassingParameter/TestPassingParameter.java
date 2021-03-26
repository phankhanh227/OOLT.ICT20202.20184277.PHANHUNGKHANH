package hust.soict.globalict.test.disc.TestPassingParameter;
import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc1;

public class TestPassingParameter {
	public static void main(String [] args)
	{
		DigitalVideoDisc1 jungleDVD = new DigitalVideoDisc1("Jungle");
		DigitalVideoDisc1 cinderellaDVD = new DigitalVideoDisc1("Cinderella");
		
		swap(jungleDVD,cinderellaDVD);
		
		System.out.println("Jungle DVD title: "+ jungleDVD.getTitle());
		System.out.println("Cinderella DVD title: "+ cinderellaDVD.getTitle());
		//type abc test
		changeTitle(jungleDVD,cinderellaDVD.getTitle());
		System.out.println("Jungle DVD title: "+ jungleDVD.getTitle());
	}
	
	public static void swap(Object o1,Object o2)
	{
		Object tmp = o1;
		o1=o2;
		o2=tmp;
	}
	
	public static void changeTitle(DigitalVideoDisc1 dvd,String title)
	{
		String oldTitle=dvd.getTitle();
		dvd.setTitle(title);
		dvd=new DigitalVideoDisc1(oldTitle);
	}
}
