package com.expreiment.springbootexperiment01.repository;

import com.expreiment.springbootexperiment01.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository

public class UserRepository {
    @PersistenceContext
    private EntityManager em;

    public void addUserAddress(){
        User user = new User("LIN");

    }

}
