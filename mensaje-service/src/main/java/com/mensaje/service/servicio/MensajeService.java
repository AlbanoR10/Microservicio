package com.mensaje.service.servicio;

import com.mensaje.service.entidades.Mensaje;
import com.mensaje.service.repositorio.MensajeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensajeService {

    @Autowired
    MensajeRepository mensajeRepository;
    
    public List<Mensaje> getAll() {
        return mensajeRepository.findAll();
    }
    
    public Mensaje getMensajeById(int d){
        return mensajeRepository.findById(d).orElse(null);
    }
    
    public Mensaje save(Mensaje mensaje){
        Mensaje nuevoMensaje = mensajeRepository.save(mensaje);
        return nuevoMensaje;
    }
}
