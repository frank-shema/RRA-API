package com.example.repositories;

import com.example.models.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IOwnerRepository extends JpaRepository<Owner, UUID> {
}
