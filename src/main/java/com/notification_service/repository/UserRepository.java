package com.notification_service.repository;

import com.notification_service.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface UserRepository extends JpaRepository<UserEntity, UUID> {
}
