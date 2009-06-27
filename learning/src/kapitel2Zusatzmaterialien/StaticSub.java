package kapitel2Zusatzmaterialien;

public class StaticSub extends StaticSuper {
	
	public static String staticGet () {
		return "Sub staticGet()";
	}
	
	public String dynamicGet() {
		return "Sub dynamicGet()";
	}
	
	public static void main(String[] args){
		StaticSuper sup2 = new StaticSub();
		System.out.println(sup2.staticGet());
		System.out.println(sup2.dynamicGet());
	}
	
}
