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
public class Pengujian {

    public static void main(String[] args) {
        // membuat objek UKM dan memberi nama
        UKM ukm = new UKM("UKM Cipta Karya");
        ukm.setNamaUnit("CIPTA KARYA");
        
        // membuat objek ketua dan kemudian mengeset sebagai ketua ukm
        Mahasiswa mhs1 = new Mahasiswa("195314113", "Kinanti", "Purworejo,3 Juni 2001");
        mhs1.setNIM("198997390");
        UKM ketua = new UKM();
        ketua.setKetua(mhs1);
        ukm.setKetua(mhs1);
        mhs1.hitungIuran();

        // membuat objek sekretaris dan kemudian mengeset sebagai sekretaris ukm
        Mahasiswa mhs2 = new Mahasiswa("195314118", "Leonny", "Wonosobo,25 Maret 2001");
        UKM sekretaris = new UKM();
        mhs2.setNIM("8973987398");
        sekretaris.setSekretaris(mhs2);
        ukm.setSekretaris(mhs2);
        mhs2.hitungIuran();

        UKM anggota = new UKM();
        // menambahkan anggota UKM berupa obyek mahasiswa beserta data-nya
        MasyarakatSekitar mahasiswa = new MasyarakatSekitar("82929290", "Elnino", "Bandung, 16 April 2001");
        mahasiswa.setNomor("8279837390");
        anggota.setAnggota(mahasiswa);
        ukm.setAnggota(mahasiswa);
        mahasiswa.hitungIuran();

        // menambahkan anggota UKM berupa obyek masyarakat sekitar lengkap dengan datanya
        MasyarakatSekitar masyarakat = new MasyarakatSekitar("82929290", "Elnino", "Bandung, 16 April 2001");
        mahasiswa.setNomor("18923730");
        anggota.setAnggota(masyarakat);
        ukm.setAnggota(masyarakat);
        masyarakat.hitungIuran();

        System.out.println("Keanggotan UKM "+ukm.getNamaUnit());
        System.out.println(
                "Mahasiswa dengan NIM " + ukm.getKetua().getNIM() + " sebagai KETUA UKM membayar iuran sebesar " + mhs1.hitungIuran());
        System.out.println(
                "Mahasiswa dengan NIM " + ukm.getSekretaris().getNIM() + " sebagai Sekretaris membayar iuran sebear " + mhs2.hitungIuran());
        System.out.println(
                "Anggota dengan Nomor " + mahasiswa.getNomor() + " sebagai Anggota membayar iuran sebesar " + mahasiswa.hitungIuran());
        System.out.println(
                "Anggota dengan Nomor " + masyarakat.getNomor() + " sebagai membayar iuran sebesar " + masyarakat.hitungIuran());

    }
}
