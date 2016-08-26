package com.now.hellologger.controller;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Crayton on 8/22/16.
 */
@RestController
@RequestMapping("/hello")
public class LoggerController {

    private static final Logger log = Logger.getLogger(LoggerController.class.getName());
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> hello(){
        log.info("hello logger");
        return new ResponseEntity<String>("hello deploy change", HttpStatus.OK);
    }

}
