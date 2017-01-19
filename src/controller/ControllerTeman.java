/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelTeman;
import util.Koneksi;

/**
 *
 * @author Juli
 */
public class ControllerTeman {
    Koneksi konek = new Koneksi();
    
    public void simpanDataTeman(ModelTeman mt){
        konek.koneksiDB();
        String url = "insert into tbl_teman(nama,nope,email) values ('"+mt.getNama()+"','"+mt.getNope()+"','"+mt.getEmail()+"')";
        try{
            konek.s.executeUpdate(url);
            JOptionPane.showMessageDialog(null,"Data Berhasil Di Simpan");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal");
            System.err.println("Galat Controller Teman : "+e.getMessage());
        }
    }
    
    public void ubahDataTeman(ModelTeman mt){
        konek.koneksiDB();
            int id = mt.getId();
            String nama = mt.getNama();
            String nope = mt.getNope();
            String email = mt.getEmail();
            String url = "update tbl_pinjam"
                    +"set nama = ('"+nama+"'),"
                    + "nope = ('"+nope+"'),"
                    + "email = ('"+email+"')"
                    + "where id = ('"+id+"')";
        try{
            konek.s.executeUpdate(url);
            JOptionPane.showMessageDialog(null,"Data Berhasil di Ubah");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal");
            System.err.println("Error : "+e.getMessage());
        }
    }
    
    public void hapusTeman(ModelTeman mt){
        konek.koneksiDB();
        String url = "delete from tbl_pinjam where id =('"+mt.getId()+"')";
        try{
            konek.s.executeUpdate(url);
            JOptionPane.showMessageDialog(null,"Data Berhasil di Hapus");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal");
            System.err.println("Error : "+e.getMessage());
        }
    }
}
