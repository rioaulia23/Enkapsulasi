/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latian3;

/**
 *
 * @author Rio Aulia Yahya
 */
public class TestSiswa {
    public static void main(String[] args){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("julian");
        siswa.setAbsen(23);
        siswa.setAddress("Malang");
        
        System.out.print("Name : " + siswa.getName()
        + " Absen : " + siswa.getAbsen()+
        " Address : " + siswa.getAddress());
    }
    
}
