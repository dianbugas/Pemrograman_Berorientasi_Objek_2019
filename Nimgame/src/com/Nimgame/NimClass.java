package com.Nimgame;

public class NimClass {
    public static int [] _board;
    
    public NimClass()
    {
   
        //Determing # of stones in each pile at the beginning.
        _board = new int [1];
        _board[0] = 10; //Pile 1  3 stones

        System.out.println("              Selamat Datang di Game NIM\n" +
                           "     Anda harus memasukkan jumlah kelerang 10-100\n");
    }
   //Display the game board
    public void displayBoard()
    {
        for(int row = 0; row < 1; row++)
        {
            if(_board[row] == 0)
                System.out.print("    0    ");
            else
                System.out.print("     " + _board[row] + "   ");
        }
            //Print out the piles
            System.out.println("\n  Pile 1");
    }
    //Determine the player's moves
    public boolean playerMove (int pile, int stones)
    {
      if ((pile < 1) || (pile > _board.length))
      {
          return false;
      }
        if (_board[pile - 1] >= stones)
        {
          _board[pile - 1] -= stones;
          return true;
        }
     else
        {
          return false;
        }
    }
    //Determine the winner of the game
    public int determineWinner()
    {
        boolean complete = true;
        int winner = -1;
        //Checking the piles to see if they're empty.
        if((_board[0] == 0) && ( _board[1]== 0) && ( _board[2]==0) && ( _board[3]==0))
            winner = Nimgame.player; //Determine winner
            complete = false;
        if(complete == false && winner == 1)
        {
            //Display the results of player 1 winning.
            System.out.println("Player 1 Wins!");
            winner = 0;
        }
        if(complete == false && winner == 2)
        {
            //Display the results of player 2 winning.
            System.out.println("Komputer!");
            winner = 0;
        }
        return winner;
    }
}
