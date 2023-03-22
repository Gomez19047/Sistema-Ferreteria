
package SistemaFerreteria;
/**
 * 
 * @author Maricela Yneth  Portillo Gómez.
 * @author 
 * 
 */

public class Menu extends javax.swing.JFrame {

   
    public Menu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        OpFactura = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        opAgregarVentas = new javax.swing.JMenuItem();
        OpAgregarProveedores = new javax.swing.JMenu();
        AgregarProductos = new javax.swing.JMenuItem();
        OpAgregarEmpleados = new javax.swing.JMenuItem();
        OpAgregarClientes = new javax.swing.JMenuItem();
        AgregarProveedores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 902, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
        );

        jMenu1.setText("Generar Documentos");

        OpFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        OpFactura.setText("Generar Factura");
        OpFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpFacturaActionPerformed(evt);
            }
        });
        jMenu1.add(OpFactura);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Productos");

        opAgregarVentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        opAgregarVentas.setText("Productos Disponibles");
        opAgregarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opAgregarVentasActionPerformed(evt);
            }
        });
        jMenu2.add(opAgregarVentas);

        jMenuBar1.add(jMenu2);

        OpAgregarProveedores.setText("Manejar Información");

        AgregarProductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        AgregarProductos.setText("Agregar Productos");
        AgregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProductosActionPerformed(evt);
            }
        });
        OpAgregarProveedores.add(AgregarProductos);

        OpAgregarEmpleados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK));
        OpAgregarEmpleados.setText("Agregar Empleados");
        OpAgregarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpAgregarEmpleadosActionPerformed(evt);
            }
        });
        OpAgregarProveedores.add(OpAgregarEmpleados);

        OpAgregarClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        OpAgregarClientes.setText("Agregar Clientes");
        OpAgregarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpAgregarClientesActionPerformed(evt);
            }
        });
        OpAgregarProveedores.add(OpAgregarClientes);

        AgregarProveedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.SHIFT_MASK));
        AgregarProveedores.setText("Agregar Proveedores");
        AgregarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProveedoresActionPerformed(evt);
            }
        });
        OpAgregarProveedores.add(AgregarProveedores);

        jMenuBar1.add(OpAgregarProveedores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      // En esta parte manda a llamar las clase que lleva el sistema.
    private void AgregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProductosActionPerformed
        
        AgregarProductos Ap = new AgregarProductos();
        escritorio.add(Ap);
        Ap.show();
    }//GEN-LAST:event_AgregarProductosActionPerformed

    private void opAgregarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opAgregarVentasActionPerformed
        //creamos un objeto
        CargarVentas Av = new CargarVentas();
        escritorio.add(Av);
        Av.show();

    }//GEN-LAST:event_opAgregarVentasActionPerformed

    private void OpAgregarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpAgregarEmpleadosActionPerformed
       AgregarEmpleados AE= new AgregarEmpleados();
       escritorio.add(AE);
       AE.show();
    }//GEN-LAST:event_OpAgregarEmpleadosActionPerformed

    private void OpAgregarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpAgregarClientesActionPerformed
        
        AgregarClientes AC= new AgregarClientes();
        escritorio.add(AC);
        AC.show();
    }//GEN-LAST:event_OpAgregarClientesActionPerformed

    private void AgregarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProveedoresActionPerformed
        
        AgregarProveedores Ap= new AgregarProveedores();
        escritorio.add(Ap);
        Ap.show();
        
    }//GEN-LAST:event_AgregarProveedoresActionPerformed

    private void OpFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpFacturaActionPerformed
        //llamar la factura y crear un objeto dentro del metodo
        
        Factura verFactura= new Factura();
        escritorio.add(verFactura);
        verFactura.show();
        
    }//GEN-LAST:event_OpFacturaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarProductos;
    private javax.swing.JMenuItem AgregarProveedores;
    private javax.swing.JMenuItem OpAgregarClientes;
    private javax.swing.JMenuItem OpAgregarEmpleados;
    private javax.swing.JMenu OpAgregarProveedores;
    private javax.swing.JMenuItem OpFactura;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem opAgregarVentas;
    // End of variables declaration//GEN-END:variables
}
