/**
 * Runs a game of Peg
 */
 
import java.util.Scanner;
public class Game
{
    /**
     * Runs a game of Peg
     */
    public static void main( String[] args)
    {
        //Constructors
        Rules rules = new Rules();
        Board board = new Board();
        Scanner in = new Scanner(System.in);
        System.out.println("Who's playing?: ");
        String player_name = in.nextLine();
        //Welcome sign
        System.out.println("  ___             ___                ");
        System.out.println(" | _ |___ __ _   / __|__ _ _ __  ___ ");
        System.out.println(" |  _/ -_) _` | | (_ / _` | '  V -_)");
        System.out.println(" |_| L__L__, |  L___L__,_|_|_|_|___|");
        System.out.println("         |___/                       ");
        //Set game variables
        int peg = 0;
        int slot = 3;
        int currentPosition;
        boolean winner = false;
        int counter = 0;
        String[] positions = new String[]{"-","o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o"};
        //Prints the board
        System.out.println(board.boardLayout(positions));
        //main game function
        while(rules.isWinner(positions, peg, slot) == false )
        {
            //Prompts for a peg
            System.out.println("Choose a peg (0-14): ");
            peg = board.getPosition();
            //Prompts for an empty slot
            System.out.println("Choose a slot (0-14): ");
            slot = board.getPosition();
            //Checks if the move is legal and able
            rules.isValidMove(positions, peg, slot);
            rules.canMove(positions, peg, slot);
            //If not legal, returns an Error message to the user & reprompts for new peg/slot inputs.
            while( rules.isValidMove(positions, peg, slot) == false || rules.canMove(positions, peg, slot) == false)
            {
                //Returns Error message
                System.out.println("Error Usage: Please insert a valid move");
                //Prompts for Peg
                System.out.println("Choose a peg: ");
                peg = board.getPosition();
                //Prompts for Slot
                System.out.println("Choose a slot: ");
                slot = board.getPosition();
            }
            //Sets legal move, reprints board.
            positions = rules.makeMove(positions, peg, slot);
            System.out.println(board.boardLayout(positions));
        }
        for(int i = 0; i < 15; i++){
            if(positions[i] == "o"){
                counter++;}}
        //Gives a winning or losing message
        if(rules.isLoser(positions) == false){
            System.out.println("You Won, " + player_name + "!");}
        else{
            System.out.println("Game over, " + player_name + "!");}
            
        System.out.println("Pegs left: " + counter);
        //END
    }
}

