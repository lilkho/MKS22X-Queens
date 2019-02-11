public class Driver {
  public static void main(String[] args) {
    QueenBoard board = new QueenBoard(4);
    System.out.println(board);
    board.solve();
    System.out.println(board);
    QueenBoard board2 = new QueenBoard(8);
    board2.solve();
    System.out.println(board2);
  }
}
