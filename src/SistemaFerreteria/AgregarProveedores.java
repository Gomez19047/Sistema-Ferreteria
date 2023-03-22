/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaFerreteria;
import java.io.File;
import java.util.Formatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcela Portillo
 */
public class AgregarProveedores extends javax.swing.JInternalFrame {
    //crear un modelo
    DefaultTableModel modeloProv=new DefaultTableModel();

    //importar al bloc de nota que tomaremos en este caso como una base de datos
    String barra= File.separator;
    String ubicacion= System.getProperty("user.dir")+ barra + "registroProveedore"+barra;
    
    public AgregarProveedores() {
        initComponents();
        //mostrar las columnas
        
        modeloProv.addColumn("Nombre");
        modeloProv.addColumn("Apellido");
        modeloProv.addColumn("Telefono");
        modeloProv.addColumn("Direccion");
        modeloProv.addColumn("Correo electronico");
        
         TablaPr.setModel(modeloProv);
        
    }
         //creamos un metodo
    private void CrearProveedores(){
    //crear el nombre del archivo para importar
    String archivo= txtnombreP.getText()+".registroProveedores";
    // Indidicamos que debe de crear la ubicacion
    File Crea_Ubicacion= new File(ubicacion);
    //crear el Archivo
    File Crea_archivo= new File(ubicacion+archivo);
    
    if (txtnombreP.getText().equals("")){
    JOptionPane.showMessageDialog(rootPane,"Ingrese Datos");
    }else{
        try{
        if(Crea_archivo.exists()){
        JOptionPane.showMessageDialog(rootPane,"El Provedor Ya existe");
        }else{
            //crear carpeta  para el registro
         
                  Crea_Ubicacion.mkdir();
           //para introduccir el texto al archivo del texto
           Formatter crea= new Formatter(ubicacion + archivo);
           crea.format("%s\r\n%s\r\n%s\r\n%s",
                   "Nombre="+txtnombreP.getText(),
                   "Apellido="+txtapellidosPr.getText(),
                   "Direccion="+txtdireccionP.getText(), 
                   "Telefono="+txtcorreoP.getText());
                  
            crea.close();
            JOptionPane.showMessageDialog(rootPane,"Datos ingresados correctamente");
        }
        }catch (Exception e){
        JOptionPane.showMessageDialog(rootPane,"Datos no guardado");
        }   
    }
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnInsertarProveedores = new javax.swing.JButton();
        txtnombreP = new javax.swing.JTextField();
        txtapellidosPr = new javax.swing.JTextField();
        txtdireccionP = new javax.swing.JTextField();
        txttelefonoP = new javax.swing.JTextField();
        txtcorreoP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPr = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Agregar Proveedores");

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        btnEliminar.setBackground(new java.awt.Color(204, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnInsertarProveedores.setBackground(new java.awt.Color(204, 255, 255));
        btnInsertarProveedores.setText("Insertar");
        btnInsertarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarProveedoresActionPerformed(evt);
            }
        });

        txtnombreP.setForeground(new java.awt.Color(0, 0, 255));

        txtapellidosPr.setForeground(new java.awt.Color(0, 0, 255));

        txtdireccionP.setForeground(new java.awt.Color(0, 51, 255));

        txttelefonoP.setForeground(new java.awt.Color(0, 0, 204));
        txttelefonoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoPKeyTyped(evt);
            }
        });

        txtcorreoP.setForeground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Apellidos");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Direccion");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Telefono");

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TablaPr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaPr);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Correo Electronico");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttelefonoP, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtcorreoP, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdireccionP, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtapellidosPr, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(163, 163, 163)
                                .addComponent(btnInsertarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(55, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel5)
                                .addGap(16, 16, 16))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtapellidosPr)
                                .addGap(14, 14, 14)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtdireccionP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txttelefonoP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtcorreoP)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnInsertarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarProveedoresActionPerformed
        //insertar filas usando un vector
        String[]datosPr= new String[5];
        datosPr[0]=txtnombreP.getText();
        datosPr[1]=txtapellidosPr.getText();
        datosPr[2]=txtdireccionP.getText();
        datosPr[3]=txttelefonoP.getText();
        datosPr[4]=txtcorreoP.getText();    
        
       modeloProv.addRow(datosPr);
       
       
            CrearProveedores();
    }//GEN-LAST:event_btnInsertarProveedoresActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         int fila = TablaPr.getSelectedRow();
     if (fila>=0){
         modeloProv.removeRow(fila);    
     } else{
     JOptionPane.showMessageDialog(null,"Seleccione la fila a Eliminar");
     
     }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txttelefonoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoPKeyTyped
       //validar la caja de texto  para que solo admita numeros
        char valTelefono= evt.getKeyChar();
        
        if (Character.isLetter(valTelefono)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese un valor Numerico Correcto");
        }
    }//GEN-LAST:event_txttelefonoPKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Limpiar texto de caja de texto
         txtnombreP.setText("");
         txtapellidosPr.setText("");
         txtdireccionP.setText("");
         txttelefonoP.setText("");
         txtcorreoP.setText(""); 
         
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPr;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertarProveedores;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtapellidosPr;
    private javax.swing.JTextField txtcorreoP;
    private javax.swing.JTextField txtdireccionP;
    private javax.swing.JTextField txtnombreP;
    private javax.swing.JTextField txttelefonoP;
    // End of variables declaration//GEN-END:variables
}
