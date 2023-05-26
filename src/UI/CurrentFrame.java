package UI;


import javax.swing.*;
import java.awt.event.ActionListener;

public class CurrentFrame extends JFrame  {

    private JButton depositButton, withdrawButton;
    private JPanel mainPanel;

    public CurrentFrame() {
        setTitle("Current Account");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}


