import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelMenu extends JPanel implements ActionListener{
   private JButton btnAlta, btnBuscar, btnEliminar, btnModificar, btnSalir;
   ManejoPersona mP = new ManejoPersona();
   JFrameBuscar jFB;
   JFrameModificar jFM;
   JFrameEliminar jFE;
   
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
      if(e.getSource() == btnAlta){
         ((JFrame)SwingUtilities.getWindowAncestor(this)).setVisible(false);
         JFrameAlta jFA = new JFrameAlta(this);
      }else if(e.getSource() == btnBuscar){
         if(mP.datos().size() > 0){
            ((JFrame)SwingUtilities.getWindowAncestor(this)).setVisible(false);
            jFB = new JFrameBuscar(this);
         }else
            JOptionPane.showMessageDialog(null, "No hay datos en la agenda", "Aviso", JOptionPane.INFORMATION_MESSAGE);
      }else if(e.getSource() == btnModificar){
         if(mP.datos().size() > 0){
            ((JFrame)SwingUtilities.getWindowAncestor(this)).setVisible(false);
            jFM = new JFrameModificar(this);
         }else
            JOptionPane.showMessageDialog(null, "No hay datos en la agenda", "Aviso", JOptionPane.INFORMATION_MESSAGE);
      }else if(e.getSource() == btnEliminar){
         if(mP.datos().size() > 0){
            ((JFrame)SwingUtilities.getWindowAncestor(this)).setVisible(false);
            jFE = new JFrameEliminar(this);
         }else
            JOptionPane.showMessageDialog(null, "No hay datos en la agenda", "Aviso", JOptionPane.INFORMATION_MESSAGE);
      }  
      if(e.getSource() == btnSalir)
         System.exit(0);
	}
}