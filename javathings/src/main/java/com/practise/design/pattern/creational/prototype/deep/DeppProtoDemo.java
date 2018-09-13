package com.practise.design.pattern.creational.prototype.deep;

public class DeppProtoDemo {

	public static void main(String[] args) {
		Registry registry = new Registry();
        Movie movie = (Movie) registry.getItems().get("Movie");
        System.err.println("runtime >>"+movie.getRuntime());
        movie.setTitle("Creational Patterns in Java");
        movie.setUrl("http://movie.com");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie anotherMovie = (Movie) registry.cloneItem("Movie");
        anotherMovie.setTitle("Gang of Four");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());
	}

}
