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
abstract class Penduduk {
    private String nama;
    private String tempatTanggalLahir;
    Penduduk(){
        
    }
    Penduduk(String dataNama, String dataTempatTanggalLahir){
        this.nama = dataNama;
        this.tempatTanggalLahir = dataTempatTanggalLahir;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setTempatTanggalLahir(String tempatTanggalLahir){
        this.tempatTanggalLahir = tempatTanggalLahir;
    }
    public String getTempatTanggalLahir(){
        return tempatTanggalLahir;
    }
    abstract double hitungIuran();
    
}
