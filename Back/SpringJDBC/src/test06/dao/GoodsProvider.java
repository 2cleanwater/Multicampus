package test06.dao;

import java.util.List;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

import test06.GoodsVo;

@Component
public class GoodsProvider {
	// ����Ǵ� ���ι��̴��� �������� �����ϱ� ������ String���� �����Ѵ�.
	public String listGoods(){
		return new SQL() {
			{ 
				SELECT ("CODE, NAME, PRICE, MAKER");
				FROM("GOODSINFO"); 
			}
		}.toString();
	};
	
	public String insertGoods(GoodsVo vo) {
		String sql = new SQL().INSERT_INTO("GOODSINFO")
				.VALUES("CODE, NAME, PRICE, MAKER","#{code},#{name},#{price},#{maker}").toString();
		return sql;
	};

	public String updateGoods(GoodsVo vo) {
		return new SQL().UPDATE("GOODSINFO").
				SET("name=#{name}","price=#{price}", "maker=#{maker}")
				.WHERE("code=#{code}").toString();
	};
	
	public String deleteGoods(String name) {
		return new SQL() {
			{
				DELETE_FROM("GOODSINFO");
				WHERE("name=#{name}");
			}
		}.toString();
	};
	
	public String findGoods(String code) {
		return new SQL() {
			{
				SELECT ("CODE, NAME, PRICE, MAKER");
				FROM("GOODSINFO");
				WHERE("CODE =#{code}");
			}
		}.toString();
	};
}

