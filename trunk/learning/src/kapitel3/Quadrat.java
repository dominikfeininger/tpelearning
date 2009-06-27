package kapitel3;

class Quadrat extends FigurMitFläche {
	
	float l;
	
	Quadrat(float x, float y, float l){
		super(x,y);
		this.l = l;
	}
	
	float berechneFlaeche(){
		return 0f;
	}
	
	void verdoppleFlaeche(){
		l = l * 2;
	}
}
