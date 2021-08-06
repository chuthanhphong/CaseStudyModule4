package com.codegym.casestudy.service.house;

import com.codegym.casestudy.model.apartment.Apartment;
import com.codegym.casestudy.repository.house.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApartmentServiceImpl implements IApartment{
    @Autowired
    private ApartmentRepository apartmentRepository;

    @Override
    public Iterable<Apartment> findAll() {
        return apartmentRepository.findAll();
    }

    @Override
    public Optional<Apartment> findById(Long id) {
        return apartmentRepository.findById(id);
    }

    @Override
    public Apartment save(Apartment apartment) {
        return apartmentRepository.save(apartment);
    }

    @Override
    public void delete(Long id) {
        apartmentRepository.deleteById(id);
    }

    @Override
    public Page<Apartment> findAll(Pageable pageable) {
        return apartmentRepository.findAll(pageable);
    }

    @Override
    public Iterable<Apartment> findAllByQuantityRoom(int room) {
        return apartmentRepository.findAllByQuantityRoom(room);
    }

    @Override
    public Iterable<Apartment> findAllByFloorIs(int floor) {
        return apartmentRepository.findAllByFloorIs(floor);
    }
}
