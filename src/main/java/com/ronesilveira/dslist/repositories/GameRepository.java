package com.ronesilveira.dslist.repositories;

import com.ronesilveira.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
