package com.example.models;

import com.example.audits.InitiatorAudit;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vehicle")
public class Vehicle extends InitiatorAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "chassis_number")
    private String chassisNumber;

    @Column(name = "manufacturer_company")
    private String manufacturerCompany;

    @Column(name = "manufactured_year")
    private String manufacturedYear;

    @Column(name = "price")
    private double price;

    @Column(name = "model_name")
    private String modelName;

    @ManyToOne
    private Owner owner;
}
