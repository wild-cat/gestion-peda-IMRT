/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.Component;

/**
 *
 * @author Alain
 */
public class FenetreAcceuilPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Fenetre
     */
    public FenetreAcceuilPrincipal() {
        initComponents();
        pGestionEtudiant.setEnabledAt(1, false);
        pGestionEtudiant.setEnabledAt(2, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pGestionEtudiant = new javax.swing.JTabbedPane();
        pAgenda = new javax.swing.JPanel();
        pGestionEtudiants = new javax.swing.JPanel();
        jBGestionAbscence = new javax.swing.JButton();
        jBGestionNote = new javax.swing.JButton();
        btRestFichEtu = new javax.swing.JButton();
        btPassageEtuClasSup = new javax.swing.JButton();
        lTitreGestEtu = new javax.swing.JLabel();
        jBCreaSuprEtudiabnt = new javax.swing.JButton();
        jBModifEtudiant = new javax.swing.JButton();
        jBImporter = new javax.swing.JButton();
        pGestionEnseignant = new javax.swing.JPanel();
        lTitreGestionEnseignants = new javax.swing.JLabel();
        btCreaSuprEtudiabnt1 = new javax.swing.JButton();
        jBModifEtudiant1 = new javax.swing.JButton();
        jBImporter1 = new javax.swing.JButton();
        jBGestionNote1 = new javax.swing.JButton();
        btCreationEtatHeure = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exemple d'utilisation des onglets");

        pGestionEtudiant.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 2, 12))); // NOI18N

        javax.swing.GroupLayout pAgendaLayout = new javax.swing.GroupLayout(pAgenda);
        pAgenda.setLayout(pAgendaLayout);
        pAgendaLayout.setHorizontalGroup(
            pAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        pAgendaLayout.setVerticalGroup(
            pAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );

        pGestionEtudiant.addTab("Agenda", pAgenda);

        pGestionEtudiants.setEnabled(false);

        jBGestionAbscence.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBGestionAbscence.setText("Gestion des abscences");

        jBGestionNote.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBGestionNote.setText("Gestion des notes");

        btRestFichEtu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btRestFichEtu.setText("restaurer la fiche d'un étudiant");

        btPassageEtuClasSup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btPassageEtuClasSup.setText("Passage des étudiants en classe superieur");

        lTitreGestEtu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lTitreGestEtu.setText("                Gestion des étudiants");

        jBCreaSuprEtudiabnt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBCreaSuprEtudiabnt.setText("Création de la fiche d'un étudiant");
        jBCreaSuprEtudiabnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCreaSuprEtudiabntActionPerformed(evt);
            }
        });

        jBModifEtudiant.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBModifEtudiant.setText("Modification/supression de la fiche d'un étudiant");
        jBModifEtudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModifEtudiantActionPerformed(evt);
            }
        });

        jBImporter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBImporter.setText("Importation à partir d'un fichier");

        javax.swing.GroupLayout pGestionEtudiantsLayout = new javax.swing.GroupLayout(pGestionEtudiants);
        pGestionEtudiants.setLayout(pGestionEtudiantsLayout);
        pGestionEtudiantsLayout.setHorizontalGroup(
            pGestionEtudiantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGestionEtudiantsLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(pGestionEtudiantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btPassageEtuClasSup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBGestionAbscence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lTitreGestEtu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCreaSuprEtudiabnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBModifEtudiant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBImporter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBGestionNote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRestFichEtu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        pGestionEtudiantsLayout.setVerticalGroup(
            pGestionEtudiantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGestionEtudiantsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lTitreGestEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jBCreaSuprEtudiabnt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBModifEtudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btRestFichEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBImporter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBGestionAbscence, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBGestionNote, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btPassageEtuClasSup, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(81, 81, 81))
        );

        pGestionEtudiant.addTab("gestion des étudiants", pGestionEtudiants);

        pGestionEnseignant.setEnabled(false);

        lTitreGestionEnseignants.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lTitreGestionEnseignants.setText("   Gestion des enseignants");

        btCreaSuprEtudiabnt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btCreaSuprEtudiabnt1.setText("Création d'une fiche enseignant");

        jBModifEtudiant1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBModifEtudiant1.setText("Modification d'une fiche enseignants");
        jBModifEtudiant1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModifEtudiant1ActionPerformed(evt);
            }
        });

        jBImporter1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBImporter1.setText("Importation à partir d'un fichier");

        jBGestionNote1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBGestionNote1.setText("Gestion des cours faits");

        btCreationEtatHeure.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btCreationEtatHeure.setText("creation d'état des heures");

        javax.swing.GroupLayout pGestionEnseignantLayout = new javax.swing.GroupLayout(pGestionEnseignant);
        pGestionEnseignant.setLayout(pGestionEnseignantLayout);
        pGestionEnseignantLayout.setHorizontalGroup(
            pGestionEnseignantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
            .addGroup(pGestionEnseignantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pGestionEnseignantLayout.createSequentialGroup()
                    .addGap(168, 168, 168)
                    .addGroup(pGestionEnseignantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lTitreGestionEnseignants, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCreaSuprEtudiabnt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBModifEtudiant1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBImporter1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBGestionNote1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCreationEtatHeure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(169, Short.MAX_VALUE)))
        );
        pGestionEnseignantLayout.setVerticalGroup(
            pGestionEnseignantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
            .addGroup(pGestionEnseignantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pGestionEnseignantLayout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(lTitreGestionEnseignants, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50)
                    .addComponent(btCreaSuprEtudiabnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(jBModifEtudiant1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(jBImporter1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(jBGestionNote1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btCreationEtatHeure, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addGap(101, 101, 101)))
        );

        pGestionEtudiant.addTab("Gestion des enseignants", pGestionEnseignant);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );

        pGestionEtudiant.addTab("Gestion des examens", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );

        pGestionEtudiant.addTab("Gestion des users", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pGestionEtudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pGestionEtudiant)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCreaSuprEtudiabntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCreaSuprEtudiabntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCreaSuprEtudiabntActionPerformed

    private void jBModifEtudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModifEtudiantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBModifEtudiantActionPerformed

    private void jBModifEtudiant1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModifEtudiant1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBModifEtudiant1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCreaSuprEtudiabnt1;
    private javax.swing.JButton btCreationEtatHeure;
    private javax.swing.JButton btPassageEtuClasSup;
    private javax.swing.JButton btRestFichEtu;
    private javax.swing.JButton jBCreaSuprEtudiabnt;
    private javax.swing.JButton jBGestionAbscence;
    private javax.swing.JButton jBGestionNote;
    private javax.swing.JButton jBGestionNote1;
    private javax.swing.JButton jBImporter;
    private javax.swing.JButton jBImporter1;
    private javax.swing.JButton jBModifEtudiant;
    private javax.swing.JButton jBModifEtudiant1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lTitreGestEtu;
    private javax.swing.JLabel lTitreGestionEnseignants;
    private javax.swing.JPanel pAgenda;
    private javax.swing.JPanel pGestionEnseignant;
    private javax.swing.JTabbedPane pGestionEtudiant;
    private javax.swing.JPanel pGestionEtudiants;
    // End of variables declaration//GEN-END:variables
}
