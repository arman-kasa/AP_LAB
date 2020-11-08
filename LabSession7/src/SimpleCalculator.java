import javax.swing.*;
import java.awt.*;

public class SimpleCalculator
{
    private JTextArea display;
    private JPanel keyboardPanel;
    
    public SimpleCalculator()
    {
        displayInit();
        keyboardPanelInit();
        //adding 1-9 buttons
        for (int i = 9; i > 0; i--)
        {
            JButton btn = new JButton();
            btn.setText("" + i);
            simpleKeyboardPanel.add(btn);
        }
    
        //adding "+" "0" "=" buttons
        JButton sumBtn = new JButton();
        sumBtn.setText("+");
        simpleKeyboardPanel.add(sumBtn);
        JButton zeroBtn = new JButton();
        zeroBtn.setText("0");
        simpleKeyboardPanel.add(zeroBtn);
        JButton doBtn = new JButton();
        doBtn.setText("=");
        simpleKeyboardPanel.add(doBtn);
    
        //adding display
        display = new JTextArea(3, 10);
        display.setEditable(false);
        display.setSize(200,200);
        display.setFont(new Font("Arial", Font.PLAIN, 14));
    
        //adding keyboard and display
        simpleCalcPanel.add(display);
        simpleCalcPanel.add(simpleKeyboardPanel);
    
        //adding scroll
        JScrollPane scrollPane = new JScrollPane(display);
        scrollPane.setPreferredSize(new Dimension(200, 100));
        scrollPane.setLocation(50, 20);
        simpleCalcPanel.add(scrollPane);
    }
    
    private void displayInit()
    {
    
    }
    
    
    private void keyboardPanelInit()
    {
        simpleCalcPanel = new JPanel();
        simpleCalcPanel.setSize(200, 400);
        GridLayout layout = new GridLayout();
        layout.setRows(2);
        layout.setColumns(1);
        simpleCalcPanel.setLayout(layout);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //
    private void simpleCalcPanelInit()
    {
    
    }
    private void simpleKeyboardPanelInit()
    {
        simpleKeyboardPanel = new JPanel();
        simpleKeyboardPanel.setSize(200, 200);
        simpleKeyboardPanel.setLocation(10, 150);
        simpleKeyboardPanel.setLayout(new GridLayout(4, 3));
    }
}
