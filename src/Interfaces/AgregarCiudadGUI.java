/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import GraficarGrafo.GraficarGrafo;
import Grafo.Ciudad;
import javax.swing.JOptionPane;

/**
 *
 * @author nelsoncarrillo
 */
public class AgregarCiudadGUI extends javax.swing.JFrame {
    
    private MenuPrincipalGUI interfazMenu;

    /**
     * Creates new form AgregarCiudad
     * @param interfaz
     */
    public AgregarCiudadGUI(MenuPrincipalGUI interfaz) {
        initComponents();
        this.interfazMenu=interfaz;
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.AgregarString.setText("");
        this.CiudadesAnexas1.setText("");
        this.DistanciasHaciaAnexas.setText("");
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
        Exit = new javax.swing.JButton();
        Atras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DistanciasHaciaAnexas = new javax.swing.JTextField();
        AgregarString = new javax.swing.JTextField();
        CiudadesAnexas1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AgregarCiudad = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        AEliminar = new javax.swing.JTextField();
        Eliminar = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setBackground(null);
        Exit.setForeground(null);
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        Exit.setBorder(null);
        Exit.setBorderPainted(false);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 40, 40));

        Atras.setBackground(null);
        Atras.setForeground(null);
        Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rounded-back-icon-element-free-png-2.png"))); // NOI18N
        Atras.setBorder(null);
        Atras.setBorderPainted(false);
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Para Eliminar una Ciudad: Inserte el número (Ej. 8) que");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 50));

        jLabel3.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("(Ej. \"5.2,2.9\"). Separe con comas y  decimales con punto \".\".");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 30));

        jLabel2.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Para Agregar una Ciudad: Inserte el número (Ej. 8) que ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 50));

        jLabel4.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("identifique la ciudad a eliminar. Esta debe existir.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 50));

        jLabel5.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Distancia Hacia Cada Ciudad ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 20));
        jPanel1.add(DistanciasHaciaAnexas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 140, -1));

        AgregarString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarStringActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarString, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 50, -1));

        CiudadesAnexas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CiudadesAnexas1ActionPerformed(evt);
            }
        });
        jPanel1.add(CiudadesAnexas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 140, -1));

        jLabel6.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("en el grafo, luego las distancias a cada respectiva ciudad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 50));

        jLabel7.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Número de Ciudad a Eliminar");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, 20));

        jLabel8.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ciudades Anexas");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 20));

        AgregarCiudad.setText("Agregar");
        AgregarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCiudadActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("identifique a la nueva ciudad. Luego, las ciudades a las que  ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 50));

        jLabel10.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("es anexa (Ej. \"1,2\") tenga presente que estas deben estar");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 50));

        jLabel11.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Número de Nueva Ciudad");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 20));
        jPanel1.add(AEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 50, -1));

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HD-wallpaper-brown-fondo-gradient-man-mix-note-para-purple-rose-simple-2.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        // TODO add your handling code here:
        this.interfazMenu.setVisible(true);
        this.AgregarString.setText("");
        this.CiudadesAnexas1.setText("");
        this.DistanciasHaciaAnexas.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_AtrasActionPerformed

    private void AgregarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCiudadActionPerformed
        // TODO add your handling code here:
        String[] CiudadesAnexas = this.CiudadesAnexas1.getText().split(",");
        String[] DistanciaCiudadesAnexas = this.DistanciasHaciaAnexas.getText().split(",");
        boolean hayEspaciosEnBlanco = false;

        for (String elemento : CiudadesAnexas) {
            if (elemento.trim().isEmpty()) {
                hayEspaciosEnBlanco = true;
                break;
            }
        }
        
        for (String elemento : DistanciaCiudadesAnexas) {
            if (elemento.trim().isEmpty()) {
                hayEspaciosEnBlanco = true;
                break;
            }
        }
        
        if((CiudadesAnexas.length == DistanciaCiudadesAnexas.length) && (!hayEspaciosEnBlanco)){
            try{
                int NumeroNuevaCiudad = Integer.parseInt(this.AgregarString.getText().trim());
                boolean agregado = this.interfazMenu.coloniaAST.AgregarCiudad(NumeroNuevaCiudad, CiudadesAnexas, DistanciaCiudadesAnexas);
                if(agregado){
                    JOptionPane.showMessageDialog(null, "Agregada Con Exito!");
                    this.AgregarString.setText("");
                    this.CiudadesAnexas1.setText("");
                    this.DistanciasHaciaAnexas.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "Error en el Input.\nRevise Acorde al grafo y tipo de datos.", "ERROR", JOptionPane.WARNING_MESSAGE);
                    this.AgregarString.setText("");
                    this.CiudadesAnexas1.setText("");
                    this.DistanciasHaciaAnexas.setText("");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error en el Input.\nRecuerde debe ser un número.", "ERROR", JOptionPane.WARNING_MESSAGE);
                this.AgregarString.setText("");
                this.CiudadesAnexas1.setText("");
                this.DistanciasHaciaAnexas.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Error en el Input.\nEvite dejar espacios vacíos entre comas.", "ERROR", JOptionPane.WARNING_MESSAGE);
            this.AgregarString.setText("");
            this.CiudadesAnexas1.setText("");
            this.DistanciasHaciaAnexas.setText("");
        }
    }//GEN-LAST:event_AgregarCiudadActionPerformed

    private void CiudadesAnexas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CiudadesAnexas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CiudadesAnexas1ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        try{
            Integer.valueOf(AEliminar.getText());
            Ciudad aux = this.interfazMenu.coloniaAST.getMatriz().getVerts()[this.interfazMenu.coloniaAST.getMatriz().getNumVerts()-1];
            Ciudad aux2 = this.interfazMenu.coloniaAST.getMatriz().getVerts()[0];
            boolean borrado = this.interfazMenu.coloniaAST.getMatriz().borrarVertice(AEliminar.getText());
            if(borrado){
                if(!aux.equals(this.interfazMenu.coloniaAST.getMatriz().getVerts()[this.interfazMenu.coloniaAST.getMatriz().getNumVerts()-1]))
                    this.interfazMenu.coloniaAST.CiudadFin=this.interfazMenu.coloniaAST.getMatriz().getVerts()[this.interfazMenu.coloniaAST.getMatriz().getNumVerts()-1];
                if(!aux2.equals(this.interfazMenu.coloniaAST.getMatriz().getVerts()[0]))
                    this.interfazMenu.coloniaAST.CiudadInicio=this.interfazMenu.coloniaAST.getMatriz().getVerts()[0];
                JOptionPane.showMessageDialog(null, "Eliminada con éxito.");
            }else{
                JOptionPane.showMessageDialog(null, "Error en el Input.\nRecuerde debe ser una ciudad existente.\nPara la simulación deben quedar al menos 4 ciudades.", "ERROR", JOptionPane.WARNING_MESSAGE);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en el Input.\nRecuerde debe ser un número.", "ERROR", JOptionPane.WARNING_MESSAGE);
            this.AEliminar.setText("");
        }
        this.AEliminar.setText("");
        GraficarGrafo nuevo = new GraficarGrafo();
        nuevo.mostrar(this.interfazMenu.coloniaAST.getMatriz());
        
    }//GEN-LAST:event_EliminarActionPerformed

    private void AgregarStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarStringActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarStringActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarCiudadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCiudadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCiudadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCiudadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AEliminar;
    private javax.swing.JButton AgregarCiudad;
    private javax.swing.JTextField AgregarString;
    private javax.swing.JButton Atras;
    private javax.swing.JTextField CiudadesAnexas1;
    private javax.swing.JTextField DistanciasHaciaAnexas;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel background;
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
