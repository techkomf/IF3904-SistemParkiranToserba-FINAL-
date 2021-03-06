/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author user
 */
public class formKendMasuk extends javax.swing.JFrame {
    java.util.Date tglsekarang = new java.util.Date();
    private SimpleDateFormat smpdtfmt = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    //diatas adalah pengaturan format penulisan, bisa diubah sesuai keinginan.
    private String tanggal = smpdtfmt.format(tglsekarang);

    /**
     * Creates new form formbarang
     */
    public formKendMasuk() {
        initComponents();
        setLocationRelativeTo(this);
        aktif(false);
        setTombol(true);
        lbltgl.setText(tanggal);
        setJam();
    }
    
    
    
    public final void setJam(){

        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String nol_jam = "", nol_menit = "",nol_detik = "";
                java.util.Date dateTime = new java.util.Date();
                int nilai_jam = dateTime.getHours();
                int nilai_menit = dateTime.getMinutes();
                int nilai_detik = dateTime.getSeconds();

                if(nilai_jam <= 9) nol_jam= "0";
                if(nilai_menit <= 9) nol_menit= "0";
                if(nilai_detik <= 9) nol_detik= "0";

                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);


                lblwktu.setText(jam+":"+menit+":"+detik+"");
            }
        };
        new Timer(1000, taskPerformer).start();
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
        bttambah = new javax.swing.JButton();
        bthapus = new javax.swing.JButton();
        btsimpan = new javax.swing.JButton();
        btkoreksi = new javax.swing.JButton();
        cetak = new javax.swing.JButton();
        btkeluar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Jenis = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Tanggal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idkarcis = new javax.swing.JTextField();
        noplat = new javax.swing.JTextField();
        ket = new javax.swing.JTextField();
        jenis = new javax.swing.JComboBox();
        tgl = new javax.swing.JTextField();
        waktu = new javax.swing.JTextField();
        btcari = new javax.swing.JButton();
        lblwktu = new javax.swing.JLabel();
        lbltgl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Kendaraan");

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        bttambah.setText("Tambah");
        bttambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttambahActionPerformed(evt);
            }
        });

        bthapus.setText("Hapus");
        bthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthapusActionPerformed(evt);
            }
        });

        btsimpan.setText("Simpan");
        btsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsimpanActionPerformed(evt);
            }
        });

        btkoreksi.setText("Koreksi");
        btkoreksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkoreksiActionPerformed(evt);
            }
        });

        cetak.setText("cetak");
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });

        btkeluar.setText("Keluar");
        btkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkeluarActionPerformed(evt);
            }
        });

        jLabel8.setText("Tombol Proses");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bttambah, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(bthapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btkoreksi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btsimpan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cetak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttambah)
                    .addComponent(btsimpan)
                    .addComponent(cetak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bthapus)
                    .addComponent(btkoreksi)
                    .addComponent(btkeluar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DATA KENDARAAN");

        jLabel2.setText("ID Karcis");

        jLabel3.setText("No Plat");

        Jenis.setText("Jenis");

        jLabel5.setText("Keterangan");

        Tanggal.setText("Tanggal");

        jLabel7.setText("Jam Masuk");

        jenis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Motor", "Mobil", " ", " " }));

        btcari.setText("Cari");
        btcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcariActionPerformed(evt);
            }
        });

        lblwktu.setText("TANGGAL");

        lbltgl.setText("JAM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(Jenis)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(Tanggal))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(noplat)
                                    .addComponent(waktu)
                                    .addComponent(tgl)
                                    .addComponent(ket)
                                    .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(idkarcis, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btcari))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(61, 61, 61)))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblwktu, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbltgl, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblwktu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbltgl)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idkarcis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcari))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noplat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jenis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tanggal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(waktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkeluarActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btkeluarActionPerformed

    private void btsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsimpanActionPerformed
        // TODO add your handling code here:
        String id_karcis = idkarcis.getText();
        String no_plat = noplat.getText();
        String jenis_kend = (String) jenis.getSelectedItem();
        String keterangan = ket.getText();
        String tanggal = tgl.getText();
        String jammasuk = waktu.getText();
        String jamkeluar = "00:00:00";
        {
            try{

                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/parkirantoserba", "root", "");
                Statement statement = (Statement) koneksi.createStatement();
                String sql="insert into tblkendaraan values('"+id_karcis+"','"+no_plat+"','"+jenis_kend+"','"+keterangan+"','"+tanggal+"','"+jammasuk+"','"+jamkeluar+"')";
                int executeUpdate = statement.executeUpdate(sql);
                statement.close();
                JOptionPane.showMessageDialog(null, "Data berhasil dimasukkan..","Insert Data",JOptionPane.INFORMATION_MESSAGE);
                aktif(true);
                idkarcis.setText("");
                noplat.setText("");
                jenis.setSelectedItem("");
                ket.setText("");
                tgl.setText("");
                waktu.setText("");

//txtnpm.setFocusable(rootPaneCheckingEnabled);

                koneksi.close();
            }
            catch (     ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e)
            {
                JOptionPane.showMessageDialog(null, "Eror: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
            }
        }
    }//GEN-LAST:event_btsimpanActionPerformed

    private void bttambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttambahActionPerformed

        aktif(true);
        setTombol(false);// TODO add your handling code here:
        tgl.setText(lbltgl.getText());       // TODO add your handling code here:
        waktu.setText(lblwktu.getText());
    }//GEN-LAST:event_bttambahActionPerformed

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed

         // TODO add your handling code here:
         new printreport(".src/koneksi/buktiparkir.jasper");
         
         
    }//GEN-LAST:event_cetakActionPerformed

    
    private void bthapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthapusActionPerformed
        // TODO add your handling code here:
        String id_karcis = idkarcis.getText();
      try {

          Class.forName("com.mysql.jdbc.Driver").newInstance();
          Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/parkirantoserba", "root", "");
          Statement statement = (Statement) koneksi.createStatement();
          String sql="DELETE FROM tblkendaraan WHERE id_karcis LIKE '"+id_karcis+"'";
          statement.executeUpdate(sql);
          statement.close();
          idkarcis.setText("");
          noplat.setText("");
          jenis.setSelectedItem("");
          ket.setText("");
          tgl.setText("");
          waktu.setText("");
          JOptionPane.showMessageDialog(null, "Data berhasil dihapus..","Insert Data",JOptionPane.INFORMATION_MESSAGE);

          koneksi.close();

      } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e) { JOptionPane.showMessageDialog(null, "Eror: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
      }
    }//GEN-LAST:event_bthapusActionPerformed

    private void btkoreksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkoreksiActionPerformed
        // TODO add your handling code here:

        String id_karcis = idkarcis.getText();
        String no_plat = noplat.getText();
        String jenis_kend = (String) jenis.getSelectedItem();
        String keterangan = ket.getText();
        String tanggal = tgl.getText();
        String jammasuk = waktu.getText();
        
        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/parkirantoserba", "root", "");
            Statement statement = (Statement) koneksi.createStatement();
            String sql="UPDATE tblkendaraan SET id_karcis='"+id_karcis+"',no_plat='"+no_plat+"',jenis_kend='"+jenis_kend+"',keterangan='"+keterangan+"',tanggal='"+tanggal+"',jammasuk='"+jammasuk+"', WHERE id_karcis LIKE '"+id_karcis+"'";
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null, "Data berhasil diedit..","Insert Data",JOptionPane.INFORMATION_MESSAGE);
            koneksi.close();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e) {

            JOptionPane.showMessageDialog(null, "Eror: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
        }
    }//GEN-LAST:event_btkoreksiActionPerformed

    private void btcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcariActionPerformed
 
        String id_karcis = idkarcis.getText();

        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/parkirantoserba", "root", "");
            Statement statement = (Statement) koneksi.createStatement();
            String sql="SELECT * FROM tblkendaraan WHERE id_karcis like '"+id_karcis+"'";
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next())
            {
                noplat.setText(rs.getString(2));
                jenis.setSelectedItem(rs.getString(3));
                ket.setText(rs.getString(4));
                tgl.setText(rs.getString(5));
                waktu.setText(rs.getString(6));
                JOptionPane.showMessageDialog(null, "Data ditemukan","Insert Data",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan ","Insert Data",JOptionPane.INFORMATION_MESSAGE);
            }
            statement.close();
            koneksi.close();
        }
        catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e)
        {

            JOptionPane.showMessageDialog(null, "Eror:"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btcariActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formKendMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new formKendMasuk().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jenis;
    private javax.swing.JLabel Tanggal;
    private javax.swing.JButton btcari;
    private javax.swing.JButton bthapus;
    private javax.swing.JButton btkeluar;
    private javax.swing.JButton btkoreksi;
    private javax.swing.JButton btsimpan;
    private javax.swing.JButton bttambah;
    private javax.swing.JButton cetak;
    private javax.swing.JTextField idkarcis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox jenis;
    private javax.swing.JTextField ket;
    private javax.swing.JLabel lbltgl;
    private javax.swing.JLabel lblwktu;
    private javax.swing.JTextField noplat;
    private javax.swing.JTextField tgl;
    private javax.swing.JTextField waktu;
    // End of variables declaration//GEN-END:variables

    private void aktif(boolean x) {
      idkarcis.setEditable(x);
      noplat.setEditable(x);
      tgl.setEditable(x);
      ket.setEditable(x);
      waktu.setEditable(x);
      jenis.setEnabled(x);
      idkarcis.requestFocus();
    }

    private void setTombol(boolean t) {
     bttambah.setEnabled(t);
     btsimpan.setEnabled(!t);
     bthapus.setEnabled(!t);
     btkoreksi.setEnabled(!t);
     btcari.setEnabled(!t);
     cetak.setEnabled(!t);
    }
}

