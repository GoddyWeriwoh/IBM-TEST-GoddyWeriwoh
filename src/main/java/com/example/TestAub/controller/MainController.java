package com.example.TestAub.controller;

import com.example.TestAub.model.dto.ProveedorDTO;
import com.example.TestAub.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/proveedor")
public class MainController {
    @Autowired
    ProveedorService proveedorService;

    @GetMapping("/get-proveedors/{id}")
    @ResponseBody
    public ResponseEntity<List<ProveedorDTO>> getListProveedorById(@PathVariable("id") final BigInteger id){
        return proveedorService.getListProveedorById(id);
    }

}
