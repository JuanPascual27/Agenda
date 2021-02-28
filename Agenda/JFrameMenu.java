import javax.swing.*;
import java.awt.*;

public class JFrameMenu extends JFrame{
   PanelMenu pm = new PanelMenu();
   
   public JFrameMenu(){
      initComponents();
   }
   
   private void initComponents(){
      setSize(300,200);
      setTitle("Menu de Agenda");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(pm);
      setVisible(true);
   }
}