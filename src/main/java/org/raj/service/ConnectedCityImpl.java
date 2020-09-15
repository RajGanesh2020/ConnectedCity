package org.raj.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.raj.entity.Connection;
import org.springframework.stereotype.Service;

/** Service implementation with algorithm to check whether city1 and city2 
 * are connected or not
 * 
 * @author Raj Ganesh
 *
 */

@Service
public class ConnectedCityImpl implements ConnectedCity{

	private List<Connection> connections = LoadCity.connections;
	
	@Override
	public boolean isConnected(String city1, String city2) {
		
		System.out.println("check if s"+city1+" is Connected to "+city2);
		
		int loop = connections.size()/2;
		
		Set<String> connectedCities1 = new HashSet<>();
		Set<String> connectedCities2 = new HashSet<>();
		connectedCities1.add(city1);
		connectedCities2.add(city2);
		
		for(int i=0; i < loop; i++) {
			connectedCities1 = getConnectedTo(connectedCities1);
			if(connectedCities1.contains(city2)) {
				return true;
			}
			connectedCities2 = getConnectedTo(connectedCities2);
			
			if(hasCommonCity(connectedCities1, connectedCities2)) {
				return true;
			}else {
				continue;
			}
			
		}
		
		return false;
	}
	
	/** Class to create Set with list of cities that are connected with origin and destination  
	 * 
	 * @param cities
	 * @return set with connections from the input file city.txt
	 **/
	private Set<String> getConnectedTo(Set<String> cities) {
		Set<String> connectedTo = new HashSet<>();
		
		for(String city: cities) {
		
			for(Connection connection: connections) {
				if(connection.getFrom().equalsIgnoreCase(city)) {
					connectedTo.add(connection.getDestination());
				}else if(connection.getDestination().equalsIgnoreCase(city)) {
					connectedTo.add(connection.getFrom());
				}
			}
		}
		
		return connectedTo;
	}
	
	/** class to return true if the two list has the common city 
	 * @param list1 
	 * @param list2
	 * @return boolean true or false
	 */
		private boolean hasCommonCity(Set<String> list1, Set<String> list2) {
		for(String city: list1) {
			if(list2.contains(city)) {
				return true;
			}
		}
		return false;
	}
	
}
