package com.example.TestAub.service;
import com.example.TestAub.model.dto.ProveedorDTO;
import com.example.TestAub.repository.IProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.http.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class ProveedorService implements IProveedorService {
    @Autowired
    IProveedorRepository iProveedorRepository;

    @Override
    public ResponseEntity<List<ProveedorDTO>> getListProveedorById(BigInteger id) {
        Optional<List<ProveedorDTO>> proveedorsList = iProveedorRepository.findAllByCustId(id);

        if(proveedorsList.isEmpty()){
            return new ResponseEntity<List<ProveedorDTO>>(HttpStatus.OK);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=utf-8");
        List<ProveedorDTO> proveedorDTO1 = proveedorsList.get();
        return new ResponseEntity<List<ProveedorDTO>>(proveedorDTO1, headers, HttpStatus.OK);
    }
}
