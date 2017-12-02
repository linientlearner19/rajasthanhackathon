package ourprojecthackathon;

import java.util.Timer;


public class demotimer {
	public static void main(String args[]) throws InterruptedException {

		Timer time = new Timer(); 
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("Execution in Main" + i);
			Thread.sleep(2000);
			if (i == 5) {
				System.out.println("Application Terminates");
				System.exit(0);
			}
		}
	}
}


