package com.notification_service.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChannelType {

    private String type;

    private String apiKey;
}
