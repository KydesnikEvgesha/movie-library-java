package ru.evgeniykravchenko.movielibrary.business.impl.specification;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import ru.evgeniykravchenko.movielibrary.domain.model.Movie;
import ru.evgeniykravchenko.movielibrary.domain.model.Movie_;

import javax.persistence.criteria.*;

/**
 * The type Movie name specification.
 */
@RequiredArgsConstructor
class MovieNameSpecification implements Specification<Movie> {
    private final String name;

    @Override
    public Predicate toPredicate(Root<Movie> movie, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        final Expression<String> nameExpression = criteriaBuilder.lower(movie.get(Movie_.name));
        return criteriaBuilder.like(nameExpression, "%" + name.toLowerCase() + "%");
    }
}
