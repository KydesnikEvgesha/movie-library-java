package ru.kravchenkoevgeniy.movielibrary.business.api.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * The enum Movie type dto.
 */
@RequiredArgsConstructor
@Getter
public enum MovieTypeDto {
    /**
     * Full movie type dto.
     */
    FULL("Полнометражка"),
    /**
     * Short movie type dto.
     */
    SHORT("Короткометражный"),
    /**
     * Series movie type dto.
     */
    SERIES("Сериал"),
    /**
     * Undefined movie type dto.
     */
    UNDEFINED("Не определен");
    private final String description;
}
