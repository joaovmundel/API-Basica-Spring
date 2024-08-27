package io.github.joaovmundel.testedemocrata.service;

import io.github.joaovmundel.testedemocrata.model.Usuario;

import java.util.List;

public interface UserService {
    Usuario criarUsuario(Usuario user);
    List<Usuario> listarUsuariosIdadeMaiorQue(Integer idade);
}
