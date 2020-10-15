package ningyuan.pan.spring.boot.servicey.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ningyuan.pan.spring.boot.servicey.YService;

/**
 * @author ningyuan
 *
 */
@Service(value="yserviceimpl")
@Scope(value="singleton")
public class YServiceImpl implements YService {

	@Override
	public String getName() {
		return "ServiceY";
	}

}
