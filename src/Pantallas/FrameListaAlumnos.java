/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;
import Entidades.Alumnos;
import Entidades.AlumnosDAO;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author GIAN
 */
public class FrameListaAlumnos extends javax.swing.JFrame {

    AlumnosDAO alumnosDao = new AlumnosDAO();
    
   
    public FrameListaAlumnos() {
        initComponents();
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(FondoListatxt,"src/Imagenes/Fondo.jpg");
        actulizarTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Fondo = new javax.swing.JPanel();
        lblRegresar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaListAlumnos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        FondoListatxt = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegresar.setBackground(new java.awt.Color(255, 255, 255));
        lblRegresar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblRegresar.setForeground(new java.awt.Color(255, 51, 51));
        lblRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegresar.setText("<<<");
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
        });
        Fondo.add(lblRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 40, 30));

        TablaListAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre ", "Telefono", "Especialidad", "Docente", "Fecha", "Departamento", "Provincia", "Edad", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaListAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaListAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaListAlumnos);

        Fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 710, 280));

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setText("Lista De Alumnos");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 200, 40));
        Fondo.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 510, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        Fondo.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 110, 40));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        Fondo.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 110, 40));

        btnAgregar.setText("Insertar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        Fondo.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 110, 40));
        Fondo.add(FondoListatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 810, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        FrameAgregar NuevoAlumno = new FrameAgregar(this);
        NuevoAlumno.setLocationRelativeTo(this);
        NuevoAlumno.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try{
            String mensaje;
            int codigo; //= Integer.parseInt(txtBuscar.getText());  
            mensaje = JOptionPane.showInputDialog("Ingrese el codigo a Eliminar: ");
            codigo = Integer.parseInt(mensaje);
            Eliminar(codigo);
            //Actualizar tabla 
            actulizarTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error al Eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void TablaListAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaListAlumnosMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int SelectedRows = TablaListAlumnos.getSelectedRow();
            if (SelectedRows != -1) {
            //Obtenemos los datos de la fila
            int codigo = (int) TablaListAlumnos.getValueAt(SelectedRows, 0);
            String nombre = (String) TablaListAlumnos.getValueAt(SelectedRows, 1);
            int telefono = (int) TablaListAlumnos.getValueAt(SelectedRows, 2);
            String especialidad = (String) TablaListAlumnos.getValueAt(SelectedRows, 3);
            String docente = (String) TablaListAlumnos.getValueAt(SelectedRows, 4);
            Date fecha = (Date) TablaListAlumnos.getValueAt(SelectedRows, 5);
            String departamento = (String) TablaListAlumnos.getValueAt(SelectedRows, 6);
            String provincia = (String) TablaListAlumnos.getValueAt(SelectedRows, 7);
            int edad = (int) TablaListAlumnos.getValueAt(SelectedRows, 8);
            String sexo = (String) TablaListAlumnos.getValueAt(SelectedRows, 9);
                        
            FrameModificar ModificarAlumno = new FrameModificar(codigo,nombre,telefono,especialidad,docente, (java.sql.Date) fecha,departamento,provincia,edad,sexo);
            ModificarAlumno.setLocationRelativeTo(this);
            ModificarAlumno.setVisible(true);
            this.setVisible(false);
            }
        }
    }//GEN-LAST:event_TablaListAlumnosMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try{
            String Buscar = txtBuscar.getText().trim();
            if (Buscar.isEmpty()) {
                actulizarTable();
            }else{
                int codigo = Integer.parseInt(Buscar);
                List<Alumnos> AlumEncontrado = alumnosDao.Search(codigo);
                if (!AlumEncontrado.isEmpty()) {
                    Buscar(AlumEncontrado); //Utilizamos el metodo Buscar
                }else{
                    JOptionPane.showMessageDialog(this,"DNI Inválido", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }catch(Exception e){   
            JOptionPane.showMessageDialog(this,"Error de busqueda", "Error", JOptionPane.ERROR_MESSAGE);
        }       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        // TODO add your handling code here:
        SeleccionEspecialidad SelEspec = new SeleccionEspecialidad();
        SelEspec.setLocationRelativeTo(this);
        SelEspec.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_lblRegresarMouseClicked

    void Buscar(List<Alumnos> resultado){
        DefaultTableModel modeloTabla = (DefaultTableModel)TablaListAlumnos.getModel();
        modeloTabla.setRowCount(0);
        for (Alumnos alumno: resultado) {
            modeloTabla.addRow(new Object[]{alumno.getCodigo(),alumno.getNombre(),alumno.getTelefono(),alumno.getEspecialidad(),
            alumno.getDocente(),alumno.getFecha(),alumno.getDepartamento(),alumno.getProvincia(),alumno.getEdad(),alumno.getSexo()});            
        }
    }
    
    private void Eliminar(int CodigoEliminar){    
        Alumnos alumno = new Alumnos(CodigoEliminar);   
        int registroEliminar = alumnosDao.delete(alumno);
    }
  
    void actulizarTable(){
        List<Alumnos>ListaAlumnos = alumnosDao.view();
        DefaultTableModel modeloTabla = (DefaultTableModel)TablaListAlumnos.getModel();
        modeloTabla.setRowCount(0);
        for(Alumnos alumno: ListaAlumnos){
            modeloTabla.addRow(new Object[]{alumno.getCodigo(),alumno.getNombre(),alumno.getTelefono(),alumno.getEspecialidad(),
                alumno.getDocente(),alumno.getFecha(),alumno.getDepartamento(),alumno.getProvincia(),alumno.getEdad(),alumno.getSexo()});
        }
    }    
    
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
            java.util.logging.Logger.getLogger(FrameListaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameListaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameListaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameListaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameListaAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel FondoListatxt;
    private javax.swing.JTable TablaListAlumnos;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
