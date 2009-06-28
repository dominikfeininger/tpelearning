package klausur2006;

public class Parkhausbetrieb {

	public static void main(String[] args) {
		
		Parkhaus parkhaus = new Parkhaus(10);
		
		for(int i = 1; i <= 40; i++){
			Auto a = new Auto("Auto " + i, parkhaus);
		}
	}
}