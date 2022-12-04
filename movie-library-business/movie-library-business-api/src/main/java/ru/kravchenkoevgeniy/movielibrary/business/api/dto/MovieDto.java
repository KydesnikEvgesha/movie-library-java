package ru.kravchenkoevgeniy.movielibrary.business.api.dto;

import lombok.*;

import java.time.LocalDate;

/**
 * The type Movie dto.
 */
@AllArgsConstructor
@Getter
@Setter
public class MovieDto {
    private String name;
    private MovieTypeDto type;
    private String description;
    private LocalDate releaseDate;
}
