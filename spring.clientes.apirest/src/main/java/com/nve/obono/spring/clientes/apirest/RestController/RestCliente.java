package com.nve.obono.spring.clientes.apirest.RestController;

import com.nve.obono.spring.clientes.apirest.Service.ServiceCliente;
import com.nve.obono.spring.clientes.apirest.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:4200"})
public class RestCliente {

    @Autowired
    private ServiceCliente serviceCliente;

    @GetMapping("/clientes")
    public List<Cliente> index(){
        return serviceCliente.findAll();
    }

    @GetMapping("/clientes/{id}")
    public ResponseEntity<?> mostrarId(@PathVariable Long id){
        Cliente cliente = null;
        Map<String, Object> response = new HashMap<>();

        try {
            cliente = serviceCliente.findById(id);
        }catch (DataAccessException e){
            response.put("mensaje", "Error al realizar la consulta");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        if(cliente == null){
            response.put("mensaje", "El cliente con ID: ".concat(id.toString().concat(" no existe ;)")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
    }

    @PostMapping("/clientes")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> crear(@RequestBody Cliente cliente){
        Cliente clienteNuevo = null;
        Map<String, Object> response = new HashMap<>();
        try {
            clienteNuevo = serviceCliente.addCliente(cliente);
        }catch (DataAccessException e){
            response.put("mensaje", "Error al crear al usuario ;(");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "El cliente: ".concat(cliente.getNombre().concat(" ha sido creado con exito ;)")));
        response.put("cliente", clienteNuevo);
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }

    @PutMapping("/clientes/{id}")
    public ResponseEntity<?> modificar(@PathVariable Long id, @RequestBody Cliente cliente ){
        Cliente clienteActual = serviceCliente.findById(id);
        Cliente clienteUpdated = null;
        Map<String, Object> response= new HashMap<>();

        if(cliente == null){
            response.put("mensaje", "Error, no se puede editar: El cliente con ID: ".concat(id.toString().concat(" no existe ;)")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }

        try {
            clienteActual.setNombre(cliente.getNombre());
            clienteActual.setApellido(cliente.getApellido());
            clienteActual.setEmail(cliente.getEmail());
            clienteActual.setCreateAt(cliente.getCreateAt());
            clienteUpdated = serviceCliente.addCliente(clienteActual);

        }catch (DataAccessException e){
            response.put("mensaje", "Error al actualizar el usuario");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "El cliente: ".concat(cliente.getNombre().concat(" ha sido modificado con exito ;)")));
        response.put("cliente", clienteUpdated);
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }

    @DeleteMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> borrar(@PathVariable Long id){
        Map<String, Object> response = new HashMap<>();
        Cliente clienteAcutual = this.serviceCliente.findById(id);

        try {
            serviceCliente.deleteCliente(clienteAcutual);
        }catch (DataAccessException e){
            response.put("mensaje", "Error al borrar el usuario: ".concat(clienteAcutual.getNombre()));
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "El cliente: ".concat(clienteAcutual.getNombre().concat(" ha sido borrado con exito ;)")));
        response.put("cliente", clienteAcutual);
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }
}
