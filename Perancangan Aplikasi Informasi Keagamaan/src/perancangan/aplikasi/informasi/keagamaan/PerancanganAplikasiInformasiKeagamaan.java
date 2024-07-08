/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perancangan.aplikasi.informasi.keagamaan;


import java.util.Scanner;
import lokasi.newpackage.kota;
/**
 *
 * @author ASUS
 */
public class PerancanganAplikasiInformasiKeagamaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    kota tes = new kota();
    Scanner input = new Scanner(System.in);
    
    System.out.println("Kota");
    System.out.print("Nama : ");
    tes.inputNamaKota(input.nextLine());
    System.out.print("Masukan Alamat Acara : ");
    tes.inputAlamatMasjid(input.nextLine());
    
    System.out.println("Daerah");
    System.out.println("Jam");
    System.out.println("| Banjarmasin | 10 |");
    System.out.println("| Banjarbaru  | 11 |");
    System.out.println("| Martapura   | 12 |");
    }
    
}
