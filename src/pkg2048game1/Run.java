/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048game1;

/**
 *
 * @author raedalmutairi
 */


import java.util.Scanner;


public class Run {

    private Board board;
    private Scanner scan = new Scanner(System.in);
    
    public Run(){
        board = new Board();
        board.displayBoard();
        String input;
        do{
            System.out.print("Next move? ");
            input = scan.nextLine();
            if(input.equalsIgnoreCase("l")){
                board.tiltLeft();
                board.mergeLeft();
                board.populateRandomCell();
                board.displayBoard();
            }
            else if(input.equalsIgnoreCase("r")){
                board.tiltRight();
                board.mergeRight();
                board.populateRandomCell();
                board.displayBoard();
            }
            else if(input.equalsIgnoreCase("t")){
                board.tiltTop();
                board.mergeTop();
                board.populateRandomCell();
                board.displayBoard();
            }
            else if(input.equalsIgnoreCase("d")){
                board.tiltDown();
                board.mergeDown();
                board.populateRandomCell();
                board.displayBoard();
            }
            else if(!input.equalsIgnoreCase("x")){
                System.out.println("Incorrect input, please enter l, r, t, or d to tilt board, or x to exit.");
            }
        }while(!input.equalsIgnoreCase("X") && !board.isBoardFull());
        
        System.out.println("Game over, your score is "+board.getScore());
    }
    
    public static void main(String[] args) {
        new Run();
    }
}
