package com.notification_service.service.impl;

import com.notification_service.dto.UserDto;
import com.notification_service.entity.ChannelType;
import com.notification_service.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String addUser(UserDto userDto) {
        return null;
    }

    @Override
    public String addUserBulk(List<UserDto> userDtos) {
        return null;
    }

    @Override
    public String updateUser(UserDto userDto) {
        return null;
    }

    @Override
    public String removeUser(UUID id) {
        return null;
    }
}
