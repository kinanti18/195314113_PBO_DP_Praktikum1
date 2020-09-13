/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_DP_Praktikum1C_Challenge;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Pengujian {

    public static void main(String[] args) {

        int N = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan jumlah mahasiswa : "));

        Mahasiswa[] mhs = new Mahasiswa[N];

        for (int i = 0; i < mhs.length; i++) {
            JOptionPane.showMessageDialog(null, "Masukkan Mahasiswa ke - " + (i + 1) + " : ");
            String nama = JOptionPane.showInputDialog(null, "Nama    : ");
            String nim = JOptionPane.showInputDialog(null, "NIM      : ");
            System.out.println();

            mhs[i] = new Mahasiswa();
            mhs[i].setNama(nama);
            mhs[i].setNim(nim);

            System.out.println("Nama : " + mhs[i].getNama());
            System.out.println("NIM  : " + mhs[i].getNim());
        }
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan jumlah gadget : "));

        Gadget[] gadget = new Gadget[n];
        gadget[0] = new Handphone();
        gadget[1] = new Tablet();
        gadget[2] = new Laptop();

        Handphone hp = new Handphone();
        Tablet tab = new Tablet();
        Laptop lap = new Laptop();

        for (int j = 0; j < gadget.length; j++) {
            System.out.println();
            String jenis_gadget = JOptionPane.showInputDialog(null, "Masukkan Gadget ke - " + (j + 1) + " : ");

            if ("Handphone".equals(jenis_gadget) && gadget[j] instanceof Handphone) {
                String merk = JOptionPane.showInputDialog(null, "Merk : ");
                String warna = JOptionPane.showInputDialog(null, "Warna : ");
                String prosesor = JOptionPane.showInputDialog(null, "Prosesor : ");
                String ram = JOptionPane.showInputDialog(null, "Ram : ");
                String rom = JOptionPane.showInputDialog(null, "Rom : ");
                String konektivitas = JOptionPane.showInputDialog(null, "Konektivitas  : ");

                gadget[j] = new Gadget();
                gadget[j].setMerk(merk);
                gadget[j].setWarna(warna);
                gadget[j].setProsesor(prosesor);
                gadget[j].setRam(ram);
                hp.setRom(rom);
                hp.setKonektivitas(konektivitas);

                System.out.println("                " + jenis_gadget + "      ");
                System.out.println("______________________________________");
                System.out.println("Merk            : " + gadget[j].getMerk());
                System.out.println("______________________________________");
                System.out.println("Warna           : " + gadget[j].getWarna());
                System.out.println("______________________________________");
                System.out.println("Prosesor        : " + gadget[j].getProsesor());
                System.out.println("______________________________________");
                System.out.println("Ram             : " + gadget[j].getRam());
                System.out.println("______________________________________");
                System.out.println("Rom             : " + hp.getRom());
                System.out.println("______________________________________");
                System.out.println("Konektivitas    : " + hp.getKonektivitas());
                System.out.println("______________________________________");

            } else if ("Tablet".equals(jenis_gadget) && gadget[j] instanceof Tablet) {
                String merk = JOptionPane.showInputDialog(null, "Merk : ");
                String warna = JOptionPane.showInputDialog(null, "Warna : ");
                String prosesor = JOptionPane.showInputDialog(null, "Prosesor : ");
                String ram = JOptionPane.showInputDialog(null, "Ram : ");
                String rom = JOptionPane.showInputDialog(null, "Rom : ");
                String konektivitas = JOptionPane.showInputDialog(null, "Konektivitas  : ");

                gadget[j] = new Gadget();
                gadget[j].setMerk(merk);
                gadget[j].setWarna(warna);
                gadget[j].setProsesor(prosesor);
                gadget[j].setRam(ram);
                tab.setRom(rom);
                tab.setKonektivitas(konektivitas);

                System.out.println("                " + jenis_gadget + "      ");
                System.out.println("______________________________________");
                System.out.println("Merk            : " + gadget[j].getMerk());
                System.out.println("______________________________________");
                System.out.println("Warna           : " + gadget[j].getWarna());
                System.out.println("______________________________________");
                System.out.println("Prosesor        : " + gadget[j].getProsesor());
                System.out.println("______________________________________");
                System.out.println("Ram             : " + gadget[j].getRam());
                System.out.println("______________________________________");
                System.out.println("Rom             : " + tab.getRom());
                System.out.println("______________________________________");
                System.out.println("Konektivitas    : " + tab.getKonektivitas());
                System.out.println("______________________________________");

            } else if ("Laptop".equals(jenis_gadget) && gadget[j] instanceof Laptop) {
                String merk = JOptionPane.showInputDialog(null, "Merk : ");
                String warna = JOptionPane.showInputDialog(null, "Warna : ");
                String prosesor = JOptionPane.showInputDialog(null, "Prosesor : ");
                String ram = JOptionPane.showInputDialog(null, "Ram : ");
                String hardisk = JOptionPane.showInputDialog(null, "Hardisk : ");
                int jumlahUSB = Integer.parseInt(JOptionPane.showInputDialog(null, "Jumlah Port USB : "));

                gadget[j] = new Gadget();
                gadget[j].setMerk(merk);
                gadget[j].setWarna(warna);
                gadget[j].setProsesor(prosesor);
                gadget[j].setRam(ram);
                lap.setHardisk(hardisk);
                lap.setJumlahUSB(jumlahUSB);

                System.out.println("                " + jenis_gadget + "      ");
                System.out.println("______________________________________");
                System.out.println("Merk            : " + gadget[j].getMerk());
                System.out.println("______________________________________");
                System.out.println("Warna           : " + gadget[j].getWarna());
                System.out.println("______________________________________");
                System.out.println("Prosesor        : " + gadget[j].getProsesor());
                System.out.println("______________________________________");
                System.out.println("Ram             : " + gadget[j].getRam());
                System.out.println("______________________________________");
                System.out.println("Hardisk         : " + lap.getHardisk());
                System.out.println("______________________________________");
                System.out.println("Jumlah Port USB : " + lap.getJumlahUSB());
                System.out.println("______________________________________");
            }
        }
    }

}
