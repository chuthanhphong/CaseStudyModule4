package com.codegym.casestudy.service.address;

import com.codegym.casestudy.model.address.Ward;
import com.codegym.casestudy.repository.address.WardRepository;
import com.codegym.casestudy.service.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WardServiceImpl implements IWardService {


    @Override
    public Iterable<Ward> findAll() {
        return null;
    }

    @Override
    public Optional<Ward> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Ward save(Ward ward) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Iterable<Ward> findAllByDistrict(String name) {
        return null;
    }
}
