package com.codegym.casestudy.service.house;

import com.codegym.casestudy.model.apartment.Apartment;
import com.codegym.casestudy.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IApartment extends IGeneralService<Apartment> {
    Page<Apartment>findAll(Pageable pageable);
    Iterable<Apartment> findAllByQuantityRoom(int room);
    Iterable<Apartment> findAllByFloorIs(int floor);
}
