import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {
    static Scanner input = new Scanner(System.in);
    private Grid grid;
    private int connectN;
    private Player[] players;
    private Map<String, Integer> score;
    private int targetScore;

    public Game(Grid grid, int connectN, int targetScore){
        this.grid = grid;
        this.connectN = connectN;
        this.targetScore = targetScore;

        this.players = new Player[]{
                new Player("Player 1", GridPosition.YELLOW);
                new Player("Player 2", GridPosition.RED);
        };

        this.score = new HashMap<>();
        for(Player player : this.players){
            this.score.put(player.getName(), 0);
        }
    }

//    private void printBoard(){
//        System.out.println("Board:");
//        for(int i = 0; i < grid.length; i++){
//            String row ="";
//            for(int piece : )
//        }
//    }
}
