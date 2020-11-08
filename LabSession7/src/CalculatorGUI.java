import javax.swing.*;
import java.awt.*;

public class CalculatorGUI
{
    private JFrame calcFrame;
    private JTabbedPane tabPanel;
    
    private JPanel simpleCalcPanel;
    private JPanel engCalcPanel;
    
    
    public CalculatorGUI()
    {
        simpleCalcPanel = new SimpleCalculator().getPanel();
        engCalcPanel = new AdvancedCalculator().getPanel();
        calcFrameInit();
        tabPanelInit();
        tabPanel.addTab("Simple", simpleCalcPanel);
        tabPanel.addTab("Scientific", engCalcPanel);
        calcFrame.setContentPane(tabPanel);
        setNimbusLayout();
        calcFrame.setVisible(true);
    }
    
    private void calcFrameInit()
    {
        calcFrame = new JFrame();
        calcFrame.setTitle("AUT Calculator");
        calcFrame.setSize(300, 300);
        calcFrame.setLocation(100, 200);
        calcFrame.setLayout(null);
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void tabPanelInit()
    {
        tabPanel = new JTabbedPane();
        tabPanel.setSize(200, 400);
        GridLayout layout = new GridLayout();
        layout.setRows(1);
        layout.setColumns(1);
        tabPanel.setLayout(layout);
    }
    
    private void setNimbusLayout()
    {
        try
        {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (Exception e)
        {
            // If Nimbus is not available, you can set the GUI to another look and feel. }
            //do nothing!
        }
    }
}
