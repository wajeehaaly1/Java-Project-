import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author mm computer
 */
public class TIC_TAC_TOE extends javax.swing.JFrame {
   
   private String StartGame="X";
   private int xCount=0;
   private int oCount=0;        
   
   
   
    public TIC_TAC_TOE() {
        initComponents();
        
    }
    private void gameScore(){
        playerxxx.setText(String.valueOf(xCount));
        playerooo.setText(String.valueOf(oCount));
    }
    private void choose_a_player(){
        if(StartGame.equalsIgnoreCase("X"))
        {
            StartGame="O";
        }    
        else{
            StartGame="X";
        }
    }
    

    
    
    
    private void winningGame(){
        String b1=txtbtn1.getText();
        String b2=txtbtn2.getText();
        String b3=txtbtn3.getText();
        
        String b4=txtbtn4.getText();
        String b5=txtbtn5.getText();
        String b6=txtbtn6.getText(); 
        
        String b7=txtbtn7.getText();
        String b8=txtbtn8.getText();
        String b9=txtbtn9.getText();
        
        //PLAYER X CODING
        
        if(b1==("X") && b2==("X") && b3==("X")){
            JOptionPane.showMessageDialog(this,"Player X win!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
        }
        
       if(b4==("X") && b5==("X") && b6==("X")){
           
           JOptionPane.showMessageDialog(this,"Player X win!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
           
        }
      if(b7==("X") && b8==("X") && b9==("X")){
            JOptionPane.showMessageDialog(this,"Player X win!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn7.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
        }
     if(b1==("X") && b4==("X") && b7==("X")){
            JOptionPane.showMessageDialog(this,"Player X win!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
        }
     if(b2==("X") && b5==("X") && b8==("X")){
            JOptionPane.showMessageDialog(this,"Player X win!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
        }
     if(b1==("X") && b5==("X") && b9==("X")){
            JOptionPane.showMessageDialog(this,"Player X win!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
        }
     if(b3==("X") && b5==("X") && b7==("X")){
            JOptionPane.showMessageDialog(this,"Player X win!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
        }
     if(b3==("X") && b6==("X") && b9==("X")){
            JOptionPane.showMessageDialog(this,"Player X win!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
        }
     
     
             //PLAYER O CODING
        
        if(b1==("O") && b2==("O") && b3==("O")){
            JOptionPane.showMessageDialog(this,"Player O win!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
        }
       if(b4==("O") && b5==("O") && b6==("O")){
            JOptionPane.showMessageDialog(this,"Player O win!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
        }
      if(b7==("O") && b8==("O") && b9==("O")){
            JOptionPane.showMessageDialog(this,"Player O win!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn7.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
        }
     if(b1==("O") && b4==("O") && b7==("O")){
            JOptionPane.showMessageDialog(this,"Player O win!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
        }
     if(b2==("O") && b5==("O") && b8==("O")){
            JOptionPane.showMessageDialog(this,"Player O win!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
        }
     if(b1==("O") && b5==("O") && b9==("O")){
            JOptionPane.showMessageDialog(this,"Player O win!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
        }
     if(b3==("O") && b5==("O") && b7==("O")){
            JOptionPane.showMessageDialog(this,"Player O win!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
        }
      if(b3==("O") && b6==("O") && b9==("O")){
            JOptionPane.showMessageDialog(this,"Player O win!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
        }
      
      
      
     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtexit = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        playerooo = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        playerxxx = new javax.swing.JLabel();
        heading = new javax.swing.JLabel();
        txtback = new javax.swing.JButton();
        database = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtbtn7 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TICTACTOE");
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 75)); // NOI18N
        jLabel1.setText("       TIC TAC TOE GAME          ");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 10, 1030, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1360, 120);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        txtexit.setBackground(new java.awt.Color(51, 153, 255));
        txtexit.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        txtexit.setText("EXIT");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });
        jPanel2.add(txtexit);
        txtexit.setBounds(330, 410, 190, 70);

        txtreset.setBackground(new java.awt.Color(255, 102, 102));
        txtreset.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        txtreset.setText("RESET");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });
        jPanel2.add(txtreset);
        txtreset.setBounds(90, 320, 220, 70);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 153, 204), new java.awt.Color(102, 0, 153)));
        jPanel4.setLayout(null);

        playerooo.setBackground(new java.awt.Color(255, 255, 255));
        playerooo.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        playerooo.setText("  xxxxxxxxxxx");
        playerooo.setOpaque(true);
        jPanel4.add(playerooo);
        playerooo.setBounds(210, 200, 230, 60);

        playero.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        playero.setText("Player O:");
        jPanel4.add(playero);
        playero.setBounds(40, 210, 140, 50);

        playerx.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        playerx.setText("Player X:");
        jPanel4.add(playerx);
        playerx.setBounds(40, 130, 140, 50);

        playerxxx.setBackground(new java.awt.Color(255, 255, 255));
        playerxxx.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        playerxxx.setText("  xxxxxxxxxxx");
        playerxxx.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        playerxxx.setOpaque(true);
        jPanel4.add(playerxxx);
        playerxxx.setBounds(210, 130, 230, 50);

        heading.setBackground(new java.awt.Color(255, 255, 255));
        heading.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        heading.setText("         SCORING");
        heading.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        heading.setOpaque(true);
        jPanel4.add(heading);
        heading.setBounds(50, 30, 410, 70);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(60, 20, 510, 280);

        txtback.setBackground(new java.awt.Color(204, 204, 255));
        txtback.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        txtback.setText("BACK");
        txtback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbackActionPerformed(evt);
            }
        });
        jPanel2.add(txtback);
        txtback.setBounds(330, 320, 190, 70);

        database.setBackground(new java.awt.Color(153, 0, 153));
        database.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        database.setText("INSERT DATA");
        database.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databaseActionPerformed(evt);
            }
        });
        jPanel2.add(database);
        database.setBounds(90, 410, 220, 70);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(690, 130, 670, 560);

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        txtbtn7.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });
        jPanel3.add(txtbtn7);
        txtbtn7.setBounds(40, 350, 180, 140);

        txtbtn1.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(txtbtn1);
        txtbtn1.setBounds(40, 20, 180, 150);

        txtbtn9.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });
        jPanel3.add(txtbtn9);
        txtbtn9.setBounds(420, 350, 190, 140);

        txtbtn4.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });
        jPanel3.add(txtbtn4);
        txtbtn4.setBounds(40, 180, 180, 160);

        txtbtn2.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });
        jPanel3.add(txtbtn2);
        txtbtn2.setBounds(230, 20, 180, 150);

        txtbtn5.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });
        jPanel3.add(txtbtn5);
        txtbtn5.setBounds(230, 180, 180, 160);

        txtbtn8.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });
        jPanel3.add(txtbtn8);
        txtbtn8.setBounds(230, 350, 180, 140);

        txtbtn3.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });
        jPanel3.add(txtbtn3);
        txtbtn3.setBounds(420, 20, 190, 150);

        txtbtn6.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });
        jPanel3.add(txtbtn6);
        txtbtn6.setBounds(420, 180, 190, 160);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 130, 660, 560);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
        txtbtn1.setText(StartGame);
        
        
        if(StartGame.equalsIgnoreCase("X"))
        {
           txtbtn1.setForeground(Color.RED);
        }    
        else{
            txtbtn1.setForeground(Color.BLUE);
            
        }
        
        
        choose_a_player();
        winningGame();
        
                
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
         txtbtn2.setText(StartGame);
        
        
        if(StartGame.equalsIgnoreCase("X"))
        {
           txtbtn2.setForeground(Color.RED);
        }    
        else{
            txtbtn2.setForeground(Color.BLUE);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
         txtbtn3.setText(StartGame);
        
        
        if(StartGame.equalsIgnoreCase("X"))
        {
           txtbtn3.setForeground(Color.RED);
        }    
        else{
            txtbtn3.setForeground(Color.BLUE);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
         txtbtn4.setText(StartGame);
        
        
        if(StartGame.equalsIgnoreCase("X"))
        {
           txtbtn4.setForeground(Color.RED);
        }    
        else{
            txtbtn4.setForeground(Color.BLUE);
        }
        
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
         txtbtn5.setText(StartGame);
        
        
        if(StartGame.equalsIgnoreCase("X"))
        {
           txtbtn5.setForeground(Color.RED);
        }    
        else{
            txtbtn5.setForeground(Color.BLUE);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
         txtbtn6.setText(StartGame);
        
        
        if(StartGame.equalsIgnoreCase("X"))
        {
           txtbtn6.setForeground(Color.RED);
        }    
        else{
            txtbtn6.setForeground(Color.BLUE);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
         txtbtn7.setText(StartGame);
        
        
        if(StartGame.equalsIgnoreCase("X"))
        {
           txtbtn7.setForeground(Color.RED);
        }    
        else{
            txtbtn7.setForeground(Color.BLUE);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
         txtbtn8.setText(StartGame);
        
        
        if(StartGame.equalsIgnoreCase("X"))
        {
           txtbtn8.setForeground(Color.RED);
        }    
        else{
            txtbtn8.setForeground(Color.BLUE);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
         txtbtn9.setText(StartGame);
        
        
        if(StartGame.equalsIgnoreCase("X"))
        {
           txtbtn9.setForeground(Color.RED);
        }    
        else{
            txtbtn9.setForeground(Color.BLUE);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresetActionPerformed
        // TODO add your handling code here:
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        
        txtbtn1.setBackground(Color.LIGHT_GRAY);
        txtbtn2.setBackground(Color.LIGHT_GRAY);
        txtbtn3.setBackground(Color.LIGHT_GRAY);
        
        txtbtn4.setBackground(Color.LIGHT_GRAY);
        txtbtn5.setBackground(Color.LIGHT_GRAY);
        txtbtn6.setBackground(Color.LIGHT_GRAY);
        
        txtbtn7.setBackground(Color.LIGHT_GRAY);
        txtbtn8.setBackground(Color.LIGHT_GRAY);
        txtbtn9.setBackground(Color.LIGHT_GRAY);
        
        
        
       
        
        
    }//GEN-LAST:event_txtresetActionPerformed

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("Exit");

        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit!!","Tic Tac Toe",JOptionPane.YES_NO_OPTION) ==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_txtexitActionPerformed

    private void txtbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbackActionPerformed
        // TODO add your handling code here:

        dispose();
        HOME home=new HOME();
        home.setVisible(true);
    }//GEN-LAST:event_txtbackActionPerformed

    private void databaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databaseActionPerformed
        // TODO add your handling code here:
        String b1=txtbtn1.getText();
        String b2=txtbtn2.getText();
        String b3=txtbtn3.getText();
        
        String b4=txtbtn4.getText();
        String b5=txtbtn5.getText();
        String b6=txtbtn6.getText(); 
        
        String b7=txtbtn7.getText();
        String b8=txtbtn8.getText();
        String b9=txtbtn9.getText();
        
        
        try {
            FileWriter fw = new FileWriter("Areeshaa.txt", true);
            if (b1 == ("X") && b2 == ("X") && b3 == ("X")) {
                fw.write("player x win");
                fw.write(System.getProperty("line.separator"));
                fw.write(System.getProperty("line.separator"));
                fw.write(" ");
            }
            if (b4 == ("X") && b5 == ("X") && b6 == ("X")) {
                fw.write("player x win");
                fw.write(System.getProperty("line.separator"));
                fw.write(System.getProperty("line.separator"));
                fw.write(" ");
            }
            if (b7 == ("X") && b8 == ("X") && b9 == ("X")) {
                fw.write("player x win");
                fw.write(System.getProperty("line.separator"));
                fw.write(System.getProperty("line.separator"));
                fw.write(" ");
            }
            if (b1 == ("X") && b4 == ("X") && b7 == ("X")) {
                fw.write("player x win");
                fw.write(System.getProperty("line.separator"));
                fw.write(System.getProperty("line.separator"));
                fw.write(" ");
            }
            if (b2 == ("X") && b5 == ("X") && b8 == ("X")) {
                fw.write("player x win");
                fw.write(System.getProperty("line.separator"));
                fw.write(System.getProperty("line.separator"));
                fw.write(" ");
            }
            if (b1 == ("X") && b5 == ("X") && b9 == ("X")) {
                fw.write("player x win");
                fw.write(System.getProperty("line.separator"));
                fw.write(System.getProperty("line.separator"));
                fw.write(" ");
            }
            if (b3 == ("X") && b5 == ("X") && b7 == ("X")) {
                fw.write("player x win");
                fw.write(System.getProperty("line.separator"));
                fw.write(System.getProperty("line.separator"));
                fw.write(" ");
            }
            if (b3 == ("X") && b6 == ("X") && b9 == ("X")) {
                fw.write("player x win");
                fw.write(System.getProperty("line.separator"));
                fw.write(System.getProperty("line.separator"));
                fw.write(" ");
            }

            //PLAYER O CODING
            if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {
                fw.write("player O win");
                fw.write(System.getProperty("line.separator"));
                fw.write(System.getProperty("line.separator"));
                fw.write(" ");
            }
            if (b4 == ("O") && b5 == ("O") && b6 == ("O")) {
                fw.write("player O win");
                fw.write(System.getProperty("line.separator"));
                fw.write(System.getProperty("line.separator"));
                fw.write(" ");
            }
            if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {
                fw.write("player O win");
                fw.write(System.getProperty("line.separator"));
                fw.write(System.getProperty("line.separator"));
                fw.write(" ");
            }
            if (b1 == ("O") && b4 == ("O") && b7 == ("O")) {
                fw.write("player O win");
                fw.write(System.getProperty("line.separator"));
                fw.write(System.getProperty("line.separator"));
                fw.write(" ");
            }
            
            if (b2 == ("O") && b5 == ("O") && b8 == ("O")) {
                fw.write("player O win");
                fw.write(System.getProperty("line.separator"));
                fw.write(System.getProperty("line.separator"));
                fw.write(" ");
            }
            if (b1 == ("O") && b5 == ("O") && b9 == ("O")) {
                fw.write("player O win");
                fw.write(System.getProperty("line.separator"));
                fw.write(System.getProperty("line.separator"));
                fw.write(" ");
            }
            if (b3 == ("O") && b5 == ("O") && b7 == ("O")) {
                fw.write("player O win");
                fw.write(System.getProperty("line.separator"));
                fw.write(System.getProperty("line.separator"));
                fw.write(" ");
            }
            if (b3 == ("O") && b6 == ("O") && b9 == ("O")) {
                fw.write("player O win");
                fw.write(System.getProperty("line.separator"));
                fw.write(" ");
            }
             Date thisDate= new Date();
            
             SimpleDateFormat dateForm=new SimpleDateFormat("MM/dd/Y hh:mm a");
            
            fw.write(dateForm.format(thisDate));
            fw.write(System.getProperty("line.separator"));
            fw.write(System.getProperty("line.separator"));
            fw.write(" ");
            
            fw.close();
            JOptionPane.showMessageDialog(this,"SUCCESSFULLY ADDED!!","DATABASE",JOptionPane.INFORMATION_MESSAGE);
            setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"ERROR!!","DATABASE",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_databaseActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton database;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerooo;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel playerxxx;
    private javax.swing.JButton txtback;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txtreset;
    // End of variables declaration//GEN-END:variables



        
}
