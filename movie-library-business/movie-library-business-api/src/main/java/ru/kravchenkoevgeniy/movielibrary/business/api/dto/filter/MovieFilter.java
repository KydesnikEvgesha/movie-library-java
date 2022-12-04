package ru.kravchenkoevgeniy.movielibrary.business.api.dto.filter;

import lombok.experimental.Accessors;

import java.util.List;

@Accessors(fluent = true)
public class MovieFilter {
    private int offset;

    private int limit;

    private List<MovieQuery> movieQuery;
}
