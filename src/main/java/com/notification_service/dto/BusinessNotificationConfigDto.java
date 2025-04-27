package com.notification_service.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BusinessNotificationConfigDto {

    private String businessId;

    private String businessNotificationId;

    private List<String> channelTypes;



}
