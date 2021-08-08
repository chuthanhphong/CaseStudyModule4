package com.codegym.casestudy.repository.house;

import com.codegym.casestudy.model.apartment.ApartmentType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartmentTypeRepository extends PagingAndSortingRepository<ApartmentType, Long> {


}
