import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JFrameAlta extends JFrame{
   private PanelAlta pA;
   
   public JFrameAlta(JPanel p){
      pA = new PanelAlta(p);
      initComponents();
   }
   
   private void initComponents(){
      setSize(300,300);
      setTitle("Dar de alta en agenda");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(pA);
      setVisible(true);
   }
}