/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_DP_Praktikum1B;

/**
 *
 * @author User
 */
public class Mahasiswa extends Penduduk {

    private String nim;

    Mahasiswa(){
        
    }
    Mahasiswa(String dataNis, String dataNama, String dataTempatTanggalLahir){
      this.nim = dataNis;
    }
    public void setNIM(String nim){
        this.nim = nim;
    }
    public String getNIM(){
        return nim;
    }
    @Override
    double hitungIuran() {
        double hitungIuran;
        hitungIuran = Double.parseDouble(nim) / 10000;
        return hitungIuran;
    }

}
