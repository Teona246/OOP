package Football;

public class Main {
    public static void main(String[] args) {
        Player player1 = Player.addPlayer();
        Player player2 = Player.addPlayer();
        Player player3 = Player.addPlayer();

        Player.info();
        System.out.println(Player.getCountPlayers());

        Player player4 = Player.addPlayer();
        Player player5 = Player.addPlayer();
        Player player6 = Player.addPlayer();
        Player player7 = Player.addPlayer();
        Player player8 = Player.addPlayer();

        System.out.println(Player.getCountPlayers());


        for (int i = player2.getStamina(); i >= 0; i--) {
            player2.run();
        }
        Player.info();

        if ( player1 != null) {
            player1.run();
        }
    }


}

