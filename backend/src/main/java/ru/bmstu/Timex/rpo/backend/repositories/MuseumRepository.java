package ru.bmstu.Timex.rpo.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bmstu.Timex.rpo.backend.models.Museum;

public interface MuseumRepository extends JpaRepository<Museum, Integer> {
}
