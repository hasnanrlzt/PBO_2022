/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilanganbulat;

/**
 *
 * @author hasna.nrlzt
 */
import java.util.Scanner;
public class BilanganBulat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masuk = new Scanner(System.in);
        int i, n;
        float jum, x, rata;
        System.out.print ("Masukkan banyak bilangan bulat yang ingin di inputkan : ");
        n = masuk.nextInt();
        jum=0;
        i=1;
        while (i<=n){
                System.out.print ("Bilangan bulat ke-"+i+": ");
                x = masuk.nextFloat ();
                jum += x;
                i++;
        }
        rata = jum / n;
        System.out.println ("Rata-rata bilangan bulat: "+rata);
        System.out.println ("Jumlah bilangan bulat: "+jum);
    }
    
}
