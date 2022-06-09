package shape;

public class Triangle extends Shape implements Resize{
	private int width;
	private int height;
	private String colors;
	
	public Triangle(int width, int height, String colors) {
		super();
		this.width = width;
		this.height = height;
		this.colors = colors;
	}

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public double getArea() {
		return this.width*this.height/2.0;
		
	}
	
	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void setResize(int size) {
		this.height= this.height + size;
	}
	
	@Override
	public String toString() {
		return "Triangle\t" + getArea() +"\t" + getColors();
	}
	
	
}
