package com.example.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Clinic;

@Repository
@Transactional
public interface ClinicRepository extends CrudRepository<Clinic, Long> {
    Optional<Clinic> findById(Long id);
}
