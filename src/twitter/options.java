/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author BahaMoviX
 */
public class options extends javax.swing.JFrame {

    /**
     * Creates new form options
     */
    public options() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comLink = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        link = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("برنامج نابع تويتر");

        comLink.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "الأشخاص الذين يتابعون سلطانھ ⁶⁰⁰ᵏ (@Q1s1Q) | تويتر", "الأشخاص الذين يتابعون ᷂حلوى ᷂القطن 🇸🇦1ᵐ (@7lw__) | تويتر", "الأشخاص الذين يتابعون ࿐ابـن واايــل࿐ (@zrrrm) | تويتر", "الأشخاص الذين يتابعون فهد الصقعبي 🇸🇦 (@fssl1999) | تويتر", "الأشخاص الذين يتابعون ᎷᎪYᏆᎠ (@_MMll_) | تويتر", "الأشخاص الذين يتابعون تفاصيل شرقي (@qalcc) | تويتر", "الأشخاص الذين يتابعون ‏ ‏فــھــد♡ ♔✰ ¹ᴹ ࿐ (@p22__) | تويتر", "الأشخاص الذين يتابعون ‏ﺂﻟﭴۆھَہّړُھَہ³⁵⁰ᴷ (@_jo_18) | تويتر", "الأشخاص الذين يتابعون ‏مشاعر 1Ꮇ❗️ (@08a) | تويتر", "الأشخاص الذين يتابعون عقد خروج🚫 (@__bc1) | تويتر", "الأشخاص الذين يتابعون انثى من خيال (@Hs___5) | تويتر", "الأشخاص الذين يتابعون العـαℓαтнвـذب (@3thb511) | تويتر", "الأشخاص الذين يتابعون ‏اناقة حرف 🙋‍♂️💙 (@maz___1) | تويتر", "الأشخاص الذين يتابعون ♡sʜoooq💙🎼 (@shOOOq_M) | تويتر", "الأشخاص الذين يتابعون *✒الحر الأشقر*✒ فارس (@Ashger_70R) | تويتر", "الأشخاص الذين يتابعون فالح الظفيري 🇰🇼 (@Faleh_HD) | تويتر", "الأشخاص الذين يتابعون .nour. 🏇🏻 (@loura_3) | تويتر", "الأشخاص الذين يتابعون مُجَرَّد مشآعر (@Bas330) | تويتر", "الأشخاص الذين يتابعون شمالي رايق ‏²⁰⁰ᴷ (@Shmaliie) | تويتر", "الأشخاص الذين يتابعون #مساعد .. 🇰🇼 (@B88R_) | تويتر", "الأشخاص الذين يتابعون ‏مروان الوصابي₁Ꮇ (@K800_) | تويتر", "الأشخاص الذين يتابعون ᎷᎪYᏆᎠ (@_Mayid_) | تويتر" }));

        jLabel1.setText("الصفحة :");

        link.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkActionPerformed(evt);
            }
        });

        jLabel2.setText("صفحة جديدة :");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setText("اضافة كلمة حظر :");

        jButton1.setText("اضافة المتابعين");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("مسح المتابعين");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(link)
                            .addComponent(comLink, 0, 437, Short.MAX_VALUE)
                            .addComponent(jTextField2))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comLink, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(link, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void linkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_linkActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    public void delay(int n)
    {
        try {
            TimeUnit.SECONDS.sleep(n);
        } catch (InterruptedException ex) {
            Logger.getLogger(options.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
       WebDriver open = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
        open.get("https://mobile.twitter.com/login");
        this.delay(2);
        open.findElement(By.name("session[username_or_email]")).sendKeys(this.Email);
        open.findElement(By.name("session[password]")).sendKeys(this.Password);
        this.delay(1);
        open.findElement(By.name("session[password]")).submit();
        
        
        if(link.getText().equals("") || link.getText().equals(null))
       {
            String arr[] = new String[22];
            arr[0] = "https://mobile.twitter.com/Q1s1Q/followers";
            arr[1] = "https://mobile.twitter.com/7lw__/followers"; 
            arr[2] = "https://mobile.twitter.com/zrrrm/followers";
            arr[3] = "https://mobile.twitter.com/fssl1999/followers";
            arr[4] = "https://mobile.twitter.com/_MMll_/followers"; 
            arr[5] = "https://mobile.twitter.com/qalcc/followers";
            arr[6] = "https://mobile.twitter.com/p22__/followers";
            arr[7] = "https://mobile.twitter.com/_jo_18/followers";
            arr[8] = "https://mobile.twitter.com/08a/followers";
            arr[9] = "https://mobile.twitter.com/__bc1/followers";
            arr[10] = "https://mobile.twitter.com/Hs___5/followers";
            arr[11] = "https://mobile.twitter.com/3thb511/followers";
            arr[12] = "https://mobile.twitter.com/maz___1/followers";
            arr[13] = "https://mobile.twitter.com/shOOOq_M/followers";
            arr[14] = "https://mobile.twitter.com/Ashger_70R/followers";
            arr[15] = "https://mobile.twitter.com/Faleh_HD/followers";
            arr[16] = "https://mobile.twitter.com/loura_3/followers";
            arr[17] = "https://mobile.twitter.com/Bas330/followers";
            arr[18] = "https://mobile.twitter.com/Shmaliie/followers";
            arr[19] = "https://mobile.twitter.com/B88R_/followers";
            arr[20] = "https://mobile.twitter.com/K800_/followers";
            arr[21] = "https://mobile.twitter.com/_Mayid_/followers";
            open.get(arr[comLink.getSelectedIndex()]);
            this.Follow(open);
       }
       else{
            //System.out.println("Hello world text link");
            open.get(link.getText());
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new options().setVisible(true);
            }
        });
    }
    
    public void setData(String email , String password)
    {
        this.Email = email;
        this.Password = password;
    }
    
    public void Follow(WebDriver opn)
    {
        this.delay(2);
        List<WebElement> list = new ArrayList<WebElement>();
       list = opn.findElements(By.className("_1_KafmK5"));
       List<WebElement> listAttr = new ArrayList<WebElement>();
     
       
       for(int i = 0 ; i < list.size() ; i ++)
       {
           try
           {
                listAttr = list.get(i).findElements(By.tagName("path"));
                if(listAttr.size() == 0)
                {
                    list.get(i).findElement(By.className("_1XMME7zz")).click();
                    this.delay(1);
                    opn.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);;
                }
           }catch(Exception e)
           {
               System.out.println("No Allowed");
           }
           this.delay(2);
          /* 
           try
           {
              if(list.get(i).isEnabled())
              {
                  list.get(i).click();
              }          
           }catch(Exception e)
           {
               System.out.println("No Allowed");
           }
           System.out.println("Tag Name "+list.get(i).getAttribute("class"));
           this.delay(2);*/
       }
       
       
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comLink;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField link;
    // End of variables declaration//GEN-END:variables
    private String Email;
    private String Password;
}
