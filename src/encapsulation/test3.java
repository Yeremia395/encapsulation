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
public class test3 {
    public static void main(String[] args) {
        
        lt3 siswa = new lt3();
        siswa.setName("Satrio");
        siswa.setAge(16);
        siswa.setAddress("Malang");
        
        System.out.println("Name   : "+siswa.getName());
        System.out.println("Age    : "+siswa.getAge());
        System.out.println("Address: "+siswa.getAddress());
    }
    
}
