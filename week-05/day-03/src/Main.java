import javax.swing.*;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    // Here is how you set up a new window and adding our board to it


    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(board);
    // Notice (at the top) that we can only do this
    // because this Board class (the type of the board object) is also a KeyListener
  }
}