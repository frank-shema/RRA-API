package com.example.repositories;

import com.example.models.VehicleHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IPlateNumberRepository extends JpaRepository<VehicleHistory, UUID> {
}
