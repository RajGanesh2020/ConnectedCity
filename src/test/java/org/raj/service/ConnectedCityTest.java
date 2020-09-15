package org.raj.service;


import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

/** Test class to test the service
 * 
 * @author Raj Ganesh
 *  *
 */
public class ConnectedCityTest {

	private ConnectedCity connectedCity = new ConnectedCityImpl();
	
	/**
	 * Beforeclass to load the test data from city.txt file
	 * @throws IOException
	 */
	@BeforeClass
	public static void loadData() throws IOException {
		LoadCity.readData();
	}
	
	/**
	 * Test to test whether city1 Boston is connected to city2 New York
	 */
	@Test
	public void testConnected() {
		boolean result = connectedCity.isConnected("Boston", "New York");
		assertEquals(true, result);
	}
	
	/** 
	 * Test to test whether city1 Philadelphia is connected to city2 Albany
	 */
	
	@Test
	public void testNotConnected() {
		boolean result = connectedCity.isConnected("Philadelphia", "Albany");
		assertEquals(false, result);
	}

}
