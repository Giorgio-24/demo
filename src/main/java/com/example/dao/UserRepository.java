package com.example.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.User;

//^ESTENDE IL CRUDREPOSITORY ED EREDITA TUTTI I METODI CRUD,
//^QUESTA PARTICOLARE REPOSITORY DEFINISCE IL METODO DI LOGIN.
@Repository
@Transactional
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmailAndPassword(String email, String password);
}
