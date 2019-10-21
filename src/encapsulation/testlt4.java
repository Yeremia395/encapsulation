/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author Yeremia Rizky
 */
public class testlt4 {
    
public static void main(String[] args) {
        lt4 bus = new lt4(250);
        bus.cetakpenumpang();
        
        //penambahan penumpang 
        System.out.println("\n");
        bus.getpenumpang(24);//password
        bus.cetakpenumpang();
        
        //penambahan penumpang
        System.out.println("\n");
         bus.getpenumpang(24);//password
        bus.cetakpenumpang();
        
        //penambhan penumpang 
        System.out.println("\n");
        bus.getpenumpang(24);//password
        bus.cetakpenumpang();
        
        //penambahan penumpang
        System.out.println("\n");
        bus.getpenumpang(24);//password
        bus.cetakpenumpang();
        
        //penambahab penumpang
        System.out.println("\n");
        bus.getpenumpang(14);//password
        bus.cetakpenumpang();
        
        System.out.println("Rata-rata penumpang : " + bus.getAverge() + "kg.");
        System.out.println("Jumlah penumpang sekarang : " + bus.counter());
    }
}

