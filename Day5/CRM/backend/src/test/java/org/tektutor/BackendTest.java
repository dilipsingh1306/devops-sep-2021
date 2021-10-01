package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

public class BackendTest {

	@Test
	public void testCase() {
		Backend be = new Backend();

		String actualResponse = be.getModuleName();
		String expectedResponse = "Backend Module";

		assertEquals ( expectedResponse, actualResponse );
	}

}
