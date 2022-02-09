package p220111;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Test t = new Test();
        
        System.out.println(t.hashCode("one", 10));
        System.out.println(t.hashCode("two", 2));
        System.out.println(t.hashCode("three", 3));
//        System.out.println(t.hashCode("one", 10));
//        System.out.println(t.hashCode("two", 20));
//        System.out.println(t.hashCode("three", 3));
//        System.out.println(t.hashCode("four", 10));
//        System.out.println(t.hashCode("fiv", 20));
//        System.out.println(t.hashCode("six",3));
    }
        
    
    public int hashCode(String key, Integer value) {
    	int k = (key == null   ? 0 : key.hashCode());
    	int v = (value == null ? 0 : value.hashCode());
    	int what = k^v;
    	System.out.printf("k는 %d\n",k);
    	System.out.printf("v는 %d\n",v);
    	System.out.printf("what은 %d\n",what);
        return (key == null   ? 0 : 9) ^ (value == null ? 0 : 1);
    }

}
