package com.notification_service.dto;


import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private UUID id;

    private UUID businessId;

    private String name;

    private String email;

    private String phone;

    private String deviceToken;

    private List<String> platform;

    private String createdAt;

    private Date modifiedAt;

    private boolean status;
}
