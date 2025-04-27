package com.notification_service.repository;

import com.notification_service.entity.BusinessNotificationConfig;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BusinessNotificationConfigRepository extends JpaRepository<BusinessNotificationConfig, UUID> {
}
