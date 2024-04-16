
package CEjemplo;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class CEjemplo01 extends javax.swing.JFrame {
    
    //se crea el objeto
    Operaciones obJOperaciones = new Operaciones();
    
    public CEjemplo01() {
    
    /**
     * Constuctor de la aplicación
    */
        initComponents();
        formulario();
        valoresIniciales();
    }
    
    /**
     * método formulario 
     * @param no tiene parametros
    */
    private void formulario(){
        this.setTitle("OPERACIONES MATEMÁTICAS"); //titulo de la ventana
        this.setLocationRelativeTo(this); //aparece la ventana al medio
        this.setResizable(false); //cambiar el tamaño de mi formulario
        this.getContentPane().setBackground(new Color(51,51,51));//color del formulario
        this.PTitulo.setBackground(new Color(51,51,51));
        this.PBotones.setBackground(new Color(51,51,51));
        this.PResultado.setBackground(new Color(51,51,51));
        this.PIngreso.setBackground(new Color(51,51,51));
    }
    
    /**
     * método valores iniciales
     * @param no tiene parametros
    */
    public void valoresIniciales(){
        this.txtnum1.requestFocus(); //para q inicie en la primera casilla, se activa el cursor.
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PBotones = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        PIngreso = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnum1 = new javax.swing.JTextField();
        txtnum2 = new javax.swing.JTextField();
        PResultado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("OPERACIONES DE NÚMEROS");

        javax.swing.GroupLayout PTituloLayout = new javax.swing.GroupLayout(PTitulo);
        PTitulo.setLayout(PTituloLayout);
        PTituloLayout.setHorizontalGroup(
            PTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PTituloLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PTituloLayout.setVerticalGroup(
            PTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PTituloLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
        );

        btnCalcular.setBackground(new java.awt.Color(255, 96, 30));
        btnCalcular.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(255, 96, 30));
        btnNuevo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 96, 30));
        btnSalir.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PBotonesLayout = new javax.swing.GroupLayout(PBotones);
        PBotones.setLayout(PBotonesLayout);
        PBotonesLayout.setHorizontalGroup(
            PBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBotonesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        PBotonesLayout.setVerticalGroup(
            PBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBotonesLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnCalcular)
                .addGap(39, 39, 39)
                .addComponent(btnNuevo)
                .addGap(40, 40, 40)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("Ingrese un número:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 51));
        jLabel4.setText("Ingrese un número:");

        txtnum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnum1KeyTyped(evt);
            }
        });

        txtnum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnum2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout PIngresoLayout = new javax.swing.GroupLayout(PIngreso);
        PIngreso.setLayout(PIngresoLayout);
        PIngresoLayout.setHorizontalGroup(
            PIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PIngresoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnum1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(txtnum2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(29, 29, 29))
        );
        PIngresoLayout.setVerticalGroup(
            PIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PIngresoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(PIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        txtResultado.setBackground(new java.awt.Color(51, 51, 51));
        txtResultado.setColumns(20);
        txtResultado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(255, 255, 255));
        txtResultado.setRows(5);
        txtResultado.setAutoscrolls(false);
        txtResultado.setBorder(null);
        jScrollPane1.setViewportView(txtResultado);

        javax.swing.GroupLayout PResultadoLayout = new javax.swing.GroupLayout(PResultado);
        PResultado.setLayout(PResultadoLayout);
        PResultadoLayout.setHorizontalGroup(
            PResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PResultadoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        PResultadoLayout.setVerticalGroup(
            PResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PResultadoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Metodo que cierra el formulario al hacer clic en el boton salir
     * @param evt 
     */
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int resp = JOptionPane.showOptionDialog(this,"Estas seguro de salir...", "Salida",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null, 
                    new Object[]{"Si","No"}, "Si");
        if(resp==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed
    
    /**
     * Método que limpia las casillas e incializa en el primer número al hacer clic en el boton nuevo
     * @param evt 
     */
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.txtnum1.setText("");
        this.txtnum2.setText("");
        this.txtResultado.setText("");
        this.txtnum1.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed
    
    //Captura de datos
    private float leerNumero(){
        float num;
        num=Float.parseFloat(txtnum1.getText().trim());
        return num;
    }
    
    private float leerNumero2(){
        float num;
        num=Float.parseFloat(txtnum2.getText().trim());
        return num;
    }
    
    //metodo para mostrar el resultado
    private void mostrar() {
        this.txtResultado.setText("\tResultado\n");
        this.txtResultado.append("\t------------\n");
        this.txtResultado.append("La suma es:  "+ String.valueOf(obJOperaciones.suma(leerNumero(),leerNumero2()))+"\t \n");
        this.txtResultado.append("La resta es:  "+ String.valueOf(obJOperaciones.resta(leerNumero(),leerNumero2()))+"\t \n");
        this.txtResultado.append("El producto es:  "+ String.valueOf(obJOperaciones.producto(leerNumero(),leerNumero2()))+"\t \n");
        if(obJOperaciones.division(leerNumero(),leerNumero2())==0){
            this.txtResultado.append("La división es:  INDETERMINADO");
        }else{
            this.txtResultado.append("La división es:  "+ String.valueOf(obJOperaciones.division(leerNumero(),leerNumero2()))+"\t \n");
        }
        this.txtResultado.append("La raíz cuadrada del primer número es:  "+ String.valueOf(obJOperaciones.raizCuadrada(leerNumero()))+"\t \n");
        this.txtResultado.append("La potencia es:  "+ String.valueOf(obJOperaciones.potencia(leerNumero(),leerNumero2()))+"\t \n");
        this.txtResultado.append("El seno del primer número es:  "+ String.valueOf(obJOperaciones.seno(leerNumero()))+"\t \n");
        this.txtResultado.append("El coseno del primer número es:  "+ String.valueOf(obJOperaciones.coseno(leerNumero()))+"\t \n");
        this.txtResultado.append("La raíz cúbica del primer número es:  "+ String.valueOf(obJOperaciones.raizCubica(leerNumero()))+"\t \n");
        this.txtResultado.append("El mayor de los números es:  "+ String.valueOf(obJOperaciones.numeroMayor(leerNumero(),leerNumero2())));
    }
    
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        //se alamcena los numeros ingresados
        float num1,num2;
        num1=leerNumero();
        num2=leerNumero2();
        
        //resultado con metodos
        mostrar();
        //resultado manejado con textArea
        /*this.txtResultado.setText("\tResultado\n");
        this.txtResultado.append("\t------------\n");
        this.txtResultado.append("La suma es:  "+ String.valueOf(obJOperaciones.suma(num1, num2))+"\t \n");
        this.txtResultado.append("La resta es:  "+ String.valueOf(obJOperaciones.resta(num1, num2))+"\t \n");
        this.txtResultado.append("El producto es:  "+ String.valueOf(obJOperaciones.producto(num1, num2))+"\t \n");
        this.txtResultado.append("La división es:  "+ String.valueOf(obJOperaciones.division(num1, num2)));*/
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtnum1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum1KeyTyped
        char c= evt.getKeyChar(); //captura el caracter q digito
        if(!Character.isDigit(c)){  // si el caracter no es un dígito
            evt.consume(); //elimina el caracter ingresado
        }
    }//GEN-LAST:event_txtnum1KeyTyped

    private void txtnum2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum2KeyTyped
        char c= evt.getKeyChar(); //captura el caracter q digito
        if(!Character.isDigit(c)){  // si el caracter no es un dígito
            evt.consume(); //elimina el caracter ingresado
        }
    }//GEN-LAST:event_txtnum2KeyTyped

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CEjemplo01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PBotones;
    private javax.swing.JPanel PIngreso;
    private javax.swing.JPanel PResultado;
    private javax.swing.JPanel PTitulo;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextField txtnum1;
    private javax.swing.JTextField txtnum2;
    // End of variables declaration//GEN-END:variables
}
