package klausur2006;

public class Parkhaus {
	int freiePlaetze;
	
	public Parkhaus(int plaetze){
		this.freiePlaetze = plaetze;
	}
	
	public synchronized void  passieren() throws InterruptedException{
		while(freiePlaetze == 0){
			wait();
		}
		if(freiePlaetze > 0) freiePlaetze--;
		System.out.println("Auto " + Thread.currentThread().getName() + " fährt ein!");
	}
	
	public synchronized void verlassen() throws InterruptedException{
		freiePlaetze++;
		System.out.println("Auto " + Thread.currentThread().getName() + " hat das Parkhaus verlassen");
		notifyAll();
		
	}
}
