package ningyuan.pan.spring.boot.servicey.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ningyuan
 *
 */
@Configuration
@ComponentScan({"ningyuan.pan.spring.boot.servicey.web.controller"})
public class WebConfig implements WebMvcConfigurer{
	
	
}
