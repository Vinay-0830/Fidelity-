import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Game: ");
        String gamename = sc.nextLine();
        System.out.println("Enter the maximum number of players: ");
        int m1 = sc.nextInt();
        Game game1 = new Game(gamename, m1);
        System.out.println("Enter a Game that has time limits: ");
        String gamename2 = sc.nextLine();
        System.out.println("Enter the maximum number of players: ");
        int m2 = sc.nextInt();
        System.out.println("Enter the Time Limit in minutes: ");
        int t1 = sc.nextInt();
        System.out.println(game1.toString());
        GamewithTimeLimit timedgame = new GamewithTimeLimit(gamename2,m2,t1);
        System.out.println("timedgame.toString());");



    }
}
