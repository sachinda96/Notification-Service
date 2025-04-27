package com.notification_service.service;

import com.notification_service.dto.BusinessNotificationConfigDto;

public interface BusinessNotificationConfigService {

    public String configBusinessNotification(BusinessNotificationConfigDto businessNotificationConfigDto);

    public String updateConfigBusinessNotification(BusinessNotificationConfigDto businessNotificationConfigDto);


}