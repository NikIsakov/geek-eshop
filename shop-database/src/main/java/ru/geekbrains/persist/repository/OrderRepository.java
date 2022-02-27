package ru.geekbrains.persist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.persist.model.Order;
import ru.geekbrains.persist.model.Role;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
