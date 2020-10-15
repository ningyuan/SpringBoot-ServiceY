/**
 * 
 */
package ningyuan.pan.spring.boot.servicey.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ningyuan.pan.spring.boot.servicey.YService;

/**
 * @author ningyuan
 *
 */
@RestController
@RequestMapping(value={"/servicey"})
public class YServiceController {
	
	@Autowired
	@Qualifier(value="yserviceimpl")
	private YService yservice;
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping(value="/name")
	public String getName() {
		return yservice.getName() + " from port: "+port;
	}
}
