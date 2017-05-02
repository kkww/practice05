package prob3;

public abstract class Bird {
	protected String name;
	
	public abstract void fly();
	public abstract void sing();
	
	@Override
	public abstract String toString();
	
	public void setName(String name) {
		this.name = name;
	}
}
