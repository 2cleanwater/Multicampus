package test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//�߰��ϰ� ��� �غ���
public class MTes01 {
	public static void main(String[] args) {
		ApplicationContext factory
		= new ClassPathXmlApplicationContext("test01/applicationContext.xm1") ;
		
		FirstJdbcDao dao = (FirstJdbcDao)factory.getBean("test") ;
		int count=dao.insert("p0004", "������", 45000, "SDS ");
		System.out.println(count + "���� ����Ÿ�� �ԷµǾ����ϴ�");
		dao.execute("SELECT * FROM GOODSINFO");
		System.out. println("========s==============");
		int r = dao.delete("������");
		dao.execute("SELECT * FROM GOODSINFO");
		((ClassPathXmlApplicationContext) factory) .close();
}
}
