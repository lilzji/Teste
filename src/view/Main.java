package view;

import controller.TemposController;
import controller.ThreadTeste;
import model.Tempos;

public class Main {

	private static int n = 3;
	public static TemposController controller = new TemposController(n);
	
	public static void main(String[] args) {
		
		
		
		for(int id = 0; id < n; id++){
			Thread threadTeste = new ThreadTeste(id+1);
			threadTeste.start();
		}
		
		controller.start();
		
	}

}
