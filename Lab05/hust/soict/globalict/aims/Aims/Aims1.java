package hust.soict.globalict.aims.Aims;
import hust.soict.globalict.aims.cart.Cart.Cart1;
import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc1;

public class Aims1 {
	public static void main(String [] args)
	{
		Cart1 anOrder= new Cart1();
		
		DigitalVideoDisc1 dvd1 = new DigitalVideoDisc1("The Lion King","Animation","Roger Allers", 87 ,19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc1 dvd2 = new DigitalVideoDisc1("Star Wars","Science Fiction","Geogrge Lucas", 87 ,24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc1 dvd3 = new DigitalVideoDisc1("Aladin","Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
	}
}

