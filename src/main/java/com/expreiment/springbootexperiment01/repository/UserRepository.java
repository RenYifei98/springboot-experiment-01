package com.expreiment.springbootexperiment01.repository;

import com.expreiment.springbootexperiment01.entity.Address;
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
        em.persist(user);
        Address address1 = new Address("956");
        address1.setUser(user);
        em.persist(address1);

        Address address2 = new Address("925");
        address2.setUser(user);
        em.persist(address2);

    }

}
