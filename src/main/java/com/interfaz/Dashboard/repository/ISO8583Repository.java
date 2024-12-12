package com.interfaz.Dashboard.repository;

import com.interfaz.Dashboard.model.ISO8583;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISO8583Repository extends JpaRepository<ISO8583, String> {
    // Métodos adicionales si necesitas consultas personalizadas
}
