package com.codegym.casestudy.controller.address;

import com.codegym.casestudy.model.address.District;
import com.codegym.casestudy.model.address.Ward;
import com.codegym.casestudy.service.address.DistrictServiceImpl;
import com.codegym.casestudy.service.address.IWardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class WardControllerAPI {
    @Autowired
    private IWardService wardService;
    @Autowired
    private DistrictServiceImpl districtService;

    @GetMapping("/wards/{id}")
    public ResponseEntity<Ward> findOneWard(@PathVariable long id) {
        Optional<Ward> ward = wardService.findById(id);
        return ward.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/wards")
    public ResponseEntity<Void> create(@RequestBody Ward ward) {
        wardService.save(ward);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/wards")
    public ResponseEntity<Iterable<Ward>> findAll() {
        Iterable<Ward> wards = wardService.findAll();
        return new ResponseEntity<>(wards, HttpStatus.OK);
    }
}
