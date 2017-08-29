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
public class EncapSiswa {
    public String name;
    public String address;
    public int absen;
    
    public int getAbsen(){
    return absen;
    }
    public String getName(){
    return name;
    }
    public String getAddress(){
    return address;
    }
    public void setAbsen (int newAbsen){
        absen = newAbsen;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setAddress (String newAddress){
        address = newAddress;
    }
}
