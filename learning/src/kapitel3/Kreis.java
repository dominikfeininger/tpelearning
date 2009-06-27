package kapitel3;

class Kreis extends FigurMitFläche{
	float r;
	
	Kreis(float x, float y, float r){
		super(x,y);
		this.r = r;
	}
	
	float berechneFlaeche(){
		return 3.14f * r * r;
	}
	
	void verdoppleFlaeche(){
		r *= 2;
	}
}
