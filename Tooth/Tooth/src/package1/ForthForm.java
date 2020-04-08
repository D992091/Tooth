/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import static package1.First.getItem;
import static package1.FirstForm.jComboBox1;
import static package1.Forth.getServices;

/**
 *
 * @author Daniil
 */
public class ForthForm extends javax.swing.JFrame
{
public static String title;
public static String str = "";
public static String cost = "";
public static float cost1 = 0;
public static float cost2 = 0;
public static float cost3 = 0;
public static float discoun = 0;
public static String disc = "";
public static String act = "";
    /**
     * Creates new form ForthForm
     */
    public ForthForm() throws SQLException
    {
    try
    {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(new Color(0,153,153));
        ArrayList<String> item = new ArrayList<String>();
         ArrayList<String> serv = new ArrayList<String>();
        getItem(item,"1");
        getServices(serv);
        jTextField5.setEditable(false);
        jTextField1.setEditable(false);
        jTextField7.setEditable(false);
        jTextField4.setEditable(false);
         jTextField2.setEditable(false);
         jLabel12.setVisible(false);
        Object[] arr = item.toArray();
        Object[] arr1 = serv.toArray();
        for(int i=0;i<item.size();i++){
            jComboBox1.addItem(arr[i].toString());
        }
         for(int i=0;i<serv.size();i++){
            jComboBox3.addItem(arr1[i].toString());
        }
         jTextField3.getDocument().addDocumentListener(new DocumentListener() {


            @Override
            public void insertUpdate(DocumentEvent e)
            {
                if(!jTextField3.getText().equals("")){
                cost2 = Integer.parseInt(jTextField3.getText());
                if(!jTextField7.getText().equals("")){
                cost3 = cost2 - cost1 + Float.parseFloat(jTextField7.getText());
                }else{
                    cost3 = cost2 - cost1 ;
                }
                if(cost3>=0){
                jTextField4.setText(Float.toString(cost3));
        }else{
             jTextField4.setText("");
        }
            }
            }

            @Override
            public void removeUpdate(DocumentEvent e)
            {
                if(!jTextField3.getText().equals("")){
                cost2 = Integer.parseInt(jTextField3.getText());
                if(!jTextField7.getText().equals("")){
                cost3 = cost2 - cost1 + Float.parseFloat(jTextField7.getText());
                }else{
                    cost3 = cost2 - cost1 ;
                }
                if(cost3>=0){
                jTextField4.setText(Float.toString(cost3));
        }else{
             jTextField4.setText("");
        }
            }
            }

            @Override
            public void changedUpdate(DocumentEvent e)
            {
                if(!jTextField3.getText().equals("")){
                cost2 = Integer.parseInt(jTextField3.getText());
                if(!jTextField7.getText().equals("")){
                cost3 = cost2 - cost1 + Float.parseFloat(jTextField7.getText());
                }else{
                    cost3 = cost2 - cost1 ;
                }
                if(cost3>=0){
                jTextField4.setText(Float.toString(cost3));
        }else{
             jTextField4.setText("");
        }
            }
                }
  });
         jTextField7.getDocument().addDocumentListener(new DocumentListener() {


            @Override
            public void insertUpdate(DocumentEvent e)
            {
                if(!jTextField3.getText().equals("")){
                cost2 = Integer.parseInt(jTextField3.getText());
                if(!jTextField7.getText().equals("")){
                cost3 = cost2 - cost1 + Float.parseFloat(jTextField7.getText());
                }else{
                    cost3 = cost2 - cost1 ;
                }
                if(cost3>=0){
                jTextField4.setText(Float.toString(cost3));
        }else{
             jTextField4.setText("");
        }
            }
            }

            @Override
            public void removeUpdate(DocumentEvent e)
            {
                if(!jTextField3.getText().equals("")){
                cost2 = Integer.parseInt(jTextField3.getText());
                if(!jTextField7.getText().equals("")){
                cost3 = cost2 - cost1 + Float.parseFloat(jTextField7.getText());
                }else{
                    cost3 = cost2 - cost1 ;
                }
                if(cost3>=0){
                jTextField4.setText(Float.toString(cost3));
        }else{
             jTextField4.setText("");
        }
            }
            }

            @Override
            public void changedUpdate(DocumentEvent e)
            {
                if(!jTextField3.getText().equals("")){
                cost2 = Integer.parseInt(jTextField3.getText());
                if(!jTextField7.getText().equals("")){
                cost3 = cost2 - cost1 + Float.parseFloat(jTextField7.getText());
                }else{
                    cost3 = cost2 - cost1 ;
                }
                if(cost3>=0){
                jTextField4.setText(Float.toString(cost3));
        }else{
             jTextField4.setText("");
        }
            }
                }
  });
         jTextField2.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                float dis = cost1 * discoun;
                jTextField7.setText(Float.toString(dis));
            }
 
            @Override
            public void removeUpdate(DocumentEvent e) {
                 float dis = cost1 * discoun;
                jTextField7.setText(Float.toString(dis));
            }
 
            @Override
            public void changedUpdate(DocumentEvent e) {
                 float dis = cost1 * discoun;
                jTextField7.setText(Float.toString(dis));
            }
        });
    }
    catch (ClassNotFoundException ex)
    {
        Logger.getLogger(ForthForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jButton2 = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));

        jButton2.setText("Выход");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });

        jInternalFrame1.setPreferredSize(new java.awt.Dimension(1000, 580));
        jInternalFrame1.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel1.setText("ФИО пациента");

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel2.setText("Лечащий врач");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel3.setText("Услуги");

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel4.setText("Итоговая сумма");

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel5.setText("Внесено");

        jLabel6.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel6.setText("Сдача");

        jButton1.setText("Оплатить");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Выберите врача" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Выберите услугу" }));
        jComboBox3.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                jComboBox3ItemStateChanged(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel7.setText("Выберите дату");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Выберите дату" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel8.setText("Выберите время");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Выберите время" }));
        jComboBox4.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                jComboBox4ItemStateChanged(evt);
            }
        });

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "нет" }));

        jLabel9.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel9.setText("Акции");

        jLabel10.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel10.setText("Скидки");

        jLabel11.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel11.setText("Cкидка");

        jTextField7.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel12.setText("Ошибка оплаты, повторите ввод!");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "нет" }));
        jComboBox5.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                jComboBox5ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel8)
                                        .addGap(91, 91, 91)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, 0, 600, Short.MAX_VALUE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 195, Short.MAX_VALUE))))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(30, 30, 30)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(94, 94, 94))
        );

        jButton3.setText("Очистить");
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1625, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 460, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 460, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1080, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 281, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 282, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
    try
    {
        String FIO = jTextField1.getText();
        String doctor = jComboBox1.getSelectedItem().toString();
        String arr = jTextField5.getText();
        String sum = jTextField2.getText();
        String inp = jTextField3.getText();
        String ost = jTextField4.getText();
        String date = jComboBox2.getSelectedItem().toString();
        String time = jComboBox4.getSelectedItem().toString();
        String d = jComboBox5.getSelectedItem().toString();
        String a = jComboBox6.getSelectedItem().toString();
            try 
            {
                if((!FIO.equals("")) && (!doctor.equals("Выберите врача")) && (!date.equals("Выберите дату")) && (!time.equals("Выберите время")) && (!arr.equals("")) && (!ost.equals(""))){
                Forth.add(FIO,doctor,arr,date,time,sum,inp,ost,d,a);
                jLabel12.setText("Успешно оплачено!");
                jLabel12.setVisible(true);
            }else{
                    jLabel12.setVisible(true);
                }
            }
            catch (ClassNotFoundException ex)
            {
                Logger.getLogger(ForthForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        if((!FIO.equals("")) && (!doctor.equals("Выберите врача")) && (!date.equals("Выберите дату")) && (!time.equals("Выберите время")) && (!arr.equals("")) && (!ost.equals(""))){
        Forth.rr(doctor, date, time, FIO,arr);
        }
            
    }
    catch (ClassNotFoundException ex)
    {
        Logger.getLogger(ForthForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (ParseException ex)
    {
        Logger.getLogger(ForthForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_jComboBox3ItemStateChanged
    {//GEN-HEADEREND:event_jComboBox3ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
          Object item = evt.getItem();
          if((!item.equals("Выберите услугу") && !item.equals("") )){
              try {
                  Forth.getCost(item.toString());
                  cost1=Integer.parseInt(cost);
                  jTextField2.setText(Float.toString(cost1));
                  str+=item.toString();
                  jTextField5.setText(str);
                  jComboBox3.setSelectedIndex(0);
                  jComboBox5.setEnabled(true);
                  jComboBox6.setEnabled(true);
                  jComboBox3.setEnabled(false);
                  str="";
              }
              catch (ClassNotFoundException ex) {
                  Logger.getLogger(ForthForm.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
        }
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_jComboBox1ItemStateChanged
    {//GEN-HEADEREND:event_jComboBox1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
        jComboBox2.removeAllItems();
        jComboBox2.addItem("Выберите дату");
          Object item = evt.getItem();
          if(!item.equals("Выберите врача")){
            try {
                   ArrayList<String> item1 = new ArrayList<String>();
                  try
                  {
                      Forth.getSchedule(item1,jComboBox1.getSelectedItem().toString());
                  }
                  catch (ParseException ex)
                  {
                      Logger.getLogger(SecondForm.class.getName()).log(Level.SEVERE, null, ex);
                  }
                   Object[] arr1 = item1.toArray();
                   int c =0;
         for(int i=0;i<item1.size();i++){
             for(int j=i+1;j<arr1.length;j++){
                 if(arr1[i].equals(arr1[j])){
                    c=1;
                     break; 
                 }
             }
                 if(c==0){
                      jComboBox2.addItem(arr1[i].toString());
                 }else{
                     c=0;
                 }
             
        }
              }
              catch (ClassNotFoundException ex) {
                  Logger.getLogger(ForthForm.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_jComboBox2ItemStateChanged
    {//GEN-HEADEREND:event_jComboBox2ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            jComboBox4.removeAllItems();
       jComboBox4.addItem("Выберите время");
          Object item = evt.getItem();
          if(!item.equals("Выберите дату")){
              try {
                   ArrayList<String> item2 = new ArrayList<String>();
                  try
                  {
                      Forth.getSchedule(item2,jComboBox1.getSelectedItem().toString(),jComboBox2.getSelectedItem().toString());
                  }
                  catch (ParseException ex)
                  {
                      Logger.getLogger(SecondForm.class.getName()).log(Level.SEVERE, null, ex);
                  }
                   Object[] arr2 = item2.toArray();
         for(int i=0;i<item2.size();i++){
            jComboBox4.addItem(arr2[i].toString());
        }
              }
              catch (ClassNotFoundException ex) {
                  Logger.getLogger(ForthForm.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        dispose();
        FirstForm fm = new FirstForm();
        fm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox5ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_jComboBox5ItemStateChanged
    {//GEN-HEADEREND:event_jComboBox5ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            try {
                String dis = jComboBox5.getSelectedItem().toString();
                if(!dis.equals("нет")){
                Forth.getDiscount(dis);
                if(!jTextField2.equals("")){
                    float di = cost1 * discoun;
                jTextField7.setText(Float.toString(di));
                }
                }else{
                    jTextField7.setText("");
                    discoun = 0;
                }
            }
            catch (ClassNotFoundException ex) {
                Logger.getLogger(ForthForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (SQLException ex) {
                Logger.getLogger(ForthForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jComboBox5ItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        String cost = "";
        float cost1 = 0;
        float cost2 = 0;
        float cost3 = 0;
        float discoun = 0;  
         jLabel12.setVisible(false);
        jTextField7.setEditable(true);
        jTextField4.setEditable(true);
         jTextField2.setEditable(true);
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jComboBox5.setSelectedIndex(0);
        jTextField5.setText("");
        jTextField7.setText("");
        jComboBox5.removeAllItems();
        jComboBox6.removeAllItems();
        jComboBox5.addItem("нет");
        jComboBox6.addItem("нет");
           jTextField7.setEditable(false);
            jTextField2.setEditable(false);
        jTextField4.setEditable(false);
        jComboBox1.setSelectedIndex(0);
        jComboBox2.removeAllItems();
        jComboBox2.addItem("Выберите дату");
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox3.setEnabled(true);
        jComboBox4.removeAllItems();
        jComboBox4.addItem("Выберите время");
        jComboBox4.setSelectedIndex(0);
        jComboBox6.setSelectedIndex(0);
        jComboBox5.setEnabled(false);
        jComboBox6.setEnabled(false);
        jLabel12.setText("Ошибка оплаты, повторите ввод!");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox4ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_jComboBox4ItemStateChanged
    {//GEN-HEADEREND:event_jComboBox4ItemStateChanged
       try
    {
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Object item = evt.getItem();
            if(!item.equals("Выберите время")){
        String doctor = jComboBox1.getSelectedItem().toString();
        String date = jComboBox2.getSelectedItem().toString();
        String time = jComboBox4.getSelectedItem().toString();
        Forth.getPat(doctor,date,time);
        jComboBox5.removeAllItems();
         jComboBox6.removeAllItems();
        jComboBox5.addItem(disc);
        jComboBox6.addItem(act);
            }
        }
    }
    catch (ClassNotFoundException ex)
    {
        Logger.getLogger(ForthForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (ParseException ex)
    {
        Logger.getLogger(ForthForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jComboBox4ItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(ForthForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ForthForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ForthForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ForthForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    new ForthForm().setVisible(true);
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(ForthForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    public static javax.swing.JComboBox<String> jComboBox1;
    public static javax.swing.JComboBox<String> jComboBox2;
    public static javax.swing.JComboBox<String> jComboBox3;
    public static javax.swing.JComboBox<String> jComboBox4;
    public static javax.swing.JComboBox<String> jComboBox5;
    public static javax.swing.JComboBox<String> jComboBox6;
    public static javax.swing.JInternalFrame jInternalFrame1;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

    
    }
