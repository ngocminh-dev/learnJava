package TicTacToe;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Board bGame = new Board();
        System.out.println("Welcome to Tic Tac Toe Game!");
        int posX=0,posY=0;
        int count = 0;
        //Main loop
        while(true){

            //X turn
            System.out.println("X turn!");   
            posX = scanner.nextInt();
            posY = scanner.nextInt();
            posX--;
            posY--;         
            while(posX>2||posX<0||posY>2||posY<0||bGame.boardGame[posX][posY].getStatus()!=CellStatus.EMPTY) {
                System.out.println("Invalid position! \nPlease enter it again!");
                posX = scanner.nextInt();
                posY = scanner.nextInt();
                posX--;
                posY--;
                
            }
            bGame.boardGame[posX][posY].setStatus(CellStatus.X);
            bGame.UpdateBoard(posX, posY, CellStatus.X);;
            bGame.DrawBoard();

            //Win thi choi lai
            if(bGame.CheckWin()){
                System.out.println("X Win!");
                System.out.println("Do you want play again ? (Y/N)");
                String s =scanner.nextLine();
                s =scanner.nextLine();
                if(s.equals("y")|| s.equals("Y")){
                    bGame.ResetBoard();
                    ClearScreen.clearScreen();
                    count = 0;
                } else {
                    scanner.close();
                    return;
                
                }
            } else count++;
            // Dien du 9 o thi choi lai
            if(count==9){
                System.out.println("X drew with O !");
                System.out.println("Do you want play again ? (Y/N)");
                String s =scanner.nextLine();
                s =scanner.nextLine();
                if(s.equals("y")|| s.equals("Y")){
                    bGame.ResetBoard();
                    ClearScreen.clearScreen();
                    count = 0;
                } else {
                    scanner.close();
                    return;
                
                }
            } 

            //O turn 
            System.out.println("O turn!");
            posX = scanner.nextInt();
            posY = scanner.nextInt();
            posX--;
            posY--;
            while(posX>2||posX<0||posY>2||posY<0||bGame.boardGame[posX][posY].getStatus()!=CellStatus.EMPTY) {
                System.out.println("Invalid position! \nPlease enter it again!");
                posX = scanner.nextInt();
                posY = scanner.nextInt();
                posX--;
                posY--;
                
            }
            bGame.boardGame[posX][posY].setStatus(CellStatus.O);
            bGame.UpdateBoard(posX, posY, CellStatus.O);;
            bGame.DrawBoard();

            //Win thi choi lai
            if(bGame.CheckWin()){
                System.out.println("O Win!");
                System.out.println("Do you want play again ? (Y/N)");
                String s =scanner.nextLine();
                s =scanner.nextLine();
                if(s.equals("y")|| s.equals("Y")){
                    bGame.ResetBoard();
                    ClearScreen.clearScreen();
                    count = 0;
                } else {
                    scanner.close();
                    return;
                
                }
            }else count++;      
            //Dien du 9 o thi choi lai    
            if(count==9){
                System.out.println("X drew with O !");
                System.out.println("Do you want play again ? (Y/N)");
                String s =scanner.nextLine();
                s =scanner.nextLine();
                if(s.equals("y")|| s.equals("Y")){
                    bGame.ResetBoard();
                    ClearScreen.clearScreen();
                    count = 0;
                } else {
                    scanner.close();
                    return;
                
                }
            } 
            /////// 
        }

        
         
    }   
}
