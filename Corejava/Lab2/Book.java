package Lab2;

public class Book extends WrittenItem {

	public Book(int ino, String copies, int no, String author) {
		super(ino, copies, no, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		//System.out.println("Method checkIn : In Subclass Book");
		
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("Menthod checkOut : In Subclass Book");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Menthod print : In Subclass Book");
	}

	@Override
	public void additem() {
		// TODO Auto-generated method stub
		System.out.println("Menthod addItem : In Subclass Book");
	}

}
