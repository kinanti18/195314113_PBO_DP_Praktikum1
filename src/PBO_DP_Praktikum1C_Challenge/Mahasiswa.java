/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_DP_Praktikum1C_Challenge;


/**
 *
 * @author User
 */
public class Mahasiswa {

    private String nim;
    private String nama;
    private Handphone handphone;
    private Tablet tablet;
    private Laptop laptop;

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setHandphone(Handphone handphone) {
        this.handphone = handphone;
    }

    public Handphone getHandphone() {
        return handphone;
    }

    public void setTablet(Tablet tablet) {
        this.tablet = tablet;
    }

    public Tablet getTablet() {
        return tablet;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Laptop getLaptop() {
        return laptop;
    }
}
