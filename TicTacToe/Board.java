package TicTacToe;

public class Board{
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
