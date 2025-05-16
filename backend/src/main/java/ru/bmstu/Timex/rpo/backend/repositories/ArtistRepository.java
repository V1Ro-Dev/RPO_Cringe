package ru.bmstu.Timex.rpo.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bmstu.Timex.rpo.backend.models.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Integer> {}
