package Lab2;

public abstract class MediaItem extends Item {
	private int run;

	public MediaItem(int ino, String copies, int no, int run) {
		super(ino, copies, no);
		this.run = run;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	@Override
	public String toString() {
		return "MediaItem [run=" + run + "]";
	}
}
