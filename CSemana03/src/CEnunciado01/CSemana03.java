
package CEnunciado01;

import Clases.ConsumoAgua;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class CSemana03 extends javax.swing.JFrame {

    ConsumoAgua objConsumo = new ConsumoAgua();
    public CSemana03() {
        initComponents();
        formulario();
    }
    /**
     * método formulario 
     * @param no tiene parametros
    */
    
    private void formulario(){
        this.setTitle("CONSUMO DE AGUA"); //titulo de la ventana
        this.setLocationRelativeTo(this); //aparece la ventana al medio
        this.setResizable(false); //cambiar el tamaño de mi formulario
        this.getContentPane().setBackground(new Color(73,73,73));//color del formulario
        this.ptitulo.setBackground(new Color(249,113,65));
        this.pbotones.setBackground(new Color(73,73,73));
        this.psalida.setBackground(new Color(73,73,73));
        this.txtConsumo.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ptitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pbotones = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        txtConsumo = new javax.swing.JTextField();
        psalida = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ptitulo.setForeground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONSUMO DE AGUA");

        javax.swing.GroupLayout ptituloLayout = new javax.swing.GroupLayout(ptitulo);
        ptitulo.setLayout(ptituloLayout);
        ptituloLayout.setHorizontalGroup(
            ptituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ptituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(119, 119, 119))
        );
        ptituloLayout.setVerticalGroup(
            ptituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ptituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calcular.png"))); // NOI18N
        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        txtConsumo.setBackground(new java.awt.Color(249, 113, 65));
        txtConsumo.setForeground(new java.awt.Color(255, 255, 255));
        txtConsumo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConsumo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consumo en Metros Cúbicos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txtConsumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsumoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pbotonesLayout = new javax.swing.GroupLayout(pbotones);
        pbotones.setLayout(pbotonesLayout);
        pbotonesLayout.setHorizontalGroup(
            pbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtConsumo)
                    .addGroup(pbotonesLayout.createSequentialGroup()
                        .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pbotonesLayout.setVerticalGroup(
            pbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        psalida.setBackground(new java.awt.Color(73, 73, 73));

        txtResultado.setBackground(new java.awt.Color(73, 73, 73));
        txtResultado.setColumns(20);
        txtResultado.setForeground(new java.awt.Color(255, 255, 255));
        txtResultado.setLineWrap(true);
        txtResultado.setRows(5);
        txtResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txtResultado);

        javax.swing.GroupLayout psalidaLayout = new javax.swing.GroupLayout(psalida);
        psalida.setLayout(psalidaLayout);
        psalidaLayout.setHorizontalGroup(
            psalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(psalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        psalidaLayout.setVerticalGroup(
            psalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(psalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ptitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pbotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(psalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ptitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(psalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int resp = JOptionPane.showOptionDialog(this,"Estas seguro de salir...", "Salida",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null, 
                    new Object[]{"Si","No"}, "Si");
        if(resp==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.txtConsumo.setText("");
        this.txtResultado.setText("");
        this.txtConsumo.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtConsumoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsumoKeyTyped
        char c = evt.getKeyChar(); // Captura el carácter que se ha ingresado

        // Verificar si el carácter no es un dígito ni un punto decimal
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Eliminar el carácter ingresado
        }
        // Si el carácter es un punto decimal, verificar si ya hay un punto decimal en el texto
        if (c == '.' && txtConsumo.getText().contains(".")) {
            evt.consume(); // Eliminar el carácter ingresado
        }
    }//GEN-LAST:event_txtConsumoKeyTyped

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double consumo;
        consumo = Double.parseDouble(this.txtConsumo.getText().trim());
        objConsumo.setConsumo(consumo);
        this.txtResultado.setText("Resultado");
        this.txtResultado.append("\n--------------\n");
        this.txtResultado.append(String.valueOf("Consumo en m3: "+ objConsumo.hallarConsumo())+"\n");
        this.txtResultado.append(String.valueOf("Impuesto en m3: "+ objConsumo.hallarImpuesto())+"\n");
        this.txtResultado.append(String.valueOf("Monto total en m3: "+ objConsumo.hallarMontoTotal()));
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(CSemana03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CSemana03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CSemana03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CSemana03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CSemana03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pbotones;
    private javax.swing.JPanel psalida;
    private javax.swing.JPanel ptitulo;
    private javax.swing.JTextField txtConsumo;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
