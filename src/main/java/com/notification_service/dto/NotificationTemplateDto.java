package com.notification_service.dto;

import lombok.*;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationTemplateDto {

    private UUID id;

    private UUID businessID;

    private String name;

    private String title;

    private String platformType;

    private String message;

    private String createdAt;

    private Date modifiedAt;

    private boolean status = true;
}
