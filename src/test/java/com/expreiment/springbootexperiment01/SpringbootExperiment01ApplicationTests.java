package com.expreiment.springbootexperiment01;

import com.expreiment.springbootexperiment01.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback(value = false)
public class SpringbootExperiment01ApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void addAddressTest() {
        userRepository.addUserAddress();
    }

}
