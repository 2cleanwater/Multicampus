package p220110;

public class Point3D extends Point {
	private int z;
	public Point3D(int x, int y, int z) {
		super(x,y);
		// super 생성자는 가장 첫줄에 사용해라
		this.z = z;
		
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%3d %3d %3d",x, y, z);
		// x와 y가 private가 아닌 protected라서 가져올수있었다.
	}
}
