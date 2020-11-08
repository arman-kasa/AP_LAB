import javax.swing.*;
import java.awt.*;

public class AdvancedCalculator
{
    //TODO: creating simple calculator and adding advanced features to it
    private JPanel engKeyboardPanel;
    private JTextArea display;
    
    private void engCalcPanelInit()
    {
        engCalcPanel = new JPanel();
        engCalcPanel.setPreferredSize(new Dimension(200, 200));
        engCalcPanel.setLocation(10, 150);
        engCalcPanel.setLayout(new GridLayout(4, 3));
    }
    
    private void engKeyboardPanelInit()
    {
        engKeyboardPanel = new JPanel();
        engKeyboardPanel.setPreferredSize(new Dimension(200, 200));
        engKeyboardPanel.setLayout(new FlowLayout());
    }
}
