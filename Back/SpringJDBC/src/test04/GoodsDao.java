package test04;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

@Component("test")
public class GoodsDao {
	//1.SqlSessionFactory -> 환경설정파일을 통해 config과 mapper 컴파일 및 빌드한다.
	private static SqlSessionFactory factory;
	static {
		try {
			String resource = "test04/mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(inputStream);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	//2. CRUD메소드를 만들어서 매퍼에서 선언된 id로 쿼리를 찾아와서 코드로 매핑한다. 
	
	public List<GoodsVo> listGoods() {
		List<GoodsVo> all = null;
		try (SqlSession session = factory.openSession()) {
			all = session.selectList("mybatis.goodsMapper.listGoods");
		}
		return all;
	}
	
	public int insertGoods(GoodsVo vo) {
		int r = 0;
		try (SqlSession session = factory.openSession()) {
			r = session.insert("mybatis.goodsMapper.insertGoods", vo);
			if(r>0) {
				session.commit();
			}else {
				session.rollback();
			}
		}
		return r;
	}
	
	public int updateGoods(GoodsVo vo) {
		int r = 0;
		try (SqlSession session = factory.openSession()) {
			r = session.update("mybatis.goodsMapper.updateGoods", vo);
			if(r>0) {
				session.commit();
			}else {
				session.rollback();
			}
		}
		return r;
	}
	
	public int deleteGoods(String name) {
		int r = 0;
		try (SqlSession session = factory.openSession()) {
			r = session.delete("mybatis.goodsMapper.deleteGoods", name);
			if(r>0) {
				session.commit();
			}else {
				session.rollback();
			}
		}
		return r;
	}
	public GoodsVo findGoods(String code) {
		GoodsVo vo = null;
		try (SqlSession session = factory.openSession()) {
			  vo = session.selectOne("mybatis.goodsMapper.findGoods", code);
			}
		return vo;
	}
	
}
