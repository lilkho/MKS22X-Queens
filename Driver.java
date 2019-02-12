public class Driver {
  public static void main(String[] args) {
    QueenBoard board0 = new QueenBoard(3);
    board0.solve();
    System.out.println(board0);
    QueenBoard board = new QueenBoard(4);
    board.solve();
    System.out.println(board);
    System.out.println(board.countSolutions());
    QueenBoard board2 = new QueenBoard(5);
    board2.solve();
    System.out.println(board2);
    QueenBoard board3 = new QueenBoard(6);
    board3.solve();
    System.out.println(board3);
    QueenBoard board4 = new QueenBoard(7);
    board4.solve();
    System.out.println(board4);
    QueenBoard board5 = new QueenBoard(8);
    board5.solve();
    System.out.println(board5);
    System.out.println(board5.countSolutions());
  }
}
