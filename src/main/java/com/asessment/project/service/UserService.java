package com.asessment.project.service;

import com.asessment.project.dto.UserDto;
import com.asessment.project.model.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);
}