package Lab2;

public class CD extends MediaItem {
	private String artist,genre;

	public CD(int ino, String copies, int no, int run, String artist, String genre) {
		super(ino, copies, no, run);
		this.artist = artist;
		this.genre = genre;
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("Menthod checkIn : In Subclass CD");
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("Menthod checkOut : In Subclass CD");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Menthod print : In Subclass CD");
	}

	@Override
	public void additem() {
		// TODO Auto-generated method stub
		System.out.println("Menthod addItem : In Subclass CD");
	}
	
}
