package com.example.TestAub.model.dto;
import java.time.LocalDate;

import jakarta.persistence.*;
import java.math.BigInteger;

@Table(name = "proveedor")
@Entity()
public class ProveedorDTO {
    @Id
    @GeneratedValue()
    @Column(name = "id_proveedor")
    private BigInteger id;

    @Column(name = "name")
    private String name;

    @Column(name = "fecha_alta")
    private LocalDate fechaAlta;

    @Column(name = "id_cliente")
    private BigInteger idClient;

    public ProveedorDTO(BigInteger i, String s, BigInteger i1) {
        id = i;
        name = s;
        fechaAlta = LocalDate.now();
        idClient = i1;
    }

    public ProveedorDTO() {
    }


    public BigInteger getIdClient() {
        return idClient;
    }

    public BigInteger getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

}
