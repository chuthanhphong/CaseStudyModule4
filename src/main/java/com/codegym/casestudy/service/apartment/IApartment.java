package com.codegym.casestudy.service.apartment;

import com.codegym.casestudy.model.apartment.Apartment;
import com.codegym.casestudy.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IApartment extends IGeneralService<Apartment> {
    Page<Apartment> findAll(Pageable pageable);

    Iterable<Apartment> findAllByQuantityRoom(int room);

    Iterable<Apartment> findAllByFloorIs(int floor);

    Iterable<Apartment> findAllByDistrict(String district);

    Iterable<Apartment> findAllByAddress(String address);

    Iterable<Apartment> findAllByWard(String ward);

    Iterable<Apartment> findAllByPrice(int low, int high);
}
