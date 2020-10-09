/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author austinm
 */
public class TicTacToe {
    
    private int board[][] = new int [3][3];
    
    public TicTacToe(){}
    
    public TicTacToe(int [][] arr){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                this.board[i][j] = arr[i][j];
            }
        }
    }
    
    public void updateBoard(int [][] arr){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                this.board[i][j] = arr[i][j];
            }
        }
    }
    
    public boolean isCat(){
        
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                if(board[i][j] == 0)
                    return false;
        
        if(!hasWinner())
            return true;
        
        return false;
    }
    
    public boolean hasWinner(){
        
        //if the getWinner function returns -1, there is no winner
        if(getWinner() == -1)
            return false;
        
        //any other value means that there is a winner
        return true;
    }
    
    public int getWinner(){
        //check the diagonals first, they are the quickest to check
        int dCounter = 1;
        int dCounter2 = 1;
        for(int i = 0; i < 2; i++){
            if(board[i][i] == board[i+1][i+1] && board[i][i] != 0)
                dCounter++;
            if(board[i][2-i] == board[i+1][1-i] && board[i][2-i] != 0)
                dCounter2++;
        }
        if(dCounter == 3 || dCounter2 == 3)
            return board[1][1];
        
        //if not the diagonals, one of the rows are columns could have a match
        int rowCounter = 1;
        int colCounter = 1;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                if(board[i][j] == board[i][j+1] && board[i][j] != 0)
                    rowCounter++;
                if(board[j][i] == board[j+1][i] && board[j][i] != 0)
                    colCounter++;
            }
            if(rowCounter == 3 || colCounter == 3)
                return board[i][i];
            rowCounter = 1;
            colCounter = 1;
        }
        
        //return -1 if no winner
        return -1;
    } 
}