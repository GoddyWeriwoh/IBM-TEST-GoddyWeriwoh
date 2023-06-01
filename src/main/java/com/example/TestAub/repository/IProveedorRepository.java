package com.example.TestAub.repository;

import com.example.TestAub.model.dto.ProveedorDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public interface IProveedorRepository extends JpaRepository<ProveedorDTO, Long> {
    @Query("SELECT u FROM ProveedorDTO u WHERE u.idClient = ?1")
    Optional<List<ProveedorDTO>> findAllByCustId(BigInteger id);
}
