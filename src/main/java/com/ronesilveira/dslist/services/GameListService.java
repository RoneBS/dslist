package com.ronesilveira.dslist.services;

import com.ronesilveira.dslist.dto.GameDTO;
import com.ronesilveira.dslist.dto.GameListDTO;
import com.ronesilveira.dslist.dto.GameMinDTO;
import com.ronesilveira.dslist.entities.Game;
import com.ronesilveira.dslist.entities.GameList;
import com.ronesilveira.dslist.repositories.GameListRepository;
import com.ronesilveira.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

}
