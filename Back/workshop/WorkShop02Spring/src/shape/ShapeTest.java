package shape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape[] = new Shape[6];
		ApplicationContext ac = new ClassPathXmlApplicationContext("shape/applicationContext.xml");
		
		shape[0] = ac.getBean("shape1", Triangle.class);
		shape[1] = ac.getBean("shape2", Rectangle.class);
		shape[2] = ac.getBean("shape3", Triangle.class);
		shape[3] = ac.getBean("shape4", Rectangle.class);
		shape[4] = ac.getBean("shape5", Triangle.class);
		shape[5] = ac.getBean("shape6", Rectangle.class);
		
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
