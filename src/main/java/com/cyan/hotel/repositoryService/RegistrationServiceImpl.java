package com.cyan.hotel.repositoryService;

import com.cyan.hotel.model.User;
import com.cyan.hotel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author: John Long
 * @create: 11-Nov-2019
 **/

@Component
public class RegistrationServiceImpl implements RegistrationService{
    @Autowired
    UserRepository userRepository;

    private boolean registrationValid;

    public boolean validateRegistration(String firstName, String lastName, String username, String password, String emailAddress){

        if(userRepository.findByUsername(username) == null){
            registrationValid = true;
            User user = new User(firstName,lastName,username,password);
            userRepository.save(user);
        }else{
            registrationValid = false;
        }

        return registrationValid;
    }
}
