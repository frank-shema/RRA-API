package com.example.models;

import com.example.audits.InitiatorAudit;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "system_user")
public class User extends InitiatorAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "names")
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "national_id", unique = true)
    private String nationalId;

    @Column(name = "password")
    private String password;

    @OneToOne
    private Role role;
}
