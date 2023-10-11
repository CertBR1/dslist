package com.estudo.dslist.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.dslist.dslist.dto.GameMinDto;
import com.estudo.dslist.dslist.entities.Game;
import com.estudo.dslist.dslist.services.GameService;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping()
    public List<GameMinDto> findAll() {
        var gameList = gameService.findAll();
        return gameList;
    }
}
