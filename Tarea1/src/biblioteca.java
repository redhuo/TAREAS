
/**
 * Frame de la biblioteca, se encarga de administrar todas las cacniones.
 * Es el frame principal.
 */

import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.UnsupportedTagException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class biblioteca extends javax.swing.JFrame {
     metodoGuardarObj cancion;
     String camino,imagen;
     int i;
     int e;
     DefaultListModel lista = new DefaultListModel();
     JFileChooser fileChooser = new JFileChooser(".");
     mostrarInformacion informacion;
     modificarInfo modificar;
     buscador buscador1;
     
    /**
     * Contructor de biblioteca
     */
    public biblioteca() throws IOException, UnsupportedTagException, InvalidDataException {
        initComponents();
        cancion = new metodoGuardarObj();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        libCancion = new javax.swing.JList();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JComboBox();
        buscar = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));

        jLabel1.setFont(new java.awt.Font("Hobo Std", 0, 18)); // NOI18N
        jLabel1.setText("Biblioteca");

        jScrollPane1.setViewportView(libCancion);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar Informacion");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnPlay.setText("Play");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });


        btnBuscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar por:", "Cancion", "Artista", "Genero", "Album" }));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscar)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()

                        .addGap(331, 331, 331)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnModificar)
                .addGap(44, 44, 44)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMostrar)
                .addGap(78, 78, 78))

        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar)
                    .addComponent(btnMostrar))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Boton que se encarga de modificar la cancion que se selecciono. Se podra modificar el artista, genero y album de la cancion selecionada.
 * @param evt 
 */
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
            if(libCancion.getSelectedIndex()<0){
            
        }
        else{
            int a = libCancion.getSelectedIndex();
            modificar = new modificarInfo();
            modificar.setVisible(true);
            modificar.btn.getModel().setEnabled(true);
            modificar.btn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt){
                     
                    String artista = modificar.txtArtista.getText();
                    String album = modificar.txtAlbum.getText();
                    String genero =  modificar.txtGenero.getText();
                    cancion.modificarCancion(a, artista, album, genero);
                    modificar.lblCorrecto.setText("Se ha modificado");
                    libCancion.setModel(lista);
          }
                
      
            
        
            });
           imagen=null;
           modificar.subir.setEnabled(true);
            modificar.subir.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt){
                    int status = fileChooser.showOpenDialog (null);
                      if (status == JFileChooser.APPROVE_OPTION){
                         File selectedFile = fileChooser.getSelectedFile();
                         imagen = selectedFile.getAbsolutePath();
                        
                }
                
            else{ 
            if (status == JFileChooser.CANCEL_OPTION){
                System.out.println("CANCELAR");
            }
            cancion.subirImagen(a, imagen);
                
            }
            }
            });
            }
    }//GEN-LAST:event_btnModificarActionPerformed
/**
 * Boton que se encarga de agregar las canciones a la bibliteca.
 * Solo se pueden agregar archivos con formato mp3
 * @param evt 
 */
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
      
        camino=null;
       
        int status = fileChooser.showOpenDialog (null);
        if (status == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            camino = selectedFile.getAbsolutePath();
        }
        else{ 
            if (status == JFileChooser.CANCEL_OPTION){
                System.out.println("CANCELAR");
            }
       
        }
         try {
             cancion.agregarCancion(camino);
         } catch (IOException ex) {
             Logger.getLogger(biblioteca.class.getName()).log(Level.SEVERE, null, ex);
         } catch (UnsupportedTagException ex) {
             Logger.getLogger(biblioteca.class.getName()).log(Level.SEVERE, null, ex);
         } catch (InvalidDataException ex) {
             Logger.getLogger(biblioteca.class.getName()).log(Level.SEVERE, null, ex);
         }
         String[] test = cancion.mostrarCancion(i);
         lista.addElement("               "+test[0]);
         libCancion.setModel(lista);
         i++;
    }//GEN-LAST:event_btnAgregarActionPerformed
