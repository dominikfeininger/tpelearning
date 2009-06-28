package kapitel5;

import java.io.*;

public class printWriterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintWriter f;
		double sum = 0.0;
		int nenner;
		
		try{
			f = new PrintWriter(new BufferedWriter(new FileWriter("c:\\zwei.txt")));
			
			for(nenner = 1; nenner <= 1024; nenner *= 2){
				sum += 1.0 / nenner;
				f.print("Summand: 1/");
				f.print(nenner);
				f.print(" Summe: ");
				f.println(sum);
			}
			
			f.close();
		}catch (IOException e){
			System.out.println("Fehler beim Erstellen der Datei");
		}
	}

}
