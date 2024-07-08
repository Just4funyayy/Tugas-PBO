/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class koneksi {
    
 
 private String databasename="dbkeagamaan";
 private String username="root";
 private String password="";
 private String lokasi="jdbc:mysql://localhost/"+databasename;
 public static Connection koneksiDB;
 
 
 public koneksi(){
     try {
       Class.forName("com.mysql.cj.jdbc.Driver");
       koneksiDB=DriverManager.getConnection(lokasi,username,password);
       System.out.println("Database Terkoneksi");
     } catch (Exception e){
         System.err.println(e.toString());
     }
 }
 
 public void simpanjadwal(String jadwal, String jadwal_id){
     
    try {
        String SQL ="INSERT INTO jadwal (jadwal,jadwal_id)"
                +"VALUE(?,?)";
        
        PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
        perintah.setString(1, jadwal);
        perintah.setString(2, jadwal_id);
        perintah.executeUpdate();
        System.out.println("Data berhadil disimpan");
    } catch (Exception e){
        System.out.println(e.getMessage());
    }
 }
 
 
 public void ubahjadwal(String jadwal, String jadwal_id){
     
    try {
        String SQL ="UPDATE jadwal SET jadwal =? WHERE jadwal_id=?";
        
        PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
        perintah.setString(1, jadwal);
        perintah.setString(2, jadwal_id);
        perintah.executeUpdate();
        System.out.println("Data berhasil diubah");
    } catch (Exception e){
        System.out.println(e.getMessage());
    }
 }
 
 public void hapusjadwal(String jadwal_id){
     try {
         String SQL ="DELETE FROM jadwal WHERE jadwal_id=?";
         PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1,jadwal_id);
         perintah.executeUpdate();
         System.out.println("Data berhasil dihapus");
     } catch (Exception e) {
         System.err.println(e.getMessage());
     }
 }
 
 public void carijadwal(String jadwal_id){
     try {
         String SQL="SELECT*FROM jadwal WHERE jadwal_id=?";
         PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1,jadwal_id);
         ResultSet data = perintah.executeQuery();
         while(data.next()){
             System.out.println("jadwal_id"+data.getString("jadwal_id"));
             System.out.println("jadwal"+data.getString("jadwal"));
         }
     } catch (Exception e){
         System.err.println(e.getMessage());
     }
 }
 
 public void datajadwal(){
     try{
         Statement stmt = koneksiDB.createStatement();
         ResultSet baris = stmt.executeQuery("SELECT*FROM jadwal ORDER BY jadwal_id ASC");
         while (baris.next()){
             System.out.println(baris.getString("jadwal_id")+" | "+
                     baris.getString("jadwal"));
         }
     } catch (Exception e) {
         System.err.println(e.getMessage());
     }
 }
 
 public void simpanmasjid(String masjid_id, String masjid){
     
    try {
        String SQL ="INSERT INTO masjid (masjid_id,masjid) VALUE (?,?)";
        
        PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
        perintah.setString(1, masjid_id);
        perintah.setString(2, masjid);
        perintah.executeUpdate();
        System.out.println("Data berhasil disimpan");
    } catch (Exception e){
        System.out.println(e.getMessage());
    }
 }
 
 public void ubahmasjid(String masjid_id, String masjid){
     
    try {
        String SQL ="UPDATE masjid SET masjid =? WHERE masjid_id = ?";
        
        PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
        perintah.setString(1, masjid);
        perintah.setString(2, masjid_id);
        perintah.executeUpdate();
        System.out.println("Data berhasil diubah");
    } catch (Exception e){
        System.out.println(e.getMessage());
    }
 }
 
 public void hapusmasjid(String masjid_id){
     try {
         String SQL ="DELETE FROM masjid WHERE masjid_id=?";
         PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1,masjid_id);
         perintah.executeUpdate();
         System.out.println("Data berhasil dihapus");
     } catch (Exception e) {
         System.err.println(e.getMessage());
     }
 }
 
  public void carimasjid(String masjid_id){
     try {
         String SQL="SELECT*FROM masjid WHERE masjid_id=?";
         PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1,masjid_id);
         ResultSet data = perintah.executeQuery();
         while(data.next()){
             System.out.println("masjid_id"+data.getString("masjid_id"));
             System.out.println("masjid"+data.getString("masjid"));
         }
     } catch (Exception e){
         System.err.println(e.getMessage());
     }
 }
  
   public void datamasjid(){
     try{
         Statement stmt = koneksiDB.createStatement();
         ResultSet baris = stmt.executeQuery("SELECT*FROM masjid ORDER BY masjid_id ASC");
         while (baris.next()){
             System.out.println(baris.getString("masjid_id")+" | "+
                     baris.getString("masjid"));
         }
     } catch (Exception e) {
         System.err.println(e.getMessage());
     }
 }
   
   public void simpankehadiran(String kehadiran_id, String kegiatan_id){
     
    try {
        String SQL ="INSERT INTO kehadiran (kehadiran_id,kegiatan_id)"
                +"VALUE(?,?)";
        
        PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
        perintah.setString(1, kehadiran_id);
        perintah.setString(2, kegiatan_id);
        perintah.executeUpdate();
        System.out.println("Data berhadil disimpan");
    } catch (Exception e){
        System.out.println(e.getMessage());
    }
 }
   
  public void ubahkehadiran(String kehadiran_id, String kegiatan_id){
     
    try {
        String SQL ="UPDATE kehadiran SET kegiatan_id =?, kegiatan_id=? WHERE kehadiran_id=?";
        
        PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
        perintah.setString(1, kegiatan_id);
        perintah.setString(2, kehadiran_id);
        perintah.executeUpdate();
        System.out.println("Data berhasil diubah");
    } catch (Exception e){
        System.out.println(e.getMessage());
    }
 }
  
  public void hapuskehadiran(String kehadiran_id){
     try {
         String SQL ="DELETE FROM kehadiran WHERE kehadiran_id=?";
         PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1,kehadiran_id);
         perintah.executeUpdate();
         System.out.println("Data berhasil dihapus");
     } catch (Exception e) {
         System.err.println(e.getMessage());
     }
 }
  
  public void carikehadiran(String kehadiran_id){
     try {
         String SQL="SELECT*FROM jadwal WHERE kehadiran_id=?";
         PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1,kehadiran_id);
         ResultSet data = perintah.executeQuery();
         while(data.next()){
             System.out.println("kehadiran_id"+data.getString("kehadiran_id"));
             System.out.println("kegiatan_id"+data.getString("kegiatan_id"));
         }
     } catch (Exception e){
         System.err.println(e.getMessage());
     }
 }
  
  public void datakehadiran(){
     try{
         Statement stmt = koneksiDB.createStatement();
         ResultSet baris = stmt.executeQuery("SELECT*FROM jadwal ORDER BY kehadiran_id ASC");
         while (baris.next()){
             System.out.println(baris.getString("kehadiran_id")+" | "+
                     baris.getString("kegiatan_id"));
         }
     } catch (Exception e) {
         System.err.println(e.getMessage());
     }
 }
  
   public void simpanuser(String user_id, String username, String password, String nama, String alamat, String no_hp, String jenis_kelamin){
     
    try {
        String SQL ="INSERT INTO user (user_id, username, password, nama, alamat, no_hp, jenis_kelamin)"
                +"VALUE(?,?,?,?,?,?,?)";
        
        PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
        perintah.setString(1, user_id);
        perintah.setString(2, username);
        perintah.setString(3, password);
        perintah.setString(4, nama);
        perintah.setString(5, alamat);
        perintah.setString(6, no_hp);
        perintah.setString(7, jenis_kelamin);
        perintah.executeUpdate();
        System.out.println("Data berhasil disimpan");
    } catch (Exception e){
        System.out.println(e.getMessage());
    }
 }
   
   public void ubahuser(String user_id, String username, String password, String nama, String alamat, String no_hp, String jenis_kelamin){
     
    try {
        String SQL ="UPDATE user SET user_id =? WHERE username=?";
        
        PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
        perintah.setString(1, user_id);
        perintah.setString(2, username);
        perintah.setString(3, password);
        perintah.setString(4, nama);
        perintah.setString(5, alamat);
        perintah.setString(6, no_hp);
        perintah.setString(7, jenis_kelamin);
        perintah.executeUpdate();
        System.out.println("Data berhasil diubah");
    } catch (Exception e){
        System.out.println(e.getMessage());
    }
 }
   
   public void hapususer(String user_id){
     try {
         String SQL ="DELETE FROM user WHERE user_id=?";
         PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1,user_id);
         perintah.executeUpdate();
         System.out.println("Data berhasil dihapus");
     } catch (Exception e) {
         System.err.println(e.getMessage());
     }
 }
   
   public void cariuser(String user_id){
     try {
         String SQL="SELECT*FROM user WHERE user_id=?";
         PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1,user_id);
         ResultSet data = perintah.executeQuery();
         while(data.next()){
             System.out.println("user_id"+data.getString("user_id"));
             System.out.println("username"+data.getString("username"));
             System.out.println("password"+data.getString("password"));
             System.out.println("nama"+data.getString("nama"));
             System.out.println("alamat"+data.getString("alamat"));
             System.out.println("no_hp"+data.getString("no_hp"));
         }
     } catch (Exception e){
         System.err.println(e.getMessage());
     }
 } 
    
}