/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8_ricardogonzalez_11651018;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Richard
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        add_proyecto = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        add_pro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        add_nombre = new javax.swing.JTextField();
        add_duracion = new javax.swing.JTextField();
        add_retraso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cb_asig = new javax.swing.JComboBox<>();
        cb_pros = new javax.swing.JComboBox<>();
        cb_acts = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cb_option = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(add_proyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 150, -1));

        jLabel1.setText("Nueva Actividad");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jLabel2.setText("Nuevo Proyecto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
        jPanel1.add(add_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 190, -1));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jLabel4.setText("Proyecto Al Que Pertenece");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        jPanel1.add(add_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 150, -1));
        jPanel1.add(add_duracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 150, -1));
        jPanel1.add(add_retraso, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 150, -1));

        jLabel5.setText("Nombre");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabel6.setText("Duracion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel7.setText("Posibilidad de Retraso");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jButton2.setText("Agregar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        jButton3.setText("Ajustar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, -1, -1));

        jPanel1.add(cb_asig, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 190, -1));

        cb_pros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cb_pros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_prosItemStateChanged(evt);
            }
        });
        jPanel1.add(cb_pros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 160, -1));

        cb_acts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_actsMouseClicked(evt);
            }
        });
        jPanel1.add(cb_acts, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 420, 180, -1));

        jLabel8.setText("Proyecto");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jLabel9.setText("Actividad");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        jLabel10.setText("Asignacion");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, -1));

        cb_option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sucesor", "Predecesor" }));
        jPanel1.add(cb_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 180, -1));

        jTabbedPane1.addTab("Adicion", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Proyectos", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Proyecto p = new Proyecto();
        int cont = 0;
        p.setNombre(add_pro.getText());
        p.setDuracion(0);
        for (int i = 0; i < lista_proyectos.size(); i++) {
            if (lista_proyectos.get(i).getNombre().equals(add_pro.getText())) {
                cont++;
            }
        }
        if (cont > 0) {
            JOptionPane.showMessageDialog(this, "Este proyecto ya existe!");
        } else {
            JOptionPane.showMessageDialog(this, "Guardado con exito!");
            lista_proyectos.add(p);
            add_proyecto.addItem(add_pro.getText());
            cb_pros.addItem(add_pro.getText());
            add_pro.setText("");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try {

            String p = (String) add_proyecto.getSelectedItem();
            actividad a = new actividad();
            a.setNombre(add_nombre.getText());
            a.setDuracion(Integer.parseInt(add_duracion.getText()));
            a.setPosibilidad_de_retraso(Integer.parseInt(add_duracion.getText()));
            a.setFinal_temprano(1);
            a.setInicio_temprano(0);
            for (int i = 0; i < lista_proyectos.size(); i++) {
                if (lista_proyectos.get(i).getNombre().equals(p)) {
                    lista_proyectos.get(i).getActividades().add(a);
                    JOptionPane.showMessageDialog(this, "Agregada con exito.");
                    add_nombre.setText("");
                    add_duracion.setText("");
                    add_retraso.setText("");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en agregado.");
        }


    }//GEN-LAST:event_jButton2MouseClicked

    private void cb_actsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_actsMouseClicked

    }//GEN-LAST:event_cb_actsMouseClicked

    private void cb_prosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_prosItemStateChanged
        cb_acts.removeAllItems();
        cb_asig.removeAllItems();
        String select = (String) cb_pros.getSelectedItem();
        for (int i = 0; i < lista_proyectos.size(); i++) {
            if (lista_proyectos.get(i).getNombre().equals(select)) {
                Proyecto p = ((Proyecto) lista_proyectos.get(i));
                for (int j = 0; j < p.getActividades().size(); j++) {
                    String addto = ((actividad) p.getActividades().get(j)).getNombre();
                    cb_acts.addItem(addto);
                    cb_asig.addItem(addto);
                }
            }
        }


    }//GEN-LAST:event_cb_prosItemStateChanged

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        String select = (String) cb_pros.getSelectedItem();
        String selecta = (String) cb_acts.getSelectedItem();
        String selectb = (String) cb_asig.getSelectedItem();
        if (cb_option.getSelectedItem().equals("Predecesor")) {

            for (int i = 0; i < lista_proyectos.size(); i++) {
                if (lista_proyectos.get(i).getNombre().equals(select)) {

                    for (int j = 0; j < lista_proyectos.get(i).getActividades().size(); j++) {
                        if (lista_proyectos.get(i).getActividades().get(j).getNombre().equals(selectb)) {

                            lista_proyectos.get(i).getActividades().get(j).getPredecesoras().add(selecta);

                        }
                    }
                    for (int j = 0; j < lista_proyectos.get(i).getActividades().size(); j++) {
                        if (lista_proyectos.get(i).getActividades().get(j).getNombre().equals(selecta)) {

                            lista_proyectos.get(i).getActividades().get(j).getSucesoras().add(selectb);

                        }
                    }

                }
            }
            
//            actividad{nombre=a, inicio_temprano=2, duracion=1, final_temprano=3, predecesoras=[s], sucesoras=[], posibilidad_de_retraso=1}
//actividad{nombre=s, inicio_temprano=1, duracion=3, final_temprano=4, predecesoras=[], sucesoras=[a], posibilidad_de_retraso=3}
//actividad{nombre=a, inicio_temprano=5, duracion=1, final_temprano=6, predecesoras=[s], sucesoras=[], posibilidad_de_retraso=1}
//actividad{nombre=s, inicio_temprano=1, duracion=3, final_temprano=4, predecesoras=[], sucesoras=[a], posibilidad_de_retraso=3}
//BUILD SUCCESSFUL (total time: 1 minute 40 seconds)
            
        } else if (cb_option.getSelectedItem().equals("Sucesor")) {
            for (int i = 0; i < lista_proyectos.size(); i++) {
                if (lista_proyectos.get(i).getNombre().equals(select)) {

                    for (int j = 0; j < lista_proyectos.get(i).getActividades().size(); j++) {
                        if (lista_proyectos.get(i).getActividades().get(j).getNombre().equals(selectb)) {

                            lista_proyectos.get(i).getActividades().get(j).getSucesoras().add(selecta);

                        }
                    }
                    for (int j = 0; j < lista_proyectos.get(i).getActividades().size(); j++) {
                        if (lista_proyectos.get(i).getActividades().get(j).getNombre().equals(selecta)) {

                            lista_proyectos.get(i).getActividades().get(j).getPredecesoras().add(selectb);

                        }
                    }

                }
            }
        }
        {

        }
        for (int i = 0; i < lista_proyectos.size(); i++) {
            if (lista_proyectos.get(i).getNombre().equals(select)) {
                for (int j = 0; j < lista_proyectos.get(i).getActividades().size(); j++) {
                    lista_proyectos.get(i).getActividades().get(j).setInicio_temprano(((actividad) lista_proyectos.get(i).getActividades().get(j)).calculo_inicio(lista_proyectos, select, lista_proyectos.get(i).getActividades().get(j).getNombre()));
                    lista_proyectos.get(i).getActividades().get(j).setFinal_temprano(((actividad) lista_proyectos.get(i).getActividades().get(j)).calculo_final(lista_proyectos, select, lista_proyectos.get(i).getActividades().get(j).getNombre()));
                    System.out.println(lista_proyectos.get(i).getActividades().get(j));
                }
            }
        }
        for (int i = 0; i < lista_proyectos.size(); i++) {
            if (lista_proyectos.get(i).getNombre().equals(select)) {
                for (int j = 0; j < lista_proyectos.get(i).getActividades().size(); j++) {
                    lista_proyectos.get(i).getActividades().get(j).setInicio_temprano(((actividad) lista_proyectos.get(i).getActividades().get(j)).calculo_inicio(lista_proyectos, select, lista_proyectos.get(i).getActividades().get(j).getNombre()));
                    lista_proyectos.get(i).getActividades().get(j).setFinal_temprano(((actividad) lista_proyectos.get(i).getActividades().get(j)).calculo_final(lista_proyectos, select, lista_proyectos.get(i).getActividades().get(j).getNombre()));
                    System.out.println(lista_proyectos.get(i).getActividades().get(j));
                }
            }
        }
    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add_duracion;
    private javax.swing.JTextField add_nombre;
    private javax.swing.JTextField add_pro;
    private javax.swing.JComboBox<String> add_proyecto;
    private javax.swing.JTextField add_retraso;
    private javax.swing.JComboBox<String> cb_acts;
    private javax.swing.JComboBox<String> cb_asig;
    private javax.swing.JComboBox<String> cb_option;
    private javax.swing.JComboBox<String> cb_pros;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    ArrayList<Proyecto> lista_proyectos = new ArrayList();
    DefaultMutableTreeNode nodo_seleccionado;
}
