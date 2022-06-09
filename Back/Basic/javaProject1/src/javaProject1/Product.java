package javaProject1;

public class Product {
	private int prdNo;
	private String prdName;
	private int prdPrice;
	private int prdYear;
	private String prdMaker;
	
	public Product(int prdNo, String prdName, int prdPrice, int prdYear, String prdMaker) {
		this.prdNo = prdNo;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
		this.prdYear = prdYear;
		this.prdMaker = prdMaker;
	}

	public int getPrdNo() {
		return prdNo;
	}

	public void setPrdNo(int prdNo) {
		this.prdNo = prdNo;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public int getPrdPrice() {
		return prdPrice;
	}

	public void setPrdPrice(int prdPrice) {
		this.prdPrice = prdPrice;
	}

	public int getPrdYear() {
		return prdYear;
	}

	public void setPrdYear(int prdYear) {
		this.prdYear = prdYear;
	}

	public String getPrdMaker() {
		return prdMaker;
	}
	public void setPrdMaker(String prdMaker) {
		this.prdMaker = prdMaker;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = prdNo + prdName + prdPrice + prdYear + prdMaker;
		result = String.format("%03d\t%s\t%d\t%d\t%s",prdNo, prdName, prdPrice, prdYear, prdMaker);
		return result;
	}
	
}
