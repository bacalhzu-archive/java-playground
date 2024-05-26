package com.littlesekii.playground.comparable_comparator.entity;

import com.littlesekii.playground.comparable_comparator.enums.GameGenre;

public class Game implements Comparable<Game> {
    
    private String name;
    private int launchYear;
    private GameGenre genre;

    public Game() {}

    public Game(String name, int launchYear, GameGenre genre) {
        this.name = name;
        this.launchYear = launchYear;
        this.genre = genre;
    }

    @Override
    public int compareTo(Game o) {
        return name.compareTo(o.name);
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getLaunchYear() {
        return launchYear;
    }


    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }


    public GameGenre getGenre() {
        return genre;
    }


    public void setGenre(GameGenre genre) {
        this.genre = genre;
    }
    
    @Override
    public String toString() {
        return String.format("==============GAME==============\nName: %s\nGenre: %s\nLaunch year: %d", name, genre.name(), launchYear);
    }

}



