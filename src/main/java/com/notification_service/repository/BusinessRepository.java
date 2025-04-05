package com.notification_service.repository;

import com.notification_service.entity.BusinessEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BusinessRepository extends JpaRepository<BusinessEntity, UUID> {

}
