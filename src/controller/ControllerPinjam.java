/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelPinjam;
import util.Koneksi;

/**
 *
 * @author Juli
 */
public class ControllerPinjam {
    
    Koneksi konek = new Koneksi();
    
    public void simpanPinjaman(ModelPinjam mp){
        konek.koneksiDB();
        String url = "insert into tbl_pinjam(namaTeman,baranDiPinjam) values ('"+mp.getNama()+"','"+mp.getBarang()+"')";
        try{
            konek.s.executeUpdate(url);
            JOptionPane.showMessageDialog(null,"Data Berhasil Di Simpan");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal");
            System.err.println("Galat Controller Teman : "+e.getMessage());
        }
    }
    
    public void ubahPinjaman(ModelPinjam mp){
        konek.koneksiDB();
            int id = mp.getId();
            String nama = mp.getNama();
            String barang = mp.getBarang();
            String url = "update tbl_pinjam"
                    +"set baranDiPinjam = ('"+barang+"')where id = ('"+id+"')";
        try{
            konek.s.executeUpdate(url);
            JOptionPane.showMessageDialog(null,"Data Berhasil di Ubah");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal");
            System.err.println("Error : "+e.getMessage());
        }
    }
    
    public void hapusPinjaman(ModelPinjam mp){
        konek.koneksiDB();
        String url = "delete from tbl_pinjam where id =('"+mp.getId()+"')";
        try{
            konek.s.executeUpdate(url);
            JOptionPane.showMessageDialog(null,"Data Berhasil di Hapus");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal");
            System.err.println("Error : "+e.getMessage());
        }
    }
}
