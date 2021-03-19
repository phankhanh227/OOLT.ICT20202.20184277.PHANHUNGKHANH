

public class Cart extends DigitalVideoDisc {
	private int qtyOrdered;
	public static final int MAX_NUMBERS_ORDERED = 20;
	public DigitalVideoDisc [] itemsOrdered= new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc)
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
			itemsOrdered[qtyOrdered] = new DigitalVideoDisc(disc.getTitle(),disc.getCategory(),disc.getDirector(),disc.getLength(),disc.getCost());
			System.out.println( "The disc has been added !");
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

