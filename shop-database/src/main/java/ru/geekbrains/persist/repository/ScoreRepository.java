package ru.geekbrains.persist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.persist.model.Score;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {

}
