import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IngresoAgenda extends JPanel implements ActionListener{
   private JButton btnIngresar, btnSalir;
   private JTextField txtUsuario;
   private JPasswordField pass;
   
   public IngresoAgenda(){
      setLayout(new GridLayout(3,2));
      JLabel lblUsuario = new JLabel("Nombre de usuario: ", JLabel.RIGHT);
      txtUsuario = new JTextField(20);
      add(lblUsuario);
      add(txtUsuario);
      
      JLabel lblPass = new JLabel("Contraseña", JLabel.RIGHT);
      pass = new JPasswordField(20);
      pass.setToolTipText("Ingrese su Contraseña");
      add(lblPass);
      add(pass);
      
      btnIngresar = new JButton ("Ingresar");
      btnIngresar.addActionListener(this);
      btnSalir = new JButton ("Salir");
      btnSalir.addActionListener(this);
      
      add(btnIngresar);
      add(btnSalir);
   }
   
   public void actionPerformed(ActionEvent e){
      String usuario = txtUsuario.getText();
      String password = new String(pass.getPassword());
      
      if(e.getSource() == btnIngresar){
         if(usuario.isEmpty() && password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese su nombre de usuario y password");
            txtUsuario.requestFocus();
         }else{
            if(usuario.equals("Juan27") && password.equals("fgFG1234")){
               JOptionPane.showMessageDialog(null, "Bienvenido a la Agenda");
               ((JFrame)SwingUtilities.getWindowAncestor(this)).dispose();
               JFrameMenu datos = new JFrameMenu();
            }else{
               JOptionPane.showMessageDialog(null, "Usuario o Password Incorrecto", "Warning", JOptionPane.WARNING_MESSAGE);
               txtUsuario.setText(null);
               pass.setText(null);
               txtUsuario.requestFocus();
            }
         }
      }
      
      if(e.getSource() == btnSalir){
         System.exit(0);
      }
   }
}