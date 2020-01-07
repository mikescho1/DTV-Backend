package com.zipcode.DTVApp.services.userDetails;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

    //AutoWire a user repository


    //check login controller request  with user repository
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try{
//            com.finance.zipBank.Models.User user = userRepo.findByUsername(username);
//            return new User(user.getUsername(), user.getPassword(), new ArrayList<>());
        }catch(UsernameNotFoundException e){
            throw new UsernameNotFoundException("Username or password does not exist", e);
        }
        //change this return to actual return in try block
        return null;
    }
}