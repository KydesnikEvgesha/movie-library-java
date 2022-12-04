package ru.evgeniykravchenko.movielibrary.rest.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;
import ru.kravchenkoevgeniy.movielibrary.business.api.dto.MovieDto;
import ru.kravchenkoevgeniy.movielibrary.business.api.dto.filter.MovieFilter;

import java.util.List;

/**
 * The interface Movie library api.
 */
@RequestMapping("/movie-api/")
@Schema(description = "Контроллер для работы с кинолентами", name = "Контроллер кинолент")
public interface MovieLibraryApi {
    /**
     * Gets movie by id.
     *
     * @param id the id
     * @return the movie by id
     */
    @GetMapping("{id}")
    @Operation(
            summary = "Получить коллекцию кинолент из библиотеки на основе фильтра",
            description = "Возвращает 200, если данные найдены"
    )
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = MovieDto.class))}, description = "Успешное выполнение операции"),
                    @ApiResponse(responseCode = "500", content = {@Content()}, description = "Ошибка сервера")
            }
    )
    MovieDto getMovieById(@PathVariable Long id);

    /**
     * Gets movies by filter.
     *
     * @param movieFilter the movie filter
     * @return the movies by filter
     */
    @Operation(summary = "Получить киноленту из библиотеки по идентификатору", description = "Возвращает 200, если данные найдены")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", description = "Успешное выполнение операции", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = MovieDto.class))}),
                    @ApiResponse(responseCode = "404", description = "Данные не найдены", content = {@Content()}),
                    @ApiResponse(responseCode = "500", description = "Ошибка сервера", content = {@Content()})
            }
    )
    @GetMapping
    List<MovieDto> getMoviesByFilter(@RequestBody MovieFilter movieFilter);

    /**
     * Add movies to library.
     *
     * @param movies the movies
     */
    @Operation(summary = "Добавить киноленты в библиотеку", description = "Возвращает 200, если данные найдены")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", description = "Успешное выполнение операции", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = MovieDto.class))}),
                    @ApiResponse(responseCode = "500", description = "Ошибка сервера", content = {@Content()})
            }
    )
    @PostMapping
    void addMoviesToLibrary(@RequestBody List<MovieDto> movies);
}
