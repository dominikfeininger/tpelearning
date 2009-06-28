package klausur2006;

import java.util.*;

public class Auto extends Thread{
	
	private String name;
	private Parkhaus parkhaus;
	
	public Auto(String name, Parkhaus parkhaus){
		this.name = name;
		this.parkhaus = parkhaus;
		start();
	}
	
	public void run(){
		while(!isInterrupted()){
			Random random = new Random();
			try{
				int grenze = random.nextInt(5000);
				parkhaus.passieren();
				sleep(grenze);
				parkhaus.verlassen();
				sleep(grenze);
			}catch(InterruptedException e){
				interrupt();
			}
		}
	}
	
}
