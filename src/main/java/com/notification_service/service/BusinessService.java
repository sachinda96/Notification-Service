package com.notification_service.service;

import com.notification_service.dto.BusinessDto;

import java.util.UUID;

public interface BusinessService {

    public String registerBusiness(BusinessDto businessDto);

    public String updateBusiness(BusinessDto businessDto);

    public String removeBusiness(UUID id);

}
