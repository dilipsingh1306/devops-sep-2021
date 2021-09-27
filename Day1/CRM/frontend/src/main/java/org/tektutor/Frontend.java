package org.tektutor;

public class Frontend {
	public String getModuleName() {
		return "Frontend Module";
	}

	public void execute() {
		System.out.println ( "Inside " + getModuleName() + " ..." );

		BusinessLayer bl = new BusinessLayer();
		bl.execute();
	}
}
