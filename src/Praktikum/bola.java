/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Rio Aulia Yahya
 */
import java.lang.Math;
public class bola {
    private double jarijari;
    public bola (double jarijari){
        this.jarijari=jarijari;
    }
    
    public void setJarijari(double jarijari){
        this.jarijari=jarijari;
    }
    
    public void showDiameter(){
        System.out.println("Diameter Bola : "+2*jarijari);
    }
   
    public void showLuasPermukaan(){
        System.out.println("Luas Permukaan Bola : "+(4/3*Math.PI*Math.pow(jarijari,3)));
    }
    
    public void showVolume(){
        System.out.println("Volume Bola : "+(4*Math.PI*Math.pow(jarijari,2)));
    }
}=