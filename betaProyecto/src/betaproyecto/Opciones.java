/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package betaproyecto;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *Muestra las opciones para resolver el laberinto
 * @author Gabriel González
 */
public class Opciones extends javax.swing.JFrame {
JFrame ventana;
Lista marco;
Lista mLista;
Integer ancho;
Integer largo;
    /**
     * Creates new form Opciones
     */
    public Opciones(JFrame ven, Lista marco, Lista mLista,Integer ancho, Integer largo) {
        initComponents();
        this.ventana = ven;
        this.marco = marco;
        this.mLista = mLista;
        this.ancho = ancho;
        this.largo = largo;
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
        DFS = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DFS.setText("Depth First Search (DFS)");
        DFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DFSActionPerformed(evt);
            }
        });
        jPanel1.add(DFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 180, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Algoritmos para resolver");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\veronica\\Downloads\\ccc3ecf340e59f310244db7620d005f0.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 20, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Entrada");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 70, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\veronica\\Downloads\\azul.png")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 20, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Salida");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 40, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DFSActionPerformed
        // TODO add your handling code here:
    try {
        this.ventana.setVisible(false);
        this.setVisible(false);
        Lista marco2 = marco;
        Lista mLista2 = mLista;
        marco.DFS(marco2, mLista2);
        Matriz matriz = new Matriz();
        matriz.setCeldas(matriz.crearMatriz(matriz.getCeldas(), ancho, largo));
        matriz.ingresarValores(matriz.getCeldas(), mLista);
        matriz.ingresarValoresMarco(matriz.getCeldas(), marco);
        Laberinto lab = new Laberinto(ancho, largo, matriz.getCeldas());
        Ventana ventana = new Ventana(lab);
        Nodo pAux = mLista.getpFirst();
        while(pAux.getpNext() != null){
            if(pAux.getFrontera() == 6){
                pAux.setFrontera(1);
            }
            pAux = pAux.getpNext();
        }
        ventana.crearVentana(ventana, marco, mLista, ancho, largo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al buscar la solución con este laberinto");
        }
        
    }//GEN-LAST:event_DFSActionPerformed

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
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opciones().setVisible(true);
            }
        }); */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DFS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
