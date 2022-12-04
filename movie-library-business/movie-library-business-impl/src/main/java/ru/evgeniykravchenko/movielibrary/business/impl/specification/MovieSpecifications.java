package ru.evgeniykravchenko.movielibrary.business.impl.specification;

import org.springframework.data.jpa.domain.Specification;
import ru.evgeniykravchenko.movielibrary.domain.model.Movie;
import ru.evgeniykravchenko.movielibrary.domain.model.MovieType;

/**
 * The type Movie specifications.
 */
public final class MovieSpecifications {
    /**
     * Name is like specification.
     *
     * @param name the name
     * @return the specification
     */
    public static Specification<Movie> nameIsLike(String name) {
        return new MovieNameSpecification(name);
    }

    /**
     * Has type movie specification.
     *
     * @param type the type
     * @return the specification
     */
    public static Specification<Movie> hasTypeMovie(MovieType type) {
        return new MovieTypeSpecification(type);
    }
}
