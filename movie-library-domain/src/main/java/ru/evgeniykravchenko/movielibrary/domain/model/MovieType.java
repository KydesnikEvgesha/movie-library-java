package ru.evgeniykravchenko.movielibrary.domain.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum MovieType {
    FULL("Полнометражка"),
    SHORT("Короткометражный"),
    SERIES("Сериал"),
    UNDEFINED("Не определен");
    private final String description;
}
