/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerPinjam;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelPinjam;
import util.Koneksi;

/**
 *
 * @author Juli
 */
public class ViewPinjam extends javax.swing.JPanel {
    Koneksi konek = new Koneksi();
    ModelPinjam mope = new ModelPinjam();
    ControllerPinjam copi = new ControllerPinjam();
    /**
     * Creates new form ViewPinjam
     */
    public ViewPinjam() {
        initComponents();
        tblpinjam();
    }

    private void tblpinjam(){
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("ID");
        table.addColumn("Nama Teman");
        table.addColumn("Barang di Pinjam");
        tabelPinjam.setModel(table);
        konek.koneksiDB();
        try{
            String url = "select * from tbl_pinjam";
            ResultSet rs = konek.s.executeQuery(url);
            while(rs.next()){
                table.addRow(new Object []{
                    rs.getString("id"),
                    rs.getString("namaTeman"),
                    rs.getString("baranDiPinjam")
                });
                tabelPinjam.setModel(table);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,""+e.getMessage());
        }
    }
    
    private void tombolBaru(){
        txt_namaP.setEnabled(true);
        txtA_barang.setEnabled(true);
        txt_namaP.requestFocus();
        btn_cariP.setEnabled(true);
        bersihTxtField();
    }
    
    private void tombolBatal(){
        txt_namaP.setEditable(false);
        txtA_barang.setEditable(false);
        btn_cariP.setEnabled(false);
        bersihTxtField();
        btn_simpanP.setEnabled(false);
        btn_baruP.setText("Baru");
    }
    
    private void bersihTxtField(){
        txt_idP.setText("");
        txt_namaP.setText("");
        txtA_barang.setText("");
        com_listteman.removeAllItems();
    }
    
    private void tableKlik(){
        btn_ubahP.setEnabled(true);
        btn_hapusP.setEnabled(true);
        txtA_barang.setEditable(true);
    }
    
