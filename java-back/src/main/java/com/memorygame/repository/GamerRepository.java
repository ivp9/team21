package com.memorygame.repository;

import com.memorygame.model.Gamer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GamerRepository extends JpaRepository<Gamer, Long> {

    Optional<Gamer> findByName(String name);
}
