package package1;


import java.awt.Color;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import static package1.First.check;
import static package1.First.getItem;
public class FirstForm extends JFrame
{
    public static String status = "-2";
    public static String login ="";
    public FirstForm()
    {
        initComponents();
        jLabel4.setVisible(false);
        getContentPane().setBackground(new Color(0,51,51));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        jButton1.setBackground(new Color(0,153,153));
        jInternalFrame1.getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Добро пожаловать!");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jInternalFrame1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Войти как:");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton1.setText("Лечащий врач");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton2.setText("Регистратура");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton3.setText("Касса");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Имя пользователя");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Пароль");

        jButton1.setBackground(java.awt.SystemColor.activeCaptionText);
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Войти");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setSelectedItem("Выберите пациента");
        jComboBox1.setLightWeightPopupEnabled(false);
        jComboBox1.setMaximumSize(new java.awt.Dimension(220, 20));
        jComboBox1.setMinimumSize(new java.awt.Dimension(220, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Неверный пароль пользователя!");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton1)
                            .addComponent(jComboBox1, 0, 220, Short.MAX_VALUE)
                            .addComponent(jPasswordField1))
                        .addGap(72, 72, 72))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addGap(37, 37, 37)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(81, 81, 81)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2044, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(743, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(743, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1147, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(285, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(325, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
       if(((jRadioButton1.isSelected()) || (jRadioButton2.isSelected())||(jRadioButton3.isSelected())) && (jComboBox1.getSelectedItem().toString().equals("Выберите пользователя:") == false)){
        try
       {
           
           login = jComboBox1.getSelectedItem().toString();

           String password = jPasswordField1.getText();
           MessageDigest md;
            try
            {
                md = MessageDigest.getInstance("MD5");
                 md.update(password.getBytes());
 
        byte byteData[] = md.digest();
 
        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
         sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
         password =  sb.toString();
        }
            }
            catch (NoSuchAlgorithmException ex)
            {
                Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           String[]arr = login.split(" ");
           if(check(arr,password)  == true){
               if (status.equals("2")){
               SecondForm sc= new SecondForm();
               sc.setTitle(login);
               sc.title = login;
               dispose();   
              status = "-2";
           sc.setVisible(true);
               } 
               if(status.equals("1")){
                    ThirdForm th= new ThirdForm();
                    th.setTitle(login);
               th.title = login;
               dispose();   
               status = "-2";
               th.setVisible(true);
               } 
               if(status.equals("0")){
                   ForthForm fr= new ForthForm();
                    fr.setTitle(login);
               fr.title = login;
               dispose(); 
               status = "-2";
               fr.setVisible(true);
               }
           }
           
       }
       catch (ClassNotFoundException ex)
       {
           Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
       }
       catch (SQLException ex)
       {
           Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
       }
       }else{
           String password = jPasswordField1.getText();
           MessageDigest md;
            try
            {
                md = MessageDigest.getInstance("MD5");
                 md.update(password.getBytes());
 
        byte byteData[] = md.digest();
 
        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
         sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
         password =  sb.toString();
        }
            }
            catch (NoSuchAlgorithmException ex)
            {
                Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
            }
           if(login.equals("")){
               try
               {
                   if(check(password)  == true){
                       FifthForm ff= new FifthForm();
                       ff.setTitle(login);
                       dispose();
                       status = "-2";
                       ff.setVisible(true);}
               }
               catch (ClassNotFoundException ex)
               {
                   Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
               }
               catch (SQLException ex)
               {
                   Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
               }
               }else{
          jPasswordField1.removeAll();
          jLabel4.setVisible(true);
           }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButton1ActionPerformed
    {//GEN-HEADEREND:event_jRadioButton1ActionPerformed
       try
       {
           jComboBox1.removeAllItems();
           ArrayList<String> item = new ArrayList<String>();
           item.add("Выберите пользователя:");
           getItem(item,"1");
           Object[] arr = item.toArray();
           for(int i=0;i<item.size();i++){
               jComboBox1.addItem(arr[i].toString());
           }
       }
       catch (ClassNotFoundException ex)
       {
           Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
       }

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButton2ActionPerformed
    {//GEN-HEADEREND:event_jRadioButton2ActionPerformed
        try
       {
           jComboBox1.removeAllItems();
           ArrayList<String> item = new ArrayList<String>();
           item.add("Выберите пользователя:");
           getItem(item,"2");        
           Object[] arr = item.toArray();
           for(int i=0;i<item.size();i++){
               jComboBox1.addItem(arr[i].toString());
           }
       }
       catch (ClassNotFoundException ex)
       {
           Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
       }

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButton3ActionPerformed
    {//GEN-HEADEREND:event_jRadioButton3ActionPerformed
        try
       {
           jComboBox1.removeAllItems();
           ArrayList<String> item = new ArrayList<String>();
           item.add("Выберите пользователя:");
           getItem(item,"0");          
           Object[] arr = item.toArray();
           for(int i=0;i<item.size();i++){
               jComboBox1.addItem(arr[i].toString());
           }
       }
       catch (ClassNotFoundException ex)
       {
           Logger.getLogger(FirstForm.class.getName()).log(Level.SEVERE, null, ex);
       }

    }//GEN-LAST:event_jRadioButton3ActionPerformed

    public static void main(String args[])
    {
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {   
                 new FirstForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JComboBox<String> jComboBox1;
    public static javax.swing.JInternalFrame jInternalFrame1;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JPasswordField jPasswordField1;
    public static javax.swing.JRadioButton jRadioButton1;
    public static javax.swing.JRadioButton jRadioButton2;
    public static javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables

}
