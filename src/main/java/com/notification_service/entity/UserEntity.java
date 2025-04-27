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
public class UserEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "business_id", nullable = false)
    private BusinessEntity business;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(unique = true)
    private String phone;

    private String deviceToken;

    @Column(nullable = false)
    private Date createdAt;

    private Date modifiedAt;

    @Column(nullable = false)
    private boolean status = true;

}


