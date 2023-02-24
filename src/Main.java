public class Main {
    public static final int LADDER=1;
    public static final int SNAKE=2;
    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Game Program");
        int startPosition=0;
        int rollingDice=(int) (Math.random()*10)%6 + 1;
        //Snake or ladder option--sol
        int sol=(int) (Math.random()*10)%3;
        switch (sol){
            case LADDER:
                startPosition+=rollingDice;
                break;
            case SNAKE:
                startPosition-=rollingDice;
                break;
        }
        System.out.println(startPosition);
    }
}