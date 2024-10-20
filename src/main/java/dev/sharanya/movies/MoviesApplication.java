package dev.sharanya.movies;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesApplication {

    public static void main(String[] args) {
        Dotenv dotenv=Dotenv.configure().filename("src/main/resources/.env").load();
        SpringApplication.run(MoviesApplication.class, args);
    }

}
