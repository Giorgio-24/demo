package com.example.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Appointment;

@Repository
@Transactional
public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
    Optional<Appointment> findById(Long id);
}
