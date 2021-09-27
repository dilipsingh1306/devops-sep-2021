package org.tektutor;

public class Backend {
	public String getModuleName() {
		return "Backend Module";
	}

	public void execute() {
		System.out.println ( "Inside " + getModuleName() + " ..." );
		System.out.println ("Accessing Data from DB ..." );
	}

		
}
