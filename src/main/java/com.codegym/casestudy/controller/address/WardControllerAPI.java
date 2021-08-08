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
@RequestMapping("/api")
@CrossOrigin("*")
public class WardControllerAPI {
    @Autowired
    private IWardService wardService;
    @Autowired
    private DistrictServiceImpl districtService;

    @GetMapping("/{id}/wards")
    public ResponseEntity<Iterable<Ward>> findAllByDistrictName(@PathVariable long id) {
        for(District district: districtService.findAll()) {
            if (district.getId() == id ) {
                Iterable<Ward> wards = wardService.findAllByDistrictId(district.getId());
                return new ResponseEntity<>(wards, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("/wards")
    public ResponseEntity<Void> create (@RequestBody Ward ward) {
        wardService.save(ward);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping("/wards")
    public ResponseEntity<Iterable<Ward>> findAll() {
        Iterable<Ward> wards = wardService.findAll();
        return new ResponseEntity<>(wards,HttpStatus.OK);
    }
}
