package com.quixindo.service;

import com.quixindo.domain.model.Users;
import com.quixindo.dto.UserDto;

public interface IUserServiceController {
    public Users findById(Long id);

    public Users create(Users user);
}