    private void tableunKlik(){
        btn_ubahP.setEnabled(false);
        btn_hapusP.setEnabled(false);
        txtA_barang.setEditable(false);
        bersihTxtField();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_idP = new javax.swing.JTextField();
        txt_namaP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_cariP = new javax.swing.JButton();
        com_listteman = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_barang = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btn_baruP = new javax.swing.JButton();
        btn_simpanP = new javax.swing.JButton();
        btn_bersihP = new javax.swing.JButton();
        btn_ubahP = new javax.swing.JButton();
        btn_hapusP = new javax.swing.JButton();
        btn_tutupP = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelPinjam = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ID");

        txt_idP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_idP.setEnabled(false);

        txt_namaP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_namaP.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nama");

        btn_cariP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_cariP.setText("Cari");
        btn_cariP.setEnabled(false);
        btn_cariP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariPActionPerformed(evt);
            }
        });

        com_listteman.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Barang");

        txtA_barang.setColumns(20);
        txtA_barang.setRows(5);
        txtA_barang.setEnabled(false);
        jScrollPane1.setViewportView(txtA_barang);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        btn_baruP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_baruP.setText("Baru");
        btn_baruP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_baruPActionPerformed(evt);
            }
        });

        btn_simpanP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_simpanP.setText("Simpan");
        btn_simpanP.setEnabled(false);
        btn_simpanP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanPActionPerformed(evt);
            }
        });

        btn_bersihP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_bersihP.setText("Bersih");
        btn_bersihP.setEnabled(false);
        btn_bersihP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bersihPActionPerformed(evt);
            }
        });

        btn_ubahP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_ubahP.setText("Ubah");
        btn_ubahP.setEnabled(false);
        btn_ubahP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahPActionPerformed(evt);
            }
        });

        btn_hapusP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_hapusP.setText("Hapus");
        btn_hapusP.setEnabled(false);
        btn_hapusP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusPActionPerformed(evt);
            }
        });

        btn_tutupP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_tutupP.setText("Tutup");
        btn_tutupP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tutupPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_baruP, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_simpanP, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_bersihP, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ubahP, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_hapusP, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_tutupP, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_baruP)
                    .addComponent(btn_simpanP)
                    .addComponent(btn_bersihP)
                    .addComponent(btn_ubahP)
                    .addComponent(btn_hapusP)
                    .addComponent(btn_tutupP))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelPinjam.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelPinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPinjamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelPinjam);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_idP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(com_listteman, javax.swing.GroupLayout.Alignment.LEADING, 0, 233, Short.MAX_VALUE)
                                            .addComponent(txt_namaP, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_cariP))))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_idP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_namaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cariP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(com_listteman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tutupPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tutupPActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btn_tutupPActionPerformed

    private void btn_bersihPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bersihPActionPerformed
        // TODO add your handling code here:
        bersihTxtField();
    }//GEN-LAST:event_btn_bersihPActionPerformed

    private void btn_baruPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_baruPActionPerformed
        // TODO add your handling code here:
        String logic = btn_baruP.getText();
        if(logic.equals("Baru")){
            btn_simpanP.setEnabled(true);
            btn_baruP.setText("Batal");
            tombolBaru();
        }else{
            btn_simpanP.setEnabled(false);
            btn_baruP.setText("Baru");
            tombolBatal();
        }
    }//GEN-LAST:event_btn_baruPActionPerformed

    private void btn_simpanPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanPActionPerformed
        // TODO add your handling code here:
        String nama = com_listteman.getSelectedItem().toString();
        String barang = txtA_barang.getText();
        if(nama.equals("")||barang.equals("")){
            JOptionPane.showMessageDialog(null,"Harap isi Data dengan Benar");
        }else{
            if(JOptionPane.showConfirmDialog(null,"Yakin Ingin Menyimpan ? ","PERHATIAN",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                try{
                    mope.setNama(nama);
                    mope.setBarang(barang);
                    
                    copi.simpanPinjaman(mope);
                    tblpinjam();
                    tombolBatal();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Harap Isi Data Dengan Benar");
                }
            }
        }
    }//GEN-LAST:event_btn_simpanPActionPerformed

    private void btn_ubahPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahPActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null,"Apakah Anda Ingin Merubah ?","PERHATIAN",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            try{
                int id = Integer.parseInt(txt_idP.getText());
                String nama = txt_namaP.getText();
                String barang = txtA_barang.getText();
                
                mope.setId(id);
                mope.setNama(nama);
                mope.setBarang(barang);
                
                copi.ubahPinjaman(mope);
                tblpinjam();
                tableunKlik();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,""+e.getMessage());
            }
        }else{
            
        }
    }//GEN-LAST:event_btn_ubahPActionPerformed

    private void btn_hapusPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusPActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null,"Apakah Anda Ingin Menghapus ?","PERHATIAN",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            try{
                int id = Integer.parseInt(txt_idP.getText());
                mope.setId(id);
                copi.hapusPinjaman(mope);
                tblpinjam();
                tableunKlik();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_hapusPActionPerformed

    private void tabelPinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPinjamMouseClicked
        // TODO add your handling code here:
        try{
            int baris = tabelPinjam.getSelectedRow();
            
            txt_idP.setText(tabelPinjam.getValueAt(baris,0).toString());
            txt_namaP.setText(tabelPinjam.getValueAt(baris,1).toString());
            txtA_barang.setText(tabelPinjam.getValueAt(baris,2).toString());
            tableKlik();
        }catch(Exception e){
            System.err.println(""+e.getMessage());
        }
    }//GEN-LAST:event_tabelPinjamMouseClicked

    private void btn_cariPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariPActionPerformed
        // TODO add your handling code here:
        String nama = txt_namaP.getText().trim();
        
        if(nama.equals("")){
            
        }else{
            System.out.println(nama);
            com_listteman.removeAllItems();
            try{
                konek.koneksiDB();
                String url = "select * from tbl_teman where nama like'%"+nama+"%'";
            ResultSet rs = konek.s.executeQuery(url);
            while(rs.next()){
                com_listteman.addItem(rs.getString("nama"));
            }
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_cariPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_baruP;
    private javax.swing.JButton btn_bersihP;
    private javax.swing.JButton btn_cariP;
    private javax.swing.JButton btn_hapusP;
    private javax.swing.JButton btn_simpanP;
    private javax.swing.JButton btn_tutupP;
    private javax.swing.JButton btn_ubahP;
    private javax.swing.JComboBox<String> com_listteman;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelPinjam;
    private javax.swing.JTextArea txtA_barang;
    private javax.swing.JTextField txt_idP;
    private javax.swing.JTextField txt_namaP;
    // End of variables declaration//GEN-END:variables
}
