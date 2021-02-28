import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelAlta extends JPanel implements ActionListener{
   private JButton btnGuardar, btnSalir;
   private JTextField txtNombre, txtApellidoP, txtApellidoN, txtTelefono, txtDirE, txtDiaC, txtMesC, txtYearC;
   private JPanel p;
   
   public PanelAlta(JPanel p){
      this.p = p;
      setLayout(new GridLayout(9,2));
      JLabel lblNombre = new JLabel("Nombre: ", JLabel.CENTER);
      txtNombre = new JTextField(20);
      add(lblNombre);
      add(txtNombre);
      JLabel lblApellidoP = new JLabel("Apellido Paterno: ", JLabel.CENTER);
      txtApellidoP = new JTextField(30);
      add(lblApellidoP);
      add(txtApellidoP);
      JLabel lblApellidoN = new JLabel("Apellido Materno: ", JLabel.CENTER);
      txtApellidoN = new JTextField(30);
      add(lblApellidoN);
      add(txtApellidoN);
      JLabel lblTelefono = new JLabel("Celular: ", JLabel.CENTER);
      txtTelefono = new JTextField(10);
      add(lblTelefono);
      add(txtTelefono);
      JLabel lblDirE = new JLabel("Direccion Electronica: ", JLabel.CENTER);
      txtDirE = new JTextField(30);
      add(lblDirE);
      add(txtDirE);
      JLabel lblDiaC = new JLabel("Dia: ", JLabel.CENTER);
      txtDiaC = new JTextField(30);
      add(lblDiaC);
      add(txtDiaC);
      JLabel lblMesC = new JLabel("Mes: ", JLabel.CENTER);
      txtMesC = new JTextField(10);
      add(lblMesC);
      add(txtMesC);
      JLabel lblYearC = new JLabel("A�o: ", JLabel.CENTER);
      txtYearC = new JTextField(10);
      add(lblYearC);
      add(txtYearC);
      
      btnGuardar = new JButton("Guardar");
      btnGuardar.addActionListener(this);
      btnSalir = new JButton("Salir");
      btnSalir.addActionListener(this);
      
      add(btnGuardar);
      add(btnSalir);
   }
   
   public void actionPerformed(ActionEvent e){
      if(e.getSource() == btnGuardar){
         if(txtNombre.getText() == null || txtNombre.getText().isEmpty()){ 
            JOptionPane.showMessageDialog(null, "Debes colocar al menos el nombre", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.requestFocus();
         }else if(txtTelefono.getText() == null || txtTelefono.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes capturar su tel�fono", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtTelefono.requestFocus();
         }else{
            JOptionPane.showMessageDialog(null, "Se guardar�n los datos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.setText(null);		
            txtTelefono.setText("");
            txtApellidoP.setText("");
            txtNombre.requestFocus();
         }
      }
      
      if(e.getSource() == btnSalir){
         ((JFrame)SwingUtilities.getWindowAncestor(p)).setVisible(true);
         ((JFrame)SwingUtilities.getWindowAncestor(this)).dispose();
      }
	}
}