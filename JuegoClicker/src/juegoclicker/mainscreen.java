
package juegoclicker;
import javax.swing.*;
import java.awt.BorderLayout;

public class mainscreen extends javax.swing.JPanel {
    JFrame newFrame = new JFrame();
    int i = 0;
    int j = 1;
    int costejB1 = 10;

    public mainscreen() {
        initComponents();
        newFrame.getContentPane().add(this, BorderLayout.CENTER);
            newFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                newFrame.pack();
                    newFrame.setVisible(true);
                        newFrame.setTitle("Juego Clicker");
                        jLabel1.setText("Bienvenido a Pori Clicker.");
                        jLabel2.setText(i + "");
                        jLabel3.setText("Porimas");
                        jButton2.setText("¡Obtener Porimas!");
                        jButton1.setVisible(false);
                        jButton1.setText("Mejorar colector: "+costejB1);
                        
    }

    @SuppressWarnings("unchecked")            
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jLabel2.getAccessibleContext().setAccessibleName("jLabel1");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        i = i+j;
        jLabel2.setText(i+ "");
            if(i >= costejB1){
                System.out.println("Prueba");
                jButton1.setVisible(true);
                jButton1.setEnabled(true);
            }
            else {
                jButton1.setVisible(false);
                jButton1.setEnabled(false);
            }
            jButton1.setText("Mejorar colector: "+costejB1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(i >=costejB1) {
        i = i-10;
        j = j+1;
        costejB1 = costejB1 + 1;
        jLabel2.setText(i+ "");
        }
        else {
            System.out.println("Porimas insuficientes");
        }
        if(i <costejB1) {
            jButton1.setVisible(false);
            jButton1.setEnabled(false);
        }
        jButton1.setText("Mejorar colector: "+costejB1);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
