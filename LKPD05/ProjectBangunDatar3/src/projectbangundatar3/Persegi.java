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
public class Persegi {
     // atribut
    double s;
    
    // constructor
    Persegi(double a) {
        this.s = a;
    }
    // LUAS //
    void luas() {
        double luasP = s*s;
        System.out.println("Luas Persegi = " + luasP);
    }
    
    // KELILING //
    void keliling() {
        double kelilingP = 4*s;
        System.out.println("Keliling Persegi = " + kelilingP);
    }
}
