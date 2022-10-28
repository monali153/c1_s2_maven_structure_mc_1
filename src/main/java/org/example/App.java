package org.example;

import org.example.config.MovieConfig;
import org.example.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);

        Movie obj = context.getBean("movie",Movie.class);
        System.out.println(obj);

        Movie obj1 = context.getBean("movie1",Movie.class);
        System.out.println(obj1);

        Movie obj2 = context.getBean("movie2",Movie.class);
        System.out.println(obj2);

        Movie obj3 = context.getBean("movie3",Movie.class);
        System.out.println(obj3);
    }
}
