package pl.js.springboot.cas.integration.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.js.springboot.cas.integration.client.util.UtilClass;

@RestController
public class HelloWorldPage {
		private final Logger logger = LoggerFactory.getLogger(HelloWorldPage.class);
 
    @RequestMapping("/secured/helloWorldPage")
    String home() {
		logger.info("Entering helloWorldPage");
        return "helloWorldPage " + UtilClass.getCurrentTimeString();
    }
}