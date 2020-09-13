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
public class Laptop extends Gadget{
    private String hardisk;
    private int jumlahUSB;
    
    public void setHardisk(String hardisk){
        this.hardisk = hardisk;
    }
    public String getHardisk(){
        return hardisk;
    }
    public void setJumlahUSB(int jumlahUSB){
        this.jumlahUSB = jumlahUSB;
    }
    public int getJumlahUSB(){
        return jumlahUSB;
    }
}
