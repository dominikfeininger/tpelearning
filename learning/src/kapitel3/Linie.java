package kapitel3;

class Linie extends GeometrischeFigur{
	float x2, y2;
	
	Linie(float x, float y, float x2, float y2){
		super(x,y);
		this.x2 = x2;
		this.y2 = y2;
	}
}
