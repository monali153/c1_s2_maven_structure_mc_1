package org.example.domain;

public class Movie {

    private int movieId;
    private String movieName;
    private String releaseDate;
    private int rating;

    public Movie(int movieId, String movieName, String releaseDate, int rating) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", rating=" + rating +
                '}';
    }
}
