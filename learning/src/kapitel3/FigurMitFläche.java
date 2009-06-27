package kapitel3;

abstract class FigurMitFläche extends GeometrischeFigur {
	abstract float berechneFlaeche();
	abstract void verdoppleFlaeche();
	
	FigurMitFläche(float x, float y) {
		super(x,y);
	}
}
