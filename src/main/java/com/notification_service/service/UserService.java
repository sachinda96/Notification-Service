package com.notification_service.service;

import com.notification_service.dto.UserDto;

import java.util.List;
import java.util.UUID;

public interface UserService {

    public String addUser(UserDto userDto);

    public String addUserBulk(List<UserDto> userDtos);

    public String updateUser(UserDto userDto);

    public String removeUser(UUID id);
}
