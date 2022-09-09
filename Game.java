import java.util.Scanner;

public class Game {
    //Submit at bit.ly/oop22-xo
    enum CellStatus{
        EMPTY,X,O;
        public static char asChar(CellStatus s){
            if(s==X) return 'X';
            else return 'O';
        }
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
        public char[][] line = {{'[',' ',']','[',' ',']','[',' ',']'},{'[',' ',']','[',' ',']','[',' ',']'},{'[',' ',']','[',' ',']','[',' ',']'}};
        
        public Board(){
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    boardGame[i][j] = new Cell();
                }
            }
        }
        public void ResetBoard(){
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    boardGame[i][j] = new Cell();
                    line[i][j*3+1]=' ';
                }
            }
        }
        public void UpdateBoard(int x, int y,CellStatus s){
            line[x][y*3+1]=CellStatus.asChar(s);
        }
        public void DrawBoard(){
            for(int i=0;i<3;i++){
                System.out.println(line[i]);
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

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Board bGame = new Board();
        System.out.println("Welcome to Tic Tac Toe Game!");
        int posX=0,posY=0;
        int count = 0;
        boolean victory =false;
        //Main loop
        while(true){
            //Check end game
            if(count>=9||victory == true){
                if(count>=9) System.out.println("X drew with O !");
                System.out.println("Do you want play again ? (Y/N)");
                String s =scanner.next();
                if(s=="Y"|| s=="y"){
                    bGame.ResetBoard();
                    Game.clearScreen();
                    count = 0;
                } else {
                    scanner.close();
                    return;
                
                }
            }

            //X turn
            System.out.println("X turn!");
            posX = scanner.nextInt();
            posY = scanner.nextInt();
            posX--;
            posY--;
            bGame.boardGame[posX][posY].setStatus(CellStatus.X);
            bGame.UpdateBoard(posX, posY, CellStatus.X);;
            bGame.DrawBoard();

            if(bGame.CheckWin()){
                System.out.println("X Win!");
                victory = true;
            } else count++;
            if(count==9) continue;

            //O turn 
            System.out.println("O turn!");
            posX = scanner.nextInt();
            posY = scanner.nextInt();
            posX--;
            posY--;
            bGame.boardGame[posX][posY].setStatus(CellStatus.O);
            bGame.UpdateBoard(posX, posY, CellStatus.O);;
            bGame.DrawBoard();

            if(bGame.CheckWin()){
                System.out.println("O Win!");
                victory = true;
            }else count++;          
        
        }

        
         
    }   
}
