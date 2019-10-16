package com.secondhandbook.org.secondhandbook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController
{
    @RequestMapping(value = {"/","/secondhandbook"})
    public ResponseEntity<String> home()
    {
        return new ResponseEntity<>("welcome to second hand book App!", HttpStatus.OK);
    }
}
