package com.quixindo.service.impl;

import com.quixindo.domain.model.Users;
import com.quixindo.domain.repository.UserRepository;
import com.quixindo.dto.UserDto;
import com.quixindo.exceptions.UserNotFoundExcetion;
import com.quixindo.service.IUserServiceController;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements IUserServiceController {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public Users findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Users create(Users user) {
        if (user.getId() != null && userRepository.existsById(user.getId()))
            throw new IllegalArgumentException("This user ID alredy exists");
        return userRepository.save(user);
    }
}
