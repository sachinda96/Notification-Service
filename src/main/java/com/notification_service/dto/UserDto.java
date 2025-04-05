package com.notification_service.dto;


import java.util.Date;
import java.util.UUID;

public class UserDto {

    private UUID id;

    private UUID businessId;

    private String name;

    private String email;

    private String phone;

    private String deviceToken;

    private String platform;

    private String createdAt;

    private Date modifiedAt;

    private boolean status;
}
