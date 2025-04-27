package com.notification_service.repository;

import com.notification_service.entity.NotificationChannelEntity;
import com.notification_service.entity.enums.ChannelType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface NotificationChannelRepository extends JpaRepository<NotificationChannelEntity, UUID> {

    List<NotificationChannelEntity> findAllByName(List<String> channelTypes);
}
