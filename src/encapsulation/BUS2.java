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
public class BUS2 {

    private int penumpang;
    private int maxpenumpang;
    
    //konstruktor kelas bus
    public BUS2(int maxpenumpang){
        
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
                }
    
    //method mutator untuk menambahkan penumpang
    
    public void addpenumpang(int penumpang){
        
        int temp;
        
        temp = this.penumpang+penumpang;
        if (temp >= maxpenumpang){
            System.out.println("Penumpang melebihi kuota");
            
        }else {
            this.penumpang = temp;
        }
    }
    
    public void cetak(){
        System.out.println("Penumpang bus sekarang adalah : " +penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah : " +maxpenumpang);
        
    }
}
