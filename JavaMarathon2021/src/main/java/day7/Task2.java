package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Player player1 = craetePlayer();
        Player player2 = craetePlayer();
        Player player3 = craetePlayer();
        Player player4 = craetePlayer();
        Player player5 = craetePlayer();
        Player player6 = craetePlayer();
        Player.info();

        tiedPlayer(player1);
        Player.info();

        tiedPlayer(player2);
        Player.info();

        tiedPlayer(player3);
        Player.info();

        tiedPlayer(player4);
        Player.info();

        tiedPlayer(player4);
        Player.info();

        tiedPlayer(player5);
        Player.info();

        tiedPlayer(player6);
        Player.info();

    }

    static Player craetePlayer(){
        int rnd = (int) (Math.random() * 10 + 90);
        Player player = new Player(rnd);
        Player.addPlayer();
        return player;
    }

    static void tiedPlayer(Player player){
        for (int i = 1; i < 101; i++) {
            player.run();
        }
    }
}
