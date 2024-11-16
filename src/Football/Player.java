package Football;

import java.util.Random;

public class Player {
    private String name;
    private Game game;
    private int stamina;
    private final static int MIN_STAMINA = 0;
    private final static int MAX_STAMINA = 10;
    Random random = new Random();

    public Player(String name, Game game) {
        this.name = name;
        this.game = game;
        this.stamina = random.nextInt(8, MAX_STAMINA + 1);
    }

    @Override
    public String toString() {
        return name +
                ", stamina=" + stamina;
    }

    public void run() {

        if (stamina > MIN_STAMINA) {
            stamina--;
        } else if (stamina == MIN_STAMINA) {
            System.out.println("The player is tired");
        }
    }
}
