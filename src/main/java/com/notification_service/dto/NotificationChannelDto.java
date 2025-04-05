package com.notification_service.dto;


import lombok.*;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationChannelDto {


    private UUID id;

    private String name;

    private String createdAt;

    private Date modifiedAt;

    private boolean status;
}
