package com.estudo.dslist.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.estudo.dslist.dslist.dto.GameMinDto;

import com.estudo.dslist.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll() {
        var gameList = gameRepository.findAll();
        return gameList.stream().map(x -> new GameMinDto(x)).toList();

    }
}
