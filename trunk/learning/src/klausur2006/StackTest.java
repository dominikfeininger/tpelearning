package klausur2006;

class StackTest {

	public static void main(String[] args) {
		
		MyStack bsp = new MyStack();
		
		try {
			bsp.push(4);
			bsp.push(4);
			bsp.push(4);
			bsp.push(4);
			bsp.push(4);
			bsp.push(4);
			bsp.push(4);
			bsp.push(4);
			bsp.push(4);
			bsp.push(4);
			bsp.push(4);
			bsp.push(4);
			bsp.push(4);
			bsp.push(4);
			bsp.push(4);
			bsp.push(4);
			bsp.push(4);
			bsp.pop();
		} catch (OverflowException e) {
			e.printinfo();
		} catch (UnderflowException e) {
			e.getMessage();
		}
	}
}