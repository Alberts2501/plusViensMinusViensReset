/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Auto {
    String marka;
    int gads;
    
    Auto(String newMarka, int newGads) {
        marka = newMarka;
        gads = newGads;
    }
    
    void setMarka(String marka) {
        this.marka = marka;
    }
    
    String getMarka() {
        return this.marka;
    }
    
    void printInfo() {
        System.out.println("Marka " + marka);
        System.out.println("Gads " + gads);
    }
}
