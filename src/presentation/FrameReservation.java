/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import dialog.DialogReservation;

@SuppressWarnings("serial")
public class FrameReservation extends javax.swing.JFrame {

    private DialogReservation dialog;

    public FrameReservation() {
    }

    public void initFrame() {
        initComponents();
    }

    public void setDialog(DialogReservation dialog) {
        this.dialog = dialog;
    }

    // /!\ /!\ /!\ ATTENTION /!\ /!\ /!\
    // ce code est auto généré et ne doit PAS être modifié
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        dateTimePanel = new javax.swing.JPanel();
        datePicker = new org.netbeans.modules.form.InvalidComponent();
        datePicker.addDateChangeListener(new DateChangeListener(){
            public void dateChanged(DateChangeEvent dateEvent) {
                datePickerDateChanged(dateEvent);
            }
        });
        TextDate = new javax.swing.JLabel();
        BoxHeure = new javax.swing.JComboBox<>();
        TextHeure = new javax.swing.JLabel();
        nbPersonsPanel = new javax.swing.JPanel();
        TextNbPer = new javax.swing.JLabel();
        BoxPer = new javax.swing.JComboBox<>();
        pickTablePanel = new javax.swing.JPanel();
        tablesImage = new javax.swing.JLabel();
        TextTable = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListTable = new javax.swing.JList<>();
        Valider = new javax.swing.JButton();
        Annuler = new javax.swing.JButton();

        jTabbedPane1.setName("Réserver une table"); // NOI18N
        jTabbedPane1.getAccessibleContext().setAccessibleName("Réserver une table");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dateTimePanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        TextDate.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        TextDate.setText("1. Choisissez la date");
        TextDate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TextDate.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                TextDateComponentShown(evt);
            }
        });

        BoxHeure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11h30", "12h00", "12h30", "13h00", "13h30" }));
        BoxHeure.setSelectedItem(getJMenuBar());
        BoxHeure.setToolTipText("");
        BoxHeure.setEnabled(false);
        BoxHeure.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                TextHeureComponentHidden(evt);
            }
        });
        BoxHeure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxHeureActionPerformed(evt);
            }
        });

        TextHeure.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        TextHeure.setText("2. Choisissez l'heure");
        TextHeure.setEnabled(false);
        TextHeure.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TextHeureAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        TextHeure.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                TextHeureComponentHidden(evt);
            }
        });

        javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
        dateTimePanel.setLayout(dateTimePanelLayout);
        dateTimePanelLayout.setHorizontalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(72, 72, 72)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextHeure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BoxHeure, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        dateTimePanelLayout.setVerticalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextDate)
                    .addComponent(TextHeure))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxHeure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        TextDate.getAccessibleContext().setAccessibleParent(datePicker);
        BoxHeure.getAccessibleContext().setAccessibleName("");

        nbPersonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        TextNbPer.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        TextNbPer.setText("3. Indiquer le nombre de personnes");
        TextNbPer.setEnabled(false);

        BoxPer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8" }));
        BoxPer.setSelectedItem(getJMenuBar());
        BoxPer.setToolTipText("");
        BoxPer.setAction(BoxPer.getAction());
        BoxPer.setEnabled(false);
        BoxPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxPerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nbPersonsPanelLayout = new javax.swing.GroupLayout(nbPersonsPanel);
        nbPersonsPanel.setLayout(nbPersonsPanelLayout);
        nbPersonsPanelLayout.setHorizontalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BoxPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextNbPer, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nbPersonsPanelLayout.setVerticalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TextNbPer)
                .addGap(18, 18, 18)
                .addComponent(BoxPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pickTablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        pickTablePanel.setName(""); // NOI18N

        tablesImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plan_tables.jpg"))); // NOI18N
        tablesImage.setEnabled(false);

        TextTable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        TextTable.setText("4. Choisissez votre table");
        TextTable.setEnabled(false);

        ListTable.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        ListTable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        ListTable.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Table 2", "Table 3", "Table 4", "Table 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListTable.setEnabled(false);
        jScrollPane2.setViewportView(ListTable);

        javax.swing.GroupLayout pickTablePanelLayout = new javax.swing.GroupLayout(pickTablePanel);
        pickTablePanel.setLayout(pickTablePanelLayout);
        pickTablePanelLayout.setHorizontalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addComponent(tablesImage, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                    .addComponent(TextTable, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pickTablePanelLayout.setVerticalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TextTable)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablesImage, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Valider.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        Valider.setText("Valider");
        Valider.setEnabled(false);
        Valider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ValiderMouseClicked(evt);
            }
        });
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });

        Annuler.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        Annuler.setText("Annuler");
        Annuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnnulerMouseClicked(evt);
            }
        });
        Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerActionPerformed(evt);
            }
        });
        Annuler.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AnnulerKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nbPersonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pickTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Valider)
                .addGap(11, 11, 11)
                .addComponent(Annuler)
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(dateTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nbPersonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pickTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Annuler)
                    .addComponent(Valider))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoxHeureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxHeureActionPerformed
        dialog.handleTimeSelectedEvent(BoxHeure.getSelectedItem().toString());
    }//GEN-LAST:event_BoxHeureActionPerformed

    private void datePickerAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_datePickerAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_datePickerAncestorAdded

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValiderActionPerformed

    private void AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnnulerActionPerformed

    private void TextHeureAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TextHeureAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TextHeureAncestorAdded

    private void AnnulerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AnnulerKeyPressed
            // TODO add your handling code here:
    }//GEN-LAST:event_AnnulerKeyPressed

    private void TextHeureComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TextHeureComponentHidden
            // TODO add your handling code here:
    }//GEN-LAST:event_TextHeureComponentHidden

    private void TextDateComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TextDateComponentShown
       // TODO
    }//GEN-LAST:event_TextDateComponentShown

    private void AnnulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnnulerMouseClicked
        dialog.handleCancelEvent();
    }//GEN-LAST:event_AnnulerMouseClicked

    private void ValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValiderMouseClicked
        dialog.handleValidationEvent();
    }//GEN-LAST:event_ValiderMouseClicked

    private void BoxPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxPerActionPerformed
        dialog.handleNumOfPersonsSelectedEvent(BoxPer.getItemCount());
    }//GEN-LAST:event_BoxPerActionPerformed

    public void datePickerDateChanged(DateChangeEvent dateEvent) {
        dialog.handleDateSelectedEvent(datePicker.getDate());
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annuler;
    private javax.swing.JComboBox<String> BoxHeure;
    private javax.swing.JComboBox<String> BoxPer;
    private javax.swing.JList<String> ListTable;
    private javax.swing.JLabel TextDate;
    private javax.swing.JLabel TextHeure;
    private javax.swing.JLabel TextNbPer;
    private javax.swing.JLabel TextTable;
    private javax.swing.JButton Valider;
    private org.netbeans.modules.form.InvalidComponent datePicker;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel nbPersonsPanel;
    private javax.swing.JPanel pickTablePanel;
    private javax.swing.JLabel tablesImage;
    // End of variables declaration//GEN-END:variables
    public void EnableTime(){
        BoxHeure.setEnabled(true);
        TextHeure.setEnabled(true);
    }
    public void EnableCountPpl(){
       BoxPer.setEnabled(true);
       TextNbPer.setEnabled(true);
    }
    public void EnableTable(){
       tablesImage.setEnabled(true);
       pickTablePanel.setEnabled(true);
     
    }
    
}



