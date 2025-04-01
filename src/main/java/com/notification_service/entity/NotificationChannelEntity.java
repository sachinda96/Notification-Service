package com.notification_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "notification_channels")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationChannelEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private ChannelType name;

    @Column(nullable = false)
    private String createdAt;

    private Date modifiedAt;

    @Column(nullable = false)
    private boolean status = true;
}

enum ChannelType {
    APNS, FCM, SMS, EMAIL
}

