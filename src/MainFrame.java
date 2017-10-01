import javafx.scene.layout.BorderWidths;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JPanel viewPanel;

    public MainFrame(String title) {
        super(title);
        creageGUI();
    }

    private void creageGUI() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        setMinimumSize(new Dimension(600, 480));

        viewPanel = new JPanel(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);

        showView(new View1(this));
        pack();
    }

    public void showView(JPanel panel) {
//        viewPanel.setVisible(false);
        viewPanel.removeAll();
        viewPanel.add(panel, BorderLayout.CENTER);
//        viewPanel.setVisible(true);
        viewPanel.revalidate();
        viewPanel.repaint();
    }
}
