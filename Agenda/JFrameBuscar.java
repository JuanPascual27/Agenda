import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JFrameBuscar extends JFrame{
   private PanelBuscar pB;
   
   public JFrameBuscar(JPanel p){
      pB = new PanelBuscar(p);
      initComponents();
   }
   
   private void initComponents(){
      setSize(300,300);
      setTitle("Buscar en la agenda");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(pB);
      setVisible(true);
   }
}