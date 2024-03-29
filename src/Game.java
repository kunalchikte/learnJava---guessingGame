public class Game {
    int computerGuess;
    Player p1,p2,p3;

    Game(String p1, String p2, String p3){
        this.p1 = new Player(p1);
        this.p2 = new Player(p2);
        this.p3 = new Player(p3);
    }

    private boolean checkWinner(){
        if(p1.guess == computerGuess){
            System.out.println(p1.name + " Wins");
            return true;
        }
        else if(p2.guess == computerGuess){
            System.out.println(p2.name + " Wins");
            return true;
        }
        if(p3.guess == computerGuess){
            System.out.println(p3.name + " Wins");
            return true;
        }
        return false;
    }

    void launch(){

        while (true){
            System.out.println("Welcome to the new game");
            this.computerGuess = (int)(Math.random() * 9) + 1;
            System.out.println("Computer Guessed : "+ this.computerGuess);

            p1.getGuess();
            p2.getGuess();
            p3.getGuess();

            if(checkWinner()){
                System.out.println("Game Over");
                break;
            }else{
                System.out.println("Computer Wins");
            }

            System.out.println("##################################");

        }
    }
}
