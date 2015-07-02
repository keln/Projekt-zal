package main;

import okno.okno;
import view.*;

public class Main {

	public static void main(String[] args) {
		Ver term;
		
		if (args.length == 1 && args[0].equals("-version")) 
			term = new Ver();
		else
			term = new okno();

		term.launch();

	}

}
