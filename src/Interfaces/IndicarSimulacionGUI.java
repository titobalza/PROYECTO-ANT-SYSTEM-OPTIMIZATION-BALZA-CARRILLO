/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Simulacion.Colonia;
import Simulacion.Hormiga;
import javax.swing.JOptionPane;

/**
 *
 * @author nelsoncarrillo
 */
public class IndicarSimulacionGUI extends javax.swing.JFrame {
    private MenuPrincipalGUI interfazMenu;
    
    /**
     * Creates new form IndicarSimulacionGUI
     */
    public IndicarSimulacionGUI(MenuPrincipalGUI interfaz) {
        initComponents();
        this.interfazMenu=interfaz;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.fin.setText("Ciudad Final número: "+interfaz.coloniaAST.CiudadFin.getNombreDeCiudad());
        this.inicio.setText("Ciudad Inicial número: "+interfaz.coloniaAST.CiudadInicio.getNombreDeCiudad());
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        softBevelBorder1 = new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED);
        jPanel1 = new javax.swing.JPanel();
        sacsac = new javax.swing.JLabel();
        alphaValue = new javax.swing.JTextField();
        betaValue = new javax.swing.JTextField();
        assadsa = new javax.swing.JLabel();
        rhoValue = new javax.swing.JTextField();
        caasacs = new javax.swing.JLabel();
        numHormigas = new javax.swing.JTextField();
        dsasd = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        numCiclos = new javax.swing.JTextField();
        sacdads = new javax.swing.JLabel();
        inicio = new javax.swing.JLabel();
        fin = new javax.swing.JLabel();
        Atras = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sacsac.setForeground(new java.awt.Color(255, 255, 255));
        sacsac.setText(" Valor α");
        jPanel1.add(sacsac, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        alphaValue.setText("1           ");
        alphaValue.setToolTipText("");
        alphaValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alphaValueActionPerformed(evt);
            }
        });
        jPanel1.add(alphaValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        betaValue.setText("2           ");
        betaValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betaValueActionPerformed(evt);
            }
        });
        jPanel1.add(betaValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        assadsa.setForeground(new java.awt.Color(255, 255, 255));
        assadsa.setText("Valor β ");
        jPanel1.add(assadsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        rhoValue.setText("0.5          ");
        rhoValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rhoValueActionPerformed(evt);
            }
        });
        jPanel1.add(rhoValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        caasacs.setForeground(new java.awt.Color(255, 255, 255));
        caasacs.setText("Valor ρ");
        jPanel1.add(caasacs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        numHormigas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        numHormigas.setMinimumSize(new java.awt.Dimension(120, 50));
        numHormigas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numHormigasActionPerformed(evt);
            }
        });
        jPanel1.add(numHormigas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 90, -1));

        dsasd.setForeground(new java.awt.Color(255, 255, 255));
        dsasd.setText("Número de Hormigas");
        jPanel1.add(dsasd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jButton1.setText("INICIAR SIMULACIÓN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 210, 50));

        numCiclos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        numCiclos.setMinimumSize(new java.awt.Dimension(120, 50));
        numCiclos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numCiclosActionPerformed(evt);
            }
        });
        jPanel1.add(numCiclos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 90, -1));

        sacdads.setForeground(new java.awt.Color(255, 255, 255));
        sacdads.setText("Número de Ciclos");
        jPanel1.add(sacdads, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        inicio.setForeground(new java.awt.Color(255, 255, 255));
        inicio.setText("Ciudad de Inicio:");
        jPanel1.add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 170, -1));

        fin.setForeground(new java.awt.Color(255, 255, 255));
        fin.setText("Ciudad de Final:");
        jPanel1.add(fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 170, -1));

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
        jPanel1.add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jButton2.setBackground(null);
        jButton2.setForeground(null);
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nature-insect-macro-animals-wallpaper-preview.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numHormigasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numHormigasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numHormigasActionPerformed

    private void alphaValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alphaValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alphaValueActionPerformed

    private void betaValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betaValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_betaValueActionPerformed

    private void rhoValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rhoValueActionPerformed
         try {
        double input = Double.parseDouble(rhoValue.getText());
        if (input > 0 && input < 1) {
            JOptionPane.showMessageDialog(null,"El número es válido");
      
        } else {
 
            JOptionPane.showMessageDialog(null,"El número no cumple la validación");
        }
    } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null,"El valor ingresado no es un número válido");
    }
    }//GEN-LAST:event_rhoValueActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      // Obtener los valores de alpha, beta y la cantidad de hormigas desde los campos de texto
try{
double alpha = Double.parseDouble(alphaValue.getText());
double beta = Double.parseDouble(betaValue.getText());
double rho = Double.parseDouble(rhoValue.getText());
double tau = 1/this.interfazMenu.interfazArchivos.ciudades.length;
int cantidadDeHormigas = Integer.parseInt(numHormigas.getText());
int ciclos = Integer.parseInt(numCiclos.getText());
int numCiudades = this.interfazMenu.interfazArchivos.ciudades.length;
this.interfazMenu.coloniaAST=new Colonia(this.interfazMenu.interfazArchivos.ciudades.length,this.interfazMenu.interfazArchivos.ciudades,this.interfazMenu.interfazArchivos.caminos);
    
// Crear un arreglo para almacenar las instancias de Hormiga
Hormiga[] hormigasArray = new Hormiga[cantidadDeHormigas];

// Crear las instancias de Hormiga y almacenarlas en el arreglo
for (int i = 0; i < cantidadDeHormigas; i++) {
    hormigasArray[i] = new Hormiga(this.interfazMenu.coloniaAST.getMatriz(),this.interfazMenu.coloniaAST.CiudadInicio.getNumeroDeCiudad(),this.interfazMenu.interfazArchivos.ciudades.length);
}

boolean todasFalse = false;  // Variable para verificar si todas las hormigas han devuelto false

for (int i = 0; i < ciclos; i++) {
  

    while (!todasFalse) {
        todasFalse = true;  // Establecer en true al comienzo del ciclo


            for (Hormiga hormiga : hormigasArray) {
                boolean resultado = hormiga.irHaciaSiguienteCiudad(cantidadDeHormigas, alpha, beta, tau);
                if (resultado) {
                    todasFalse = false;
                }
            }
        } 
    
        this.interfazMenu.coloniaAST.actualizarPorEvaporacion(rho, numCiudades);
    }} catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Input Incorrecto");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void numCiclosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numCiclosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numCiclosActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        // TODO add your handling code here:
        this.interfazMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(IndicarSimulacionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndicarSimulacionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndicarSimulacionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndicarSimulacionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JTextField alphaValue;
    private javax.swing.JLabel assadsa;
    private javax.swing.JTextField betaValue;
    private javax.swing.JLabel caasacs;
    private javax.swing.JLabel dsasd;
    private javax.swing.JLabel fin;
    private javax.swing.JLabel inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numCiclos;
    private javax.swing.JTextField numHormigas;
    private javax.swing.JTextField rhoValue;
    private javax.swing.JLabel sacdads;
    private javax.swing.JLabel sacsac;
    private javax.swing.border.SoftBevelBorder softBevelBorder1;
    // End of variables declaration//GEN-END:variables
}
