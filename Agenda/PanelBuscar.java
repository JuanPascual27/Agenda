import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelBuscar extends JPanel implements ActionListener{
   private JButton btnBuscar, btnSalir;
   private JTextField txtNombre, txtApellidoP, txtApellidoM, txtTelefono, txtDirE, txtDiaC, txtMesC, txtYearC;
   private JPanel p;
   private Persona objPersona;
   ManejoPersona mP = new ManejoPersona();
   
   public PanelBuscar(JPanel p){
      this.p = p;
      JLabel lblTitle = new JLabel("Ingrese los siguiente campos para realizar la busqueda:", JLabel.CENTER);
      add(lblTitle);
      setLayout(new GridLayout(10,2));
      JLabel lblNombre = new JLabel("Nombre: ", JLabel.CENTER);
      txtNombre = new JTextField(20);
      add(lblNombre);
      add(txtNombre);
      JLabel lblApellidoP = new JLabel("Apellido Paterno: ", JLabel.CENTER);
      txtApellidoP = new JTextField(30);
      add(lblApellidoP);
      add(txtApellidoP);
      JLabel lblApellidoM = new JLabel("Apellido Materno: ", JLabel.CENTER);
      txtApellidoM = new JTextField(30);
      txtApellidoM.setEditable(false);
      add(lblApellidoM);
      add(txtApellidoM);
      JLabel lblTelefono = new JLabel("Celular: ", JLabel.CENTER);
      txtTelefono = new JTextField(10);
      add(lblTelefono);
      add(txtTelefono);
      JLabel lblDirE = new JLabel("Direccion Electronica: ", JLabel.CENTER);
      txtDirE = new JTextField(30);
      txtDirE.setEditable(false);
      add(lblDirE);
      add(txtDirE);
      JLabel lblDiaC = new JLabel("Dia: ", JLabel.CENTER);
      txtDiaC = new JTextField(30);
      txtDiaC.setEditable(false);
      add(lblDiaC);
      add(txtDiaC);
      JLabel lblMesC = new JLabel("Mes: ", JLabel.CENTER);
      txtMesC = new JTextField(10);
      txtMesC.setEditable(false);
      add(lblMesC);
      add(txtMesC);
      JLabel lblYearC = new JLabel("Año: ", JLabel.CENTER);
      txtYearC = new JTextField(10);
      txtYearC.setEditable(false);
      add(lblYearC);
      add(txtYearC);
      
      btnBuscar = new JButton("Buscar");
      btnBuscar.addActionListener(this);
      btnSalir = new JButton("Salir");
      btnSalir.addActionListener(this);
      
      add(btnBuscar);
      add(btnSalir);
   }
   
   public void actionPerformed(ActionEvent e){
      if(e.getSource() == btnBuscar){
         if((txtNombre.getText() == null || txtNombre.getText().isEmpty()) || (txtApellidoP.getText() == null || txtApellidoP.getText().isEmpty())){ 
            JOptionPane.showMessageDialog(null, "Debes colocar el nombre y el apellido paterno", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.requestFocus();
         }else if(txtTelefono.getText() == null || txtTelefono.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes colocar el teléfono", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtTelefono.requestFocus();
         }else{
            if(mP.buscar(txtNombre.getText(), txtApellidoP.getText(), txtTelefono.getText()) != null){
               JOptionPane.showMessageDialog(null, "Se han encontrado los datos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
               objPersona = mP.buscar(txtNombre.getText(), txtApellidoP.getText(), txtTelefono.getText());
               txtNombre.setText(objPersona.getNombre());
               txtApellidoP.setText(objPersona.getApellidoP());
               txtApellidoM.setText(objPersona.getApellidoM());
               txtTelefono.setText(objPersona.getTelefono());
               txtDirE.setText(objPersona.getDirE());
               txtDiaC.setText(objPersona.getDiaC());
               txtMesC.setText(objPersona.getMesC());
               txtYearC.setText(objPersona.getYearC());
            }else{
               JOptionPane.showMessageDialog(null, "No se encontro", "Aviso", JOptionPane.INFORMATION_MESSAGE);
               txtNombre.setText("");
               txtApellidoP.setText("");
               txtApellidoM.setText("");
               txtTelefono.setText("");
               txtDirE.setText("");
               txtDiaC.setText("");
               txtMesC.setText("");
               txtYearC.setText("");
            }
         }
      }
      
      if(e.getSource() == btnSalir){
         ((JFrame)SwingUtilities.getWindowAncestor(p)).setVisible(true);
         ((JFrame)SwingUtilities.getWindowAncestor(this)).dispose();
      }
	}
}