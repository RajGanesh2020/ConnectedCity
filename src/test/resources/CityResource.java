import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityResource {
	
	 @RequestMapping(value = "/connected", method = RequestMethod.GET, produces = { "application/Json", "" }, consumes = MediaType.ALL_VALUE )
	 @ResponseBody
	 public Boolean isConnected(@RequestParam(required = false) String from,@RequestParam(required = false) String destination) {
	    return false;
	    }

}
