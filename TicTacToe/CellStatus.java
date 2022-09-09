package TicTacToe;
public enum CellStatus{
    EMPTY,X,O;
    public static char asChar(CellStatus s){
            if(s==X) return 'X';
            else return 'O';
        }
    }
