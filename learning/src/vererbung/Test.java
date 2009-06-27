package vererbung;

public class Test {
	public static void main(String[] args){
		Auto car = new Cabrio();
		Cabrio c = (Cabrio) car;
		c.zulassung = 200;
		System.out.println(c.zulassung);
	}
}
