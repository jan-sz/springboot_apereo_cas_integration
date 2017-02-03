package pl.js.springboot.cas.integration.client.filter;

import pl.js.springboot.cas.integration.client.util.Constants;

public class CasAuthenticationFilter extends org.jasig.cas.client.authentication.AuthenticationFilter {

	public CasAuthenticationFilter() {
		super();
	} 
	
	@Override
	public void init() {
 		super.setService(Constants.casService);
		super.setCasServerLoginUrl(Constants.casServerLoginUrl);
		super.init();
	}  
}