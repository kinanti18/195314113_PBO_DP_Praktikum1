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
public class UKM {

    private String namaUnit;
    private Mahasiswa ketua;
    private Mahasiswa sekretaris;
    private MasyarakatSekitar anggota;

    UKM() {

    }

    UKM(String namaUnit) {
        this.namaUnit = namaUnit;

    }

    public void setNamaUnit(String namaUnit) {
        this.namaUnit = namaUnit;
    }

    public String getNamaUnit() {
        return namaUnit;
    }

    public void setKetua(Mahasiswa dataKetua) {
        this.ketua = dataKetua;
    }

    public Mahasiswa getKetua() {
        return ketua;
    }

    public void setSekretaris(Mahasiswa dataSekretaris) {
        this.sekretaris = dataSekretaris;
    }

    public Mahasiswa getSekretaris() {
        return sekretaris;
    }
    public void setAnggota(MasyarakatSekitar dataAnggota) {
        this.anggota = dataAnggota;
    }

    public MasyarakatSekitar getAnggota() {
        return anggota;
    }
}
