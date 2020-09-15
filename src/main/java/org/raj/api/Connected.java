package org.raj.api;

import java.util.logging.Logger;

import org.raj.Application;
import org.raj.service.ConnectedCity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/** Controller
 * 
 * @author Raj Ganesh
 * 
 * Input : String : Origin & Destination
 * Output : Boolean : Returns true or false based on whether the Origin and Destination is connected or not
 *
 */
@RestController
@RequestMapping("/connected")
public class Connected {
	
final static Logger log = Logger.getLogger(Connected.class.getName());

@Autowired
private ConnectedCity connectedCity;
	
@GetMapping
 public @ResponseBody String isConnected(@RequestParam(required = false) String origin,@RequestParam(required = false) String destination) {
	
	log.info(connectedCity.toString());
	return ""+connectedCity.isConnected(origin, destination);
    }

	}

	
