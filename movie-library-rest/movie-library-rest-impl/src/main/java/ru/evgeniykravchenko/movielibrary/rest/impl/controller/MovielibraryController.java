package ru.evgeniykravchenko.movielibrary.rest.impl.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.evgeniykravchenko.movielibrary.rest.api.MovieLibraryApi;
import ru.kravchenkoevgeniy.movielibrary.business.api.dto.MovieDto;
import ru.kravchenkoevgeniy.movielibrary.business.api.dto.filter.MovieFilter;
import ru.kravchenkoevgeniy.movielibrary.business.api.service.MovieApiService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MovielibraryController implements MovieLibraryApi {
    private final MovieApiService service;

    @Override
    public MovieDto getMovieById(Long id) {
        return service.getById(id);
    }

    @Override
    public List<MovieDto> getMoviesByFilter(MovieFilter movieFilter) {
        return service.getByFilter(movieFilter);
    }

    @Override
    public void addMoviesToLibrary(List<MovieDto> movies) {
        service.addToLibrary(movies);
    }
}
