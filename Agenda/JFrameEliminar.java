import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JFrameEliminar extends JFrame{
   private PanelEliminar pE;
   
   public JFrameEliminar(JPanel p){
      pE = new PanelEliminar(p);
      initComponents();
   }
   
   private void initComponents(){
      setSize(300,300);
      setTitle("Eliminar datos de la agenda");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(pE);
      setVisible(true);
   }
}