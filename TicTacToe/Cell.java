package TicTacToe;

public class Cell{        
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
