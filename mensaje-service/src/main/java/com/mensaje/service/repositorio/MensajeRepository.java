package com.mensaje.service.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mensaje.service.entidades.Mensaje;

public interface MensajeRepository extends JpaRepository<Mensaje, Integer>{
    
}
