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
public class PersegiPanjang {
   // atribut
    double p;
    double l;
    
    // constructor
    PersegiPanjang(double a, double b) {
        this.p = a;
        this.l = b;
    }
    // LUAS //
    void luas() {
        double luasPP = p*l;
        System.out.println("Luas Persegi Panjang = " + luasPP);
    }

    // KELILING //
    void keliling() {
        double kelilingPP = 2*(p+l);
        System.out.println("Keliling Persegi Panjang = " + kelilingPP);
    }
            
}
