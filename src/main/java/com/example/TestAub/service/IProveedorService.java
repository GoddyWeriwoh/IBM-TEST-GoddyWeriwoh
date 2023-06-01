package com.example.TestAub.service;

import com.example.TestAub.model.dto.ProveedorDTO;
import org.springframework.http.ResponseEntity;

import java.math.BigInteger;
import java.util.List;

public interface IProveedorService {

    ResponseEntity<List<ProveedorDTO>> getListProveedorById(BigInteger id);
}
