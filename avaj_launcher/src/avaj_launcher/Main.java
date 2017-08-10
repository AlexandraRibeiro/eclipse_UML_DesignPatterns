package avaj_launcher;

import java.io.IOException;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) throws IOException {
		
		JFrame frame = new swing1();
		
		try {
			Leader lead = new Leader();
			lead.reader(args);
		}
		catch (MyExceptions e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
