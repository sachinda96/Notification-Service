package com.notification_service.service.impl;

import com.notification_service.dto.UserDto;
import com.notification_service.entity.BusinessEntity;
import com.notification_service.entity.PlatformEntity;
import com.notification_service.entity.UserEntity;
import com.notification_service.entity.UserPlatform;
import com.notification_service.entity.enums.ChannelType;
import com.notification_service.entity.enums.Platform;
import com.notification_service.repository.BusinessRepository;
import com.notification_service.repository.PlatformRepository;
import com.notification_service.repository.UserPlatformRepository;
import com.notification_service.repository.UserRepository;
import com.notification_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BusinessRepository businessRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PlatformRepository platformRepository;

    @Autowired
    private UserPlatformRepository userPlatformRepository;
    @Override
    public String addUser(UserDto userDto) {

        Optional<BusinessEntity> businessEntity = businessRepository.findById(userDto.getBusinessId());

        if(!businessEntity.isPresent()){
            return null;
        }

        UserEntity userEntity = null;

        if(userDto.getId() == null){
            userEntity = new UserEntity();
            userEntity.setName(userDto.getName());
            userEntity.setEmail(userDto.getEmail());
            userEntity.setPhone(userDto.getPhone());
            userEntity.setDeviceToken(userDto.getDeviceToken());
            userEntity.setBusiness(businessEntity.get());
        }else{
            Optional<UserEntity> user = userRepository.findById(userDto.getId());
            if(user.isPresent()){
                userEntity = user.get();
            }else {
                //throw new Exception("failed");
            }
        }


        if(userDto.getPlatform().isEmpty()){
            return null;
        }

        List<PlatformEntity> platformEntityList = platformRepository.findAllByType(userDto.getPlatform());

        List<UserPlatform> userPlatformList = new ArrayList<>();

        for (PlatformEntity platform:
             platformEntityList) {
            UserPlatform userPlatform = new UserPlatform();
            userPlatform.setPlatform(platform);
            userPlatform.setUser(userEntity);
            userPlatform.setCreatedAt(new Date());
            userPlatformList.add(userPlatform);
        }

        userRepository.save(userEntity);
        userPlatformRepository.saveAll(userPlatformList);


        return null;
    }

    @Override
    public String addUserBulk(List<UserDto> userDtos) {
        return null;
    }

    @Override
    public String updateUser(UserDto userDto) {

        if(userDto.getId() == null){

        }

        Optional<UserEntity> userEntity = userRepository.findById(userDto.getId());

        if(!userEntity.isPresent()){

        }

       List<UserPlatform> userPlatformList =  userPlatformRepository.findAllByUserEntity(userEntity.get());

       userPlatformList.forEach(e -> e.setStatus(false));

       userPlatformRepository.saveAll(userPlatformList);

       addUser(userDto);

       return null;
    }

    @Override
    public String removeUser(UUID id) {
        return null;
    }
}
