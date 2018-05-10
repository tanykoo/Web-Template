package com.tanykoo.mvc.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author ThinkPad
 * @Since
 */
@Controller
@RequestMapping("/user")
public class Login {
    Logger logger = LoggerFactory.getLogger(Login.class);
    @RequestMapping(value = "login",method = RequestMethod.GET)
    @ResponseBody
    public String login(){
        logger.info("login");
        return "index";
    }
}