/**
 * Boton que se encarga de mostrar informacion.
 * Se le mostrara la informacion de la cancion
 * @param evt 
 */
    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        if (libCancion.getSelectedIndex()<0){
            
        }
        else{
            informacion = new mostrarInformacion();
            informacion.setVisible(true);
             e=libCancion.getSelectedIndex();
             String[] test=cancion.mostrarCancion(e);
             mostrarInformacion.jLabel3.setText(test[1]);
             mostrarInformacion.jLabel5.setText(test[2]);
             mostrarInformacion.jLabel7.setText(test[3]);
             mostrarInformacion.jLabel9.setText(test[4]+"secs");
            // mostrarInformacion.lblImg.setIcon(new ImageIcon(test[6]));
             
             
            
        }
    }//GEN-LAST:event_btnMostrarActionPerformed
/**
 * Boton que se encarga de eliminar la cancion deseada.
 * @param evt 
 */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        e=libCancion.getSelectedIndex();
        System.out.println(e);
        lista.remove(e);  
        libCancion.setModel(lista);
        
        cancion.eliminarCancion(e);// TODO add your handling code here:
        i--;
        System.out.println(cancion.getSize());
    }//GEN-LAST:event_btnEliminarActionPerformed
/**
 * Boton que se encarga de reproducir la cancion.
 * Abre el reproductor de Musica.
 * @param evt 
 */
    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        if (libCancion.getSelectedIndex()<0){
            
        }
        else{
            e=libCancion.getSelectedIndex();
            String[] test=cancion.mostrarCancion(e);
            camino = test[5]+"";
            System.out.println(camino);
               
        java.awt.EventQueue.invokeLater(() -> {
        try {
             reproductorMp3 player;
             player = new reproductorMp3(camino);
             player.setVisible(true);
         } catch (BasicPlayerException ex) {
             Logger.getLogger(biblioteca.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        });
                
        }
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
   
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        DefaultListModel lista2 = new DefaultListModel();
        buscador1 = new buscador();
      
        buscador1.setVisible(true);
        System.out.println(btnBuscar.getSelectedIndex());
        Object[] resultado = null;
        String txt =null;
        if (btnBuscar.getSelectedIndex()==1){
             txt = jTextField1.getText();
             resultado= cancion.buscarCancion(txt);
          for (int a =0;a<resultado.length;a++ )
              lista2.addElement(resultado[0].toString());
              buscador1.si.setModel(lista2);
           
        }
        if (btnBuscar.getSelectedIndex()==2){
            txt = jTextField1.getText();
              resultado= cancion.buscarArtista(txt);
              for ( int i=0; i < cancion.getSize();i++){
              lista2.addElement(resultado[0].toString());
              buscador1.si.setModel(lista2);
           }
        }
         if (btnBuscar.getSelectedIndex()==4){
            txt = jTextField1.getText();
           for ( int i=0; i < cancion.getSize();i++){
               resultado = cancion.buscarAlbum(txt);
            
              
              lista2.addElement(resultado[0].toString());
              buscador.si.setModel(lista2);
           }
         }
           if (btnBuscar.getSelectedIndex()==3){
            /*String*/ txt = jTextField1.getText();
           for ( int i=0; i < cancion.getSize();i++){
             resultado= cancion.buscarGenero(txt);
              
              lista2.addElement(resultado[0].toString());
              buscador1.si.setModel(lista2);
           }
           
        }
           buscador1.jButton1.getModel().setEnabled(true);
           buscador1.jButton1.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent evt){
                     if(buscador1.si.getSelectedIndex()<0){
                       
                     }
                String resultado1 = buscador.si.getSelectedValue().toString();
                for(int i = 0;i<cancion.getSize();i++){
                    String[] test2=cancion.mostrarCancion(i);
                    if(resultado1.equals(test2[0])){
                       String cami=test2[5];
                         java.awt.EventQueue.invokeLater(() -> {
        try {
             reproductorMp3 player;
             player = new reproductorMp3(cami);
             player.setVisible(true);
         } catch (BasicPlayerException ex) {
             Logger.getLogger(biblioteca.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        });
                    }
                }
                        
                    
          }}
           );
// TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new biblioteca().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(biblioteca.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedTagException ex) {
                    Logger.getLogger(biblioteca.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidDataException ex) {
                    Logger.getLogger(biblioteca.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox btnBuscar;
    public static javax.swing.JButton btnEliminar;
    public static javax.swing.JButton btnModificar;
    public static javax.swing.JButton btnMostrar;
    public static javax.swing.JButton btnPlay;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JList libCancion;
    // End of variables declaration//GEN-END:variables
}
