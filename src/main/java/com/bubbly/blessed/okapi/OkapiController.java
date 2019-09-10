package com.bubbly.blessed.okapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OkapiController {
    @Autowired
    DataService ds;

    @PostMapping(path = "/okapis")
    public ResponseEntity<Okapi> create(@RequestBody Okapi okapi) {
        return new ResponseEntity<>(ds.addToList(okapi), HttpStatus.CREATED);
    }

    @GetMapping(path = "/okapis/{id}")
    public ResponseEntity<Okapi> read(@PathVariable Integer id) {
        Okapi o = ds.retrieveFromList(id);
        return new ResponseEntity<>(o, HttpStatus.OK);
    }

    public void update() {

    }

    public void destroy() {

    }


}
