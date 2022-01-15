package com.test.test.controllers;

import com.test.test.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Pablo");
        usuario.setApellido("Morales");
        usuario.setEmail("pablo@mail.com");
        usuario.setTelefono("4751111");
        usuario.setPassword("123456");
        return usuario;
    }

    @RequestMapping(value = "usuario")
    public List<Usuario> getUsuario(@PathVariable Long id) {
        List<Usuarios> usuarios = new ArrayList<>() {

            Usuario usuario1 = new Usuario();
        usuario1.setId(id);
        usuario1.setNombre("Pablo");
        usuario1.setApellido("Morales");
        usuario1.setEmail("pablo@mail.com");
        usuario1.setTelefono("4751111");
        usuario1.setPassword("123456");
        return usuario1;
        }
    }
}