/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import Entidades.Alumnos;
import javax.swing.JFrame;
import Entidades.AlumnosDAO;
import java.awt.Component;
import java.awt.Image;
import java.sql.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author GIAN
 */
public class FrameAgregar extends javax.swing.JFrame {
    private FrameListaAlumnos padre;
    AlumnosDAO alumnosDAO = new AlumnosDAO();
    /**
     * Creates new form FrameAgregar
     */
    public FrameAgregar(FrameListaAlumnos padre) {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(lblLogo,"src/Imagenes/Logo.png");
        this.padre=padre;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BgFrameAgregar = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtDepartamento = new javax.swing.JTextField();
        txtProvincia = new javax.swing.JTextField();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        cbDocente = new javax.swing.JComboBox<>();
        cbEspecialidad = new javax.swing.JComboBox<>();
        rbF = new javax.swing.JRadioButton();
        rbM = new javax.swing.JRadioButton();
        btnRegresar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BgFrameAgregar.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setText("FECHA");

        jLabel2.setText("DNI");

        jLabel3.setText("NOMBRE");

        jLabel4.setText("DEPARTAMENTO");

        jLabel5.setText("TELEFONO");

        jLabel6.setText("ESPECIALIDAD");

        jLabel7.setText("EDAD");

        jLabel8.setText("DOCENTE");

        jLabel9.setText("PROVINCIA");

        jLabel10.setText("SEXO");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        jdcFecha.setDateFormatString("yyyy-MM-dd");

        cbDocente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Olivia Apaza", "Mario Soledad" }));

        cbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Confeccion Textil", "Construcciones Metalicas" }));

        rbF.setText("Mujer");
        rbF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFActionPerformed(evt);
            }
        });

        rbM.setText("Hombre");

        btnRegresar.setText("<<<Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnInsertar.setText("Agregar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("REGISTRAR DATOS ALUMNOS");

        javax.swing.GroupLayout BgFrameAgregarLayout = new javax.swing.GroupLayout(BgFrameAgregar);
        BgFrameAgregar.setLayout(BgFrameAgregarLayout);
        BgFrameAgregarLayout.setHorizontalGroup(
            BgFrameAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgFrameAgregarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(BgFrameAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BgFrameAgregarLayout.createSequentialGroup()
                        .addGroup(BgFrameAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BgFrameAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdni, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(txtTelefono)
                            .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(txtDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jdcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(80, 80, 80)
                        .addGroup(BgFrameAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BgFrameAgregarLayout.createSequentialGroup()
                                .addGroup(BgFrameAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BgFrameAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgFrameAgregarLayout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(20, 20, 20))
                                        .addGroup(BgFrameAgregarLayout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(29, 29, 29)))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7))
                                .addGap(29, 29, 29)
                                .addGroup(BgFrameAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEdad)
                                    .addComponent(cbEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtProvincia)
                                    .addComponent(cbDocente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(BgFrameAgregarLayout.createSequentialGroup()
                                        .addComponent(rbM)
                                        .addGap(37, 37, 37)
                                        .addComponent(rbF)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(btnInsertar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel11))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        BgFrameAgregarLayout.setVerticalGroup(
            BgFrameAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgFrameAgregarLayout.createSequentialGroup()
                .addGroup(BgFrameAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgFrameAgregarLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel11)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgFrameAgregarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(BgFrameAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(BgFrameAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(BgFrameAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BgFrameAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel8)
                        .addComponent(cbDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(BgFrameAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(BgFrameAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbM)
                    .addComponent(rbF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(BgFrameAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgFrameAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgFrameAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
    FrameListaAlumnos Main = padre;
        Main.setLocationRelativeTo(this);
        Main.setVisible(true);
        this.setVisible(false);   
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:
        try{
            //Imagen
            ImageIcon icono = new ImageIcon("src/Imagenes/check.png");
            //Ajustar dimenciones del icono 
            int x = 100;
            int y = 100;
            Image ScalaImagen = icono.getImage().getScaledInstance(y, x, Image.SCALE_SMOOTH);
            ImageIcon ScaledIcon = new ImageIcon(ScalaImagen);
            
            //Obtener el componente de la ventana principal
            Component parentComponent = this;
            
            int codigo = Integer.parseInt(txtdni.getText());
            String nombre = txtnombre.getText();
            int telefono = Integer.parseInt(txtTelefono.getText());
            String especialidad = cbEspecialidad.getSelectedItem().toString();
            String docente = cbDocente.getSelectedItem().toString();   
            String fecha = ((JTextField)jdcFecha.getDateEditor().getUiComponent()).getText();
            String departamento = txtDepartamento.getText();
            String provincia = txtProvincia.getText();
            String sexo;
            if(rbF.isSelected() == true){ //F = Femenino -> M = Mujer
                sexo = "M";
            }else if(rbM.isSelected() == true){ //M = Masculino -> H = Hombre
                sexo = "H";
            }else{
                sexo = "N";
            }
            int edad = Integer.parseInt(txtEdad.getText());
            //Evitamos que el codigo(DNI) se repita
            if (alumnosDAO.ExisteCodigo(codigo)) {
                JOptionPane.showMessageDialog(this,"DNI ya Existente", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Alumnos alumno = new Alumnos(codigo,nombre,telefono,especialidad,docente,Date.valueOf(fecha),departamento,provincia,edad,sexo);
            alumnosDAO.Insert(alumno); //Insertamos alumno a la base de datos
            JOptionPane.showMessageDialog(parentComponent, "Se Agrego Correctamente","Mensaje",JOptionPane.INFORMATION_MESSAGE,ScaledIcon);
            //llamos a la funcion actualizarTable del padre
            padre.actulizarTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"        Error al Insertar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnInsertarActionPerformed
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAgregar(new FrameListaAlumnos()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BgFrameAgregar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbDocente;
    private javax.swing.JComboBox<String> cbEspecialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JRadioButton rbF;
    private javax.swing.JRadioButton rbM;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}