public class Main {
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int WIN_POSITION = 100;

    //number of time dice rolled -- notdr
    public static int notdr = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Game Program");
        int startPositionOfPlayer1 = 0;
        int startPositionOfPlayer2 = 0;

        Main m = new Main();

        while (startPositionOfPlayer1 != WIN_POSITION && startPositionOfPlayer2 != WIN_POSITION) {
            startPositionOfPlayer1 = m.gamePlay(startPositionOfPlayer1);

            if (startPositionOfPlayer1 != WIN_POSITION) {
                startPositionOfPlayer2 = m.gamePlay(startPositionOfPlayer2);
            }

            System.out.println("Player1 Position:- " + startPositionOfPlayer1);
            System.out.println("Player2 Position:- " + startPositionOfPlayer2);
            System.out.println("Number times Dice rolled:- " + notdr);

            if (startPositionOfPlayer1 == WIN_POSITION) {
                System.out.println("Player1 Won the Game");
            } else if (startPositionOfPlayer2 == WIN_POSITION) {
                System.out.println("Player2 Won the Game");
            }
        }
    }

    public int gamePlay(int startPosition) {

        /* rollingRotation -- decides which player needs to throw the dice.
        Can use rollingRotaton with an integer value to set 1-to continue set 0-to give chance tonext player
         int rollingRotation=1 */
        int rollingRotation = 1;

        while (rollingRotation==1) {
            int rollingDice = (int) (Math.random() * 10) % 6 + 1;
            notdr++;
            //Snake or ladder option--sol
            int sol = (int) (Math.random() * 10) % 3;

            switch (sol) {
                case LADDER:
                    startPosition += rollingDice;
                    if (startPosition > WIN_POSITION) {
                        startPosition -= rollingDice;
                    }
                    break;
                case SNAKE:
                    startPosition -= rollingDice;
                    rollingRotation=0;
                    break;
                //Default gets implemented when the player doesnt get reach where there isn't any snake or ladder
                default:
                    rollingRotation=0;
                    break;
            }

            if (startPosition < 0) {
                startPosition = 0;
            }
        }
        return startPosition;
    }
}