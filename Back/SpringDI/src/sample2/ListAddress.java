package sample2;

public class ListAddress {
	
	private Address addr;
	
	public ListAddress() {
		System.out.println("ListAddress 기본 생성자");
	}

	public ListAddress(Address addr) {
		
		this.addr = addr;
		System.out.println("ListAddress 매개인자 생성자");
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
}
