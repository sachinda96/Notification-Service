package com.notification_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPlatform {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "platform_id", nullable = false)
    private PlatformEntity platform;

    @Column(nullable = false)
    private Date createdAt;

    private Date modifiedAt;

    @Column(nullable = false)
    private boolean status = true;

}
