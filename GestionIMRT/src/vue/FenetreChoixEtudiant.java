/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

/**
 *
 * @author paul
 */
public class FenetreChoixEtudiant extends javax.swing.JFrame {

    /**
     * Creates new form FentreChoixEtudiant
     */
    public FenetreChoixEtudiant() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTitreChoixEtu = new javax.swing.JLabel();
        lChoixClasse = new javax.swing.JLabel();
        cbChoixClasse = new javax.swing.JComboBox<String>();
        lChoixEtu = new javax.swing.JLabel();
        cbChoixEtu = new javax.swing.JComboBox<String>();
        btChoixEtuOk = new javax.swing.JButton();
        btChoixEtuAnnuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lTitreChoixEtu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lTitreChoixEtu.setText("     Choix de l'étudiant");

        lChoixClasse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lChoixClasse.setText("Choix de la classe");

        cbChoixClasse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbChoixClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChoixClasseActionPerformed(evt);
            }
        });

        lChoixEtu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lChoixEtu.setText("Choix de l'étudiant");

        cbChoixEtu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbChoixEtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChoixEtuActionPerformed(evt);
            }
        });

        btChoixEtuOk.setText("OK");
        btChoixEtuOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChoixEtuOkActionPerformed(evt);
            }
        });

        btChoixEtuAnnuler.setText("Annuler");
        btChoixEtuAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChoixEtuAnnulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lChoixEtu, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(lChoixClasse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btChoixEtuOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btChoixEtuAnnuler, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(cbChoixEtu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbChoixClasse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lTitreChoixEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lTitreChoixEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbChoixClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lChoixClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lChoixEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbChoixEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btChoixEtuOk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btChoixEtuAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbChoixEtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChoixEtuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChoixEtuActionPerformed

    private void cbChoixClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChoixClasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChoixClasseActionPerformed

    private void btChoixEtuOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChoixEtuOkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btChoixEtuOkActionPerformed

    private void btChoixEtuAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChoixEtuAnnulerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btChoixEtuAnnulerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChoixEtuAnnuler;
    private javax.swing.JButton btChoixEtuOk;
    private javax.swing.JComboBox<String> cbChoixClasse;
    private javax.swing.JComboBox<String> cbChoixEtu;
    private javax.swing.JLabel lChoixClasse;
    private javax.swing.JLabel lChoixEtu;
    private javax.swing.JLabel lTitreChoixEtu;
    // End of variables declaration//GEN-END:variables
}
