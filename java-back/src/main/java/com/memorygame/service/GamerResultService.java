package com.memorygame.service;

import com.memorygame.model.Result;
import com.memorygame.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GamerResultService {

    @Autowired
    private ResultRepository resultRepository;

    public List<Result> findAll() {
        return resultRepository.findAll();
    }

    public Optional<List<Result>> findByGamerId(Long gamerId) {
        return resultRepository.findByGamerId(gamerId);
    }

}
