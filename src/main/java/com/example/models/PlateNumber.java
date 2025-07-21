package com.example.models;

import com.example.audits.InitiatorAudit;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "plate_number")
public class PlateNumber extends InitiatorAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "plate_number")
    private String plateNumber;

    @Column(name = "issued_date")
    private LocalDate issuedDate;

    @ManyToOne
    private Owner owner;
}
