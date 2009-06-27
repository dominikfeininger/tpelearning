package kapitel3;

abstract class GeometrischeFigur {
	OffsetPunkt offsetPunkt;
	
	public GeometrischeFigur(float x, float y) {
		offsetPunkt = new OffsetPunkt(x,y);
	}
	
	void verschiebe(float dX, float dY){
		offsetPunkt.x += dX;
		offsetPunkt.y += dY;
	}
}
