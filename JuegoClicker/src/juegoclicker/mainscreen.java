
package juegoclicker;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.TimerTask;

public class mainscreen extends javax.swing.JPanel {
    JFrame newFrame = new JFrame();
    int i = 0;
    int y = 1;
    java.util.Timer t = new java.util.Timer();
    int costejB1 = 2;
    int costejB3 = 3;
    private Font font = new Font("serief", Font.ITALIC, 18); 
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
                        jButton2.setFont(font);
                        jButton2.setText("¡Obtener Porimas!");
                        jButton1.setVisible(false);
                        jButton1.setText("Mejorar colector: "+costejB1);
                        jButton3.setVisible(false);
                        jButton3.setText("Comprar quarry de Porimas");
                        
    }

    @SuppressWarnings("unchecked")            
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

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

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton3)))
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jLabel2.getAccessibleContext().setAccessibleName("jLabel1");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        i++;
        jLabel2.setText(i+ "");
        if(i >= costejB1){
            System.out.println("Prueba");
            jButton1.setVisible(true);
            jButton1.setEnabled(true);
            jButton1.setBackground(Color.green);
        }
        else {
            jButton1.setEnabled(false);
            jButton1.setBackground(Color.gray);
            jButton1.setFont(font);
        }
        if(i >= costejB3){
            System.out.println("Prueba");
            jButton3.setVisible(true);
            jButton3.setEnabled(true);
            jButton3.setBackground(Color.green);
        }
        else {
            jButton3.setEnabled(false);
            jButton3.setBackground(Color.gray);
            jButton3.setFont(font);
        }
            jButton1.setText("Mejorar colector: "+costejB1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /* El colector está jodido, habría que restablecer el contador j para establecer la cantidad de puntos por cada click (i+j)
        y así mejorar el "pico". También habría que mover la lógica de los checks para poder comprar mejoras al scheduler,
        comprobar cada segundo si i es igual o mayor al coste. */
        if(i >=costejB1) {
            i = i-10;
            costejB1 = costejB1 + 1;
            jLabel2.setText(i + "");
        }
        /*else(i =! costejB1) {
            System.out.println("Porimas insuficientes");
        }*/
        if(i <costejB1) {
            jButton1.setEnabled(false);
            jButton1.setBackground(Color.gray);
        }
        jButton1.setText("Mejorar colector: "+costejB1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        t.schedule(new TimerTask(){
            @Override
            public void run(){
            i=i+y;
            jLabel2.setText(i + "");
        }
        }, 1000, 1000);/*
        if(i >=costejB1) {
            i = i-10;
            costejB1 = costejB1 + 1;
            jLabel2.setText(i + "");
        }
        /*else(i =! costejB1) {
            System.out.println("Porimas insuficientes");
        }*/
        if(i <costejB1) {
            jButton1.setEnabled(false);
            jButton1.setBackground(Color.gray);
        }
        jButton1.setText("Mejorar colector: "+costejB1);
    }//GEN-LAST:event_jButton3ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
