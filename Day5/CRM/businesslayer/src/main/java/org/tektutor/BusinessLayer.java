package org.tektutor;

public class BusinessLayer {
	public String getModuleName() {
		return "BusinessLayer Module";
	}

	public void execute() {
		System.out.println ("Inside " + getModuleName() + " ...");

		Backend be = new Backend();
		be.execute();
	}
}
