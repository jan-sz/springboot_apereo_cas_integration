package pl.js.springboot.cas.integration.client.filter;

import pl.js.springboot.cas.integration.client.util.Constants;
import org.jasig.cas.client.Protocol;
import org.jasig.cas.client.validation.Cas10TicketValidator;
import org.jasig.cas.client.validation.TicketValidator;

public class CasAbstractTicketValidationFilter extends org.jasig.cas.client.validation.AbstractTicketValidationFilter {
 
	private Cas10TicketValidator tickerValidator;
	
	public CasAbstractTicketValidationFilter() {
		super(Protocol.CAS1); 
  	}
  
	@Override
	public void init() { 
		tickerValidator = new Cas10TicketValidator(Constants.casServerUrlPrefix);
		super.setService(Constants.casService);
		super.setTicketValidator( tickerValidator);
		super.init();
	}
}
