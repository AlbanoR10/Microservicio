package com.usuario.service.repositorio;

import com.usuario.service.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EARE_
 */

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
}
