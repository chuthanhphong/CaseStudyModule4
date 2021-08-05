package com.codegym.casestudy.controller.address;

import com.codegym.casestudy.model.address.District;
import com.codegym.casestudy.model.address.Ward;
import com.codegym.casestudy.service.address.DistrictServiceImpl;
import com.codegym.casestudy.service.address.IWardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/wards")
@CrossOrigin("*")
public class WardControllerAPI {
    @Autowired
    private IWardService wardService;
    @Autowired
    private DistrictServiceImpl districtService;

    @GetMapping("/{name}/wards")
    public ResponseEntity<Iterable<Ward>> findAllByDistrictName(@PathVariable String name) {
        for(District district: districtService.findAll()) {
            if (district.getDicName().equals(name)) {
                Iterable<Ward> wards = wardService.findAllByDistrict(name);
                return new ResponseEntity<>(wards, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("")
    public ResponseEntity<Void> create (@RequestBody Ward ward) {
        wardService.save(ward);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping("")
    public ResponseEntity<Iterable<Ward>> findAll() {
        Iterable<Ward> wards = wardService.findAll();
        return new ResponseEntity<>(wards,HttpStatus.OK);
    }
}
