package shape;

public class Rectangle extends Shape implements Resize {

	private int width;
	private int height;
	private String colors;
	
	public Rectangle(int width, int height, String colors) {
		super();
		this.width = width;
		this.height = height;
		this.colors = colors;
	}

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public double getArea() {
		return this.width*this.height;
		
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	@Override
	public void setResize(int size) {
		this.width = this.width + size;
	}
	
	@Override
	public String toString() {
		return "Rectangle\t" + getArea() +"\t" + getColors();
	}
	
}
