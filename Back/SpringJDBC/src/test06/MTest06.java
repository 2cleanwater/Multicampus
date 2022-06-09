package test06;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test06.dao.GoodsDao;

public class MTest06 {

	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("test06/applicationContext.xml");
		
		GoodsDao dao = factory.getBean("test", GoodsDao.class);
		
		System.out.println("========��ü���=========");
		List<GoodsVo> all = dao.listGoods();
		
		for(GoodsVo res : all) {
			System.out.println(res);
		}
		
		System.out.println("=======v01 �߰�=======");
		dao.insertGoods(factory.getBean("vo01", GoodsVo.class));
		all = dao.listGoods();
		for(GoodsVo res : all) {
			System.out.println(res);
		}
		
		System.out.println("=======����=======");
		dao.deleteGoods(factory.getBean("myname", String.class));
		all = dao.listGoods();
		for(GoodsVo res : all) {
			System.out.println(res);
		}
		
	}
}