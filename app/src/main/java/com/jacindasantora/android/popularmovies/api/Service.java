package com.jacindasantora.android.popularmovies.api;

import com.bumptech.glide.annotation.GlideModule;
import com.jacindasantora.android.popularmovies.model.Movie;
import com.jacindasantora.android.popularmovies.model.MovieResponse;
import com.jacindasantora.android.popularmovies.model.TrailerResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Service {

    @GET("movie/popular")
    Call<MovieResponse> getPopularMovies(@Query("api_key") String apiKey);

    @GET("movie/top_rated")
    Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{movie_id}/videos")
    Call<TrailerResponse> getMovieTrailer(@Path("movie_id") int id, @Query("api_key") String apiKey);
}