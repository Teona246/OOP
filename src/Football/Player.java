package Football;

import java.util.Random;

public class Player {
    private String player;
    private int stamina;
    private final static int MIN_STAMINA = 0;
    private final static int MAX_STAMINA = 10;
    private static int countPlayers;

    private Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
    }

    public int getStamina() {

        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public static Player addPlayer() {

        Random st = new Random();
        int randomStamina = st.nextInt(8, MAX_STAMINA + 1);

        if (countPlayers < 6) {
            return new Player(randomStamina);

        } else {
            return null;
        }
    }

    public void run() {

        if (stamina > MIN_STAMINA) {
            stamina--;
        } else if (stamina == MIN_STAMINA) {
            System.out.println("The player is tired");

        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Недостаточно игроков, на поле сейчас - " + countPlayers + " игрок, нужно еще - " + (6 - countPlayers));
        } else if (countPlayers == 6) {
            System.out.println("Игроков достаточно для игры - " + countPlayers);
        } else {
            System.out.println("Нет места для игрока, сейчас на поле - " + countPlayers);
        }
    }
}
