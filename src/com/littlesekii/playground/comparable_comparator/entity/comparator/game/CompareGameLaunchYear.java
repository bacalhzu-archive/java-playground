package com.littlesekii.playground.comparable_comparator.entity.comparator.game;

import java.util.Comparator;

import com.littlesekii.playground.comparable_comparator.entity.Game;

public class CompareGameLaunchYear implements Comparator<Game>{

    @Override
    public int compare(Game o1, Game o2) {
        int result = 0;
        if (o1.getLaunchYear() < o2.getLaunchYear())
            result = -1;
        else if (o1.getLaunchYear() > o1.getLaunchYear())
            result = 1;
        else
            result = 0;

        return result;
    }

    
}