package org.sms.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class HelloWorld {

    private static final Logger logger = Logger.getLogger(HelloWorld.class);

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "This is fucking start.......");
        logger.isDebugEnabled();
        logger.debug("Testing");
        logger.info("Testing");
        logger.error("Testing");
        return "hello";
    }
}