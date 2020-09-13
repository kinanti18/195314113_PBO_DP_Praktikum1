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
public class MasyarakatSekitar extends Penduduk {
    private String nomor;
    
    MasyarakatSekitar(){
        
    }
    MasyarakatSekitar(String dataNis, String dataNama, String dataTempatTanggalLahir){
        this.nomor = dataNis;
    }
    public void setNomor(String nomor){
        this.nomor = nomor;
    }
    public String getNomor(){
        return nomor;
    }
    @Override
    double hitungIuran() {
        double hitungIuran;
        hitungIuran = Double.parseDouble(nomor)*100;
        return hitungIuran;
    }
    
}
