package ru.evgeniykravchenko.movielibrary.rest.client;

import org.springframework.cloud.openfeign.FeignClient;
import ru.evgeniykravchenko.movielibrary.rest.api.MovieLibraryApi;

@FeignClient(name = "movie-library")
public interface MovieLibraryClient extends MovieLibraryApi {
}
