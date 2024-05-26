package com.littlesekii.playground.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.littlesekii.playground.comparable_comparator.entity.Game;
import com.littlesekii.playground.comparable_comparator.entity.comparator.game.CompareGameGenre;
import com.littlesekii.playground.comparable_comparator.entity.comparator.game.CompareGameLaunchYear;
import com.littlesekii.playground.comparable_comparator.enums.GameGenre;

public class ComparableComparatorExample {

    public static void run() {
        Game game = new Game();

        game.setLaunchYear(2023);
        game.setName("Astrorisk");
        game.setGenre(GameGenre.ARCADE);

        List<Game> games = new ArrayList<>();

        games.add(new Game("The Legend of Zelda: Tears of the Kingdom", 2023, GameGenre.ADVENTURE));
        games.add(new Game("VALORANT", 2020, GameGenre.FPS));
        games.add(game);
        games.add(new Game("The Legend of Zelda", 1986, GameGenre.ADVENTURE));

        games.forEach(System.out::println);
        System.out.println();

        //order list
        Collections.sort(games); 

        games.forEach(System.out::println);
        System.out.println();

        Collections.sort(games, Collections.reverseOrder());

        games.forEach(System.out::println);
        System.out.println();
        
        //
        Collections.sort(games, new CompareGameLaunchYear());

        games.forEach(System.out::println);
        System.out.println();

        Collections.sort(games, Collections.reverseOrder(new CompareGameLaunchYear()));

        games.forEach(System.out::println);
        System.out.println();

        //
        Collections.sort(games, new CompareGameGenre());

        games.forEach(System.out::println);
        System.out.println();

        Collections.sort(games, Collections.reverseOrder(new CompareGameGenre()));

        games.forEach(System.out::println);
        System.out.println();
    }
    
}