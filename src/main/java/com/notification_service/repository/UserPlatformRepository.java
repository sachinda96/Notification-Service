package com.notification_service.repository;


import com.notification_service.entity.UserEntity;
import com.notification_service.entity.UserPlatform;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserPlatformRepository extends JpaRepository<UserPlatform, UUID> {


    List<UserPlatform> findAllByUserEntity(UserEntity userEntity);
}
