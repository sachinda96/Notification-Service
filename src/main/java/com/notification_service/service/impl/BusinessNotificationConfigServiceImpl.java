package com.notification_service.service.impl;

import com.notification_service.dto.BusinessNotificationConfigDto;
import com.notification_service.entity.BusinessEntity;
import com.notification_service.entity.BusinessNotificationConfig;
import com.notification_service.entity.NotificationChannelEntity;
import com.notification_service.repository.BusinessNotificationConfigRepository;
import com.notification_service.repository.BusinessRepository;
import com.notification_service.repository.NotificationChannelRepository;
import com.notification_service.service.BusinessNotificationConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BusinessNotificationConfigServiceImpl implements BusinessNotificationConfigService {

   @Autowired
   private BusinessRepository businessRepository;

   @Autowired
   private NotificationChannelRepository notificationChannelRepository;

   private BusinessNotificationConfigRepository businessNotificationConfigRepository;

    @Override
    public String configBusinessNotification(BusinessNotificationConfigDto businessNotificationConfigDto) {

        if(businessNotificationConfigDto.getBusinessId().isEmpty()){
            return null;
        }

        Optional<BusinessEntity> businessEntity = businessRepository.findById(UUID.fromString(businessNotificationConfigDto.getBusinessId()));

        if(!businessEntity.isPresent()){
            return null;
        }

        List<NotificationChannelEntity> notificationChannelEntityList = notificationChannelRepository.findAllByName(businessNotificationConfigDto.getChannelTypes());

        List<BusinessNotificationConfig> businessNotificationConfigs = new ArrayList<>();

        for (NotificationChannelEntity notificationChannelEntity: notificationChannelEntityList){
            BusinessNotificationConfig notificationConfig = new BusinessNotificationConfig();
            notificationConfig.setId(UUID.randomUUID());
            notificationConfig.setBusiness(businessEntity.get());
            notificationConfig.setChannel(notificationChannelEntity);
            notificationConfig.setStatus(true);
            //notificationConfig.setApiKey();
            notificationConfig.setChannel(notificationChannelEntity);
            notificationConfig.setCreatedAt(new Date());
            businessNotificationConfigs.add(notificationConfig);
        }

        businessNotificationConfigRepository.saveAll(businessNotificationConfigs);


        return "";
    }

    @Override
    public String updateConfigBusinessNotification(BusinessNotificationConfigDto businessNotificationConfigDto) {

        if(businessNotificationConfigDto.getBusinessId().isEmpty()){
            return null;
        }

        Optional<BusinessEntity> businessEntity = businessRepository.findById(UUID.fromString(businessNotificationConfigDto.getBusinessId()));

        if(!businessEntity.isPresent()){
            return null;
        }




        return "";
    }
}
