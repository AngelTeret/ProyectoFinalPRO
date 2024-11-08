/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author angel
 */
public class formVendedor extends javax.swing.JFrame {
    usuarios mod;
    Conexion cn = new Conexion();
    Connection con = cn.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    private TableRowSorter trsfiltro;
    
    public formVendedor() {
        initComponents();
        cargarTabla();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String rutaImagen = "/Componentes/personaje.png";
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource(rutaImagen));
        setIconImage(icono);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txtNombreB = new LIB.FSTexFieldMD();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtNombre = new LIB.FSTexFieldMD();
        txtApellido = new LIB.FSTexFieldMD();
        txtDpi = new LIB.FSTexFieldMD();
        btnGuardar = new LIB.FSButtonMD();
        btnModificar = new LIB.FSButtonMD();
        btnEliminar = new LIB.FSButtonMD();
        btnLimpiar = new LIB.FSButtonMD();
        txtCargo = new LIB.FSTexFieldMD();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 63, 99));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Vendedor");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ic_clear_128_28306.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Componentes/back_arrow_5821.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Componentes/test2.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(355, 355, 355)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(161, 165, 166));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        txtNombreB.setBackground(new java.awt.Color(161, 165, 166));
        txtNombreB.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreB.setBordeColorFocus(new java.awt.Color(25, 25, 25));
        txtNombreB.setBordeColorNoFocus(new java.awt.Color(0, 0, 0));
        txtNombreB.setCaretColor(new java.awt.Color(0, 0, 0));
        txtNombreB.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtNombreB.setMaterialDesing(true);
        txtNombreB.setPlaceholder("Buscar por nombre");
        txtNombreB.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txtNombreB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreBKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registro de Datos");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Busqueda de Datos");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(203, 203, 203))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(txtNombreB, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(192, 192, 192))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanel4.setBackground(new java.awt.Color(161, 165, 166));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));

        txtNombre.setBackground(new java.awt.Color(161, 165, 166));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBordeColorFocus(new java.awt.Color(25, 25, 25));
        txtNombre.setBordeColorNoFocus(new java.awt.Color(0, 0, 0));
        txtNombre.setCaretColor(new java.awt.Color(0, 0, 0));
        txtNombre.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtNombre.setMaterialDesing(true);
        txtNombre.setPlaceholder("Nombre");
        txtNombre.setSelectedTextColor(new java.awt.Color(51, 51, 51));

        txtApellido.setBackground(new java.awt.Color(161, 165, 166));
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido.setBordeColorFocus(new java.awt.Color(25, 25, 25));
        txtApellido.setBordeColorNoFocus(new java.awt.Color(0, 0, 0));
        txtApellido.setCaretColor(new java.awt.Color(0, 0, 0));
        txtApellido.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtApellido.setMaterialDesing(true);
        txtApellido.setPlaceholder("Apellido");
        txtApellido.setSelectedTextColor(new java.awt.Color(51, 51, 51));

        txtDpi.setBackground(new java.awt.Color(161, 165, 166));
        txtDpi.setForeground(new java.awt.Color(0, 0, 0));
        txtDpi.setBordeColorFocus(new java.awt.Color(25, 25, 25));
        txtDpi.setBordeColorNoFocus(new java.awt.Color(0, 0, 0));
        txtDpi.setCaretColor(new java.awt.Color(0, 0, 0));
        txtDpi.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtDpi.setMaterialDesing(true);
        txtDpi.setPlaceholder("DPI");
        txtDpi.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txtDpi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDpiKeyTyped(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setColorPressed(new java.awt.Color(0, 204, 51));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(0, 51, 153));
        btnModificar.setText("Modificar");
        btnModificar.setColorNormal(new java.awt.Color(0, 51, 153));
        btnModificar.setColorPressed(new java.awt.Color(0, 51, 153));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setColorNormal(new java.awt.Color(255, 0, 0));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(204, 102, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setColorNormal(new java.awt.Color(204, 102, 0));
        btnLimpiar.setColorPressed(new java.awt.Color(204, 102, 0));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtCargo.setBackground(new java.awt.Color(161, 165, 166));
        txtCargo.setForeground(new java.awt.Color(0, 0, 0));
        txtCargo.setBordeColorFocus(new java.awt.Color(25, 25, 25));
        txtCargo.setBordeColorNoFocus(new java.awt.Color(0, 0, 0));
        txtCargo.setCaretColor(new java.awt.Color(0, 0, 0));
        txtCargo.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtCargo.setMaterialDesing(true);
        txtCargo.setPlaceholder("Cargo");
        txtCargo.setSelectedTextColor(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDpi, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(357, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(96, 96, 96)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        int rowSelect = tabla.rowAtPoint(evt.getPoint());

        txtNombre.setText(tabla.getValueAt(rowSelect,1).toString());
        txtApellido.setText(tabla.getValueAt(rowSelect,2).toString());
        txtDpi.setText(tabla.getValueAt(rowSelect, 3).toString());
        txtCargo.setText(tabla.getValueAt(rowSelect,4).toString());
    }//GEN-LAST:event_tablaMouseClicked

    private void txtNombreBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreBKeyTyped
        // TODO add your handling code here:
        txtNombreB.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(final KeyEvent e){
                String cadena = (txtNombreB.getText());
                txtNombreB.setText(cadena);
                repaint();
                filtro();
                cargarTabla();

            }
        });
        trsfiltro = new TableRowSorter(tabla.getModel());
        tabla.setRowSorter(trsfiltro);
    }//GEN-LAST:event_txtNombreBKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if(txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtDpi.getText().isEmpty() || txtCargo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "rellenar las cajas de texto");
        }else{
            insertDate();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if(txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtDpi.getText().isEmpty() || txtCargo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "rellenar las cajas de texto");
        }else{
            actualizaDatos();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String dpi = txtDpi.getText().trim();
        String cargo = txtCargo.getText().trim();

        // Verificar si alguno de los campos está vacío
        if (nombre.isEmpty() || apellido.isEmpty() || dpi.isEmpty() || cargo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se puede eliminar, las cajas de texto están vacías.");
        } else {
            // Mostrar confirmación antes de eliminar
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro desea eliminar a " + nombre + " " + apellido + "?");
            if (respuesta == JOptionPane.YES_OPTION) {
                eliminarDatos();
            }
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        sqlUsuarios modSql = new sqlUsuarios();
        usuarios mod = new usuarios();
        if (mod != null) {
            this.dispose();
            MainMenu frmHome = new MainMenu(mod);
            frmHome.setVisible(true);
        } else {
            System.out.println("Error: el objeto 'mod' es nulo.");
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void txtDpiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDpiKeyTyped
        // TODO add your handling code here:
      char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo Números");
        }
        
        if(txtDpi.getText().length() >= 13){ 
            evt.consume();
        }
    }//GEN-LAST:event_txtDpiKeyTyped

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
            java.util.logging.Logger.getLogger(formVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formVendedor().setVisible(true);
            }
        });
    }
    
    public void filtro() {
        trsfiltro.setRowFilter(RowFilter.regexFilter(txtNombreB.getText(), 1));
    }
        
    public void insertDate(){

        try{
            ps = con.prepareStatement("INSERT INTO vendedor (nombre, apellido, dpi, cargo) VALUES(?,?,?,?)");
            ps.setString(1, txtNombre.getText());
            ps.setString(2, txtApellido.getText());
            ps.setString(3, txtDpi.getText());
            ps.setString(4, txtCargo.getText());
            
            int res = ps.executeUpdate();
            if (res > 0){
                JOptionPane.showMessageDialog(null, "Vendedor guardado!");
                limpiar();
                cargarTabla();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar Vendedor!");
                limpiar();
            }
            
        }catch(HeadlessException | SQLException e){
            System.err.println(e);
        } finally {
            cn.cerrar();
        }
    }
    
    public  void actualizaDatos(){

        try{
            con = cn.getConnection();
            ps = con.prepareStatement("UPDATE vendedor SET nombre = ? , apellido = ?, dpi = ?, cargo = ? WHERE id_vendedor = ?");
            int rowSelect = tabla.getSelectedRow();
            String date = (String)tabla.getValueAt(rowSelect, 0);
            ps.setString(1, txtNombre.getText());
            ps.setString(2, txtApellido.getText());
            ps.setString(3, txtDpi.getText());
            ps.setString(4, txtCargo.getText());
            ps.setString(5, date);
            
            int res = ps.executeUpdate();
            if (res > 0){
                JOptionPane.showMessageDialog(null, "Vendedor Actualizado!");
                limpiar();
                cargarTabla();
            }else{
                JOptionPane.showMessageDialog(null, "Error al actualizar Vendedor!");
                limpiar();
            }
            
        }catch(HeadlessException | SQLException e){
            System.err.println(e);
        } finally {
            cn.cerrar();
        }
        
    }
    
    public void eliminarDatos(){
            int rowSelect = tabla.getSelectedRow();
        try{
            con = cn.getConnection();
            ps = con.prepareStatement("DELETE FROM vendedor WHERE id_vendedor = "+tabla.getValueAt(rowSelect, 0));
            int res = ps.executeUpdate();
            if (res > 0){
                JOptionPane.showMessageDialog(null, "Vendedor Eliminado!");
                limpiar();
                cargarTabla();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar Vendedor!");
                limpiar();
            }
            
        }catch(HeadlessException | SQLException e){
            System.err.println(e);
        } finally {
            cn.cerrar();
        }
    }
        
    public void cargarTabla(){
        String [] encabezado = {"Numero", "Vendedor", "Apellido", "DPI","Cargo"};
        String [] contRegistro = new String[10];
        DefaultTableModel modelo = new DefaultTableModel(null, encabezado);
        String Query = ("select * from vendedor");
        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(Query);
            
            while(rs.next()){
                contRegistro[0] = rs.getString("id_vendedor");
                contRegistro[1] = rs.getString("nombre");
                contRegistro[2] = rs.getString("apellido");
                contRegistro[3] = rs.getString("dpi");
                contRegistro[4] = rs.getString("cargo");
                modelo.addRow(contRegistro);
            }
            
            tabla.setModel(modelo);
        } catch (SQLException e) {
            System.err.println(e);
        }
    } 
    
    public void limpiar(){
        txtNombre.setText(null);
        txtNombre.setText(""); 
        txtApellido.setText(null);
        txtApellido.setText("");
        txtDpi.setText(null);
        txtDpi.setText(""); 
        txtCargo.setText(null);
        txtCargo.setText("");
        txtNombreB.setText(null);
        txtNombreB.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.FSButtonMD btnEliminar;
    private LIB.FSButtonMD btnGuardar;
    private LIB.FSButtonMD btnLimpiar;
    private LIB.FSButtonMD btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private LIB.FSTexFieldMD txtApellido;
    private LIB.FSTexFieldMD txtCargo;
    private LIB.FSTexFieldMD txtDpi;
    private LIB.FSTexFieldMD txtNombre;
    private LIB.FSTexFieldMD txtNombreB;
    // End of variables declaration//GEN-END:variables
}
