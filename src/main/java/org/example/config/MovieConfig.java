package org.example.config;

import org.example.domain.Movie;
import org.springframework.context.annotation.Bean;

public class MovieConfig {

    @Bean("movie")
    public Movie getMovie(){
        return new Movie(1,"DDLJ","10/05/2000",5);
    }

    @Bean("movie1")
    public Movie getMovie1(){
        return new Movie(2,"Twilight Saga","11/03/2012",5);
    }

    @Bean("movie2")
    public Movie getMovie2(){
        return new Movie(3,"KGF","22/02/2022",5);
    }

    @Bean("movie3")
    public Movie getMovie3(){
        return new Movie(4,"War","29/07/2019",4);
    }


}
