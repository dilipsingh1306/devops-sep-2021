package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

	@Test
	public void testCase() {
		Main mainModule = new Main();

		String actualResponse = mainModule.getModuleName();
		String expectedResponse = "Main Module";

		assertEquals ( expectedResponse, actualResponse );
	}

}
