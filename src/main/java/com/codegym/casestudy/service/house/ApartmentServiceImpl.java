package com.codegym.casestudy.service.house;

import com.codegym.casestudy.model.apartment.Apartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApartmentServiceImpl implements IApartment{
    @Autowired
    private IApartment apartmentService;

    @Override
    public Iterable<Apartment> findAll() {
        return apartmentService.findAll();
    }

    @Override
    public Optional<Apartment> findById(Long id) {
        return apartmentService.findById(id);
    }

    @Override
    public Apartment save(Apartment apartment) {
        return apartmentService.save(apartment);
    }

    @Override
    public void delete(Long id) {
        apartmentService.delete(id);
    }

    @Override
    public Page<Apartment> findAll(Pageable pageable) {
        return apartmentService.findAll(pageable);
    }

    @Override
    public Iterable<Apartment> findAllByQuantityRoom(int room) {
        return apartmentService.findAllByQuantityRoom(room);
    }

    @Override
    public Iterable<Apartment> findAllByFloorIs(int floor) {
        return apartmentService.findAllByFloorIs(floor);
    }
}
