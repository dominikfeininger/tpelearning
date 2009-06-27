package klausur2006;

class Bier extends Getraenk{
	private boolean bierGroesse;
	
	Bier(boolean bierGroesse){
		this.bierGroesse = bierGroesse;
	}
	
	int preis(){
		if(bierGroesse){
			return 300;
		}else{
			return 180;
		}
	}
	
	double menge(){
		if(bierGroesse){
			return 0.5d;
		}else{
			return 0.33d;
		}
	}
}
