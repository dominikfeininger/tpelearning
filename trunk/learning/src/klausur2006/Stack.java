package klausur2006;

public interface Stack {
	public boolean push(Object o) throws OverflowException;
	public Object pop() throws UnderflowException;
}
