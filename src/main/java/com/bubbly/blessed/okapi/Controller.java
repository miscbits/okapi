package com.bubbly.blessed.okapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    DataService ds;

    @RequestMapping(method = RequestMethod.GET,
            path = "/cats")
    @ResponseBody
    public String some_function() {
        return "Hello";
    }

    @RequestMapping(method = RequestMethod.OPTIONS,
            path = "/dogs")
    public ResponseEntity<String> some_other_function() {
        return new ResponseEntity<>("World",
                HttpStatus.I_AM_A_TEAPOT);
    }

    @RequestMapping(path = "/add",
            method = RequestMethod.POST)
    @ResponseBody
    public Integer add(@RequestBody PartContainer pc) {
        return pc.getFirst_part() + pc.getSecond_part();
    }

    @RequestMapping(
            path = "/subtract/{first_part}/{second_part}",
            method = RequestMethod.GET)
    @ResponseBody
    public Integer subtract(
            @PathVariable Integer first_part,
            @PathVariable Integer second_part) {
        return first_part - second_part;
    }

    @RequestMapping(
            path = "/multiply",
            method = RequestMethod.GET)
    @ResponseBody
    public Integer multiply(
            @RequestParam Integer first_part,
            @RequestParam Integer second_part) {
        return first_part * second_part;
    }

}
