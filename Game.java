import java.util.Scanner;

public class Game {
    //Submit at bit.ly/oop22-xo
    enum CellStatus{
        EMPTY,X,O
    }

    static class Cell{        
        private CellStatus status;
        public Cell(){
            status = CellStatus.EMPTY;
        }
        public CellStatus getStatus(){
            return status;
        }
        public void setStatus(CellStatus s){
            status = s;
        }
    }

    static class Board{
        public  Cell[][] boardGame = new Cell[3][3];
        public Board(){
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    boardGame[i][j] = new Cell();
                }
            }
        }
        public boolean CheckWin(){
            if(boardGame[0][0].getStatus() == boardGame[0][1].getStatus() && 
                boardGame[0][1].getStatus()==boardGame[0][2].getStatus() && boardGame[0][0].getStatus()!= CellStatus.EMPTY) return true;
            if(boardGame[1][0].getStatus() == boardGame[1][1].getStatus() && 
                boardGame[1][1].getStatus()==boardGame[1][2].getStatus() && boardGame[1][0].getStatus()!= CellStatus.EMPTY) return true;
            if(boardGame[2][0].getStatus() == boardGame[2][1].getStatus() && 
                boardGame[2][1].getStatus()==boardGame[2][2].getStatus() && boardGame[2][0].getStatus()!= CellStatus.EMPTY) return true;
            if(boardGame[0][0].getStatus() == boardGame[1][0].getStatus() && 
                boardGame[1][0].getStatus()==boardGame[2][0].getStatus() && boardGame[0][0].getStatus()!= CellStatus.EMPTY) return true;
            if(boardGame[1][0].getStatus() == boardGame[1][1].getStatus() && 
                boardGame[1][1].getStatus()==boardGame[2][1].getStatus() && boardGame[1][0].getStatus()!= CellStatus.EMPTY) return true;
            if(boardGame[2][0].getStatus() == boardGame[2][1].getStatus() && 
                boardGame[2][1].getStatus()==boardGame[2][2].getStatus() && boardGame[2][0].getStatus()!= CellStatus.EMPTY) return true;
            if(boardGame[0][0].getStatus() == boardGame[1][1].getStatus() && 
                boardGame[1][1].getStatus()==boardGame[2][2].getStatus() && boardGame[0][0].getStatus()!= CellStatus.EMPTY) return true;
            if(boardGame[0][2].getStatus() == boardGame[1][1].getStatus() && 
                boardGame[1][1].getStatus()==boardGame[2][0].getStatus() && boardGame[0][2].getStatus()!= CellStatus.EMPTY) return true;   
            return false;
        }
        


    } 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Board bGame = new Board();
        System.out.println("Tic Tac Toe Game!");
        //                 0   1   2   3   4   5   6   7   8
        char[][] line = {{'[',' ',']','[',' ',']','[',' ',']'},{'[',' ',']','[',' ',']','[',' ',']'},{'[',' ',']','[',' ',']','[',' ',']'}};
        
        int posX=0,posY=0;
        while(true){
            System.out.println("X turn!");
            posX = scanner.nextInt();
            posY = scanner.nextInt();
            posX--;
            posY--;
            bGame.boardGame[posX][posY].setStatus(CellStatus.X);

            //Draw board
            line[posX][posY*3+1] = 'X';
            for(int i=0;i<3;i++){
                System.out.println(line[i]);
            }
            //~~
            if(bGame.CheckWin()){
                System.out.println("X Win!");
                scanner.close(); 
                return;
            };
            System.out.println("O turn!");
            posX = scanner.nextInt();
            posY = scanner.nextInt();
            posX--;
            posY--;
            bGame.boardGame[posX][posY].setStatus(CellStatus.O);
            
            //Draw board
            line[posX][posY*3+1] = 'O';
            for(int i=0;i<3;i++){
                System.out.println(line[i]);
            }
            //~~
            if(bGame.CheckWin()){
                System.out.println("O Win!");
                scanner.close(); 
                return;
            };

        }

        
         
    }   
}
