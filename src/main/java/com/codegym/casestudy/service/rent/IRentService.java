package com.codegym.casestudy.service.rent;


import com.codegym.casestudy.model.rent.Rent;
import com.codegym.casestudy.service.IGeneralService;

public interface IRentService  extends IGeneralService<Rent> {
    Iterable<Rent> findAllByUserId(long id);
}
