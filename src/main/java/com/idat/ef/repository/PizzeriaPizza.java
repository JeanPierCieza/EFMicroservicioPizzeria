package com.idat.ef.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzeriaPizza extends JpaRepository<PizzeriaPizza, Integer>{

}
