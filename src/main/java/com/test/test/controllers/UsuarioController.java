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
    public List<Usuario> getUsuario() {
        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(123L);
        usuario.setNombre("Pablo");
        usuario.setApellido("Morales");
        usuario.setEmail("pablo@mail.com");
        usuario.setTelefono("4751111");
        usuario.setPassword("123456");

        Usuario usuario2 = new Usuario();
        usuario2.setId(456L);
        usuario2.setNombre("Pablo");
        usuario2.setApellido("Morales");
        usuario2.setEmail("pablo@mail.com");
        usuario2.setTelefono("4751111");
        usuario2.setPassword("123456");

        Usuario usuario3 = new Usuario();
        usuario3.setId(789L);
        usuario3.setNombre("Pablo");
        usuario3.setApellido("Morales");
        usuario3.setEmail("pablo@mail.com");
        usuario3.setTelefono("4751111");
        usuario3.setPassword("123456");

        Usuario usuario4 = new Usuario();
        usuario4.setId(741L);
        usuario4.setNombre("Pablo");
        usuario4.setApellido("Morales");
        usuario4.setEmail("pablo@mail.com");
        usuario4.setTelefono("4751111");
        usuario4.setPassword("123456");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);

        return usuarios;
    }
}
