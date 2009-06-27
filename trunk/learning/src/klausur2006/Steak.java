package klausur2006;

class Steak extends Essen{
	private int gramm;
	private int preisProGramm;
	
	Steak(int gramm, int preisProGramm){
		this.gramm = gramm;
		this.preisProGramm = preisProGramm;
	}
	
	int preis(){
		return gramm * preisProGramm;
	}
}
