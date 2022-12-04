package ru.kravchenkoevgeniy.movielibrary.business.api.dto.filter;

import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class MovieQuery {
    private String fieldName;
    private String value;
}
