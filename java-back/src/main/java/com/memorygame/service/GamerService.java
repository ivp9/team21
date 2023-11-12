package com.memorygame.service;

import com.memorygame.model.Gamer;
import com.memorygame.repository.GamerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GamerService {

    @Autowired
    private GamerRepository gamerRepository;

    public List<Gamer> findAll() {
        return gamerRepository.findAll();
    }

    public Optional<Gamer> findByName(String name) {
        return gamerRepository.findByName(name);
    }

    public Optional<Gamer> findById(Long id) {
        return gamerRepository.findById(id);
    }

    public Gamer save(Gamer gamer) {
        return gamerRepository.save(gamer);
    }


}
