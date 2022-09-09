public class Game {
    //Submit at bit.ly/oop22-xo
    enum CellStatus{
        EMPTY,X,O
    }

    public class Cell{
        private CellStatus status;
        public CellStatus getStatus(){
            return status;
        }
        public void setStatus(CellStatus s){
            this.status = s;
        }
    }

    public class Board{
        public Cell[][] boardGame;
        public Board(){
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    boardGame[i][j].setStatus(CellStatus.EMPTY);
                }
            }
        }
        public boolean CheckWin(){
            boolean check = false;


            return check;
        }
        
    } 
    public static void main(String[] args) {
        
    }


}
