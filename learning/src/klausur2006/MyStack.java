package klausur2006;

class MyStack implements Stack {
	
	Object[] stack;
	
	int anzahl = 0;
	
	MyStack() {
		stack = new Object[10];
	}
	
	MyStack(int stackGroesse){
		stack = new Object[stackGroesse];
	}
	
	public boolean push(Object o) throws OverflowException{
		boolean successfull;
		if(anzahl < stack.length){
			stack[anzahl] = o;
			anzahl++;
			successfull = true;
		}else{
			successfull = false;
			throw new OverflowException("overflow", o);
		}
		return successfull;
	}
	
	public Object pop() throws UnderflowException{
		Object tmp;
		if(anzahl > 0){
			tmp = stack[anzahl-1];
			stack[anzahl-1] = null;
			anzahl--;
		}else{
			tmp = null;
			throw new UnderflowException("underflow");
		}
		return tmp;
	}
}