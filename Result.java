/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mm computer
 */
public class Result extends javax.swing.JFrame {
    int questionAnswered;
    int Marks;
    /**
     * Creates new form Result
     */
    public Result(int quizanswered, int marks) {
        initComponents();
        lblquestionAnswered.setText(" "+questionAnswered);
        lblMarks.setText(""+marks);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblquestionAnswered = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblMarks = new javax.swing.JLabel();
        btnfinish = new javax.swing.JButton();
        btnhome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 153, 0));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quiz Game Result");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(180, 10, 960, 70);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1400, 90);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Correct Answers -");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(450, 100, 220, 50);

        lblquestionAnswered.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblquestionAnswered.setForeground(new java.awt.Color(51, 153, 0));
        lblquestionAnswered.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblquestionAnswered.setText("0");
        jPanel1.add(lblquestionAnswered);
        lblquestionAnswered.setBounds(730, 100, 150, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Marks");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(440, 152, 461, 60);

        lblMarks.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblMarks.setForeground(new java.awt.Color(102, 153, 0));
        lblMarks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMarks.setText("00");
        lblMarks.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 3, true));
        jPanel1.add(lblMarks);
        lblMarks.setBounds(490, 237, 350, 140);

        btnfinish.setBackground(new java.awt.Color(51, 153, 0));
        btnfinish.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnfinish.setText("Finish");
        btnfinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinishActionPerformed(evt);
            }
        });
        jPanel1.add(btnfinish);
        btnfinish.setBounds(690, 390, 260, 70);

        btnhome.setBackground(new java.awt.Color(51, 153, 0));
        btnhome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnhome.setText("Home");
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnhome);
        btnhome.setBounds(400, 390, 220, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1400, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnfinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinishActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnfinishActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        HOME d=new HOME();
        d.setVisible(true);
    }//GEN-LAST:event_btnhomeActionPerformed

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
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result(0,0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfinish;
    private javax.swing.JButton btnhome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblMarks;
    private javax.swing.JLabel lblquestionAnswered;
    // End of variables declaration//GEN-END:variables
}
