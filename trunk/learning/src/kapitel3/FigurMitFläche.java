package kapitel3;

abstract class FigurMitFl�che extends GeometrischeFigur {
	abstract float berechneFlaeche();
	abstract void verdoppleFlaeche();
	
	FigurMitFl�che(float x, float y) {
		super(x,y);
	}
}
