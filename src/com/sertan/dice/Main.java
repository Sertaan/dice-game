package com.sertan.dice;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int numberOfDices;
        int numberOfPlayers;
        List <Player> playerList = new ArrayList<>();
        InputHelper inputHelper = new InputHelper;

        System.out.println("Welcome");
        numberOfDices = inputHelper.inputNumberOfDice();
        numberOfPlayers = inputHelper.inputNumberOfPlayers();

        for (int i = 1; i <= numberOfPlayers; i++) {
            Player player = inputHelper.inputPlayerName(i);
            playerList.add(player);
        }

        System.out.println("All set, Let's play!");

        playerList.
    }
}
