package soccer;

public class League {
    public static void main(String[] args) {
        // TODO code application logic here

        Player player1 = new Player();
        player1.playerName = "George Eliot";

        Player player2 = new Player();
        player2.playerName = "Graham Greene";

        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";

        Player[] thePlayers = { player1, player2, player3};

//        Creation of the Greens team...
        Team team1 = new Team();
        team1.teamName = "The Greens";

//        Insertion of players to the Greens team..
        team1.playerArray = thePlayers;

//        Creation of the Reds team...
        Team team2 = new Team();
        team2.teamName = "The Reds";

//        Insertion of players to the Reds...
        team2.playerArray = new Player[3];

        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";

        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";

        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";



        for(Player thePlayer: team1.playerArray){

            //player1.playerName = "Robert Service";
            System.out.println(thePlayer.playerName);
        }

        System.out.println("------------------------------------------------------------------");

        for(Player thePlayer: team2.playerArray){

            System.out.println(thePlayer.playerName);
        }
    }
}
