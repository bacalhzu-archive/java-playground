package com.littlesekii.playground.comparable_comparator.entity.comparator.game;

import java.util.Comparator;

import com.littlesekii.playground.comparable_comparator.entity.Game;

public class CompareGameGenre implements Comparator<Game> {

    @Override
    public int compare(Game o1, Game o2) {
        return o1.getGenre().name().compareTo(o2.getGenre().name());
    }
    
}