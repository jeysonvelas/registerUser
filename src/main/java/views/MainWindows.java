package views;

import datos.PersonaDAO;
import domain.Persona;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.*;
import javax.swing.table.TableRowSorter;

public class MainWindows extends javax.swing.JFrame {

    TableRowSorter trs = null;

    public MainWindows() {
        initComponents();
        setLocationRelativeTo(null);
        mostrarDatos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        textSearch = new javax.swing.JTextField();
        comboSearch = new javax.swing.JComboBox<>();
        buttonUpdate = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonInsert = new javax.swing.JButton();
        buttonRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaPersonas);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar por:"));

        textSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textSearchKeyTyped(evt);
            }
        });

        comboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellido", "Email" }));

        buttonUpdate.setText("Actualizar Datos");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonDelete.setText("Elminar Usuario");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonInsert.setText("Insertar Usuario");
        buttonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertActionPerformed(evt);
            }
        });

        buttonRefresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\jeyson.velasquez\\Pictures\\reload.png")); // NOI18N
        buttonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonUpdate)
                        .addComponent(buttonDelete)
                        .addComponent(buttonInsert))
                    .addComponent(buttonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed

        int fila = tablaPersonas.getSelectedRow();

        if (fila == -1) {

            mostrarDatos();
            JOptionPane.showMessageDialog(null, "Por favor primero selecciona y modifica las celdas que deseas actualizar");

        } else {
            modificarRegistros();
        }

    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed

        int fila = tablaPersonas.getSelectedRow();
        int respuesta;

        try {

            if (fila == -1) {

                JOptionPane.showMessageDialog(null, "Por favor primero selecciona el usuario a eliminar");

            } else {

                respuesta = JOptionPane.showConfirmDialog(null, "?? Esta seguro que quiere eliminar este usuario ?");

                if (respuesta == JOptionPane.YES_OPTION) {

                    eliminarRegistros();
                    mostrarDatos();
                    JOptionPane.showMessageDialog(null, "El usuario ha sido eliminado exitosamente");

                } else {

                    JOptionPane.showMessageDialog(null, "No se elimino ningun usuario");

                }
            }

        } catch (Exception e) {

        }


    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertActionPerformed

        SecondaryWindows p = new SecondaryWindows();
        p.setVisible(true);
        p.setLocationRelativeTo(null);


    }//GEN-LAST:event_buttonInsertActionPerformed


    private void textSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSearchKeyTyped

        textSearch.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {

                int opcion = comboSearch.getSelectedIndex();

                if (opcion == 0) {

                    trs.setRowFilter(RowFilter.regexFilter("(?i)" + textSearch.getText(), 1));

                } else {

                    if (opcion == 1) {

                        trs.setRowFilter(RowFilter.regexFilter("(?i)" + textSearch.getText(), 2));

                    } else {

                        trs.setRowFilter(RowFilter.regexFilter("(?i)" + textSearch.getText(), 3));
                    }

                }

            }

        });

        trs = new TableRowSorter(tablaPersonas.getModel());
        tablaPersonas.setRowSorter(trs);


    }//GEN-LAST:event_textSearchKeyTyped

    private void buttonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshActionPerformed

        mostrarDatos();

    }//GEN-LAST:event_buttonRefreshActionPerformed

    public void mostrarDatos() {

        DefaultTableModel tPersona = new DefaultTableModel();

        tPersona.addColumn("ID");
        tPersona.addColumn("Nombre");
        tPersona.addColumn("Apellido");
        tPersona.addColumn("Email");
        tPersona.addColumn("Telefono");

        tablaPersonas.setModel(tPersona);

        String[] data = new String[5];
        PersonaDAO personaDAO = new PersonaDAO();

        //Se llama al metodo listarDatos y se guarda la informacion en una lista de tipo Persona
        List<Persona> personas = personaDAO.listarDatos();

        //forEach normal
        for (Persona persona : personas) {

            data[0] = String.valueOf(persona.getIdPersona());
            data[1] = persona.getNombre();
            data[2] = persona.getApellido();
            data[3] = persona.getEmail();
            data[4] = persona.getTelefono();

            tPersona.addRow(data);

        }

    }

    public void modificarRegistros() {

        int fila = tablaPersonas.getSelectedRow();

        int id = Integer.parseInt(this.tablaPersonas.getValueAt(fila, 0).toString());

        String nombre = tablaPersonas.getValueAt(fila, 1).toString();
        String apellido = tablaPersonas.getValueAt(fila, 2).toString();
        String email = tablaPersonas.getValueAt(fila, 3).toString();
        String telefono = tablaPersonas.getValueAt(fila, 4).toString();

        PersonaDAO personaDAO = new PersonaDAO();
        Persona persona = new Persona(id, nombre, apellido, email, telefono);

        personaDAO.modificarDatos(persona);
        mostrarDatos();

    }

    public void eliminarRegistros() {

        int fila = tablaPersonas.getSelectedRow();

        int valor = Integer.parseInt(tablaPersonas.getValueAt(fila, 0).toString());

        PersonaDAO personaDAO = new PersonaDAO();
        Persona persona = new Persona(valor);
        personaDAO.eliminarDatos(persona);

    }

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
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindows().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonInsert;
    private javax.swing.JButton buttonRefresh;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JComboBox<String> comboSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable tablaPersonas;
    private javax.swing.JTextField textSearch;
    // End of variables declaration//GEN-END:variables
}
