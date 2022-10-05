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
public class Segitiga {
    // atribut
    double a;
    double t;
    
    // constructor
    Segitiga(double b, double c) {
        this.a = b;
        this.t = c;
    }
    
    // LUAS
    void luas() {
        double luasS = a*t/2;
        System.out.println("Luas Segitiga = " + luasS);
    }
}
