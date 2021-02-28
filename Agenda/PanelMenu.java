import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelMenu extends JPanel implements ActionListener{
   private JButton btnAlta, btnBuscar, btnEliminar, btnModificar, btnSalir;
   
   public PanelMenu(){
      setLayout(new GridLayout(5,1));
      
      btnAlta = new JButton("Dar de alta en agenda");
      btnAlta.addActionListener(this);
      btnBuscar = new JButton("Buscar en agenda");
      btnBuscar.addActionListener(this);
      btnEliminar = new JButton("Eliminar de agenda");
      btnEliminar.addActionListener(this);
      btnModificar = new JButton("Modificar en agenda");
      btnModificar.addActionListener(this);
      btnSalir = new JButton("Salir");
      btnSalir.addActionListener(this);
      
      add(btnAlta);
      add(btnBuscar);
      add(btnEliminar);
      add(btnModificar);
      add(btnSalir);
      
   }
   
   public void actionPerformed(ActionEvent e){
      ((JFrame)SwingUtilities.getWindowAncestor(this)).setVisible(false);
      if(e.getSource() == btnAlta){
         JFrameAlta jFA = new JFrameAlta(this);
      }else if(e.getSource() == btnBuscar){
         JFrameBuscar jFB = new JFrameBuscar(this);
      }else if(e.getSource() == btnModificar){
         JFrameModificar jFM = new JFrameModificar(this);
      }else if(e.getSource() == btnEliminar){
         JFrameEliminar jFE = new JFrameEliminar(this);
      }  
      if(e.getSource() == btnSalir)
         System.exit(0);
	}
}