package io.github.joaovmundel.testedemocrata.repository;

import io.github.joaovmundel.testedemocrata.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Long> {
    List<Usuario> findUsuarioByIdadeGreaterThan(Integer idade);
}
