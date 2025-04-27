package com.notification_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "business_notification_configs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BusinessNotificationConfig {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "business_id", nullable = false)
    private BusinessEntity business;

    @ManyToOne
    @JoinColumn(name = "channel_id", nullable = false)
    private NotificationChannelEntity channel;

    @Column(nullable = false)
    private String apiKey;

    @Column(nullable = false)
    private Date createdAt;

    private Date modifiedAt;

    @Column(nullable = false)
    private boolean status = true;
}
