package com.estudo.dslist.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.dslist.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
