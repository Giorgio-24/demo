package com.example.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Specialty;

@Repository
@Transactional
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
    Optional<Specialty> findById(Long id);

}
