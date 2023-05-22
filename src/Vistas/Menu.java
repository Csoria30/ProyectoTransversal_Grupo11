package Vistas;

import Modelo.Login;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.*;

public class Menu extends javax.swing.JFrame  {
    
    private JMenuBar barra;
    private JMenu Menu_Alumnos, Menu_Materias, Menu_Salir;
    private JMenuItem A_opcion1, A_opcion2, A_opcion3, M_opcion1, M_opcion2, M_opcion3, M_opcion4, M_opcion5, S_opcion1;
    
    public Menu() {
        crearMenu();
        initComponents();
        label_usuarioSesion.setText("Usuario: " + Login.getUsuario_login());
    }
  
    private void crearMenu(){
        barra = new JMenuBar();
        
        Menu_Alumnos = new JMenu("Alumnos");
        Menu_Materias = new JMenu("Materias");
        Menu_Salir = new JMenu("Salir");
        
        //Menu Alumnos
        A_opcion1 = new JMenuItem("Punto 1 _ Lista Alumnos");
        A_opcion1.addActionListener((java.awt.event.ActionEvent evt) -> {
            escritorio.removeAll();
            escritorio.repaint();
            ListaAlumnos listaAlumnos = new ListaAlumnos();
            listaAlumnos.setVisible(true);
            escritorio.add(listaAlumnos);
            escritorio.moveToBack(listaAlumnos);
        });
        
        A_opcion2 = new JMenuItem("Lista Materias Inscriptos");
        A_opcion2.addActionListener((java.awt.event.ActionEvent evt) -> {
            escritorio.removeAll();
            escritorio.repaint();
            InscripcionesAlumnos inscripcionesAlumnos = new InscripcionesAlumnos();
            inscripcionesAlumnos.setVisible(true);
            escritorio.add(inscripcionesAlumnos);
            escritorio.moveToFront(inscripcionesAlumnos);
        });
        
        A_opcion3 = new JMenuItem("ABM Alumnos");
        A_opcion3.addActionListener((java.awt.event.ActionEvent evt) -> {
            escritorio.removeAll();
            escritorio.repaint();
            ABMAlumnos abmAlumnos = new ABMAlumnos();
            abmAlumnos.setVisible(true);
            escritorio.add(abmAlumnos);
            escritorio.moveToFront(abmAlumnos);
        });
        
        //Menu Materias
        M_opcion1 = new JMenuItem("Punto 2 _ Lista Materias");
        M_opcion1.addActionListener((java.awt.event.ActionEvent evt) -> {
            escritorio.removeAll();
            escritorio.repaint();
            ListaMaterias listaMaterias = new ListaMaterias();
            listaMaterias.setVisible(true);
            escritorio.add(listaMaterias);
            escritorio.moveToFront(listaMaterias);
        });
        
        M_opcion2 = new JMenuItem("Lista de inscripciones");
        M_opcion2.addActionListener((java.awt.event.ActionEvent evt) -> {
            escritorio.removeAll();
            escritorio.repaint();
            ListaMateriasInscripto listaMateriasIns = new ListaMateriasInscripto();
            listaMateriasIns.setVisible(true);
            escritorio.add(listaMateriasIns);
            escritorio.moveToFront(listaMateriasIns);
        });
        
        M_opcion3 = new JMenuItem("ABM Materias");
        M_opcion3.addActionListener((java.awt.event.ActionEvent evt) -> {
            escritorio.removeAll();
            escritorio.repaint();
            ABMMaterias abmMaterias = new ABMMaterias();
            abmMaterias.setVisible(true);
            escritorio.add(abmMaterias);
            escritorio.moveToFront(abmMaterias);
        });
        
        M_opcion4 = new JMenuItem("Inscribir Alumnos");
        M_opcion4.addActionListener((java.awt.event.ActionEvent evt) -> {
            escritorio.removeAll();
            escritorio.repaint();
            ListaInscripciones listaInscripciones = new ListaInscripciones();
            listaInscripciones.setVisible(true);
            escritorio.add(listaInscripciones);
            escritorio.moveToFront(listaInscripciones);
        });
        
        M_opcion5 = new JMenuItem("Calificaciones");
        M_opcion5.addActionListener((java.awt.event.ActionEvent evt) -> {
            escritorio.removeAll();
            escritorio.repaint();
            Calificaciones calificaciones = new Calificaciones();
            calificaciones.setVisible(true);
            escritorio.add(calificaciones);
            escritorio.moveToFront(calificaciones);
        });
        
        //Menu Salir
        S_opcion1 = new JMenuItem("Salir del sistema");
        S_opcion1.addActionListener((java.awt.event.ActionEvent evt) -> {
            System.exit(0);
        });
        
        if ( Login.getUsuario_login().equals("alumno")){

            Menu_Alumnos.add(A_opcion1);
            Menu_Alumnos.add(A_opcion2);
            Menu_Alumnos.add(A_opcion3);
            Menu_Salir.add(S_opcion1);
        
            barra.add(Menu_Alumnos);
            barra.add(Menu_Salir);
        }
        
        if ( Login.getUsuario_login().equals("cristians")){

            Menu_Alumnos.add(A_opcion1);
            Menu_Alumnos.add(A_opcion2);
            Menu_Alumnos.add(A_opcion3);
            Menu_Materias.add(M_opcion1);
            Menu_Materias.add(M_opcion2);
            Menu_Materias.add(M_opcion3);
            Menu_Materias.add(M_opcion4);
            Menu_Materias.add(M_opcion5);
            Menu_Salir.add(S_opcion1);
        
            barra.add(Menu_Alumnos);
            barra.add(Menu_Materias);
            barra.add(Menu_Salir);
        }
        
        
        setJMenuBar(barra);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/fondo_escritorio_transversal.png"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        btnPrueba_usuario = new javax.swing.JButton();
        btnPrueba_rol = new javax.swing.JButton();
        label_usuarioSesion = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPrueba_usuario.setText("Usuario");
        btnPrueba_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrueba_usuarioActionPerformed(evt);
            }
        });

        btnPrueba_rol.setText("rol");
        btnPrueba_rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrueba_rolActionPerformed(evt);
            }
        });

        label_usuarioSesion.setText("jLabel1");

        escritorio.setLayer(btnPrueba_usuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btnPrueba_rol, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(label_usuarioSesion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(btnPrueba_usuario)
                .addGap(216, 216, 216)
                .addComponent(btnPrueba_rol)
                .addContainerGap(669, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_usuarioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(btnPrueba_usuario))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(label_usuarioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)
                        .addComponent(btnPrueba_rol)))
                .addContainerGap(526, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrueba_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrueba_usuarioActionPerformed
        JOptionPane.showMessageDialog ( null, "usuario: " + Login.getUsuario_login() , "Error de ejecucion", JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_btnPrueba_usuarioActionPerformed

    private void btnPrueba_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrueba_rolActionPerformed
        JOptionPane.showMessageDialog ( null, "rol: " + Login.getUsuario_login() , "Error de ejecucion", JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_btnPrueba_rolActionPerformed
      
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
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrueba_rol;
    private javax.swing.JButton btnPrueba_usuario;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_usuarioSesion;
    // End of variables declaration//GEN-END:variables
   
}