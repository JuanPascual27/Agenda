import javax.swing.*;
import java.awt.*;

public class JFrameIngreso extends JFrame{
   IngresoAgenda pIA = new IngresoAgenda();
   
   public JFrameIngreso(){
      initComponents();
   }
   
   private void initComponents(){
      setSize(300, 200);
      setTitle("Usuario y contraseña");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(pIA);
      setVisible(true);
   }
   
}