/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar3;

/**
 *
 * @author hasna.nrlzt
 */
public class Lingkaran {
    // atribut
    double r;
    
    // constructor
    Lingkaran(double a) {
        this.r = a;
    }
    
    // LUAS //
    void luas() {
        double luasL = 3.14*r*r;
        System.out.println("Luas Lingkaran = " + luasL);
    }
    
    // KELILING //
    void keliling() {
        double kelilingL = 2*3.14*r;
        System.out.println("Keliling Lingkaran = " + kelilingL);
    }
}
