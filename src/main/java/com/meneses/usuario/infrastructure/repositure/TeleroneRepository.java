package com.meneses.usuario.infrastructure.repositure;


import com.meneses.usuario.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeleroneRepository extends JpaRepository<Telefone, Long> {
}
