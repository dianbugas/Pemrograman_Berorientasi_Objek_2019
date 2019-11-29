package com.Nimgame;
import java.util.Scanner;

public class Nimgame {
    public static int player = 1;
    public static int [] _board;
    public static void main(String[] args)
    {
        //Declare variables
        int pile = 0; //Which file to pick from
        int stones = 0; //How many stones to pick
        int counter = 0; //If the game is over or not
        //Scanner 
        Scanner input = new Scanner(System.in);
        NimClass myAssistant = new NimClass();
        myAssistant.displayBoard(); //Set board up
        //Begin loop
        while(counter == 0)
        {
        //Choose pile you want to remove stones from.
        System.out.print("Player " + player + " Silahkan masukkan jumlah kelerang yang anda inginkan untuk di hapus\n");
        //Get a pile number
        pile = input.nextInt();
          //Only allow user to enter a valid pile number.
          while (pile < 1 || pile > 4)
            {
               //Display error message, and ask user to re enter number.
               System.out.print("Invalid number, Please enter a pile # 1-4 ");
               pile = input.nextInt();
            }
        //Enter # of stones you want to remove.
        System.out.print("Player " + player + " Please enter the amount of" +
                          " stones you wish to remove\n");
        stones = input.nextInt();
        myAssistant.playerMove(pile, stones);
         //Only allow user to take half the pile.
          while ( stones >= 4 )
            {
               //Display error message, and ask user to re enter number.
               System.out.print("Invalid number, You can't take more than half the pile");
               stones = input.nextInt();
            }
            //Determine what player is entering the values.
            if (player == 1)
                player = 2;
            else
                player = 1;
             //Display board / determine the winner of the game.
             myAssistant.displayBoard();
             myAssistant.determineWinner();
            if (myAssistant.determineWinner() != -1)
                counter = 1;
        }
    }
}
