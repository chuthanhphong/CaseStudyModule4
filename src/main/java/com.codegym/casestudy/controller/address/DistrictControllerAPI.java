package com.codegym.casestudy.controller.address;

import com.codegym.casestudy.model.address.District;
import com.codegym.casestudy.service.address.DistrictServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/districts")
@CrossOrigin("*")
public class DistrictControllerAPI {
    @Autowired
    private DistrictServiceImpl districtService;

    @GetMapping("")
    public ResponseEntity<Iterable<District>> findAll() {
        Iterable<District> districts = districtService.findAll();
        return new ResponseEntity<>(districts, HttpStatus.OK);
    }
}
