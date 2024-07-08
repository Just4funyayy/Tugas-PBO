/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lokasi.newpackage;

/**
 *
 * @author ASUS
 */
public class provinsi extends kota{
    
    String alamatMasjid,namaProvinsi;
    int totalJamaah, tglAcara;
    public provinsi(){}
    
    public provinsi(String alamatMasjid,String nama,int totalJamaah){
        this.alamatMasjid=alamatMasjid;
        this.totalJamaah=totalJamaah;
        
        this.namaProvinsi=nama;
    }
    
    public void inputAlamatPesan(String alamatJamaah){
        this.alamatMasjid= alamatMasjid;
    }
    
    public String ambilAlamatPengirim(){
        return this.alamatMasjid;
    }
    
    public void inputNamaProvinsi(String namaProvinsi){
        this.namaProvinsi=namaProvinsi;
    }
    
    public String ambilNamaProvinsi(){
        return this.namaProvinsi;
    }
    
    public void inputTglAcara(Integer tglAcara){
        this.tglAcara=tglAcara;
    }
    
    public int ambilTglAcara(){
        return this.tglAcara;
    }
    
    public int totalJamaah(){
        return ambilJam()*ambilJumlah();
    }
    
}
