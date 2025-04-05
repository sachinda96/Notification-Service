package com.notification_service.service.impl;

import com.notification_service.dto.BusinessDto;
import com.notification_service.entity.BusinessEntity;
import com.notification_service.repository.BusinessRepository;
import com.notification_service.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private BusinessRepository businessRepository;

    @Override
    public String registerBusiness(BusinessDto businessDto) {
        BusinessEntity business = new BusinessEntity();
        business.setName(businessDto.getName());
        business.setEmail(businessDto.getEmail());
        business.setCreateAt(new Date());
        business.setModifiedAt(new Date());

        businessRepository.save(business);

        return "200";
    }

    @Override
    public String updateBusiness(BusinessDto businessDto) {

        Optional<BusinessEntity> businessEntity = businessRepository.findById(businessDto.getId());

        if(!businessEntity.isPresent()){

        }

        businessEntity.get().setName(businessDto.getName());
        businessEntity.get().setEmail(businessDto.getEmail());
        businessEntity.get().setModifiedAt(new Date());

        businessRepository.save(businessEntity.get());
        return "200";
    }


    @Override
    public String removeBusiness(UUID id) {
        Optional<BusinessEntity> businessEntity = businessRepository.findById(id);

        if(!businessEntity.isPresent()){

        }

        businessEntity.get().setStatus(false);
        businessEntity.get().setModifiedAt(new Date());
        businessRepository.save(businessEntity.get());
        return "200";
    }
}
