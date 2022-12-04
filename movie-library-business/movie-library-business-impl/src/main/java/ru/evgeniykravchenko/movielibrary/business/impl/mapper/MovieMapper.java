package ru.evgeniykravchenko.movielibrary.business.impl.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.evgeniykravchenko.movielibrary.domain.model.Movie;
import ru.kravchenkoevgeniy.movielibrary.business.api.dto.MovieDto;

import java.util.List;

/**
 * The interface Movie mapper.
 */
@Mapper(componentModel = "spring")
public interface MovieMapper {
    /**
     * The constant INSTANCE.
     */
    MovieMapper INSTANCE = Mappers.getMapper(MovieMapper.class);

    /**
     * Map list.
     *
     * @param movies the movies
     * @return the list
     */
    List<MovieDto> mapListToDto(List<Movie> movies);

    /**
     * Map movie dto.
     *
     * @param movie the movie
     * @return the movie dto
     */
    MovieDto mapToDto(Movie movie);

    /**
     * Map movie.
     *
     * @param movieDto the movie dto
     * @return the movie
     */
    Movie mapFromDto(MovieDto movieDto);

    /**
     * Map list.
     *
     * @param moviesDto the movies dto
     * @return the list
     */
    List<Movie> mapListFromDto(List<MovieDto> moviesDto);
}
