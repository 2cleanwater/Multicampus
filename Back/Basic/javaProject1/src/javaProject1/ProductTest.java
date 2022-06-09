package javaProject1;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductTest test = new ProductTest();
		test.test();
	}
	
	public void test() {
		String prdNo1 = "1,노트북,1200000,2021,삼성";
		String prdNo2 = "2,모니터,300000,2021,LG";
		String prdNo3 = "3,마우스,30000,2020,로지텍";
		
		String[] prds = {prdNo1, prdNo2, prdNo3};
		System.out.println("상품번호\t상품명\t가격\t연도\t제조사");
		System.out.println("-------------------------------------");
		for(String s : prds) {
			String[] temp = s.split(",");
			
			String prdName = temp[1];
			String prdMaker = temp[4];
			int prdNo = 0;
			int prdPrice = 0;
			int prdYear = 0;
			try { 
				prdNo = Integer.parseInt(temp[0]);
				prdPrice = Integer.parseInt(temp[2]);
				prdYear = Integer.parseInt(temp[3]);
			} catch(NumberFormatException nfe) {
				System.out.println(nfe.getMessage());
			}
			Product result = new Product(prdNo, prdName, prdPrice, prdYear, prdMaker);
			System.out.println(result);
			
		}
	}

}
