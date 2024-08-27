package io.github.joaovmundel.testedemocrata.controller;

import io.github.joaovmundel.testedemocrata.model.Usuario;
import io.github.joaovmundel.testedemocrata.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/usuario")
public class UsuarioController {
    private final UserServiceImpl userService;

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuariosMaioresDe25() {
        return ResponseEntity.ok(userService.listarUsuariosIdadeMaiorQue(25));
    }

    @PostMapping
    public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioCriado = userService.criarUsuario(usuario);
        return new ResponseEntity<>(usuarioCriado, HttpStatus.CREATED);
    }
}
