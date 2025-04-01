package com.notification_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "notifications")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "business_id", nullable = false)
    private BusinessEntity business;

    @ManyToOne
    @JoinColumn(name = "template_id", nullable = true)
    private NotificationTemplateEntity template;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String message;

    @Enumerated(EnumType.STRING)
    @Column(name = "notif_status",nullable = false)
    private NotificationStatus notification_status;

    @Column(nullable = false)
    private String createdAt;

    private Date modifiedAt;

    @Column(nullable = false)
    private boolean status = true;
}

enum NotificationStatus {
    PENDING, SENT, FAILED
}
