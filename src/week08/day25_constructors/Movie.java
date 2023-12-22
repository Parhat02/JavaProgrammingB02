package week08.day25_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country, title, Genre,  director;

    public LocalDate releaseDate;

    public ArrayList<String> casts = new ArrayList<>();

    public DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/y");

    public Movie(String country, String title, String genre, String director, LocalDate releaseDate) {
        this.country = country;
        this.title = title;
        Genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;
    }

    public void addCast(String cast){
        casts.add(cast);
    }

    public void addCasts(String[] array){
        casts.addAll(Arrays.asList(array));
    }

    @Override
    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ",\ntitle=' " + title + '\'' +
                ", \nGenre=' " + Genre + '\'' +
                ", \ndirector=' " + director + '\'' +
                ", \nreleaseDate= " + releaseDate.format(df) +
                ", \ncasts= " + casts +
                '}';
    }
}
