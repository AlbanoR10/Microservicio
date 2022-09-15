package com.mensaje.service.controlador;

import com.mensaje.service.entidades.Mensaje;
import com.mensaje.service.servicio.MensajeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensaje")
public class MensajeController {
    @Autowired
    private MensajeService mensajeService;
    
    @GetMapping("/{id}")
    public ResponseEntity<Mensaje> obtenerMensaje(@PathVariable("id") int id){
        Mensaje mensaje = mensajeService.getMensajeById(id);
        if(mensaje==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(mensaje);
    }
    
    @PostMapping
    public ResponseEntity<Mensaje> guardarMensaje(@RequestBody Mensaje mensaje){
        Mensaje nuevoMensaje = mensajeService.save(mensaje);
        if(mensaje==null){
            return ResponseEntity.unprocessableEntity().build();
        }
        return ResponseEntity.ok(nuevoMensaje);
    }
    
    @GetMapping
    public ResponseEntity<List<Mensaje>> listarMensajes(){
        List<Mensaje> mensajes = mensajeService.getAll();
        if(mensajes.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(mensajes);
    }
}
