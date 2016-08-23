package com.now.hellologger.controller;

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

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> hello(){
        return new ResponseEntity<String>("hello", HttpStatus.OK);
    }

}
