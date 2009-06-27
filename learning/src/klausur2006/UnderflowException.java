package klausur2006;

public class UnderflowException extends Exception {
	
	public UnderflowException(String s) {
		super(s);
		System.out.println(s);
	}	
	
}
