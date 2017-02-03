Spring Boot client integration with Apereo CAS 5.0.1 <br />
  <br />
(application.properties moved to folder config) <br />
  <br />
All that is needed for this client to work are: <br /> 
-SSL certificate to work in HTTPS mode <br />
-Altering these 3 URLs in Constants class <br />
 	public final static String casServerLoginUrl = "https://xxxxxxx:xxxx/cas/login"; <br />
	public final static String casService = "https://xxxxxxx:xxxx/casClient/secured/loggedPage"; <br />
	public final static String casServerUrlPrefix = "https://xxxxxxx:xxxx/cas/"; <br />
 <br />
 <br />
 <br />
# Credit Jan Szczygie³ #