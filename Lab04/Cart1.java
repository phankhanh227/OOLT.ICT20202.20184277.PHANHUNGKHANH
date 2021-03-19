

public class Cart1 extends DigitalVideoDisc1 {
	private int qtyOrdered;
	public static final int MAX_NUMBERS_ORDERED = 20;
	public DigitalVideoDisc1 [] itemsOrdered= new DigitalVideoDisc1[MAX_NUMBERS_ORDERED];
	
	public void addDigitalVideoDisc(DigitalVideoDisc1 disc)
	{
		if(qtyOrdered==20) System.out.println("The cart is almost full !");
		else
		{
			qtyOrdered++;
			/*itemsOrdered[qtyOrdered].setTitle(disc.getTitle());
			itemsOrdered[qtyOrdered].setCategory(disc.getCategory());
			itemsOrdered[qtyOrdered].setDirector(disc.getDirector());
			itemsOrdered[qtyOrdered].setLength(disc.getLength());
			itemsOrdered[qtyOrdered].setCost(disc.getCost());*/
			itemsOrdered[qtyOrdered] = new DigitalVideoDisc1(disc.getTitle(),disc.getCategory(),disc.getDirector(),disc.getLength(),disc.getCost());
			System.out.println( "The disc has been added !");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc1 dvd1,DigitalVideoDisc1 dvd2)
	{
		if(qtyOrdered==20) System.out.println("The cart is almost full !");
		else
		{
			qtyOrdered++;
			
			itemsOrdered[qtyOrdered] = new DigitalVideoDisc1(dvd1.getTitle(),dvd1.getCategory(),dvd1.getDirector(),dvd1.getLength(),dvd1.getCost());
			System.out.println( "The disc has been added !");
		}
		if(qtyOrdered==20) System.out.println("The cart is almost full !");
		else
		{
			qtyOrdered++;
			
			itemsOrdered[qtyOrdered] = new DigitalVideoDisc1(dvd2.getTitle(),dvd2.getCategory(),dvd2.getDirector(),dvd2.getLength(),dvd2.getCost());
			System.out.println( "The disc has been added !");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc1 [] dvdList)
	{
		for(int i=0;i<dvdList.length;i++)
		{
		if(qtyOrdered==20) 
			{System.out.println("The cart is almost full !");
			 break;
			}else
			{
				qtyOrdered++;
				itemsOrdered[qtyOrdered] = new DigitalVideoDisc1(dvdList[i].getTitle(),dvdList[i].getCategory(),dvdList[i].getDirector(),dvdList[i].getLength(),dvdList[i].getCost());
				System.out.println( "The disc has been added !");
			}
		}
	}
	
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc)
	{
		for(int i=0;i<qtyOrdered;i++)
		{
			if(disc.getTitle().equals(itemsOrdered[qtyOrdered].getTitle()) && disc.getDirector().equals(itemsOrdered[qtyOrdered].getDirector()) ) 
			{
				for(int j=i;j<qtyOrdered;j++)
				{
					j=j++;
				}
				System.out.println("The disc have been deleted !");
			}else System.out.println("Have no this disc");
		}
	}
	public float totalCost()
	{
		float cost=0;
		for(int i=1;i<=qtyOrdered;i++)
		{
			cost+=itemsOrdered[i].getCost();
		}
		return cost;
	}
}

