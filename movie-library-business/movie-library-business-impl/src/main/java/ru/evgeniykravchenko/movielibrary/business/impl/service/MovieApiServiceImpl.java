package ru.evgeniykravchenko.movielibrary.business.impl.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import ru.evgeniykravchenko.movielibrary.business.impl.mapper.MovieMapper;
import ru.evgeniykravchenko.movielibrary.domain.model.MovieType;
import ru.evgeniykravchenko.movielibrary.domain.repository.MovieRepository;
import ru.kravchenkoevgeniy.movielibrary.business.api.dto.MovieDto;
import ru.kravchenkoevgeniy.movielibrary.business.api.dto.MovieTypeDto;
import ru.kravchenkoevgeniy.movielibrary.business.api.dto.filter.MovieFilter;
import ru.kravchenkoevgeniy.movielibrary.business.api.service.MovieApiService;

import java.time.LocalDate;
import java.util.List;

import static ru.evgeniykravchenko.movielibrary.business.impl.specification.MovieSpecifications.hasTypeMovie;
import static ru.evgeniykravchenko.movielibrary.business.impl.specification.MovieSpecifications.nameIsLike;

@Service
@RequiredArgsConstructor
public class MovieApiServiceImpl implements MovieApiService {
    private final MovieRepository movieRepository;
    private final MovieMapper movieMapper;

    @Override
    public MovieDto getById(Long id) {
        return movieRepository.findById(id)
                .map(movieMapper::mapToDto)
                .orElse(new MovieDto("NULL", MovieTypeDto.UNDEFINED, "NULL", LocalDate.now()));
    }

    @Override
    public List<MovieDto> getByFilter(MovieFilter movieFilter) {
        if (movieFilter == null) return movieMapper.mapListToDto(movieRepository.findAll());
        return movieMapper.mapListToDto(
                movieRepository.findAll(
                        Specification
                                .where(nameIsLike("TEST"))
                                .or(hasTypeMovie(MovieType.FULL))
                )
        );
    }

    @Override
    public void addToLibrary(List<MovieDto> listMovies) {
        movieRepository.saveAll(movieMapper.mapListFromDto(listMovies));
    }
}
