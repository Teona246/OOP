package Football;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        System.out.println(game.getPlayers());

        game.addPlayer("Алексей");
        game.addPlayer("Олег");
        game.addPlayer("Слава");

        Game.info();
        game.addPlayer("Сергей");
        game.addPlayer("Андрей");
        game.addPlayer("Никита");
        game.addPlayer("Игорь");

        Game.info();

        Player player1 = game.getPlayers().get(0);
        Player player2 = game.getPlayers().get(1);
        Player player3 = game.getPlayers().get(2);
        Player player4 = game.getPlayers().get(3);
        Player player5 = game.getPlayers().get(4);
        Player player6 = game.getPlayers().get(5);

        System.out.println(player1);
        player3.run();
        player4.run();


    }


}

