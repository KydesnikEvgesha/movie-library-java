package ru.evgeniykravchenko.movielibrary.business.impl.specification;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import ru.evgeniykravchenko.movielibrary.domain.model.Movie;
import ru.evgeniykravchenko.movielibrary.domain.model.MovieType;
import ru.evgeniykravchenko.movielibrary.domain.model.Movie_;

import javax.persistence.criteria.*;

/**
 * The type Movie type specification.
 */
@RequiredArgsConstructor
public class MovieTypeSpecification implements Specification<Movie> {
    private final MovieType type;
    @Override
    public Predicate toPredicate(Root<Movie> movie, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        return criteriaBuilder.equal(movie.get(Movie_.MOVIE_TYPE), type);
    }
}
