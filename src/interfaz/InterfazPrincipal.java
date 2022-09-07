package interfaz;
import FiveCodMover.FiveCodMoverJFrame;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import interfaz.Iniciar_Sesion;
//import javax.swing.JOptionPane;
//import java.sql.*;

public class InterfazPrincipal extends javax.swing.JFrame {

    
   
    
    public InterfazPrincipal() {
        initComponents();
        this.setResizable(false);
        //icono del jframe
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconoencuesta.png")).getImage());
        btnPerfil.setVisible(false);
        panelBtn1.setVisible(false);
        panelBtn2.setVisible(false);
        panelBtn3.setVisible(false);       
        
    }
    
    public void habilitarMenu(boolean valido){
        Icon icono;
        icono = new ImageIcon(getClass().getResource("/imagenes/desbloquear.png"));
        
        if(valido = true){
            panelBtn1.setVisible(true);
            panelBtn2.setVisible(true);
            panelBtn3.setVisible(true);            
//            btnSesion.setIcon(icono);
            btnSesion.setVisible(false);
            btnPerfil.setVisible(true);
            jLabel9.setText("PERFIL");
            
        }
           
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
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        panelBtn1 = new javax.swing.JPanel();
        btnRegistros = new javax.swing.JLabel();
        panelBtn2 = new javax.swing.JPanel();
        btnEncuestas = new javax.swing.JLabel();
        panelBtn3 = new javax.swing.JPanel();
        btnResultados = new javax.swing.JLabel();
        panelBtn4 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSesion = new javax.swing.JLabel();
        btnPerfil = new javax.swing.JLabel();
        intercambio = new javax.swing.JPanel();
        e1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(159, 223, 188));

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel1.setText("PROGRAMA DISEÑADO PARA LA FORMULACION DE ENCUESTAS Y REGISTROS DE RADIOS ");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ondas-de-radio.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(183, 228, 199));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel9.setText("SESION");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 21, -1, -1));

        panelBtn1.setBackground(new java.awt.Color(183, 228, 199));

        btnRegistros.setFont(new java.awt.Font("DialogInput", 0, 11)); // NOI18N
        btnRegistros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registro (2).png"))); // NOI18N
        btnRegistros.setText("REGISTROS");
        btnRegistros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBtn1Layout = new javax.swing.GroupLayout(panelBtn1);
        panelBtn1.setLayout(panelBtn1Layout);
        panelBtn1Layout.setHorizontalGroup(
            panelBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBtn1Layout.setVerticalGroup(
            panelBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jPanel2.add(panelBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 120, -1));

        panelBtn2.setBackground(new java.awt.Color(183, 228, 199));

        btnEncuestas.setBackground(new java.awt.Color(183, 228, 199));
        btnEncuestas.setFont(new java.awt.Font("DialogInput", 0, 11)); // NOI18N
        btnEncuestas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEncuestas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista-de-verificacion (3).png"))); // NOI18N
        btnEncuestas.setText("ENCUESTAS");
        btnEncuestas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEncuestas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEncuestasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEncuestasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEncuestasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBtn2Layout = new javax.swing.GroupLayout(panelBtn2);
        panelBtn2.setLayout(panelBtn2Layout);
        panelBtn2Layout.setHorizontalGroup(
            panelBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEncuestas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBtn2Layout.setVerticalGroup(
            panelBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEncuestas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(panelBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 259, 120, -1));

        panelBtn3.setBackground(new java.awt.Color(183, 228, 199));

        btnResultados.setFont(new java.awt.Font("DialogInput", 0, 11)); // NOI18N
        btnResultados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/informe-seo.png"))); // NOI18N
        btnResultados.setText("RESULTADOS");
        btnResultados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResultadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnResultadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResultadosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBtn3Layout = new javax.swing.GroupLayout(panelBtn3);
        panelBtn3.setLayout(panelBtn3Layout);
        panelBtn3Layout.setHorizontalGroup(
            panelBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBtn3Layout.setVerticalGroup(
            panelBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnResultados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jPanel2.add(panelBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 305, 120, -1));

        panelBtn4.setBackground(new java.awt.Color(183, 228, 199));

        btnSalir.setFont(new java.awt.Font("DialogInput", 0, 11)); // NOI18N
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btnSalir.setText("  SALIR  ");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBtn4Layout = new javax.swing.GroupLayout(panelBtn4);
        panelBtn4.setLayout(panelBtn4Layout);
        panelBtn4Layout.setHorizontalGroup(
            panelBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBtn4Layout.setVerticalGroup(
            panelBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jPanel2.add(panelBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 392, 120, -1));

        jPanel3.setBackground(new java.awt.Color(183, 228, 199));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bloquear.png"))); // NOI18N
        btnSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSesion.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSesionMouseExited(evt);
            }
        });
        jPanel3.add(btnSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        btnPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil.png"))); // NOI18N
        btnPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPerfil.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPerfilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPerfilMouseExited(evt);
            }
        });
        jPanel3.add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        intercambio.setBackground(new java.awt.Color(247, 251, 252));
        intercambio.setForeground(new java.awt.Color(247, 251, 252));
        intercambio.setPreferredSize(new java.awt.Dimension(550, 450));

        e1.setFont(new java.awt.Font("DialogInput", 3, 20)); // NOI18N
        e1.setText("INICIO");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/radio (4).png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel3.setText("Programa, Interfaz dedicado a la formulacion de encuestas y registros");

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel2.setText("En este programa los usuarios podran registrar:  ");

        jLabel4.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel4.setText("empresas y todo lo que viene elazado de estas, ademas de poder   ");

        jLabel5.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel5.setText("registrarse a si mismos para poder contestar una encuesta");

        jLabel6.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel6.setText("hacerca de programas de radio.");

        javax.swing.GroupLayout intercambioLayout = new javax.swing.GroupLayout(intercambio);
        intercambio.setLayout(intercambioLayout);
        intercambioLayout.setHorizontalGroup(
            intercambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(intercambioLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(intercambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, intercambioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(intercambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, intercambioLayout.createSequentialGroup()
                        .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(274, 274, 274))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, intercambioLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(250, 250, 250))))
        );
        intercambioLayout.setVerticalGroup(
            intercambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(intercambioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(e1)
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        getContentPane().add(intercambio, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrosMouseClicked
        intercambio.removeAll();
        intercambio.updateUI();
        intercambio.setLayout(null);
        intercambio.add(new PRegistros());
        panelBtn1.setBackground(Color.decode("#F7FBFC"));
        panelBtn2.setBackground(Color.decode("#B7E4C7"));
        panelBtn3.setBackground(Color.decode("#B7E4C7"));
    }//GEN-LAST:event_btnRegistrosMouseClicked

    private void btnEncuestasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncuestasMouseClicked
        intercambio.removeAll();
        intercambio.updateUI();
        intercambio.setLayout(null);
        intercambio.add(new PEncuestas());
        panelBtn2.setBackground(Color.decode("#F7FBFC"));
        panelBtn1.setBackground(Color.decode("#B7E4C7"));
        panelBtn3.setBackground(Color.decode("#B7E4C7"));
    }//GEN-LAST:event_btnEncuestasMouseClicked

    private void btnResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResultadosMouseClicked
        intercambio.removeAll();
        intercambio.updateUI();
        intercambio.setLayout(null);
        intercambio.add(new PEstadisticas());
        panelBtn3.setBackground(Color.decode("#F7FBFC"));
        panelBtn2.setBackground(Color.decode("#B7E4C7"));
        panelBtn1.setBackground(Color.decode("#B7E4C7"));
    }//GEN-LAST:event_btnResultadosMouseClicked

    private void btnRegistrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrosMouseEntered
        //btn1.setForeground(Color.decode("#1FAB89")); PARA ELEGIR EL COLOR EN CODIGO DECEADO CUALQUIERA
        btnRegistros.setForeground(Color.decode("#9FDFBC"));
    }//GEN-LAST:event_btnRegistrosMouseEntered

    private void btnRegistrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrosMouseExited
        btnRegistros.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnRegistrosMouseExited

    private void btnEncuestasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncuestasMouseEntered
        btnEncuestas.setForeground(Color.decode("#9FDFBC"));
    }//GEN-LAST:event_btnEncuestasMouseEntered

    private void btnEncuestasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncuestasMouseExited
        btnEncuestas.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnEncuestasMouseExited

    private void btnResultadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResultadosMouseEntered
        btnResultados.setForeground(Color.decode("#9FDFBC"));
    }//GEN-LAST:event_btnResultadosMouseEntered

    private void btnResultadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResultadosMouseExited
        btnResultados.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnResultadosMouseExited

    private void btnSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSesionMouseClicked
 
        Iniciar_Sesion newframe = new Iniciar_Sesion();
        newframe.setVisible(true);

        newframe.setVentanap(this); 
       
    }//GEN-LAST:event_btnSesionMouseClicked

    private void btnSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSesionMouseEntered
        jPanel3.setBackground(Color.decode("#9FDFBC"));
    }//GEN-LAST:event_btnSesionMouseEntered

    private void btnSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSesionMouseExited
        jPanel3.setBackground(Color.decode("#B7E4C7"));
    }//GEN-LAST:event_btnSesionMouseExited

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setForeground(Color.white);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit (WIDTH);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        FiveCodMoverJFrame.MouseDraggedFrame(evt,this);
    }//GEN-LAST:event_formMouseDragged

    private void btnPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseClicked
        Perfil newframe = new Perfil();
        newframe.setVisible(true);      
    }//GEN-LAST:event_btnPerfilMouseClicked

    private void btnPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseEntered
        jPanel3.setBackground(Color.decode("#9FDFBC"));
    }//GEN-LAST:event_btnPerfilMouseEntered

    private void btnPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseExited
        jPanel3.setBackground(Color.decode("#B7E4C7"));
    }//GEN-LAST:event_btnPerfilMouseExited

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
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEncuestas;
    private javax.swing.JLabel btnPerfil;
    private javax.swing.JLabel btnRegistros;
    private javax.swing.JLabel btnResultados;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnSesion;
    private javax.swing.JLabel e1;
    private javax.swing.JPanel intercambio;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelBtn1;
    private javax.swing.JPanel panelBtn2;
    private javax.swing.JPanel panelBtn3;
    private javax.swing.JPanel panelBtn4;
    // End of variables declaration//GEN-END:variables
}
