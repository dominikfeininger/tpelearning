package klausur2006;

public class OverflowException extends Exception {
	
	Object value;
	
	public OverflowException(String s, Object o) {
		super(s);
		System.out.println(s);
		this.value = o;
	}
	
	public void printinfo(){
		System.out.println("Overflow bei Wert: " + value.toString());
	}

}
