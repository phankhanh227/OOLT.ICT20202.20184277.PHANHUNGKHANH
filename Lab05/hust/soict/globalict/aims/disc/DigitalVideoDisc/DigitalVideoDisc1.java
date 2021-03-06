package hust.soict.globalict.aims.disc.DigitalVideoDisc;



public class DigitalVideoDisc1 {

		private String title;
		private String category;
		private String director;
		private int length;
		private float cost;
		
		
		public DigitalVideoDisc1() {
			//super();
			this.title="";
			this.category="";
			this.director="";
			this.length=0;
			this.cost=0;
		}
		
		public DigitalVideoDisc1(String title) {
			super();
			this.title = title;
			
		}

		public DigitalVideoDisc1(String title,String category,String director,int length, float cost)
		{
			super();
			this.title=title;
			this.category=category;
			this.director=director;
			this.length=length;
			this.cost=cost;
		}

		public DigitalVideoDisc1(String title, String category, float cost) {
			super();
			this.title = title;
			this.category = category;
			this.cost = cost;
		}

		public DigitalVideoDisc1(String title, String category, String director, float cost) {
			super();
			this.title = title;
			this.category = category;
			this.director = director;
			this.cost = cost;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getDirector() {
			return director;
		}

		public void setDirector(String director) {
			this.director = director;
		}

		public int getLength() {
			return length;
		}

		public void setLength(int length) {
			this.length = length;
		}

		public float getCost() {
			return cost;
		}

		public void setCost(float cost) {
			this.cost = cost;
		}
		
		public String getDetail()
		{
			String s= this.getTitle()+" "+this.getCategory()+" "+this.getDirector()+" "+this.getLength()+": "+this.getCost()+"$";
			return s;
		}
		
	
}

