package klausur2006;

class ValuePair extends SingleValue{
	protected int value2;
	
	public ValuePair(int value1, int value2){
		super(value1);
		this.value2 = value2;
	}
	
	public void print(){
		System.out.println("value = (" + value1 + ", " + value2 + ")");
	}
}
