package org.tektutor;

public class Main {
	public String getModuleName() {
		return "Main Module";
	}

	public static void main ( String[] args ) {
		Main mainModule = new Main();
		System.out.println ( "Inside " + mainModule.getModuleName() + " ..." ); 

		Frontend fe = new Frontend();
		fe.execute();
	}
}
