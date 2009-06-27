package kapitel2;

/**
 * Erst werden alle Objekte erzeugt und initialisiert, danach erst wird der
 * Konstruktor aufgerufen
 * 
 * 
 */

public class Card {

	Tag t1 = new Tag(1);

	Card() {
		System.out.println("Card() ");
		t3 = new Tag(33);
	}

	Tag t2 = new Tag(2);

	void f() {
		System.out.println("f()");
	}

	Tag t3 = new Tag(3);

	public static void main(String[] args) {
		Card t = new Card();
		t.f();
	}
}
