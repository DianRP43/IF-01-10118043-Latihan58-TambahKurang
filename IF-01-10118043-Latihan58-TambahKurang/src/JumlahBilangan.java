/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class JumlahBilangan extends Bilangan{
    public void tampilHasilJumlah(){
        int hasil;
        hasil = getX() + getY();
            System.out.println("Hasil penjumlahan dari "+getX()+" dan "+getY()+" adalah = "+hasil);
    }
        
}
