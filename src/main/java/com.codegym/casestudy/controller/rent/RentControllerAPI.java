package com.codegym.casestudy.controller.rent;

import com.codegym.casestudy.model.rent.Rent;
import com.codegym.casestudy.repository.user.IUserRepository;
import com.codegym.casestudy.service.rent.IRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class RentControllerAPI {
    @Autowired
    private IRentService rentService;

    @GetMapping("/rents")
    public ResponseEntity<Iterable<Rent>> findAll() {
        Iterable<Rent> rents = rentService.findAll();
        return new ResponseEntity<>(rents,HttpStatus.OK);
    }
    @GetMapping("/{userID}/rentList")
    public ResponseEntity<Iterable<Rent>> findAllByUserId(@PathVariable long userID) {
        Iterable<Rent> personalRents = rentService.findAllByUserId(userID);
        return new ResponseEntity<>(personalRents, HttpStatus.OK);
    }
    @PostMapping("/{userID}/rents")
    public ResponseEntity<Rent> save(@RequestBody Rent rent,@PathVariable long userID) {
        /// findUser
        rentService.save(rent);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping("/{userID}/rents/{rentId}")
    public ResponseEntity<Void> delete(@PathVariable long userID, @PathVariable long rentId) {
        //findUser
        rentService.delete(rentId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
