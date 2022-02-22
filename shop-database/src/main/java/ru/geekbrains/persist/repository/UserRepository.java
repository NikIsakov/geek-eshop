package ru.geekbrains.persist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.persist.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
