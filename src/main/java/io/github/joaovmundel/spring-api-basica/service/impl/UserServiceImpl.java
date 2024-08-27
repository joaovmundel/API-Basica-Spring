package io.github.joaovmundel.testedemocrata.service.impl;

import io.github.joaovmundel.testedemocrata.model.Usuario;
import io.github.joaovmundel.testedemocrata.repository.UserRepository;
import io.github.joaovmundel.testedemocrata.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public Usuario criarUsuario(Usuario user) {
        return repository.save(user);
    }

    @Override
    public List<Usuario> listarUsuariosIdadeMaiorQue(Integer idade) {
        return repository.findUsuarioByIdadeGreaterThan(idade);
    }
}
