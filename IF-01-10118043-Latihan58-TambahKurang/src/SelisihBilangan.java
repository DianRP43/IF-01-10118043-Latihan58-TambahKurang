/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class SelisihBilangan extends Bilangan{
    public void tampilSelisih(){
    int hasil;
        hasil = getX() - getY();
    System.out.println("Hasil pengurangan dari "+getX()+" dan "+getY()+" adalah = "+hasil);
    }
    
}
