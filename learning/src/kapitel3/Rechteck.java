package kapitel3;

class Rechteck extends FigurMitFläche {
	
	float laenge;
	float breite;
	
	Rechteck(float x, float y, float laenge, float breite){
		super(x,y);
		this.laenge = laenge;
		this.breite = breite;
	}
	
	float berechneFlaeche(){
		return laenge * breite;
	}
	
	void verdoppleFlaeche(){
	}

}
