package com.controllers;

import com.models.BakeryEntity;
import com.services.BakeryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class BakeryController {
    @Autowired
    private BakeryService bakeryService;

    @PostMapping("/bake")
    public ResponseEntity createBake(@RequestBody BakeryEntity bake) {
        return new ResponseEntity(bakeryService.saveBake(bake), HttpStatus.OK);
    }

    @GetMapping("/bake/all")
    public ResponseEntity getAllBake() {
        return new ResponseEntity(bakeryService.getAllBake(), HttpStatus.OK);
    }

    @GetMapping("/bake/max")
    public ResponseEntity getMaxPriceBake() {
        return new ResponseEntity(bakeryService.getMaxPriceBake(), HttpStatus.OK);
    }

    @GetMapping("/bake/expired")
    public ResponseEntity getExpiredBake() {
        return new ResponseEntity(bakeryService.getExpiredBake(), HttpStatus.OK);
    }

}
