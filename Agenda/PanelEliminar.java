import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelEliminar extends JPanel implements ActionListener{
   private JButton btnBuscar, btnSalir, btnEliminar, btnLimpiar;
   private JTextField txtNombre, txtApellidoP, txtApellidoM, txtTelefono, txtDirE, txtDiaC, txtMesC, txtYearC;
   private JPanel p;
   private Persona objPersona = null;
   ManejoPersona mP = new ManejoPersona();
   
   public PanelEliminar(JPanel p){
      this.p = p;
      JLabel lblEspacio = new JLabel("");
      JLabel lblTitle = new JLabel("Ingrese lo siguiente:", JLabel.RIGHT);
      add(lblTitle);
      add(lblEspacio);
      setLayout(new GridLayout(11,2));
      JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
      txtNombre = new JTextField(20);
      add(lblNombre);
      add(txtNombre);
      JLabel lblApellidoP = new JLabel("Apellido Paterno: ", JLabel.RIGHT);
      txtApellidoP = new JTextField(30);
      add(lblApellidoP);
      add(txtApellidoP);
      JLabel lblApellidoM = new JLabel("Apellido Materno: ", JLabel.RIGHT);
      txtApellidoM = new JTextField(30);
      txtApellidoM.setEditable(false);
      add(lblApellidoM);
      add(txtApellidoM);
      JLabel lblTelefono = new JLabel("Celular: ", JLabel.RIGHT);
      txtTelefono = new JTextField(10);
      add(lblTelefono);
      add(txtTelefono);
      JLabel lblDirE = new JLabel("Direccion Electronica: ", JLabel.RIGHT);
      txtDirE = new JTextField(30);
      txtDirE.setEditable(false);
      add(lblDirE);
      add(txtDirE);
      JLabel lblDiaC = new JLabel("Dia: ", JLabel.RIGHT);
      txtDiaC = new JTextField(30);
      txtDiaC.setEditable(false);
      add(lblDiaC);
      add(txtDiaC);
      JLabel lblMesC = new JLabel("Mes: ", JLabel.RIGHT);
      txtMesC = new JTextField(10);
      txtMesC.setEditable(false);
      add(lblMesC);
      add(txtMesC);
      JLabel lblYearC = new JLabel("Año: ", JLabel.RIGHT);
      txtYearC = new JTextField(10);
      txtYearC.setEditable(false);
      add(lblYearC);
      add(txtYearC);
      
      btnBuscar = new JButton("Buscar");
      btnBuscar.addActionListener(this);
      btnSalir = new JButton("Salir");
      btnSalir.addActionListener(this);
      btnLimpiar = new JButton("Limpiar");
      btnLimpiar.addActionListener(this);
      btnEliminar = new JButton("Eliminar");
      btnEliminar.addActionListener(this);
      
      add(btnBuscar);
      add(btnEliminar);
      add(btnLimpiar);
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
            if(mP.buscar(txtNombre.getText(), txtApellidoP.getText(), txtTelefono.getText()) != null && objPersona == null){
               JOptionPane.showMessageDialog(null, "Se han encontrado los datos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
               objPersona = mP.buscar(txtNombre.getText(), txtApellidoP.getText(), txtTelefono.getText());
               txtNombre.setText(objPersona.getNombre());
               txtNombre.setEditable(false);
               txtApellidoP.setText(objPersona.getApellidoP());
               txtApellidoP.setEditable(false);
               txtApellidoM.setText(objPersona.getApellidoM());
               txtTelefono.setText(objPersona.getTelefono());
               txtTelefono.setEditable(false);
               txtDirE.setText(objPersona.getDirE());
               txtDiaC.setText(objPersona.getDiaC());
               txtMesC.setText(objPersona.getMesC());
               txtYearC.setText(objPersona.getYearC());
            }else if(objPersona != null){
               JOptionPane.showMessageDialog(null, "Primero limpie los campos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }else{
               JOptionPane.showMessageDialog(null, "No se encontro", "Aviso", JOptionPane.INFORMATION_MESSAGE);
               txtNombre.setText("");
               txtApellidoP.setText("");
               txtTelefono.setText("");
               txtNombre.requestFocus();
            }
         }
      }
      if(e.getSource() == btnEliminar){
         if(objPersona != null){
            int valorR = JOptionPane.showConfirmDialog(null, "¿Estas seguro que deseas eliminarlo?", "WARNING", JOptionPane.YES_NO_OPTION);
            if(valorR == JOptionPane.YES_OPTION) {
               mP.eliminar(objPersona);
               JOptionPane.showMessageDialog(null, "Se ha eliminado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
               txtNombre.setText("");
               txtNombre.setEditable(true);
               txtApellidoP.setText("");
               txtApellidoP.setEditable(true);
               txtApellidoM.setText("");
               txtTelefono.setText("");
               txtTelefono.setEditable(true);
               txtDirE.setText("");
               txtDiaC.setText("");
               txtMesC.setText("");
               txtYearC.setText("");
               txtNombre.requestFocus();
               objPersona = null;
            }
         }else{
            JOptionPane.showMessageDialog(null, "Primero busque los datos por favor", "Aviso", JOptionPane.INFORMATION_MESSAGE);
         }
      }
      if(e.getSource() == btnLimpiar){
         JOptionPane.showMessageDialog(null, "Se limpiaran los datos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
         txtNombre.setText("");
         txtNombre.setEditable(true);
         txtApellidoP.setText("");
         txtApellidoP.setEditable(true);
         txtApellidoM.setText("");
         txtTelefono.setText("");
         txtTelefono.setEditable(true);
         txtDirE.setText("");
         txtDiaC.setText("");
         txtMesC.setText("");
         txtYearC.setText("");
         txtNombre.requestFocus();
         objPersona = null;
      }
      if(e.getSource() == btnSalir){
         ((JFrame)SwingUtilities.getWindowAncestor(p)).setVisible(true);
         ((JFrame)SwingUtilities.getWindowAncestor(this)).dispose();
      }
	}
}