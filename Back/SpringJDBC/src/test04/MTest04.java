package test04;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest04 {

	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("test04/applicationContext.xml");
		
		GoodsDao dao = factory.getBean("test", GoodsDao.class);
		
		System.out.println("========전체목록=========");
		List<GoodsVo> all = dao.listGoods();
		
		for(GoodsVo res : all) {
			System.out.println(res);
		}
		
		System.out.println("=======v01 추가=======");
		dao.insertGoods(factory.getBean("vo01", GoodsVo.class));
		all = dao.listGoods();
		for(GoodsVo res : all) {
			System.out.println(res);
		}
		
		
	}
}
