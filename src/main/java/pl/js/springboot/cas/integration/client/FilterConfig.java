package pl.js.springboot.cas.integration.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.js.springboot.cas.integration.client.filter.CasAbstractTicketValidationFilter;
import pl.js.springboot.cas.integration.client.filter.CasAuthenticationFilter;

@Configuration
public class FilterConfig {
	
	private final Logger logger = LoggerFactory.getLogger(FilterConfig.class);

	@Bean
	@Autowired
    public FilterRegistrationBean CasAuthenticationFilsster() {
        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        
        logger.info("CasAuthenticationFilter registration");       
        
        registrationBean.setFilter(new CasAuthenticationFilter());
        registrationBean.addUrlPatterns("/*"); 
        registrationBean.setName("CAS Authentication Filter");
        registrationBean.setOrder(1);
        return registrationBean;
    }
	 
	@Bean
	@Autowired
    public FilterRegistrationBean CasTicketValidationFilter() {
        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        
         logger.info("CasAbstractTicketValidationFilter registration");       
        
        registrationBean.setFilter(new CasAbstractTicketValidationFilter());
        registrationBean.addUrlPatterns("/*"); 
        registrationBean.setName("CAS Validation Filter");
        registrationBean.setOrder(1);
        return registrationBean;
    }
	
}