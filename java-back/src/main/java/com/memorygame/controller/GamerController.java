package com.memorygame.controller;

import com.memorygame.model.Gamer;
import com.memorygame.service.GamerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gamer")
public class GamerController {

    @Autowired
    private GamerService gamerService;

    @Autowired
    private GamerResultService gamerResultService;

    @GetMapping
    public List<Gamer> findAll() {
        return gamerService.findAll();
    }

    @GetMapping("/{name}")
    public Optional<Gamer> findByName(@PathVariable String name) {
        return gamerService.findByName(name);
    }

    @GetMapping("/{gamer_results}")
    public Optional<List<Result>> findGamerResults(@PathVariable String name) {
        Optional<Gamer> gamer = gamerService.findByName(name);
        if (gamer.isPresent()) {
            return gamerResultService.findById(gamer.get().getId());
        }
    }
}
