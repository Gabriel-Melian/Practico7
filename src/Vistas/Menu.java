package Vistas;

import java.util.HashMap;
import java.util.Map;
import practico_7.*;

public class Menu extends javax.swing.JFrame {

    public static Map<Integer,Alumno>alumnos=new HashMap();
    public static Map<Integer,Materia>materias=new HashMap();
    
    public static Map<Integer,Alumno>alumnos2=new HashMap();
    public static Map<Integer,Materia>materias2=new HashMap();
    
    private static Alumno nuevo = new Alumno();
    
    public static Alumno getAlumno() {
        return nuevo;
    }
    
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiAltaAlumno = new javax.swing.JMenuItem();
        jmiAltaMateria = new javax.swing.JMenuItem();
        jmiFormulario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        jMenu1.setForeground(new java.awt.Color(255, 102, 255));
        jMenu1.setText("Registro");

        jmiAltaAlumno.setBackground(new java.awt.Color(255, 102, 255));
        jmiAltaAlumno.setForeground(new java.awt.Color(0, 0, 0));
        jmiAltaAlumno.setText("Alta de Alumnos");
        jmiAltaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAltaAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAltaAlumno);

        jmiAltaMateria.setBackground(new java.awt.Color(255, 102, 255));
        jmiAltaMateria.setForeground(new java.awt.Color(0, 0, 0));
        jmiAltaMateria.setText("Alta de Materias");
        jmiAltaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAltaMateriaActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAltaMateria);

        jmiFormulario.setBackground(new java.awt.Color(255, 102, 255));
        jmiFormulario.setForeground(new java.awt.Color(0, 0, 0));
        jmiFormulario.setText("Formulario de Inscripción");
        jmiFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormularioActionPerformed(evt);
            }
        });
        jMenu1.add(jmiFormulario);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 102, 255));
        jMenu2.setText("Salir");

        jmiSalir.setBackground(new java.awt.Color(255, 102, 255));
        jmiSalir.setForeground(new java.awt.Color(0, 0, 0));
        jmiSalir.setText("Salir del Colegio");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jMenu2.add(jmiSalir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAltaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAltaAlumnoActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        ViewAlumnos alumnos = new ViewAlumnos();
        jEscritorio.add(alumnos);
        alumnos.setVisible(true);
        jEscritorio.moveToFront(alumnos);
    }//GEN-LAST:event_jmiAltaAlumnoActionPerformed

    private void jmiAltaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAltaMateriaActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        ViewMaterias materia = new ViewMaterias();
        jEscritorio.add(materia);
        materia.setVisible(true);
    }//GEN-LAST:event_jmiAltaMateriaActionPerformed

    private void jmiFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormularioActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        ViewInscripcion formulario = new ViewInscripcion();
        jEscritorio.add(formulario);
        formulario.setVisible(true);
    }//GEN-LAST:event_jmiFormularioActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jmiSalirActionPerformed

   public static void main(String args[]) {

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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiAltaAlumno;
    private javax.swing.JMenuItem jmiAltaMateria;
    private javax.swing.JMenuItem jmiFormulario;
    private javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables
}
