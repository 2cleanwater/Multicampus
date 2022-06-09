package shape;

public class ShapeTest {

	private static final String Triangle = null;
	private static final boolean[] instenceof = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape[] = new Shape[6];
		shape[0] = new Triangle(7,5,"Blue");
		shape[1] = new Rectangle(4,6,"Blue");
		shape[2] = new Triangle(6,7,"red");
		shape[3] = new Rectangle(8,3,"red");
		shape[4] = new Triangle(9,8,"white");
		shape[5] = new Rectangle(5,7,"white");
		
		System.out.println("기본정보");
		for(int i=0;i<6;i++) {
			System.out.println(shape[i]);
		}
		
		for(int i=0;i<6;i++) {
			if(shape[i] instanceof Triangle) {
				((Triangle)shape[i]).setResize(5);
			} else {
				((Rectangle)shape[i]).setResize(5);
			}
		}
		
		System.out.println("사이즈를 변경 후 정보");
		for(int i=0;i<6;i++) {
			System.out.println(shape[i]);
		}
	}
		
}
