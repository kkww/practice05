package prob5_update;

public class MyStackException extends Exception {
	private static final long serialVersionUID = -4345544702249838346L;
	
	public MyStackException() {
		super("My Stack Exception occurs");
	}
	
	public MyStackException(String message) {
		super(message);
	}
}
