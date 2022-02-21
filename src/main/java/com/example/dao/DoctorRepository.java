package com.example.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Doctor;

@Repository
@Transactional
public interface DoctorRepository extends CrudRepository<Doctor, Long> {
    Optional<Doctor> findById(Long id);
}
