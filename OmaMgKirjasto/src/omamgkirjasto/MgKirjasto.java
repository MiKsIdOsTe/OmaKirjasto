/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omamgkirjasto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lentt
 */
public class MgKirjasto extends javax.swing.JFrame {

    luoYhteys db = new luoYhteys();

    /**
     * Creates new form MgKirjasto
     */
    public MgKirjasto() throws ClassNotFoundException, SQLException {
        initComponents();
        tableload1(tbManga);
        comboload(comboManga);
        idloadManga(txtMgID);
        
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
        jLabel1 = new javax.swing.JLabel();
        txtMgNimi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMgTekija = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMgKustantaja = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMgKieli = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btMgLisaa = new javax.swing.JButton();
        btMgPaivita = new javax.swing.JButton();
        btMgPoista = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbManga = new javax.swing.JTable();
        comboManga = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtMgID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mangan nimi:");

        jLabel2.setText("Tekijä:");

        jLabel3.setText("Kustantaja:");

        jLabel4.setText("Kieli:");

        btMgLisaa.setText("Lisää");
        btMgLisaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMgLisaaActionPerformed(evt);
            }
        });

        btMgPaivita.setText("Päivitä");
        btMgPaivita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMgPaivitaActionPerformed(evt);
            }
        });

        btMgPoista.setText("Poista");
        btMgPoista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMgPoistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btMgPoista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btMgLisaa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btMgPaivita, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btMgLisaa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btMgPaivita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btMgPoista)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Kirjasto", jPanel3);

        tbManga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nimi", "Tekijä", "Kustantaja", "Kieli"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbManga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMangaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbManga);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manga", jPanel4);

        comboManga.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboMangaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        comboManga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboMangaMouseClicked(evt);
            }
        });
        comboManga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMangaActionPerformed(evt);
            }
        });

        jLabel5.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboManga, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMgNimi)
                            .addComponent(txtMgTekija)
                            .addComponent(txtMgKustantaja)
                            .addComponent(txtMgKieli, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(txtMgID))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMgID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMgNimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMgTekija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMgKustantaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMgKieli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(85, 85, 85)
                .addComponent(comboManga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMgLisaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMgLisaaActionPerformed
        System.out.println("Alkaa21");
        try {

            //Lisätään tiedot tietokantaan
            db.putData("INSERT INTO MANGA(NIMI,TEKIJA,KUSTANTAJA,KIELI) "
                    + "values('" + txtMgNimi.getText() + "','" + txtMgTekija.getText() + "','" + txtMgKustantaja.getText()
                    + "','" + txtMgKieli.getText() + "')");

            System.out.println("Alkaa22");
            clear();
            tableload1(tbManga);
            comboload(comboManga);
            idloadManga(txtMgID);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MgKirjasto.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        } catch (SQLException ex) {
            Logger.getLogger(MgKirjasto.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        System.out.println("Alkaa23");
    }//GEN-LAST:event_btMgLisaaActionPerformed

    private void tbMangaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMangaMouseClicked
        //Klikkaamalla taulukkossa jotakin tietoa ne päivittyvät tekstikenttiin
        //Valitun tiedon nimi (paikka 0) lisätään Mangan nimi:-tekstikenttään
        txtMgID.setText(String.valueOf(tbManga.getValueAt(tbManga.getSelectedRow(), 0)));
        //Valitun tiedon nimi (paikka 1) lisätään Mangan nimi:-tekstikenttään
        txtMgNimi.setText(String.valueOf(tbManga.getValueAt(tbManga.getSelectedRow(), 1)));
        //Valitun tiedon tekijä (paikka 1) lisätään tekijä:-tekstikenttään
        txtMgTekija.setText(String.valueOf(tbManga.getValueAt(tbManga.getSelectedRow(), 2)));
        //Valitun tiedon kustantaja (paikka 2) lisätään kustantaja:-tekstikenttään
        txtMgKustantaja.setText(String.valueOf(tbManga.getValueAt(tbManga.getSelectedRow(), 3)));
        //Valitun tiedon kieli (paikka 3) lisätään kieli:-tekstikenttään
        txtMgKieli.setText(String.valueOf(tbManga.getValueAt(tbManga.getSelectedRow(), 4)));

        // comboManga.addItem(String.valueOf(tbManga.getValueAt(tbManga.getSelectedRow(), 0))+"  "+String.valueOf(tbManga.getValueAt(tbManga.getSelectedRow(), 1)));
        try {
            int valittuID = Integer.parseInt(String.valueOf(tbManga.getValueAt(tbManga.getSelectedRow(), 0)));
            ResultSet rset;
            //comboManga.removeAllItems();

            rset = db.getData("SELECT * FROM MANGA where ID= "+valittuID+"");

            while (rset.next()) {
                comboManga.setSelectedItem(rset.getInt("ID") + " " + rset.getString("NIMI") + " " + rset.getString("KIELI"));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MgKirjasto.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        } catch (SQLException ex) {
            Logger.getLogger(MgKirjasto.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }

        //While silmukka

    }//GEN-LAST:event_tbMangaMouseClicked

    private void btMgPaivitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMgPaivitaActionPerformed
        try {
            //Luodaan statement (kysely)
            System.out.println("Päivitä1");
            
            
            String valinta = (String) comboManga.getSelectedItem();
            String[] nimet = valinta.split(" ");
            int mangaId = Integer.parseInt(nimet[0]);
            

            String nimi = txtMgNimi.getText();
            String tekija = txtMgTekija.getText();
            String kustantaja = txtMgKustantaja.getText();
            String kieli = txtMgKieli.getText();
            
            db.putData("UPDATE Manga SET NIMI  ='" + nimi + "', TEKIJA = '" + tekija + "', KUSTANTAJA ='" + kustantaja + "',  KIELI='" + kieli + "'  WHERE ID = " + mangaId);
            
            //comboManga clicked nappiin
            /* String valinta = (String) comboManga.getSelectedItem();
            String[] nimet = valinta.split(" ");
             ResultSet rset;
            
           rset = db.getData("SELECT * FROM MANGA WHERE NIMI ='" + nimet[1] + "'");
           
            while (rset.next()) {
                txtMgNimi.setText(rset.getString("NIMI"));
                txtMgTekija.setText(rset.getString("TEKIJA"));
                txtMgKustantaja.setText(rset.getString("KUSTANTAJA"));
                txtMgKieli.setText(rset.getString("KIELI"));
            }*/

            /*String valinta = (String) comboManga.getSelectedItem();

            String[] nimet = valinta.split("");

            int id = Integer.parseInt(nimet[0]);
            System.out.println("Päivitä4");
            //Päivitetään viimeisimmät muutokset tietokantaan
            db.putData("update MANGA set NIMI='" + txtMgNimi.getText() + "',TEKIJA='" + txtMgTekija.getText() + "',KUSTANTAJA='" + txtMgKustantaja.getText()
                    + "',KIELI='" + txtMgKieli.getText() + "' where ID='" + id + "'");*/
            System.out.println("Päivitä5");
            clear();
            System.out.println("Päivitä6");
            //Päivitetään taulukko, jotta uusimmat muutokset näkyvät
            tableload1(tbManga);
            System.out.println("Päivitä7");
            comboload(comboManga);
            System.out.println("Päivitä8");
            idloadManga(txtMgID);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MgKirjasto.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        } catch (SQLException ex) {
            Logger.getLogger(MgKirjasto.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        System.out.println("Päivitä9");
    }//GEN-LAST:event_btMgPaivitaActionPerformed

    private void btMgPoistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMgPoistaActionPerformed
        try {
           String valinta = (String) comboManga.getSelectedItem();
            String[] nimet = valinta.split(" ");
           
            db.putData("DELETE FROM MANGA WHERE KIELI ='" + nimet[2] + "' AND NIMI = '" + nimet[1] + "'");
            
            clear();
            System.out.println("Poista6");
            //Päivitetään taulukko, jotta uusimmat muutokset näkyvät
            tableload1(tbManga);
            System.out.println("Poista7");
            comboload(comboManga);
            System.out.println("Poista8");
            idloadManga(txtMgID);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MgKirjasto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MgKirjasto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btMgPoistaActionPerformed

    private void comboMangaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboMangaMouseClicked
      
    }//GEN-LAST:event_comboMangaMouseClicked

    private void comboMangaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMangaActionPerformed
        
    }//GEN-LAST:event_comboMangaActionPerformed

    private void comboMangaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboMangaPopupMenuWillBecomeInvisible
         try {
            
             
            String valinta = (String) comboManga.getSelectedItem();
            String[] nimet = valinta.split(" ");
           ResultSet rset;
            rset = db.getData("SELECT * FROM MANGA WHERE KIELI ='" + nimet[2] + "' AND NIMI = '" + nimet[1] + "'");

            while (rset.next()) {
               String id  = rset.getString("ID");
               String nimi  = rset.getString("NIMI");
               String tekija  = rset.getString("TEKIJA");
               String kustantaja  = rset.getString("KUSTANTAJA");
               String kieli  = rset.getString("KIELI");
               
                txtMgID.setText(id);
                txtMgNimi.setText(nimi);
                txtMgTekija.setText(tekija);
                txtMgKustantaja.setText(kustantaja);
                txtMgKieli.setText(kieli);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MgKirjasto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MgKirjasto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboMangaPopupMenuWillBecomeInvisible

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
            java.util.logging.Logger.getLogger(MgKirjasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MgKirjasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MgKirjasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MgKirjasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MgKirjasto().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MgKirjasto.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(MgKirjasto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMgLisaa;
    private javax.swing.JButton btMgPaivita;
    private javax.swing.JButton btMgPoista;
    private javax.swing.JComboBox<String> comboManga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbManga;
    private javax.swing.JTextField txtMgID;
    private javax.swing.JTextField txtMgKieli;
    private javax.swing.JTextField txtMgKustantaja;
    private javax.swing.JTextField txtMgNimi;
    private javax.swing.JTextField txtMgTekija;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        //Tyhjennetään teksti kentät
        txtMgNimi.setText(null);
        txtMgTekija.setText(null);
        txtMgKustantaja.setText(null);
        txtMgKieli.setText(null);
    }

    private void tableload1(JTable jt) throws ClassNotFoundException, SQLException {
        DefaultTableModel dt = (DefaultTableModel) jt.getModel();
        //Asetetaan rivit aloittamaan 0
        dt.setRowCount(0);
        //Haetaan tiedot tietokannasta ja lisätään ne taulukkoon
        ResultSet rset = db.getData("SELECT * FROM MANGA");

        while (rset.next()) {
            Vector v = new Vector();
            v.add(rset.getString(1));
            v.add(rset.getString(2));
            v.add(rset.getString(3));
            v.add(rset.getString(4));
            v.add(rset.getString(5));

            dt.addRow(v);
        }
    }

    private void comboload(JComboBox jl) throws ClassNotFoundException, SQLException {
        comboManga.removeAllItems();
        //Haetaan tiedot tietokannasta ja lisätään ne valintaComboon. 
        ResultSet rset = db.getData("SELECT * FROM MANGA");
        while (rset.next()) {
            String pat = rset.getInt("ID") + " " + rset.getString("NIMI") + " " + rset.getString("KIELI");
            comboManga.addItem(pat);
        }
    }
   

    private void idloadManga(JTextField jText) throws ClassNotFoundException, SQLException {
        //Haetaan viimeisin vapaana oleva ID
        ResultSet rset = db.getData("select max(ID) from MANGA");
        while (rset.next()) {
            int i = rset.getInt(1);
            i = i + 1;
            jText.setText(String.valueOf(i));
        }
    }
}
