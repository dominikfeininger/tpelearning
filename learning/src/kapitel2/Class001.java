package kapitel2;

public class Class001 extends Class000{
	int i, j;
	
	Class001(int i, int j){
		System.out.println("Constructor 1 Class001");
		this.i = i;
		this.j = j * a;
	}
	
	Class001(int i){
		this(i, i*i);
		System.out.println("Constructor 2 Class001");
	}
	
	void print(){
		System.out.println("i= " + i + ", j= " + j);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class001 c1 = new Class001(7);
		c1.print();
	}

}
