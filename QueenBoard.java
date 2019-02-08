public class QueenBoard {
  private int[][] board;

  public QueenBoard(int size) {
    board = new int[size][size];
  }

  private boolean addQueen(int r, int c) {
    if (board[r][c]==0){
      board[r][c]=-1;
      for (int i=1;c+i<board.length;i++) {
        board[r][c+i]++;
        if (r-i>=0)
          board[r-i][c+1]++;
        if (r+i<board.length)
          board[r+i][c+i]++;
      }
      return true;
    }
    return false;
  }
  private boolean removeQueen(int r, int c) {
    if (board[r][c]==-1) board[r][c]=0;
    else return false;
    return true;
  }

  /**
  *@return The output string formatted as follows:
  *All numbers that represent queens are replaced with 'Q'
  *all others are displayed as underscores '_'
  *There are spaces between each symbol:
  *"""_ _ Q _
  *Q _ _ _

  *_ _ _ Q

  *_ Q _ _"""
  *(pythonic string notation for clarity,
  *excludes the character up to the *)
  */
  public String toString(){
    String s = "";
    for (int i=0;i<board.length;i++) {
      for (int j=0;j<board.length;j++) {
        if (board[i][j]==0) s+="_ ";
        if (board[i][j]==-1) s+="Q ";
      }
      s+="\n";
    }
    return s;
  }



  /**
  *@return false when the board is not solveable and leaves the board filled with zeros;

  *        true when the board is solveable, and leaves the board in a solved state

  *@throws IllegalStateException when the board starts with any non-zero value

  */
  public boolean solve(){
    return solve(0,0);
  }
  private boolean solve(int r, int c){
    if (addQueen(r,c)) {

    }
  }

  /**
  *@return the number of solutions found, and leaves the board filled with only 0's
  *@throws IllegalStateException when the board starts with any non-zero value
  */
  public int countSolutions(){
    return 0;
  }


}
