package br.com.roger437unix.miiproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.roger437unix.miiproject.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
