package ru.kravchenkoevgeniy.movielibrary.business.api.service;

import ru.kravchenkoevgeniy.movielibrary.business.api.dto.MovieDto;
import ru.kravchenkoevgeniy.movielibrary.business.api.dto.filter.MovieFilter;

import java.util.List;

/**
 * Сервис с бизнес логикой библиотеки фильмов
 */
public interface MovieApiService {
    /**
     * Поиск киноленты по идентификатору
     *
     * @param id идентификатор киноленты
     * @return объект {@link MovieDto}
     */
    MovieDto getById(Long id);
    /**
     * Поиск списка кинолент по фильтру {@link MovieFilter}
     *
     * @param movieFilter фильтр {@link MovieFilter}
     * @return коллекцию значений {@link MovieDto}
     */
    List<MovieDto> getByFilter(MovieFilter movieFilter);

    /**
     * Вставка списка кинолент в библиотеку
     *
     * @param listMovies коллекция значений {@link MovieDto}
     */
    void addToLibrary(List<MovieDto> listMovies);
}
