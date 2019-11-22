/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.ctrlJuego;
import static java.lang.Integer.parseInt;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josel
 */
public class FrmJuego extends javax.swing.JFrame {

    /**
     * Creates new form FrmJuego
     */
    public FrmJuego() {
        initComponents();
        this.setLocationRelativeTo(null);
        agregar();
    }
 public void agregar() {
        ctrlJuego a = new ctrlJuego();
        String[][] data = a.getJuego();
        DefaultTableModel modelo = new DefaultTableModel();
           modelo.addColumn("ID JUEGO");
        modelo.addColumn("CAMPEONATO");
        modelo.addColumn("LOCAL");
        modelo.addColumn("VISITANTE");
        modelo.addColumn("CANCHA");
        modelo.addColumn("INICIO PARTIDO");
        modelo.addColumn("FIN PARTIDO");
        modelo.addColumn("GOLES LOCAL");
        modelo.addColumn("GOLES VISITANTE");
        String[] enviar = new String[9];

        for (int f = 0; f < data.length; f++) {
            for (int c = 0; c < data[f].length; c++) {
                enviar[c] = data[f][c];
            }
            modelo.addRow(enviar);
        }
        tabla.setModel(modelo);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textHInicio = new javax.swing.JTextField();
        textHFinalizacion = new javax.swing.JTextField();
        textGLocal = new javax.swing.JTextField();
        textGVisitante = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        codCancha = new javax.swing.JTextField();
        TextVisitante = new javax.swing.JTextField();
        TextELocal = new javax.swing.JTextField();
        codCampeonato = new javax.swing.JTextField();
        codJuego = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("JUEGO");

        jLabel2.setText("HORA INICIO:");

        jLabel3.setText("HORA FINALIZACION:");

        jLabel4.setText("GOL LOCAL:");

        jLabel5.setText("GOL VISITANTE:");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel6.setText("ID JUEGO:");

        jLabel7.setText("ID CAMPEONATO:");

        jLabel8.setText("EQUIPO LOCAL:");

        jLabel9.setText("VISITANTE:");

        jLabel10.setText("ID CANCHA:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(codCancha, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textHFinalizacion)
                                    .addComponent(textGLocal)
                                    .addComponent(textGVisitante)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TextELocal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(textHInicio)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextVisitante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(codCampeonato, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(codJuego, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 489, Short.MAX_VALUE)
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(codJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(codCampeonato, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TextELocal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textHFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codCancha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textHInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textGLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textGVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if ((this.codJuego.getText().length() == 0)
                || (this.codCampeonato.getText().length() == 0)
                || (this.TextELocal.getText().length() == 0)
                || (this.TextVisitante.getText().length() == 0)
                || (this.codCancha.getText().length() == 0)
                || (this.textHInicio.getText().length() == 0)
                || (this.textHFinalizacion.getText().length() == 0)
                || (this.textGLocal.getText().length() == 0)
                || (this.textGVisitante.getText().length() == 0)) {
            Icon icon = null;
            JOptionPane.showMessageDialog(null, "ALGUN CAMPO VACIO", "ERROR", JOptionPane.DEFAULT_OPTION, icon);
        } else {
            int idJuego = parseInt(this.codJuego.getText());
            int idCampeonato = parseInt(this.codCampeonato.getText());
            int EquipoLocal = parseInt(this.TextELocal.getText());
            int Visitante = parseInt(this.TextVisitante.getText());
            int idCancha = parseInt(this.codCancha.getText());
            String HoraInicio = this.textHInicio.getText();
            String HoraFinalizacion = this.textHFinalizacion.getText();
            int GolLocal = parseInt(this.textGLocal.getText());
            int GolVisitante = parseInt(this.textGVisitante.getText());

            Icon icon = null;
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, icon);
            if (resp == JOptionPane.YES_OPTION) {
                ctrlJuego a = new ctrlJuego();
                a.insertarJuego(idJuego, idCampeonato, EquipoLocal, Visitante, idCancha, HoraInicio, HoraFinalizacion, GolLocal, GolVisitante);
                this.TextELocal.setText(null);
                this.TextVisitante.setText(null);
                this.textHInicio.setText(null);
                this.textHFinalizacion.setText(null);
                this.textGLocal.setText(null);
                this.textGVisitante.setText(null);
                this.codCampeonato.setText(null);
                this.codJuego.setText(null);
                this.codCancha.setText(null);
                 agregar();
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        new MENU().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextELocal;
    private javax.swing.JTextField TextVisitante;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JTextField codCampeonato;
    private javax.swing.JTextField codCancha;
    private javax.swing.JTextField codJuego;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField textGLocal;
    private javax.swing.JTextField textGVisitante;
    private javax.swing.JTextField textHFinalizacion;
    private javax.swing.JTextField textHInicio;
    // End of variables declaration//GEN-END:variables
}