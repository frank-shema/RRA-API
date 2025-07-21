package com.example.models;

import com.example.audits.InitiatorAudit;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "vehicle_owner")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Owner extends InitiatorAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "owner_names")
    private String ownerName;

    @Column(name = "owner_national_id")
    private String OwnerNationalId;

    @Column(name = "owner_phone_number")
    private String ownerPhoneNumber;

    @Column(name = "owner_address")
    private String ownerAddress;

    @OneToMany
    private List<PlateNumber> plateNumbers;

    @OneToMany
    private List<Vehicle> vehicles;
}
