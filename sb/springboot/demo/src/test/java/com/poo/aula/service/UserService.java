package com.poo.aula.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.aula.model.User;
import com.poo.aula.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public void insertUser(User user){
        userRepository.save(user);
    }

    public void deleteUser(User user){
        userRepository.delete(user);
    }

    public boolean deleteUserById(Long id){
        Optional<User> opUser = userRepository.findById(id);
        if(opUser.isEmpty()){
            return false;
        }
        User user = opUser.get();
        userRepository.delete(user);
        return true;

    //     if(opUser.isPresent()){
    //         userRepository.delete(opUser.get())
    //         return true;
    //     }
    //     return false;
    // }
    }
    public boolean updateNameById(Long id, String newName){
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isEmpty()){
            return false;
        }
        User user = userOptional.get();
        user.setName(newName);
        userRepository.save(user);

        return true;
    }

    public User getUserById(Long id){
        Optional<User> opUser = userRepository.findById(id);
        if(userOptional.isPresent()){
            return userOptional.get();
        }
    }
    public List<User> getAllUsers(){
        for(int i = 0; i )
    }
}
