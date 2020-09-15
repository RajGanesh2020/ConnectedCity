package org.raj.entity;

/** Entity for from and Destination cities
 * 
 * @author Raj Ganesh
 *
 */
public class Connection {

	private String from;

	private String destination;
	
	public Connection(String from, String destination) {
		this.from = from;
		this.destination = destination;
	}
	
	public String getFrom() {
		return from;
	}

	public String getDestination() {
		return destination;
	}
	
}
