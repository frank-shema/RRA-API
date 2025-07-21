package com.example.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vehicle_history")
public class VehicleHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    private Vehicle vehicle;

    @ManyToOne
    private Owner owner;

    @ManyToOne
    private PlateNumber plateNumber;

    @Column(nullable = false)
    private LocalDate transferDate;

    @Column(nullable = false)
    private BigDecimal purchaseAmount;
}
