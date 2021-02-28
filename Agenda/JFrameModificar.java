import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JFrameModificar extends JFrame{
   private PanelModificar pM;
   
   public JFrameModificar(JPanel p){
      pM = new PanelModificar(p);
      initComponents();
   }
   
   private void initComponents(){
      setSize(300,300);
      setTitle("Modificar la agenda");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(pM);
      setVisible(true);
   }
}