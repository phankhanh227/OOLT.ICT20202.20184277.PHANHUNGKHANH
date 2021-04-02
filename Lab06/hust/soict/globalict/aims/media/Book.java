package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Book extends DigitalVideoDisc {
	private int id;
	private String title;
	private String category;
	private float cost;
	
	private List<String> authors = new ArrayList<String>();

	public Book(int id, String title, String category, float cost, List<String> authors) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.authors = authors;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public void addAuthors(String authorName) {
		for(String s : this.getAuthors())
		{
			if (s.compareTo(authorName)==0) 
				{
				System.out.println("This author already esxit !");
				break;
				}
			else {
				this.getAuthors().add(authorName);
				System.out.println("Author Name has been added! ");
			}
			
		}
	}
	
	public void removeAuthor(String authorName) {
		int i=0;
	
		for(String s : this.getAuthors())
		{
			if (s.compareTo(authorName)==0) 
				{ this.getAuthors().remove(i);}
			i++;
			}
	}
	
	
}
