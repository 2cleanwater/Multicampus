package test03;

public class GoodsVo {
	private String code;
	private String name;
	private int price;
	private String maker;

	public GoodsVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoodsVo(String code, String name, int price, String maker) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.maker = maker;
	}
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getMaker() {
		return maker;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
}
