package com.SpringBootUdemy.learningspringboot;

import com.SpringBootUdemy.learningspringboot.game.GameRunner;
import com.SpringBootUdemy.learningspringboot.game.MarioGame;
import com.SpringBootUdemy.learningspringboot.game.PacmanGame;
import com.SpringBootUdemy.learningspringboot.game.SuperContraGame;

public class AppGamingBasic {
    public static void main(String[] args) {
//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
