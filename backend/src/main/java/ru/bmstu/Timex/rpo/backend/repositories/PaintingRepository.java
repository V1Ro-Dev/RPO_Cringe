package ru.bmstu.Timex.rpo.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bmstu.Timex.rpo.backend.models.Painting;

public interface PaintingRepository extends JpaRepository<Painting, Integer> {
}
