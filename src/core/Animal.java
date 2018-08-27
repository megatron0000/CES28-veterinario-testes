package core;

public class Animal {
	private int x1;
	private int x2;
	
	public Animal(int startx1, int startx2) {
		this.x1 = startx1;
		this.x2 = startx2;
	}
	
	public void setX1(int newX1) {
		x1=newX1;
	}	
	
	public int getX1() {
		return this.x1;
	}
}
