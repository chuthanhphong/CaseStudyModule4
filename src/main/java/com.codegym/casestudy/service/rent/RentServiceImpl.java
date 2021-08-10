package com.codegym.casestudy.service.rent;

import com.codegym.casestudy.model.rent.Rent;
import com.codegym.casestudy.repository.rent.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service
public class RentServiceImpl implements IRentService{
    @Autowired
    private RentRepository rentRepository;

    @Override
    public Iterable<Rent> findAll() {
        return rentRepository.findAll();
    }

    @Override
    public Optional<Rent> findById(Long id) {
        return rentRepository.findById(id);
    }

    @Override
    public Rent save(Rent rent) {
        rent.setCreateDate(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyy")));
        return rentRepository.save(rent);
    }

    @Override
    public void delete(Long id) {
        rentRepository.deleteById(id);
    }

    @Override
    public Iterable<Rent> findAllByUserId(long id) {
        return rentRepository.findAllByUserId(id);
    }
}
