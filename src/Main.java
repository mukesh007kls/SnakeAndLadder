public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Game Program");
        int startingPosition=0;
        int rollingDice=(int) (Math.random()*10)%6 + 1;
        System.out.println(rollingDice);
    }
}