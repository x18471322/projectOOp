package library;
import java.util.*;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;

/**
 *
 * @author x18493414
 */
public class BorrowGUI extends javax.swing.JFrame{

    protected String name;
    protected int bID;
    protected int ID;
    protected Date bDate;
    protected Date TDate;
    protected int bDays;
    protected String BkName;
   
    
    public BorrowGUI() {
        initComponents();
       
        TDate = Calendar.getInstance().getTime();
        DateFormat Dformat = new SimpleDateFormat("dd/mm/yyyy");
        String strDate = Dformat.format(TDate);
        Datelbl.setText(strDate);
        
        
        
        //SearchCB is name of Booklbl//
        SearchGui s = new SearchGui();
        BkName = s.SearchSelect;
        Booklbl.setText(BkName);
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Titlelbl = new javax.swing.JLabel();
        BkNamelbl = new javax.swing.JLabel();
        Booklbl = new javax.swing.JLabel();
        DaysCmbo = new javax.swing.JComboBox<>();
        Dayslbl = new javax.swing.JLabel();
        CheckoutBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        CurrentDatelbl = new javax.swing.JLabel();
        Datelbl = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titlelbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Titlelbl.setText("Borrow A Book");

        BkNamelbl.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        BkNamelbl.setText("Book Name:");

        Booklbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Booklbl.setText("The Great Gatsby");

        DaysCmbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        DaysCmbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaysCmboActionPerformed(evt);
            }
        });

        Dayslbl.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        Dayslbl.setText("Days:");

        CheckoutBtn.setText("Check-Out");
        CheckoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutBtnActionPerformed(evt);
            }
        });

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        CurrentDatelbl.setText("Todays Date:");

        Datelbl.setText("11/12/19");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(Titlelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CurrentDatelbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Datelbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BkNamelbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Booklbl, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Dayslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DaysCmbo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CheckoutBtn)
                                .addGap(33, 33, 33)
                                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titlelbl)
                    .addComponent(CurrentDatelbl)
                    .addComponent(Datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BkNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Booklbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DaysCmbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dayslbl))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckoutBtn)
                    .addComponent(BackBtn))
                .addGap(0, 90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        BorrowGUI myGUI = new BorrowGUI();
        myGUI.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void CheckoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckoutBtnActionPerformed
        // TODO add your handling code here:
         BorrowGUI myGUI = new BorrowGUI();
        myGUI.dispose();
        //Sends the user back to search page
        //SearchGui SGui = new SearchGui();
        //SGui.setVisible(true);
        
        
        
    }//GEN-LAST:event_CheckoutBtnActionPerformed

    private void DaysCmboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaysCmboActionPerformed
        // TODO add your handling code here:
       
        /*Code to be added to Date to give return date*/
          bDays = Integer.parseInt((String)DaysCmbo.getSelectedItem());
    }//GEN-LAST:event_DaysCmboActionPerformed

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
            java.util.logging.Logger.getLogger(BorrowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel BkNamelbl;
    private javax.swing.JLabel Booklbl;
    private javax.swing.JButton CheckoutBtn;
    private javax.swing.JLabel CurrentDatelbl;
    private javax.swing.JLabel Datelbl;
    private javax.swing.JComboBox<String> DaysCmbo;
    private javax.swing.JLabel Dayslbl;
    private javax.swing.JLabel Titlelbl;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
