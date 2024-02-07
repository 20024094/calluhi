package calluhi;

/**
 *
 * @author 20024094
 */

import java.awt.EventQueue;
import javax.swing.JFrame;

public class CallUHI extends JFrame {
    
    private final int OFFSET = 30;
    
    public CallUHI() {
        initUI();
    }
    
    private void initUI() {
        
        Board board = new Board();
        add(board);

        setTitle("Sokoban");
        
        setSize(board.getBoardWidth() + OFFSET,
                board.getBoardHeight() + 2 * OFFSET);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            
        CallUHI game = new CallUHI();
            game.setVisible(true);
        });
    }
    
}
