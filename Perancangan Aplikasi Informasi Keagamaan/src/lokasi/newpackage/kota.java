/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lokasi.newpackage;

/**
 *
 * @author ASUS
 */
public class kota {
   
    String namaKota, tempat, alamatMasjid;
    int jam,jumlah, tglAcara;
    
    public kota(){}
    
    public kota(String namaKota, String tempat, int jam, int jumlah, int tglAcara){
    this.namaKota=namaKota;
    this.jam=jam;
    this.jumlah=jumlah;
    this.tempat=tempat;
    this.alamatMasjid=alamatMasjid;
    this.tglAcara=tglAcara;
    }
    
    public int ambilJam(){
        this.jam=0;
        if(this.namaKota.equals("Banjarmasin")){
            this.jam = 10;
        }else if (this.namaKota.equals("Banjarbaru")){
            this.jam = 11;
        }else if (this.namaKota.equals("Martapura")){
            this.jam = 12;
        }else{
            this.jam = 13;
        }
        return this.jam;
    }
    
    
    public void inputJumlah(int jumlah){
        this.jumlah=jumlah;
    }
    
    public void inputNamaKota(String namaKota){
        this.namaKota=namaKota;
    }
    
    
     public void inputAlamatMasjid(String alamatMasjid){
        this.alamatMasjid= alamatMasjid;
     }
     
    public int ambilJumlah(){
        return this.jumlah;
    }
    
    public void inputTempat(String tempat){
        this.tempat=tempat;
    }
    public String ambilTempat(){
        return this.tempat;
    }
}


