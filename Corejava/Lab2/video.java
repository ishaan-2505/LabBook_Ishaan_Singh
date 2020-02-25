package Lab2;

public class video extends MediaItem{
	private int year;
	private String director,genre;
	public video(int ino, String copies, int no, int run, int year, String director, String genre) {
		super(ino, copies, no, run);
		this.year = year;
		this.director = director;
		this.genre = genre;
	}
	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("Menthod checkIn : In Subclass Video");
		
	}
	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("Menthod checkOut : In Subclass Video");
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Menthod print : In Subclass Video");
	}
	@Override
	public void additem() {
		// TODO Auto-generated method stub
		System.out.println("Menthod addItem : In Subclass Video");
	}
	
}
