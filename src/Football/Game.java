package Football;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static final int MAX_COUNT = 6;
    private static int count = 0;
    private List<Player> players = new ArrayList<>();


    public void addPlayer(String name) {
        if (count < MAX_COUNT) {
            count++;
            Player newPlayer = new Player(name, this);
            if (newPlayer != null) {
                players.add(newPlayer);
                System.out.println("Введен новый игрок, всего - " + count);
            }
        } else {
            System.out.println("Игроков уже 6, больше мест нет");
        }

    }

    public List<Player> getPlayers() {
        return players;
    }

    public static void info() {
        if (count < MAX_COUNT) {
            System.out.println("Недостаточно игроков, на поле сейчас - " + count + " игрок, нужно еще - " + (MAX_COUNT - count));
        } else if (count == MAX_COUNT) {
            System.out.println("Игроков достаточно для игры - " + MAX_COUNT);
        } else {
            System.out.println("Нет места для игрока, сейчас на поле - " + count);
        }
    }
}
