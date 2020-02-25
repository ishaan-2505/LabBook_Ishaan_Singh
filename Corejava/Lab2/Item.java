package Lab2;

public abstract class Item {
	private int Ino;
	private String copies;
	private int no;
	public Item(int ino, String copies, int no) {
		super();
		Ino = ino;
		this.copies = copies;
		this.no = no;
	}
	public int getIno() {
		return Ino;
	}
	public void setIno(int ino) {
		Ino = ino;
	}
	public String getCopies() {
		return copies;
	}
	public void setCopies(String copies) {
		this.copies = copies;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "Item [Ino=" + Ino + ", copies=" + copies + ", no=" + no + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (Ino != other.Ino)
			return false;
		if (copies == null) {
			if (other.copies != null)
				return false;
		} else if (!copies.equals(other.copies))
			return false;
		if (no != other.no)
			return false;
		return true;
	}
	public abstract void checkIn();
	public abstract void checkOut();
	public abstract void print();
	public abstract void additem();
	
}
