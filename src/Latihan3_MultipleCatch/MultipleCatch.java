/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3_MultipleCatch;

/**
 *
 * @author M. RAFI PUTRA
 */
public class MultipleCatch {
    public static void main(String[] args) {
        try{
            int a = 3 / 0;
            // berpotensi menimbulkan kesalahan yaitu dibagi dengan bilangan 0
            args[0] = "Malang";
            args[0] = "0";
            int num = Integer.parseInt(args[0]);
            System.out.println("Kota Kelahiran: "+ args[0]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
           
        }
        catch(NullPointerException e) {
            
        }
        catch(Exception e) {
            
        }
    }
}
