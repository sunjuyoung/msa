package com.example.userservice.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 50)
    private String email;

    @Column(nullable = false,unique = true)
    private String userId;

    @Column(nullable = false)
    private String encryptedPassword;

    @Column(nullable = false,length = 50)
    private String name;
}
