package com.notification_service.dto;



import lombok.*;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BusinessDto {

    private UUID id;

    private String name;

    private String email;

    private Date createAt;

    private Date modifiedAt;

    private boolean status;
}
