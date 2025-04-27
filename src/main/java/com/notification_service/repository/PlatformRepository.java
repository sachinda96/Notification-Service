package com.notification_service.repository;

import com.notification_service.entity.PlatformEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PlatformRepository extends JpaRepository<PlatformEntity, UUID> {

    List<PlatformEntity> findAllByType(List<String> types);
}
