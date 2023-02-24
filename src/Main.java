public class Main {
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int WIN_POSITION = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Game Program");
        int startPosition = 0;
        //number of time dice rolled -- notdr
        int notdr = 0;

        while (startPosition <= WIN_POSITION) {
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
                    if (startPosition < 0) {
                        startPosition = 0;
                    }
                    break;
            }



            if (startPosition == WIN_POSITION) {
                System.out.println("Player Reached Win Position:- " + startPosition + " Number of time dice rolled:- " + notdr);
                break;
            }

            System.out.println("Position of player:- " + startPosition + " Number of time dice rolled:- " + notdr);
        }

    }
}