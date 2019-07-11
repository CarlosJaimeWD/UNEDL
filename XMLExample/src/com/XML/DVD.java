package com.XML;

import java.util.ArrayList;
import java.util.List;

public class DVD {

    private List movies = new ArrayList();

    public DVD() {
    }

    public List getMovies() {
        return movies;
    }

    public void setMovies(List movies) {
        this.movies = movies;
    }
    

//    public String toString() {
//        String movies = "";
//        for (Movie movie : get) {
//            movies += movie.getName() + ", ";
//        }
//        return movies;
//    }

    @Override
    public String toString() {
        return "DVD{" + "movies=" + movies + '}';
    }
}
