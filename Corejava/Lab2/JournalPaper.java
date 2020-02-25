package Lab2;

public class JournalPaper extends WrittenItem{
	private int year;

	public JournalPaper(int ino, String copies, int no, String author, int year) {
		super(ino, copies, no, author);
		this.year = year;
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("Menthod checkIn : In Subclass JournalPaper");
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("Menthod checkOut : In Subclass JournalPaper");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Menthod print : In Subclass JournalPaper");
	}

	@Override
	public void additem() {
		// TODO Auto-generated method stub
		System.out.println("Menthod addItem : In Subclass Journalpaper");
	}
	
}
