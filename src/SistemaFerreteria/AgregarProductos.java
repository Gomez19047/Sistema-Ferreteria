
package SistemaFerreteria;


import java.io.File;
import java.util.Formatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcela Portillo
 */
public class AgregarProductos extends javax.swing.JInternalFrame {
  
    DefaultTableModel modelo= new DefaultTableModel();
    
   
    //importar al bloc de nota que tomaremos en este caso como una base de datos
    String barra= File.separator;
    String ubicacion= System.getProperty("user.dir")+ barra + "registroProductos"+barra;

    /**
     * Creates new form AgregarProductos
     */
    public AgregarProductos() {
        initComponents();
        modelo.addColumn("Codigo");
        modelo.addColumn("Producto");
        modelo.addColumn("Precio");
        
        
        
        TablaProductos.setModel(modelo);
    }
      //creamos un metodo
    private void Crear(){
    //crear el nombre del archivo para importar
    String archivo= txtnombreProducto.getText()+".registros";
    // Indidicamos que debe de crear la ubicacion
    File Crea_Ubicacion= new File(ubicacion);
    //crear el Archivo
    File Crea_archivo= new File(ubicacion+archivo);
    
    if (txtnombreProducto.getText().equals("")){
    JOptionPane.showMessageDialog(rootPane,"Ingrese datos");
    }else{
        try{
        if(Crea_archivo.exists()){
        JOptionPane.showMessageDialog(rootPane,"El producto ya existe");
        }else{
            //crear carpeta  para el registro
         
                  Crea_Ubicacion.mkdir();
           //para introduccir el texto al archivo del texto
           Formatter crea= new Formatter(ubicacion + archivo);
           crea.format("%s\r\n%s\r\n%s","Codigo="+txtcodProducto.getText(),
                   "Nombre Producto="+txtnombreProducto.getText()
                   ,"Precio="+txtprecioProducto.getText());
                      crea.close();
            JOptionPane.showMessageDialog(rootPane,"Producto Guardado");
        }
        }catch (Exception e){
        JOptionPane.showMessageDialog(rootPane,"El registro no se guardo");
        }   
    }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnombreProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtprecioProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcodProducto = new javax.swing.JTextField();
        btninsertarProducto = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("Enviar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Agregar  Producto");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre Producto");

        txtnombreProducto.setForeground(new java.awt.Color(51, 51, 255));
        txtnombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreProductoActionPerformed(evt);
            }
        });
        txtnombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreProductoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Precio");

        txtprecioProducto.setForeground(new java.awt.Color(255, 0, 51));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("código");

        txtcodProducto.setForeground(new java.awt.Color(51, 51, 255));
        txtcodProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodProductoKeyTyped(evt);
            }
        });

        btninsertarProducto.setBackground(new java.awt.Color(204, 255, 255));
        btninsertarProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btninsertarProducto.setText("Insertar");
        btninsertarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertarProductoActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(204, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(204, 255, 255));
        btnNuevo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        TablaProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaProductos.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(TablaProductos);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)
                        .addComponent(txtnombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btninsertarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtprecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtcodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)))))
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(245, 245, 245))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btninsertarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtnombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtprecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninsertarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertarProductoActionPerformed
        // 
        String[]datos= new String[3];
        datos[1]=txtnombreProducto.getText();
        datos[2]=txtprecioProducto.getText();
        datos[0]=txtcodProducto.getText();
        
        modelo.addRow(datos);
        
        
        //inicializamos el metodo para importar al bloc
                 Crear();
    }//GEN-LAST:event_btninsertarProductoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // enviar Datos
        DefaultTableModel model=(DefaultTableModel)CargarVentas.TablaProducto1.getModel();
        int filaselec=TablaProductos.getSelectedRow();
        String[]Registro= new String[3];
        
        Registro[0]=(String) TablaProductos.getValueAt(filaselec, 0).toString();
        Registro[1]=(String) TablaProductos.getValueAt(filaselec, 1).toString();
        Registro[2]=(String) TablaProductos.getValueAt(filaselec, 2).toString();
       
        model.addRow(Registro);
        CargarVentas.TablaProducto1.setModel(model);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
     int fila = TablaProductos.getSelectedRow();
     if (fila>=0){
         modelo.removeRow(fila);    
     } else{
     JOptionPane.showMessageDialog(null,"Seleccione la fila a Eliminar");
     
     }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtnombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreProductoKeyTyped
    //validar para que solo reciba texto
    char validar= evt.getKeyChar();
    
    if(Character.isDigit(validar)){
    getToolkit().beep();
    
    evt.consume();
     JOptionPane.showMessageDialog(rootPane, "Ingrese solo Letras");
    }
            
    }//GEN-LAST:event_txtnombreProductoKeyTyped

    private void txtcodProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodProductoKeyTyped
        //validar la caja de texto  para que solo admita numeros
        char Cod= evt.getKeyChar();
        
        if (Character.isLetter(Cod)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese un valor Numerico Correcto");
        }
    }//GEN-LAST:event_txtcodProductoKeyTyped

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        //nuevo
        txtnombreProducto.setText("");
        txtprecioProducto.setText("");
        txtcodProducto.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtnombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Factura fac=new Factura();
      fac.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btninsertarProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcodProducto;
    private javax.swing.JTextField txtnombreProducto;
    private javax.swing.JTextField txtprecioProducto;
    // End of variables declaration//GEN-END:variables
}
