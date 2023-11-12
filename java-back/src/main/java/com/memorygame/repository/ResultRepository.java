package com.memorygame.repository;

import com.memorygame.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ResultRepository extends JpaRepository<Result, Long> {

    Optional<List<Result>> findByGamerId(Long gamerId);

}
