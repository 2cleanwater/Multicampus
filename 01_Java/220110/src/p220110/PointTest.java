package p220110;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PointTest pt = new PointTest();
		pt.test1();
	}
	
	public void test1() {
		Point p1 = new Point(10,20);
		Point p2 = new Point(20,30);
		System.out.println("x\ty");
		System.out.println("**************");
		System.out.println(p1);
		System.out.println(p2);
		Point3D p3 = new Point3D(1,3,4);
		Point3D p4 = new Point3D(10,13,14);
		Point3D p5 = new Point3D(12,30,42);
		System.out.println("x\ty\tz");
		System.out.println("**************");
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);

	}

}
