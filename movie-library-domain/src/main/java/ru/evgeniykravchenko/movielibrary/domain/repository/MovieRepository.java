package ru.evgeniykravchenko.movielibrary.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.evgeniykravchenko.movielibrary.domain.model.Movie;

/**
 * Репозиторий для работы с сущностью {@link Movie}
 */
@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>, JpaSpecificationExecutor<Movie> {
}
