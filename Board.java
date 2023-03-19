 



/**
 * Prompts a user inputted position on a game board.
 * @author Anjali Viswan
 */
import java.util.Scanner;

public class Board
{
    /**
     * Prompts a user to get a position, and returns the position.
     * @return the user's set position number.
     */
    public int getPosition()
    {
        Scanner n = new Scanner(System.in);
        int prompt = n.nextInt();
        
        return prompt;
    }
    /**
     * Sets the positions array into a board-like format.
     * @param String[] positions - the array to store and set positions in.
     * @return the String[] with spacing into a board-like format.
     */
    public String boardLayout(String[] positions)
    {
        String crude = "          (0)" + "\n           " + positions[0] + "\n        (1) (2)" + "\n         " + 
        positions[1] + "   " + positions[2] + "\n      (3) (4) (5)" + "\n       " + positions[3] + "   "
        + positions[4] + "   " + positions[5] + "\n    (6) (7) (8) (9)" + "\n     " + positions[6] + "   " + positions[7] +
        "   " + positions[8] + "   " + positions[9] + "\n  (10)(11)(12)(13)(14)" + "\n   " + positions[10] + "   " +
        positions[11] + "   " + positions[12] + "   " + positions[13] + "   " + positions[14];
        return crude;
    }
}

